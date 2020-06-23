package org.cg.mule.cifs.errors;

import java.util.HashSet;
import java.util.Set;

import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

public class ExecuteErrorsProvider implements ErrorTypeProvider {

	@Override
	public Set<ErrorTypeDefinition> getErrorTypes() {
		HashSet<ErrorTypeDefinition> errors = new HashSet<>();
		errors.add(CIFSErrors.FILES_LISTING_ERROR);
		errors.add(CIFSErrors.FILES_MAP_AND_READ_ERROR);
		errors.add(CIFSErrors.FILE_READ_ERROR);
		errors.add(CIFSErrors.FILE_WRITE_ERROR);
		errors.add(CIFSErrors.FILE_DELETE_ERROR);
		return errors;
	}

}
