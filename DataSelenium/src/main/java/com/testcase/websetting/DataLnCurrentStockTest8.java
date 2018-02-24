package com.testcase.websetting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autoframe.lib.DataStore;
import com.project.lib.ObjectStore;

public class DataLnCurrentStockTest8 {
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
	public void test() throws Exception {
		String DataLnCurrentStockTest01="当前存量分析-统计方式时间查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.D_CurrentStock);
		DataLn.newClick(ObjectStore.D_CurrentStockTime);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.D_PropertyType);
		DataLn.newClick(ObjectStore.D_PropertyTypeOne);
		DataLn.newClick(ObjectStore.D_Plate);
		DataLn.newClick(ObjectStore.D_PlateOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCurrentStockTest01, true, DataLn.isTextPresent(ObjectStore.D_Verifiation));
	}

}
