package com.armin.sap.ds.builder.controls;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.providers.ExtensionListTreeContentProvider;
import com.armin.sap.ds.builder.providers.ExtensionListViewerLabelProvider;

public class ExtensionList extends Composite {
	
	private ExtensionCollectionNode _input;
	private TreeViewer _treeViewer;
	private Tree _tree;
	
	/**
	 * @return the _treeViewer
	 */
	public TreeViewer getTreeViewer() {
		return _treeViewer;
	}

	/**
	 * @return the _treeViewer
	 */
	public Tree getTree() {
		return _tree;
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ExtensionList(Composite parent, int style) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(1, false));
		
		_treeViewer = new TreeViewer(this, SWT.BORDER | SWT.CHECK);		
		_tree = _treeViewer.getTree();
		_tree.setLinesVisible(true);
		_tree.setHeaderVisible(true);
		_tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		_treeViewer.setLabelProvider(new ExtensionListViewerLabelProvider());
		_treeViewer.setContentProvider(new ExtensionListTreeContentProvider());
	}
	
	/**
	 * Create the control
	 * @wbp.parser.constructor
	 */
	public ExtensionList(Composite parent, int style, ExtensionCollectionNode input) {
		this(parent, SWT.BORDER);
		_input = input;
		_treeViewer.setInput(input);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	/**
	 * @return the _input
	 */
	public ExtensionCollectionNode getInput() {
		return _input;
	}

	/**
	 * @param _input the _input to set
	 */
	public void setInput(ExtensionCollectionNode _input) {
		this._input = _input;
	}

}
