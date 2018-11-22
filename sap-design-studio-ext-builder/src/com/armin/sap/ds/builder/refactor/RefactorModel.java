package com.armin.sap.ds.builder.refactor;

import com.armin.sap.ds.builder.api.models.domain.IModel;

public class RefactorModel implements IRefactor {

	protected IModel _model;
	protected String _oldId;
	protected String _newId;
	protected String _oldName;
	protected String _newName;
	
	public RefactorModel(IModel model) {
		this._model = model;
	}

	@Override
	public void renameId(String oldId, String newId) {
		_oldId = oldId;
		_newId = newId;
		_model.setId(_newId);
	}

	@Override
	public void rename(String oldName, String newName) {
		_oldName = oldName;
		_newName = newName;
		_model.setName(_newName.toUpperCase());
	}
	
	public void refactorObject(String oldName, String newName) {
		
	}

}
