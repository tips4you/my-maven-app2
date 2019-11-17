package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{


	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testAppConstructor() {
		try {
			new App();
			System.out.println("Hello World Test from Varun....." );
		} catch (Exception e) {
			fail("Construction failed.");
		}
	}

	@Test
	public void testAppMain()
	{
		App.main(null);


		String actualMsg="Hello World!";

		System.out.println("Hello World Test from Varun....." );

		try {
			assertEquals("Hello World!", actualMsg);
		} catch (AssertionError e) {
			fail("\"message\" is not \"Hello World!\"");
		}
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

}
