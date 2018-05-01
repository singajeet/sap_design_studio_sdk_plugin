package com.armin.sap.ds.ext.navigator.sorter;

import java.util.Comparator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import com.armin.sap.ds.ext.navigator.elements.DesignStudioProjectResAPS;
import com.armin.sap.ds.ext.navigator.elements.DesignStudioProjectResCSS;
import com.armin.sap.ds.ext.navigator.elements.DesignStudioProjectResJS;
import com.armin.sap.ds.ext.navigator.elements.IDesignStudioProjectElement;

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
        String catName1 = ((IDesignStudioProjectElement)e1).getText();
        String catName2 = ((IDesignStudioProjectElement)e2).getText();
         
        int result = -1;
        if (catName1.equals(DesignStudioProjectResJS.NAME)) {
            result = -1;
        } else if (catName2.equals(DesignStudioProjectResAPS.NAME)) {
            result = 1;
        } else if (catName1.equals(DesignStudioProjectResCSS.NAME)) {
            result = -1;
        } else if (catName1.equals(DesignStudioProjectResJS.NAME)) {
            result = 1;
        } // else result == -1
         
        return result;
    }

}
