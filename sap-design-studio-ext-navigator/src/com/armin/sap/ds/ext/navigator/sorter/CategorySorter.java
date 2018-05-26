package com.armin.sap.ds.ext.navigator.sorter;

import java.util.Comparator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

import com.armin.sap.ds.ext.navigator.elements.AdvancedPropertySheetFile;
import com.armin.sap.ds.ext.navigator.elements.CascadeStyleSheetFile;
import com.armin.sap.ds.ext.navigator.elements.JavaScriptFile;
import com.armin.sap.ds.ext.navigator.elements.IProjectElement;

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
        String catName1 = ((IProjectElement)e1).getText();
        String catName2 = ((IProjectElement)e2).getText();
         
        int result = -1;
        if (catName1.equals(JavaScriptFile.NAME)) {
            result = -1;
        } else if (catName2.equals(AdvancedPropertySheetFile.NAME)) {
            result = 1;
        } else if (catName1.equals(CascadeStyleSheetFile.NAME)) {
            result = -1;
        } else if (catName1.equals(JavaScriptFile.NAME)) {
            result = 1;
        } // else result == -1
         
        return result;
    }

}
