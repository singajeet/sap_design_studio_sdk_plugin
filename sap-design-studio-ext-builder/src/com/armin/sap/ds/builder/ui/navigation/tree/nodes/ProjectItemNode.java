package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.core.common.UIHelper;
import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.models.domain.Resource;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ProjectItemNodeProperties;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

/**
 * @author armin
 *
 */
public class ProjectItemNode implements IProjectItemNode, IWorkbenchAdapter, IAdaptable {
	
	protected IProjectItemNode _parent;
	protected IProject _project;	
	protected String _description;
	protected String _tooltip;
	protected Image _image;
	protected ArrayList<IProjectItemNode> _children;
	protected IModel _item;
	protected IProjectService _projectService;
	protected TreeNodeAccessMode _mode = TreeNodeAccessMode.READ_ONLY;
	
	
	/**
	 * Constructor to create tree node based on an IModel
	 * @param project
	 * @param item
	 * @param parent
	 */
	public ProjectItemNode(IProject project, IModel item, IProjectItemNode parent) {
    	_parent = parent;
    	_project = project;
    	_children = new ArrayList<IProjectItemNode>();
    	if(item != null) {
    		_item = item;
    	}
    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
    }
    
	/**
	 * Constructor to create empty tree node
	 * @param project
	 * @param parent
	 */
	public ProjectItemNode(IProject project, IProjectItemNode parent) {
    	_parent = parent;
    	_project = project;
    	_children = new ArrayList<IProjectItemNode>();
    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);    	
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
    }
	
	/**
	 * Constructor to create tree node for information purpose only
	 * @param title
	 * @param parent
	 */
	public ProjectItemNode(String title, IProjectItemNode parent) {
    	_parent = parent;
    	_project = parent.getProject();
    	_children = new ArrayList<IProjectItemNode>();
    	    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
    }
	
	/**
	 * Constructor to create tree node for information purpose only
	 * NOTE: This node will be added to root node of the tree
	 * @param title
	 */
	public ProjectItemNode(String title) {
    	_children = new ArrayList<IProjectItemNode>();
    	_parent = UIHelper.INSTANCE.getRootTreeNode();
    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
    }
	
	
	/**
	 * Constructor to create an empty tree node
	 * NOTE: This node will be added to root node of the tree
	 * @param project
	 */
	public ProjectItemNode(IProject project) {
		_project = project;
		_children = new ArrayList<IProjectItemNode>();
    	_parent = UIHelper.INSTANCE.getRootTreeNode();
    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
	}
	
    public String getProjectName() {
        return _project.getName();
    }
    
    @Override
    public Image getImage() {
    	Image image = Activator.getImage("images/project_item_node_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE_ID));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
    }
    
    @Override
    public void setImage(String file) {
    	IFile imageFile = this._project.getFile(file);
    	if(imageFile.exists()) {
    		this._image = Activator.getImage(file);
    	}
    }
    
    @Override
    public Object[] getElements(Object input) {
    	return getChildren(input);
    }
    
    @Override
    public Object[] getChildren(Object parent) {
        return _children.toArray();
    }
    
	@Override
	public Stream<Object> getContent() {
		return Arrays.stream(_children.toArray());
	}

	@Override
	public boolean hasChildren(Object parent) {		
		return _children.size() > 0;
	}

	@Override
	public IProject getProject() {		
		return _project;
	}

	@Override
	public Object getParent(Object element) {		
		return _parent;
	}

	@Override
	public ProjectItemNodeType getType() {		
		return ProjectItemNodeType.UNKNOWN;
	}

	@Override
	public String getName() {		
		return _item.getName();
	}

	@Override
	public String getDescription() {		
		return _description;
	}
	
	@Override
	public void setDescription(String desc) {
		this._description = desc;
	}

	@Override
	public String getTooltip() {
		if(_tooltip == null && _description != null)
			_tooltip = _description;
		return _tooltip;
	}
	
	@Override
	public void setTooltip(String tooltip) {
		_tooltip = tooltip;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		if(_image != null) {
			_image.dispose();
			_image = null;
		}
		super.finalize();
	}

	@Override
	public void addItem(IProjectItemNode item) {
		if(item != null) {
			if(!exists(item)) {
				_children.add(item);
			}
		}
		
	}
	
	@Override
	public void addItem(IResource item) {
		if(item != null) {
			if(!exists(item)) {
				if(item.getType() == IResource.FILE || item.getType() == IResource.FOLDER) {
					this.addItem(item.getRawLocation().toOSString());
				} else {
					IProjectItemNode node = new ResourceItemNode(this.getProject(), item, this);
					_children.add(node);
				}
			}
		}
	}
	
	public void addItem(String strPath) {
		IProjectItemNode item = null;
		if(strPath != null) {
			IPath path = new Path(strPath);
			if(path.toFile().isFile()) {
				switch(path.getFileExtension().toUpperCase()) {
					case "HTML":
						item = new HTMLNode(this.getProject(), strPath, this);
						break;
					case "JS":
						item = new JavaScriptNode(this.getProject(), strPath, this);
						break;
					case "CSS":
						item = new CascadeStyleSheetNode(this.getProject(), strPath, this);
						break;
					case "PNG":
					case "GIF":
					case "BMP":
					case "JPG":
					case "JPEG":
						item = new ImageNode(this.getProject(), strPath, this);
					default:					
						item = new GenericFileNode(this.getProject(), this.getProject().getFile(strPath), this);
				}
			} else if(path.toFile().isDirectory()) {
				String[] segments = path.segments();
				for(String segment : segments) {
					if(!segment.toUpperCase().equals("RES") &&
							!segment.toUpperCase().equals("CSS") &&
							!segment.toUpperCase().equals("JS") &&
							!segment.toUpperCase().equals("IMAGES") &&
							!segment.toUpperCase().equals("ADDITIONAL_PROPERTIES_SHEET")
							) {
						item = new GenericFolderNode(this.getProject(), strPath, this);
					}
				}
			}
		}
		if(item != null) {
			_children.add(item);
		}
	}

	@Override
	public void removeItem(IProjectItemNode item) {
		if(item != null) {
			removeItem(item.getModel().getId());
		}
	}

	@Override
	public void removeItem(IResource item) {
		if(item != null) {
			String id = item.getName();
			removeItem(id);
		}
	}

	@Override
	public void removeItem(String id) {
		if(id != null) {
			if(exists(id)) {
				for(IProjectItemNode node : _children) {
					if(node.getModel().getId().equals(id)) {
						_children.remove(node);
						return;
					}
				}
			}
		}
	}
	
	@Override
	public IProjectItemNode findItem(String id) {
		if(id != null) {
			if(exists(id)) {
				for(IProjectItemNode node : _children) {
					if(node.getModel().getId().equals(id)) {
						return node;
					}
				}
			}
		}
		return null;
	}

	@Override
	public boolean exists(String id) {
		for(IProjectItemNode node : _children) {
			if(node.getModel().getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean exists(String id, boolean ignorecase) {		
		for(IProjectItemNode node : _children) {
			if(ignorecase) {
				if(node.getModel().getId().equalsIgnoreCase(id)) {
					return true;
				}
			} else {
				return exists(id);
			}
		}
		return false;
	}
	
	@Override
	public boolean exists(IProjectItemNode item) {
		return exists(item.getModel().getId());
	}

	@Override
	public boolean exists(IResource item) {
		return exists(item.getName());
	}

	@Override
	public void updateItemsListFromResource(ArrayList<IResource> items, boolean merge) {
		if(merge) {
			for(IResource resource : items) {
				IProjectItemNode item = new ProjectItemNode(this.getProject(), new Resource(resource), this);
				if(!exists(item))
					_children.add(item);
			}
		} else {
			_children.clear();
			for(IResource resource : items) {
				IProjectItemNode item = new ProjectItemNode(this.getProject(), new Resource(resource), this);
				if(!exists(item))
					_children.add(item);
			}
		}
	}

	@Override
	public void updateItemsList(ArrayList<IProjectItemNode> items, boolean merge) {
		if(merge) {
			for(IProjectItemNode node : items) {
				if(!exists(node)) {
					_children.add(node);
				}
			}
		} else {
			_children.clear();
			for(IProjectItemNode node : items) {
				if(!exists(node)) {
					_children.add(node);
				}
			}
		}
		
	}

	@Override
	public void addItem(IModel model) {
		if(!exists(model)) {
			IProjectItemNode item = new ProjectItemNode(this.getProject(), model, this);
			_children.add(item);
		}
	}

	@Override
	public void removeItem(IModel model) {
		if(exists(model)) {
			removeItem(model.getId());
		}
	}

	@Override
	public boolean exists(IModel item) {
		return exists(item.getId());
	}

	@Override
	public IModel getModel() {
		return _item;
	}

	@Override
	public TreeNodeAccessMode getAccessMode() {		
		return this._mode;
	}

	@Override
	public void setAccessMode(TreeNodeAccessMode mode) {
		this._mode = mode;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ProjectItemNodeProperties(this));
		return null;
	}
	
	@Override
	public IResource getAsResource() {
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {		
		return ImageDescriptor.createFromImage(getImage());
	}

	@Override
	public String getLabel(Object o) {		
		return this.getName();
	}
	
}
