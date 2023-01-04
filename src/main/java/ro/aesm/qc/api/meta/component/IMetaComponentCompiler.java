package ro.aesm.qc.api.meta.component;

import java.util.Map;

import ro.aesm.qc.api.exception.QcResourceException;

public interface IMetaComponentCompiler {

	public Map<String, Object> compile(IMetaComponentModel metaModel) throws QcResourceException;
}
