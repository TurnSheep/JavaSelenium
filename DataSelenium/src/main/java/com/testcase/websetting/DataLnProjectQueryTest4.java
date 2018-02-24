package com.testcase.websetting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.autoframe.lib.DataStore;
import com.project.lib.ObjectStore;

public class DataLnProjectQueryTest4   {

		// TODO Auto-generated constructor stub
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


	

//	@Test
//	public void test001() throws Exception {
//		String DataLnProjectQuery1="项目查询-关键字查询";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.newType(ObjectStore.ProjectQueryTwo, DataStore.D_ProjectQueryOne);
//		DataLn.Query();
//		DataLn.newClick(ObjectStore.projectQueryThree);
//		DataLn.newVerifyEquals(DataLnProjectQuery1, true, DataLn.isTextPresent(ObjectStore.NameVerification));
//}
//	@Test
//	public void test002() throws Exception {
//		String DataLnProjectQuery2="备案名查询";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.newType(ObjectStore.ProjectQueryThreeOne, DataStore.D_ProjectQueryTwo);
//		DataLn.Query();
//	    DataLn.newClick(ObjectStore.projectQueryThree);
//		DataLn.newVerifyEquals(DataLnProjectQuery2, true, DataLn.isTextPresent(ObjectStore.NameVerification));
//}
//	@Test
//	public void test003() throws Exception {
//		String DataLnProjectQuery3="日期查询";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
//		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
//		DataLn.Query();
//        DataLn.newClick(ObjectStore.projectQueryThree);	
//		DataLn.newVerifyEquals(DataLnProjectQuery3, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.R_DataVerifiation)));
//		}
//	@Test
//		public void test004() throws Exception {
//		String DataLnProjectQuery4="销售状态";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
//		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
//		DataLn.newClick(ObjectStore.SalesStatus);
//		DataLn.Query();
//        DataLn.newClick(ObjectStore.projectQueryThree);
//		DataLn.newVerifyEquals(DataLnProjectQuery4, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.SalesStatusVerifiation)));
//		}
//	@Test
//		public void test005() throws Exception {
//		String DataLnProjectQuery5="项目查询-区县板块选择";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
//		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
//		DataLn.newClick(ObjectStore.SalesStatus);
//		DataLn.newClick(ObjectStore.Area);
//		DataLn.newClick(ObjectStore.Plate);
//		DataLn.Query();
//	    DataLn.newClick(ObjectStore.projectQueryThree);
//		DataLn.newVerifyEquals(DataLnProjectQuery5, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.AreaPlate)));
//		}
//	@Test
//		public void test006() throws Exception {
//		String DataLnProjectQuery6="项目查询-物业类型";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.ProjectQueryOne);
//		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
//		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
//		DataLn.newClick(ObjectStore.SalesStatus);
//		DataLn.newClick(ObjectStore.Area);
//		DataLn.newClick(ObjectStore.Plate);
//		DataLn.newClick(ObjectStore.PropertyOne);
//		DataLn.newClick(ObjectStore.PropertyOne);
//		DataLn.newClick(ObjectStore.PropertyTwo);
//		DataLn.Query();
//        DataLn.newClick(ObjectStore.projectQueryThree);
//		DataLn.newVerifyEquals(DataLnProjectQuery6, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.PropertyVerifiation)));
//		}
	@Test
		public void test007() throws Exception {
		String DataLnProjectQuery7="项目查询-环线";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.SalesStatus);
		DataLn.newClick(ObjectStore.Area);
		DataLn.newClick(ObjectStore.Plate);
	    DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.PropertyTwo);
		DataLn.newClick(ObjectStore.Open);
		DataLn.newClick(ObjectStore.LoopLine);
		DataLn.Query();
        DataLn.newClick(ObjectStore.projectQueryThree);	
		DataLn.newVerifyEquals(DataLnProjectQuery7, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.LoopLineVerifiation)));
		}
	@Test
		public void test008() throws Exception {
		String DataLnProjectQuery8="项目查询-地铁";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.SalesStatus);
		DataLn.newClick(ObjectStore.Area);
		DataLn.newClick(ObjectStore.Plate);
	    DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.PropertyTwo);
		DataLn.newClick(ObjectStore.Open);
		DataLn.newClick(ObjectStore.LoopLine);
		DataLn.newClick(ObjectStore.MetroLine);
		DataLn.Query();
        DataLn.newClick(ObjectStore.projectQueryThree);
		DataLn.newVerifyEquals(DataLnProjectQuery8, true, DataLn.isTextPresent(ObjectStore.MetroLineVerifiation));
		}
	@Test
		public void test009() throws Exception {
		String DataLnProjectQuery9="项目查询-保存模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.Area);
		DataLn.newClick(ObjectStore.Plate);
		DataLn.newClick(ObjectStore.BrandHousingPricesInput);
		DataLn.newType(ObjectStore.BrandHousingPricesInput,DataStore.D_BrandHousingPrice);
		DataLn.newClick(ObjectStore.BrandHousingPrices);
		DataLn.Query();
		DataLn.newClick(ObjectStore.SaveInput);
		DataLn.newType(ObjectStore.SaveInput, DataStore.D_SaveInput);
		DataLn.newClick(ObjectStore.SaveButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newVerifyEquals(DataLnProjectQuery9, true, DataLn.isTextPresent(ObjectStore.SaveListVerifiation));		
}
	@Test
	public void test010() throws Exception {
		String DataLnProjectQuery10="项目查询-根据模板查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.SaveQuery);
		DataLn.newVerifyEquals(DataLnProjectQuery10, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.SaveQuerVerifiation)));
	}
	@Test
	public void test011() throws Exception {
		String DataLnProjectQuery11="项目查询-下载数据";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.newClick(ObjectStore.SalesStatus);
		DataLn.newClick(ObjectStore.Area);
		DataLn.newClick(ObjectStore.Plate);
		DataLn.Query();
		DataLn.newClick(ObjectStore.DownloadData);
		DataLn.newClick(ObjectStore.DownloadDataButton);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.DownloadDataOneTwo);
		DataLn.newVerifyEquals(DataLnProjectQuery11, true, DataLn.isTextPresent(ObjectStore.DownloadDataVerifiation));
	
	}
	@Test
	public void test012() throws Exception {
		String DataLnProjectQuery12="项目查询-显示更多列-减少";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.ShowMoreColumnsOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnProjectQuery12, false,  DataLn.isTextPresent(ObjectStore.ShowMoreColumnsVerifiation));
	}
	@Test
	public void test013() throws Exception {
		String DataLnProjectQuery13="项目查询-显示更多列-增加";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.ShowMoreColumnsOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnProjectQuery13, true, DataLn.isTextPresent(ObjectStore.ShowMoreColumnsVerifiation));
		
	}
	@Test
	public void test014() throws Exception {
		String DataLnProjectQuery13="项目查询-添加至自定义项目组";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectQueryOne);
		DataLn.newType(ObjectStore.ProjectQueryThreeOne, DataStore.D_ProjectQueryTwo);
		DataLn.Query();
		DataLn.newClick(ObjectStore.Custom);
		DataLn.newClick(ObjectStore.CustomOne);
		DataLn.newClick(ObjectStore.CustomTwo);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.CustomFour);
		DataLn.newClick(ObjectStore.CustomFive);
		DataLn.newVerifyEquals(DataLnProjectQuery13, true, DataLn.isTextPresent(ObjectStore.CustomVerifiation));
		
	}
	@Test
	public void test015() throws Exception {
	String DataLnProjectQuery15="项目查询-品牌房企";
	DataLn.newClick(ObjectStore.ProjectQuery);
	DataLn.newClick(ObjectStore.ProjectQueryOne);
	DataLn.RemoveScript(ObjectStore.R_Startid, ObjectStore.R_Startscript, DataStore.D_StartData);
	DataLn.RemoveScript(ObjectStore.R_Endid, ObjectStore.R_Endscript, DataStore.D_EndtData);
	DataLn.newClick(ObjectStore.AreaOne);
	DataLn.newClick(ObjectStore.BrandHousingPricesInput);
	DataLn.newType(ObjectStore.BrandHousingPricesInput,DataStore.D_BrandHousingPrice);
	DataLn.newClick(ObjectStore.BrandHousingPrices);
	DataLn.Query();
	DataLn.newVerifyEquals(DataLnProjectQuery15, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.R_BrandHousingPricesVerifiation)));
}
}

