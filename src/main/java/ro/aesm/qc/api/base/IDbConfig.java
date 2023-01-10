package ro.aesm.qc.api.base;

public interface IDbConfig {
	public String getName();

	public String getEngine();

	public String getHost();

	public String getPort();

	public String getDatabase();

	public String getUser();

	public char[] getPassword();

}
