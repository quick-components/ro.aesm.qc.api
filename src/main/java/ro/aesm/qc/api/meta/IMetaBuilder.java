package ro.aesm.qc.api.meta;

import java.io.InputStream;
import java.util.Map;

import ro.aesm.qc.api.exception.QcResourceException;
import ro.aesm.qc.api.meta.component.IMetaComponentModel;

public interface IMetaBuilder { // extends IFactoryAware {

	// ====================================================
	// ====================== resource ====================
	// ====================================================

	// load

	public InputStream loadResource(String location);

	// parse

	public IMetaResourceModel parseResource(String location) throws QcResourceException;

	public IMetaResourceModel parseResource(InputStream inputStream) throws QcResourceException;

	// ====================================================
	// ======================== model =====================
	// ====================================================

	// compile

	public Map<String, Object> compile(IMetaOid moid, IMetaComponentModel model) throws QcResourceException;

	public Map<String, Object> getCompilationResult(String id) throws QcResourceException;

	public Map<String, Object> getCompilationResult(IMetaOid moid) throws QcResourceException;

	// build (load and parse resource + compile model)

	public IMetaComponentModel buildModel(String id) throws QcResourceException;

	public IMetaComponentModel buildModel(IMetaOid moid) throws QcResourceException;

	public IMetaComponentModel getModel(IMetaOid moid) throws QcResourceException;

	// ====================================================
	// ================== getters / setters ===============
	// ====================================================

//	public IMetaCache getCache();
//	void setCache(IMetaCache cache);

	void setUseCache(boolean useCache);

	boolean isUseCache();

}