package ro.aesm.qc.api.meta;

public interface IMetaOid {

	public String getId();

	// component
	public String getName();

	// public String getAlias();

	// resource
	// public String getModule();

	public String getResource();

	public boolean isClasspathResource();

	public String getLocation();

}