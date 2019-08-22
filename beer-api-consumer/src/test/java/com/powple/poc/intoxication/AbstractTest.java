package com.powple.poc.intoxication;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.springframework.boot.test.json.JacksonTester;

/**
 * @author Marcin Grzejszczak
 * @author Arnaud Deprez
 */
public abstract class AbstractTest {

	public JacksonTester<Person> json;

	@Before
	public void setup() {
		ObjectMapper objectMappper = new ObjectMapper();
		// Possibly configure the mapper
		JacksonTester.initFields(this, objectMappper);
	}
}
