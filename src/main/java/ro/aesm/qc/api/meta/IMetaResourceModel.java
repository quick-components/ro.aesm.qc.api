package ro.aesm.qc.api.meta;

import java.util.List;
import java.util.Map;

import ro.aesm.qc.api.meta.component.IMetaComponentModel;

public interface IMetaResourceModel {

	public static final String TYPE_MODEL = "model";
	public static final String TYPE_DATASET = "ds";
	public static final String TYPE_TEXT = "txt";
	public static final String TYPE_UI = "ui";

	public void add(IMetaComponentModel model);

	public void add(List<IMetaComponentModel> list);

	// model
	public List<IMetaComponentModel> getModelList();

	public Map<String, IMetaComponentModel> getModelMap();

	public IMetaComponentModel getModel(String name);

}