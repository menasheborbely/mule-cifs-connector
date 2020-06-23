package io.idstudios.mule.extension.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.cg.mule.cifs.errors.CIFSErrors;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "cifs")
@Extension(name = "CIFS")
@Configurations(CIFSConfiguration.class)
@ErrorTypes(CIFSErrors.class)
public class CIFSExtension {

}
