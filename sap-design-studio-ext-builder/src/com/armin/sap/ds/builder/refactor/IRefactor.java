package com.armin.sap.ds.builder.refactor;

public interface IRefactor {
	void renameId(String oldId, String newId);
	void rename(String oldName, String newName);
	void refactorObject(String oldName, String newName);
}
