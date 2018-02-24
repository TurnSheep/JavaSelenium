package com.testcase.websetting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autoframe.lib.DataStore;
import com.autoframe.lib.TitleStore;
import com.project.lib.ObjectStore;

public class DataLnMapSearchTest3 {
	static WebBussinessLib DataLn = new WebBussinessLib();
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
	public void test001() throws Exception {
		String DataLnCaseMapSearch1="地图搜索-项目搜索";
		DataLn.newClick(ObjectStore.MapSearch);
		DataLn.swithchToWindow(TitleStore.M_Map);
		DataLn.newClick(ObjectStore.MapSearchInput);
		DataLn.newType(ObjectStore.MapSearchInput, DataStore.D_MapProjectSearch);
		DataLn.newClick(ObjectStore.MapSearchQueryOne);
		DataLn.newClick(ObjectStore.MapSearchQuery);
		DataLn.newClick(ObjectStore.MapSearchProject);
		DataLn.newClick(ObjectStore.MapSearchQueryTwo);
		DataLn.newVerifyEquals(DataLnCaseMapSearch1, true, DataLn.isTextPresent(ObjectStore.MapSearchProjectVerification));
	}
	@Test
	public void test002() throws Exception {
		String DataLnCaseMapSearch2="地图搜索-土地搜索";
		DataLn.newClick(ObjectStore.MapSearch);
		DataLn.swithchToWindow(TitleStore.M_Map);
		DataLn.newClick(ObjectStore.MapLandOne);
		DataLn.newClick(ObjectStore.MapLandTwo);
		DataLn.newClick(ObjectStore.MapSearchInput);
		DataLn.newType(ObjectStore.MapSearchInput, DataStore.D_MapLandSearch);
		DataLn.newClick(ObjectStore.MapSearchQuery);
		DataLn.newClick(ObjectStore.MapSearchLand);
		DataLn.newVerifyEquals(DataLnCaseMapSearch2, true, DataLn.isTextPresent(ObjectStore.MapSearchLandVerification));
		
	}
	
	
	
}
