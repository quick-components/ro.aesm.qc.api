package ro.aesm.qc.api.meta.component;

public interface IMetaComponentDescriptor<M> {
	public String getTag();

	public String getNsName();

	public String getNsAlias();

	public Class<M> getModelClass();

//	public Class<? extends IMetaComponentParser<M>> getParserClass();
//
//	public Class<? extends IMetaComponentCompiler<M>> getCompilerClass();
}
