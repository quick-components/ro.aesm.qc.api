package ro.aesm.qc.api.base;

import java.io.File;
import java.io.InputStream;

import ro.aesm.qc.api.exception.QcResourceException;

public interface IXmlResourceParser {

	public Object parse(String content) throws QcResourceException;

	public Object parse(InputStream inputStream) throws QcResourceException;

	public Object parse(File file) throws QcResourceException;
}
