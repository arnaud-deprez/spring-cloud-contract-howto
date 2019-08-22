package com.powple.poc.intoxication;

import org.springframework.stereotype.Service;

/**
 * @author Marcin Grzejszczak
 * @author Arnaud Deprez
 */
@Service
class NoOpResponseProvider implements ResponseProvider {
	@Override public Response thereYouGo(Customer personToCheck) {
		return null;
	}
}
