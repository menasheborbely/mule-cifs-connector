package org.cg.mule.cifs.errors;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

public enum CIFSErrors implements ErrorTypeDefinition<CIFSErrors> {
	FILE_WRITE_ERROR,
	FILE_READ_ERROR,
	FILES_MAP_AND_READ_ERROR,
	FILES_LISTING_ERROR,
	FILE_DELETE_ERROR;
}
