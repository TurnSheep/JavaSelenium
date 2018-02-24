package com.testcase.websetting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autoframe.lib.DataStore;
import com.autoframe.lib.RobotKeyboard;
import com.autoframe.lib.TitleStore;
import com.project.lib.ObjectStore;

public class DataLnProjectStatisticalAnalysis5 {
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
		String DataLnProjectStatisticalAnalysis01="项目统计分析-查询日期";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis01, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_DataVerifiation)));
	}
	@Test
	public void test002() throws Exception {
		String DataLnProjectStatisticalAnalysis02="项目统计分析-成交状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis02, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_DataVerifiation)));
	}
	@Test
	public void test003() throws Exception {
		String DataLnProjectStatisticalAnalysis03="项目统计分析-销售状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis03, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_SalesStatusVerifiation)));
	}
	@Test
	public void test004() throws Exception {
		String DataLnProjectStatisticalAnalysis04="项目统计分析-物业类型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis04, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_PropertyTypeVerifiation)));
	}
	@Test
	public void test005() throws Exception {
		String DataLnProjectStatisticalAnalysis05="项目统计分析-区县";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis05, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.p_AreaPlateVerifiation)));
	}
	@Test
	public void test006() throws Exception {
		String DataLnProjectStatisticalAnalysis06="项目统计分析-户型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
	    DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis06, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_RoomTypeVerifiation)));
	}

	@Test
	public void test007() throws Exception {
		String DataLnProjectStatisticalAnalysis07="项目统计分析-总价";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis07, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_TotalVerifiation)));
	}
	@Test
	public void test008() throws Exception {
		String DataLnProjectStatisticalAnalysis08="项目统计分析-房价面积";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.newClick(ObjectStore.P_RoomArea);
		DataLn.newClick(ObjectStore.P_RoomAreaOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis08, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_RoomAreaVerifiation)));
	}
	@Test
	public void test009() throws Exception {
		String DataLnProjectStatisticalAnalysis09="项目统计分析-单价";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.newClick(ObjectStore.P_RoomArea);
		DataLn.newClick(ObjectStore.P_RoomAreaOne);
		DataLn.newClick(ObjectStore.P_UnitPrice);
		DataLn.newClick(ObjectStore.P_UnitPriceOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis09, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_UnitPriceVerifiation)));
	}
	@Test
	public void test010() throws Exception {
		String DataLnProjectStatisticalAnalysis10="项目统计分析-最高楼层";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.newClick(ObjectStore.P_RoomArea);
		DataLn.newClick(ObjectStore.P_RoomAreaOne);
		DataLn.newClick(ObjectStore.P_UnitPrice);
		DataLn.newClick(ObjectStore.P_UnitPriceOne);
		DataLn.newClick(ObjectStore.P_TopFloor);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis10, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_TopFloorVerifiation)));
	}
	@Test
	public void test011() throws Exception {
		String DataLnProjectStatisticalAnalysis11="项目统计分析-环线类型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.newClick(ObjectStore.P_RoomArea);
		DataLn.newClick(ObjectStore.P_RoomAreaOne);
		DataLn.newClick(ObjectStore.P_UnitPrice);
		DataLn.newClick(ObjectStore.P_UnitPriceOne);
		DataLn.newClick(ObjectStore.P_TopFloor);
		DataLn.newClick(ObjectStore.P_LoopLine);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis11, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_LoopLineVerifiation)));
	}
	@Test
	public void test012() throws Exception {
		String DataLnProjectStatisticalAnalysis12="项目统计分析-地铁线路";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.TransactionStatusOne);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyType);
		DataLn.newClick(ObjectStore.p_Area);
		DataLn.newClick(ObjectStore.p_Plate);
		DataLn.newClick(ObjectStore.P_RoomType);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.P_Total);
		DataLn.newClick(ObjectStore.P_TotalOne);
		DataLn.newClick(ObjectStore.P_RoomArea);
		DataLn.newClick(ObjectStore.P_RoomAreaOne);
		DataLn.newClick(ObjectStore.P_UnitPrice);
		DataLn.newClick(ObjectStore.P_UnitPriceOne);
		DataLn.newClick(ObjectStore.P_TopFloor);
		DataLn.newClick(ObjectStore.P_LoopLine);
		DataLn.newClick(ObjectStore.p_MetroLine);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis12, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_MetroLineVerfifation)));
	}
	@Test
	public void test013() throws Exception {
		String DataLnProjectStatisticalAnalysis13="项目统计分析-保存模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
        DataLn.newClick(ObjectStore.P_SaveTemplateOne);
		DataLn.Query();
		DataLn.newClick(ObjectStore.SaveInput);
		DataLn.newType(ObjectStore.SaveInput, DataStore.D_SaveInputOne);
		DataLn.newClick(ObjectStore.SaveButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis13, true, DataLn.isTextPresent(ObjectStore.P_SaveTemplateVerifiation));
	}
	@Test
	public void test014() throws Exception {
		String DataLnProjectStatisticalAnalysis14="项目统计分析-模板查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.P_SaveTempList);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis14, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.p_SaveTempListVerifiation)));
	}
	@Test
	public void test015() throws Exception {
		String DataLnProjectStatisticalAnalysis15="项目统计分析-下载数据";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.DownloadData);
		RobotKeyboard.getInstance().typeKey(ObjectStore.DownloadDataButton, ObjectStore.Enter);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.DownloadDataOneTwo);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis15, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_DownloadDataVerifiation)));
	}	
	@Test
	public void test016() throws Exception {
		String DataLnProjectStatisticalAnalysis16="项目统计分析-显示更多列-减少";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.ShowMoreColumnsOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis16, false, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_ShowMoreColumnsOneVerifiation)));
	}
	@Test
	public void test017() throws Exception {
		String DataLnProjectStatisticalAnalysis17="项目统计分析-显示更多列-增加";;
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.ShowMoreColumnsOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis17, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_ShowMoreColumnsOneVerifiation)));
	}
	@Test
	public void test018() throws Exception {
		String DataLnProjectStatisticalAnalysis18="项目统计分析-供应穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.P_SaveTempList);
		DataLn.newClick(ObjectStore.P_SupplyDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis18, true, DataLn.isTextPresent(ObjectStore.P_SupplyDetailsVerifiation));
	}
	@Test
	public void test019() throws Exception {
		String DataLnProjectStatisticalAnalysis19="项目统计分析-成交穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.P_SaveTempList);
		DataLn.newClick(ObjectStore.P_TransactionDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis19, true, DataLn.isTextPresent(ObjectStore.P_TransactionDetailsVerifiation));
	}
	@Test
	public void test020() throws Exception {
		String DataLnProjectStatisticalAnalysis20="项目统计分析-总价自定义模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.moveToElement(ObjectStore.P_Custom);
		DataLn.newClick(ObjectStore.P_CustomAdd);
		DataLn.newType(ObjectStore.P_CustomAddStart, DataStore.D__CustomAddStart);
		DataLn.newType(ObjectStore.P_CustomAddEnd, DataStore.D__CustomAddEnd);
		DataLn.newClick(ObjectStore.P_AddTo);
		DataLn.newClick(ObjectStore.P_CustomSaveTemplate);
		DataLn.newType(ObjectStore.P_CustomInput,DataStore.P_Custom);
		DataLn.newClick(ObjectStore.P_CustomSaveButton);
		DataLn.moveToElement(ObjectStore.P_CustomMove);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis20, true, DataLn.isTextPresent(ObjectStore.P_CustomVerifiation));
	}
	@Test
	public void test021() throws Exception {
		String DataLnProjectStatisticalAnalysis21="项目统计分析-多项目查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis21, true,DataLn.isElementPresent(DataLn.parseObject(ObjectStore.P_MultiQrojectVerifiation)));
	}
	@Test
	public void test022() throws Exception {
		String DataLnProjectStatisticalAnalysis18="项目统计分析-供应穿透明细至全市统计";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.P_SaveTempList);
		DataLn.newClick(ObjectStore.P_SupplyDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newClick(ObjectStore.P_haone);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis18, true, DataLn.isTextPresent(ObjectStore.P_haoneVerifiation));
	}
	@Test
	public void test023() throws Exception {
		String DataLnProjectStatisticalAnalysis18="项目统计分析-成交穿透明细至全市统计";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.ProjectStatisticalAnalysis);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.P_SaveTempList);
		DataLn.newClick(ObjectStore.P_TransactionDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newClick(ObjectStore.P_haone);
		DataLn.newVerifyEquals(DataLnProjectStatisticalAnalysis18, true, DataLn.isTextPresent(ObjectStore.P_haTWOVerifiation));
	}
}
