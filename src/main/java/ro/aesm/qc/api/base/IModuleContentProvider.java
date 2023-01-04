package ro.aesm.qc.api.base;

import java.io.InputStream;

public interface IModuleContentProvider {

	public InputStream getResourceAsStream(String name);

	public String getTemplatesPathPrefix();

	public String getTemplatesPathSuffix();

}
