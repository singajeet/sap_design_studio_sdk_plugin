package com.armin.sap.ds.builder.refactor;

import com.armin.sap.ds.builder.api.models.domain.Component;
import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.api.models.domain.IModel;
import com.armin.sap.ds.builder.api.models.domain.RequireJSType;

public class RefactorExtensionModel extends RefactorModel {

	
	public RefactorExtensionModel(IModel model) {
		super(model);
	}

	@Override
	public void renameId(String oldId, String newId) {
		super.renameId(oldId, newId);	
		this.renameIdInChilds();
	}

	@Override
	public void rename(String oldName, String newName) {
		super.rename(oldName, newName);
	}

	public void renameIdInChilds() {

		//Make changes in the child comps for this extension
		for(Component comp : ((Extension)_model).getComponent()) {
			if(comp != null) {
				//Make changes in icon path to have parent folder as the newID of this extension
				if(comp.getIcon() != null && !comp.getIcon().isEmpty()) {
					comp.setIcon(comp.getIcon().replace(_oldId, _newId));
				}
				
				//CSS Path
				for(String cssPath : comp.getCssInclude()) {
					if(cssPath.toUpperCase().contains(_oldId.toUpperCase())) {
						comp.getCssInclude().remove(cssPath);
						String replacedPath = cssPath.replace(_oldId, _newId);
						comp.getCssInclude().add(replacedPath);
					}
				}
				
				//JavaScript Path
				for(String jsPath : comp.getJsInclude()) {
					if(jsPath.toUpperCase().contains(_oldId.toUpperCase())) {
						comp.getJsInclude().remove(jsPath);
						String replacedPath = jsPath.replace(_oldId, _newId);
						comp.getJsInclude().add(replacedPath);
					}
				}
				
				//APS Path
				if(comp.getPropertySheetPath() != null && !comp.getPropertySheetPath().isEmpty()) {
					comp.setPropertySheetPath(comp.getPropertySheetPath().replace(_oldId, _newId));
				}
				
				//RequireJS path
				for(RequireJSType js : comp.getRequireJs()) {
					if(js.getValue() != null && !js.getValue().isEmpty()) {						
						js.setValue(js.getValue().replace(_oldId, _newId));
					}
				}
			}
		}
	}
}
