package com.armin.sap.ds.ext.navigator.sorter;

import java.util.Comparator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import com.armin.sap.ds.ext.navigator.elements.AdvancedPropertySheetNode;
import com.armin.sap.ds.ext.navigator.elements.CascadeStyleSheetNode;
import com.armin.sap.ds.ext.navigator.elements.JavaScriptNode;
import com.armin.sap.ds.ext.navigator.elements.IProjectItemNode;

public class CategorySorter extends ViewerComparator {

	public CategorySorter() {
		// TODO Auto-generated constructor stub
	}

	public CategorySorter(Comparator<? super String> comparator) {
		super(comparator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public int compare(Viewer viewer, Object e1, Object e2) {
        String name1 = ((IProjectItemNode)e1).getName();
        String name2 = ((IProjectItemNode)e2).getName();
        
        return String.CASE_INSENSITIVE_ORDER.compare(name1, name2);
    }

}
