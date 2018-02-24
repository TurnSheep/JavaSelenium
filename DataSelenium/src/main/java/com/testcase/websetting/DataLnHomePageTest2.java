package com.testcase.websetting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.autoframe.lib.DataStore;
import com.autoframe.lib.TitleStore;
import com.project.lib.ObjectStore;

public class DataLnHomePageTest2 {
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
	public void test001()throws Exception {
		String DataLnCasePage1="首页-城市切换";
		DataLn.newClick(ObjectStore.HomePage_SwitchingCity);
		DataLn.newClick(ObjectStore.HomePage_Switchinglink);
		DataLn.newClick(ObjectStore.PromptBulletBox);
		DataLn.newVerifyEquals(DataLnCasePage1,true ,DataLn.isTextPresent(ObjectStore.text));
	}
	@Test
		public void test002()throws Exception {
		String DataLnCasePage2="我的项目-添加在售项目";
		DataLn.newClick(ObjectStore.HomePage_AddItem);
		DataLn.newType(ObjectStore.HomePage_AddItemSearch, DataStore.D_SearchItemName);
		DataLn.newClick(ObjectStore.HomePage_AddItemSearchButton);
		DataLn.newClick(ObjectStore.HomePage_AddItemSelection);
		DataLn.newClick(ObjectStore.HomePage_AddItemDetermine);
		DataLn.newVerifyEquals(DataLnCasePage2, true, DataLn.isTextPresent(ObjectStore.HomePage_AddItemVerification));
//		String DataLnCasePage3="首页-数据存在";
//		DataLn.newVerifyEquals(DataLnCasePage3, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_Data)));
	}
	@Test
	public void test003()throws Exception {
		String DataLnCasePage4="首页-我的常用查询-全市日供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQueryOne);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage4, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQueryOneVerification)));
	}
	@Test
	public void test004()throws Exception {
		String DataLnCasePage5="首页-我的常用查询-各区日供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQueryTwo);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage5, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQueryOneVerification)));
	}
	@Test
	public void test005()throws Exception {
		String DataLnCasePage6="首页-我的常用查询-全市月供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQueryThree);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage6, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQueryOneVerification)));
	}
	@Test
	public void test006()throws Exception {
		String DataLnCasePage7="首页-我的常用查询-各区月供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQueryFour);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage7, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQueryTwoVerification)));
	}
	@Test
	public void test007()throws Exception {
		String DataLnCasePage8="首页-我的常用查询-各面积段月供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQueryFive);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage8, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQueryFiveVerification)));
	}
	@Test
	public void test008()throws Exception {
		String DataLnCasePage9="首页-我的常用查询-各总价段月供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQuerySix);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage9, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQuerySixVerification)));
	}
	@Test
	public void test009()throws Exception {
		String DataLnCasePage10="首页-我的常用查询-各单价段月供求";
		DataLn.newClick(ObjectStore.HomePage_CommonQuerySeven);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage10, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.HomePage_CommonQuerySevenVerification)));
	}	
	@Test
	
	public void test010()throws Exception {
		String DataLnCasePage11="首页-我的项目-项目供销存更多";
		DataLn.newClick(ObjectStore.HomePage_AddItemMore);
		DataLn.swithchToWindow(TitleStore.HomePage_ProjectStatisticsTitle);
		DataLn.newVerifyEquals(DataLnCasePage11, true, DataLn.isTextPresent(ObjectStore.HomePage_AddItemMoreVerification));	
	}
	@Test
	public void test011()throws Exception {
		String DataLnCasePage12="首页-项目销售排行榜-周销售排行榜";
		DataLn.newClick(ObjectStore.HomePage_WeekSalesRankingMore);
		DataLn.swithchToWindow(TitleStore.HomePage_ProjectStatisticsTitle);
		DataLn.newVerifyEquals(DataLnCasePage12, true, DataLn.isTextPresent(ObjectStore.HomePage_SalesRankingVerification));
    }	
	@Test
		public void test012()throws Exception {
		String DataLnCasePage13="首页-项目销售排行榜-月销售排行榜";
		DataLn.newClick(ObjectStore.HomePage_MonthSalesRankingMore);
		DataLn.swithchToWindow(TitleStore.HomePage_ProjectStatisticsTitle);
		DataLn.newVerifyEquals(DataLnCasePage13, true, DataLn.isTextPresent(ObjectStore.HomePage_SalesRankingVerification));
    }	
	@Test
		public void test013()throws Exception {
		String DataLnCasePage14="首页-项目销售排行榜-季销售排行榜";
		DataLn.newClick(ObjectStore.HomePage_SeasonSalesRankingMore);
		DataLn.swithchToWindow(TitleStore.HomePage_ProjectStatisticsTitle);
		DataLn.newVerifyEquals(DataLnCasePage14, true, DataLn.isTextPresent(ObjectStore.HomePage_SalesRankingVerification));
    }	
	@Test
		public void test014()throws Exception {
		String DataLnCasePage15="首页-物业类型销售统计-周销售";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_WeekPropertyTypeMore);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage15, true, DataLn.isTextPresent(ObjectStore.HomePage_PropertyTypeMoreVerification));
    }	
	@Test
		public void test015()throws Exception {
		String DataLnCasePage16="首页-物业类型销售统计-月销售";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_MonthPropertyTypeMore);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage16, true, DataLn.isTextPresent(ObjectStore.HomePage_PropertyTypeMoreVerification));
    }
	@Test
		public void test016()throws Exception {
		String DataLnCasePage17="首页-物业类型销售统计-季销售";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_SeasonPropertyTypeMore);
		DataLn.swithchToWindow(TitleStore.HomePage_CommonQueryTitle);
		DataLn.newVerifyEquals(DataLnCasePage17, true, DataLn.isTextPresent(ObjectStore.HomePage_PropertyTypeMoreVerification));
		
    }
	@Test
	public void test017()throws Exception {
		String DataLnCasePage18="首页-土地资讯-土地挂牌";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_LandInformationMore);
		DataLn.swithchToWindow(TitleStore.HomePage_LandInformationTitle);
		DataLn.newVerifyEquals(DataLnCasePage18, true, DataLn.isTextPresent(ObjectStore.HomePage_LandListingVerification));
	}
	@Test
	public void test018()throws Exception{
		String DataLnCasePage19="首页-土地资讯-土地成交";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_LandTransActionMore);
		DataLn.swithchToWindow(TitleStore.HomePage_LandInformationTitle);
		DataLn.newVerifyEquals(DataLnCasePage19, true, DataLn.isTextPresent(ObjectStore.HomePage_LandTransActionVerification));
	}
	@Test
		public void test019()throws Exception{
		String DataLnCasePage20="首页-研究快报-每周快报";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_WeeklyExpressMore);
		DataLn.swithchToWindow(TitleStore.HomePage_MarketReportTitle);
		DataLn.newVerifyEquals(DataLnCasePage20, true, DataLn.isTextPresent(ObjectStore.HomePage_MarketReporVerification));
	}
	@Test
		public void test020()throws Exception{
		String DataLnCasePage21="首页-研究快报-每周快报";
		DataLn.newRunScript(DataStore.D_js);
		DataLn.newClick(ObjectStore.HomePage_MonthlyExpressMore);
		DataLn.swithchToWindow(TitleStore.HomePage_MarketReportTitle);
		DataLn.newVerifyEquals(DataLnCasePage21, true, DataLn.isTextPresent(ObjectStore.HomePage_MarketReporVerification));
	}


}
