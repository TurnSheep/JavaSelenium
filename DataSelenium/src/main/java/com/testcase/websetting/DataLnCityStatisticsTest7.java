package com.testcase.websetting;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Test;
import com.autoframe.lib.DataStore;
import com.autoframe.lib.RobotKeyboard;
import com.autoframe.lib.TitleStore;
import com.project.lib.ObjectStore;

public class DataLnCityStatisticsTest7 {

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
	public void test001() throws Exception {
		String DataLnCityStatisticsTest01="全市统计分析-分析周期查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_week);
		DataLn.newClick(ObjectStore.C_Start);
		DataLn.newClick(ObjectStore.C_weekStartlist);
		DataLn.newClick(ObjectStore.C_WeekTwo);
		DataLn.newClick(ObjectStore.C_End);
		DataLn.newClick(ObjectStore.C_weekEndlist);
		DataLn.newClick(ObjectStore.C_WeekTwo);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest01, true, DataLn.isTextPresent(ObjectStore.C_WeekVerifiation));
		
	}
	@Test
	public void test002() throws Exception {
		String DataLnCityStatisticsTest02="全市统计分析-月查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newClick(ObjectStore.C_Start);
		DataLn.newClick(ObjectStore.C_monthStartlist);
		DataLn.newClick(ObjectStore.C_End);
		DataLn.newClick(ObjectStore.C_monthEndlist);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest02, true, DataLn.isTextPresent(ObjectStore.C_monthVerifiation));
		
	}
	@Test
	public void test003() throws Exception {
		String DataLnCityStatisticsTest03="全市统计分析-季查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_Season);
		DataLn.newClick(ObjectStore.C_Start);
		DataLn.newClick(ObjectStore.C_SeasonStartlist);
		DataLn.newClick(ObjectStore.C_End);
		DataLn.newClick(ObjectStore.C_SeasonEndlist);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest03, true, DataLn.isTextPresent(ObjectStore.C_SeasonVerifiation));
		
	}
	@Test
	public void test004() throws Exception {
		String DataLnCityStatisticsTest04="全市统计分析-年查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_year);
		DataLn.newClick(ObjectStore.C_Start);
		DataLn.newClick(ObjectStore.C_yearlist);
		DataLn.newClick(ObjectStore.C_year);
		DataLn.newClick(ObjectStore.C_End);
		DataLn.newClick(ObjectStore.C_yearlist);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest04, true, DataLn.isTextPresent(ObjectStore.C_yearVerifiation));
		
	}
	@Test
	public void test005() throws Exception {
		String DataLnCityStatisticsTest05="全市统计分析-天查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_Day);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_DayOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_DayTwo);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest05, true, DataLn.isTextPresent(ObjectStore.C_DayVerifiation));
		
	}
	@Test
	public void test006() throws Exception {
		String DataLnCityStatisticsTest06="全市统计分析-成交状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest06, true, DataLn.isTextPresent(ObjectStore.C_TransactionStatus));	
	}
	@Test
	public void test007() throws Exception {
		String DataLnCityStatisticsTest07="全市统计分析-销售状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_SalesStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest07, true, DataLn.isTextPresent(ObjectStore.C_SalesStatusVerifiation));
	}
	@Test
	public void test008() throws Exception {
		String DataLnCityStatisticsTest08="全市统计分析-区县选择";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest08, true, DataLn.isTextPresent(ObjectStore.C_p_Area));
	}
	@Test
	public void test009() throws Exception {
		String DataLnCityStatisticsTest09="全市统计分析-物业类型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.PropertyOne);
		DataLn.newClick(ObjectStore.B_Property);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest09, true, DataLn.isTextPresent(ObjectStore.C_PropertyVerifiation));
	}
	@Test
	public void test010() throws Exception {
		String DataLnCityStatisticsTest10="全市统计分析-户型选择";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_RoomTypeOne);
		DataLn.newClick(ObjectStore.C_RoomTypeTwo);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest10, true, DataLn.isTextPresent(ObjectStore.C_RoomTypeVerifiation));
	}
	@Test
	public void test011() throws Exception {
		String DataLnCityStatisticsTest11="全市统计分析-总价查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.C_TotalOne);
		DataLn.newClick(ObjectStore.C_TotalTwo);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest11, true, DataLn.isTextPresent(ObjectStore.C_TotalVerifiation));
	}
	@Test
	public void test012() throws Exception {
		String DataLnCityStatisticsTest12="全市统计分析-房间面积查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.C_RoomArea);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest12, true, DataLn.isTextPresent(ObjectStore.C_RoomAreaVerifiation));
	}
	@Test
	public void test013() throws Exception {
		String DataLnCityStatisticsTest13="全市统计分析-单价查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_UnitPrice);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest13, true, DataLn.isTextPresent(ObjectStore.C_UnitPriceVerifiation));
	}
	@Test
	public void test014() throws Exception {
		String DataLnCityStatisticsTest14="全市统计分析-最高楼层";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_Floor);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest14, true, DataLn.isTextPresent(ObjectStore.C_FloorVerifiation));
	}
	@Test
	public void test015() throws Exception {
		String DataLnCityStatisticsTest15="全市统计分析-环线";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_LoopLine);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest15, true, DataLn.isTextPresent(ObjectStore.C_LoopLineVerifiation));
	}
	@Test
	public void test016() throws Exception {
		String DataLnCityStatisticsTest16="全市统计分析-地铁线路";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.C_Metro);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCityStatisticsTest16, true, DataLn.isTextPresent(ObjectStore.C_MetroVerifiation));
	}
	@Test
	public void test017() throws Exception {
		String DataLnCityStatisticsTest17="全市统计分析-保存模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.SaveInput);
		DataLn.newType(ObjectStore.SaveInput, DataStore.C_SaveInputTwo);
		DataLn.newClick(ObjectStore.SaveButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newVerifyEquals(DataLnCityStatisticsTest17, true, DataLn.isTextPresent(ObjectStore.C_SaveTemplateVerifiation));
	}
	@Test
	public void test018() throws Exception {
		String DataLnCityStatisticsTest18="全市统计分析-根据模板查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.C_SaveTempList);
		DataLn.newVerifyEquals(DataLnCityStatisticsTest18, true, DataLn.isTextPresent(ObjectStore.C_SaveTempListVerifiation));
	}
	@Test
	public void test019() throws Exception {
		String DataLnCityStatisticsTest19="全市统计分析-下载数据";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.DownloadData);
		RobotKeyboard.getInstance().typeKey(ObjectStore.DownloadDataButton, ObjectStore.Enter);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.DownloadDataOneTwo);
		DataLn.newVerifyEquals(DataLnCityStatisticsTest19, true, DataLn.isTextPresent(ObjectStore.C_DownloadDataVerifiation));
	}
	@Test
	public void test020() throws Exception {
		String DataLnCityStatisticsTest20="全市统计分析-显示更多列-减少";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.C_LoopLineOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnCityStatisticsTest20, false, DataLn.isTextPresent(ObjectStore.C_LoopLineOneVerifiation));
	}
	@Test
	public void test021() throws Exception {
		String DataLnCityStatisticsTest21="全市统计分析-显示更多列-增加";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.C_LoopLineOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnCityStatisticsTest21, true, DataLn.isTextPresent(ObjectStore.C_LoopLineOneVerifiation));
	}
	@Test
	public void test022() throws Exception {
		String DataLnBrandHousingPricesTest22="全市统计分析-供应穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.C_SaveTempList);
		DataLn.newClick(ObjectStore.C_SupplyDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest22, true, DataLn.isTextPresent(ObjectStore.C_SupplyDetailsVerifiation));
	}
	@Test
	public void test023() throws Exception {
		String DataLnBrandHousingPricesTest23="全市统计分析-成交穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.C_SaveTempList);
		DataLn.newClick(ObjectStore.C_TransactionDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest23, true, DataLn.isTextPresent(ObjectStore.C_TransactionDetailsVerifiation));
	}
	@Test
	public void test024() throws Exception {
		String DataLnBrandHousingPricesTest24="品牌统计分析-总价自定义模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.moveToElement(ObjectStore.P_Custom);
		DataLn.newClick(ObjectStore.P_CustomAdd);
		DataLn.newType(ObjectStore.P_CustomAddStart, DataStore.D__CustomAddStart);
		DataLn.newType(ObjectStore.P_CustomAddEnd, DataStore.D__CustomAddEnd);
		DataLn.newClick(ObjectStore.C_Add);
		DataLn.newClick(ObjectStore.P_CustomSaveTemplate);
		DataLn.newType(ObjectStore.P_CustomInput,DataStore.C_Custom);
		DataLn.newClick(ObjectStore.P_CustomSaveButton);
		DataLn.moveToElement(ObjectStore.P_CustomMove);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest24, true, DataLn.isTextPresent(ObjectStore.C_CustomVerifiation));
	}
	@Test
	public void test025() throws Exception {
		String DataLnBrandHousingPricesTest25="品牌房企统计分析-多项目查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.C_CityStatistics);
		DataLn.newClick(ObjectStore.C_month);
		DataLn.newJsHidden(ObjectStore.C_Start,DataStore.C_MotchOne);
		DataLn.newJsHidden(ObjectStore.C_End,DataStore.C_MotchTwo);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest25, true,DataLn.isTextPresent(ObjectStore.C_MultiQrojectVerifiation));
	}
	
	

}
