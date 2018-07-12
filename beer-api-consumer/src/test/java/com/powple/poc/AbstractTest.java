package com.powple.poc;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.springframework.boot.test.json.JacksonTester;

/**
 * @author Marcin Grzejszczak
 * @author Arnaud Deprez
 */
public abstract class AbstractTest {

	private static String ENV_REPLACEMENT = "[\\.\\-]";

	public JacksonTester<Person> json;
	public JacksonTester<StatsRequest> statsJson;

	@Before
	public void setup() {
		ObjectMapper objectMappper = new ObjectMapper();
		// Possibly configure the mapper
		JacksonTester.initFields(this, objectMappper);
	}

	public static String getVersion(String groupId, String artifactId) {
		return System.getProperty("stubs." + groupId + "." + artifactId + ".version",
			System.getenv().getOrDefault(
				"STUBS_" + groupId.toUpperCase().replaceAll(ENV_REPLACEMENT, "_") + "_" + artifactId.toUpperCase().replaceAll(ENV_REPLACEMENT, "_") + "_VERSION",
				"+"));
	}
}
