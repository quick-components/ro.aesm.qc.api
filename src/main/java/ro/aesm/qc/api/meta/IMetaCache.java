package ro.aesm.qc.api.meta;

import java.util.Set;

public interface IMetaCache {

	public void put(String key, IMetaResourceModel model);

	public IMetaResourceModel get(String key);

	public boolean contains(String key);

	public Set<String> getKeys();

	public void clearCache();

}