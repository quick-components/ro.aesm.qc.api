package ro.aesm.qc.api.meta.component;

import java.util.List;
import java.util.Map;

import org.w3c.dom.Node;

import ro.aesm.qc.api.exception.QcResourceException;

public interface IMetaComponentParser {

	public String getTag();

	public IMetaComponentModel parse(Node node) throws QcResourceException;

	public List<IMetaComponentModel> parseChildrenAsList(Node node) throws QcResourceException;

	public Map<String, IMetaComponentModel> parseChildrenAsMap(Node node) throws QcResourceException;

}
