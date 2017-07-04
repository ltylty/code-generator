/**
 * 
 */
package com.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;

/**
 * @author 
 *
 */
public class MyResourceLoader extends ResourceLoader {

	/* (non-Javadoc)
	 * @see org.apache.velocity.runtime.resource.loader.ResourceLoader#getLastModified(org.apache.velocity.runtime.resource.Resource)
	 */
	@Override
	public long getLastModified(Resource arg0) {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.apache.velocity.runtime.resource.loader.ResourceLoader#getResourceStream(java.lang.String)
	 */
	@Override
	public synchronized    InputStream getResourceStream(String arg0)
			throws ResourceNotFoundException {
		InputStream result = null;

		if (arg0 == null || arg0.length() == 0) {
			throw new ResourceNotFoundException("");
		}
		result = new ByteArrayInputStream(arg0.getBytes());
		return result;
	}

	/* (non-Javadoc)
	 * @see org.apache.velocity.runtime.resource.loader.ResourceLoader#init(org.apache.commons.collections.ExtendedProperties)
	 */
	@Override
	public void init(ExtendedProperties arg0) {
		
	}

	/* (non-Javadoc)
	 * @see org.apache.velocity.runtime.resource.loader.ResourceLoader#isSourceModified(org.apache.velocity.runtime.resource.Resource)
	 */
	@Override
	public boolean isSourceModified(Resource arg0) {
		return false;
	}

}
