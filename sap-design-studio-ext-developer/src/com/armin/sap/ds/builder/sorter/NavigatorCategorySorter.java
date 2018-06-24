package com.armin.sap.ds.builder.sorter;

import java.util.Comparator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class NavigatorCategorySorter extends ViewerComparator {

	public NavigatorCategorySorter() {
		// TODO Auto-generated constructor stub
	}

	public NavigatorCategorySorter(Comparator<? super String> comparator) {
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
