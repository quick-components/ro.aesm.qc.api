package ro.aesm.qc.api.base;

public interface IDbConfigProvider {

	public IDbConfig getConfig(String name);

	public void addConfig(String name, IDbConfig config);
}
