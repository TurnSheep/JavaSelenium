package com.testcase.websetting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataLnBusinessDetailsTest11 {

	static WebBussinessLib DataLn=new WebBussinessLib();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		DataLn.newSetup();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		DataLn.newTeardown();
	}

	@Before
	public void setUp() throws Exception {
		DataLn.login();
	}

	@After
	public void tearDown() throws Exception {
		DataLn.logout();
	}

	@Test
	public void test001() {
		
	}

}
