package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.models.domain.IModel;
import com.armin.sap.ds.builder.models.domain.Resource;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ProjectItemNodeProperties;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

public class ResourceItemNode extends ProjectItemNode {
	
	protected IProjectItemNode _parent;
	protected IProject _project;	
	protected String _description;
	protected String _tooltip;
	protected Image _image;
	protected ArrayList<IProjectItemNode> _children;
	protected IModel _item;
	protected IProjectService _projectService;
	protected TreeNodeAccessMode _mode = TreeNodeAccessMode.READ_ONLY;
	private IResource _resItem;
	
	public ResourceItemNode(IProject project, IResource item, IProjectItemNode parent) {
		super(project, new Resource(item), parent);
		_resItem = item;
    	_parent = parent;
    	_project = project;
    	_children = new ArrayList<IProjectItemNode>();
    	if(item != null) {
    		_item = new Resource(item);
    	}
    	
    	_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
    }
    
	@Override
	public IResource getAsResource() {		
		return this._resItem;
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
	public ProjectItemNodeType getType() {		
		return ProjectItemNodeType.RESOURCE;
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
	public ImageDescriptor getImageDescriptor(Object object) {		
		return ImageDescriptor.createFromImage(getImage());
	}

	@Override
	public String getLabel(Object o) {		
		return this.getName();
	}
	
}
