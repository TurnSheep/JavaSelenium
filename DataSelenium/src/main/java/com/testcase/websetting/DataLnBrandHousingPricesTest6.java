package com.testcase.websetting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.autoframe.lib.DataStore;
import com.autoframe.lib.RobotKeyboard;
import com.autoframe.lib.TitleStore;
import com.project.lib.ObjectStore;

public class DataLnBrandHousingPricesTest6 {
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
		String DataLnBrandHousingPricesTest01="品牌房企统计分析-日期查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest01, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.BrandHousingPricesVerifiation)));
	
	}
	@Test
	public void test002() throws Exception {
		String DataLnBrandHousingPricesTest02="品牌房企统计分析-成交状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest02, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_TransactionStatus)));
	}
	@Test
	public void test003() throws Exception {
		String DataLnBrandHousingPricesTest03="品牌房企统计分析-销售状态";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest03, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_SalesStatusVerifiation)));
		
	}
	@Test
	public void test004() throws Exception {
		String DataLnBrandHousingPricesTest04="品牌房企统计分析-物业类型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.B_Property);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest04, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_PropertyVerifiation)));
	}
	@Test
	public void test005() throws Exception {
		String DataLnBrandHousingPricesTest05="品牌房企统计分析-品牌房企";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.TransactionStatus);
		DataLn.newClick(ObjectStore.p_SalesStatus);
		DataLn.newClick(ObjectStore.BrandHousingPricesInput);
		DataLn.newType(ObjectStore.BrandHousingPricesInput,DataStore.D_BrandHousingPrice);
		DataLn.newClick(ObjectStore.BrandHousingPrices);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest05, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_BrandHousingPricesVerifiation)));
	}
	@Test
	public void test006() throws Exception {
		String DataLnBrandHousingPricesTest06="品牌房企统计分析-区县";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.B_Area);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest06, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_AreaVerifiation)));
	}
	@Test
	public void test007() throws Exception {
		String DataLnBrandHousingPricesTest07="品牌房企统计分析-户型";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.P_PropertyTypeOne);
		DataLn.newClick(ObjectStore.B_houseTypeWhole);
		DataLn.newClick(ObjectStore.B_houseType);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest07, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_houseTypeVerifiation)));
	}
	@Test
	public void test008() throws Exception {
		String DataLnBrandHousingPricesTest08="品牌房企统计分析-总价";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_Total);
		DataLn.newClick(ObjectStore.B_TotalOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest08, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_TotalVerifiation)));
	}
	@Test
	public void test009() throws Exception {
		String DataLnBrandHousingPricesTest09="品牌房企统计分析-房间面积";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_MeasureArea);
		DataLn.newClick(ObjectStore.B_MeasureAreaOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest09, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_MeasureAreaVerifiation)));
	}
	@Test
	public void test010() throws Exception {
		String DataLnBrandHousingPricesTest10="品牌房企统计分析-单价";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_UnitPrice);
		DataLn.newClick(ObjectStore.B_UnitPriceOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest10, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_UnitPriceVerifiation)));
	}
	@Test
	public void test011() throws Exception {
		String DataLnBrandHousingPricesTest11="品牌房企统计分析-最高楼层";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_TopFloor);
		DataLn.newClick(ObjectStore.B_TopFloorOne);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest11, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_TopFloorVerifiation)));
	}
	@Test
	public void test012() throws Exception {
		String DataLnBrandHousingPricesTest12="品牌房企统计分析-环线";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_LoopLine);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest12, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_LoopLineVerifiation)));
	}
	@Test
	public void test013() throws Exception {
		String DataLnBrandHousingPricesTest13="品牌房企统计分析-地铁线路";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.newClick(ObjectStore.P_StarDate);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
		DataLn.newClick(ObjectStore.P_EndDate);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.newClick(ObjectStore.B_Metro);
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest13, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_MetroVerifiation)));
	}
	@Test
	public void test014() throws Exception {
		String DataLnBrandHousingPricesTest14="品牌房企统计分析-保存模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.RemoveScript(ObjectStore.P_StarDate,ObjectStore.P_StarDateID , DataStore.D_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate,ObjectStore.P_EndDateID , DataStore.D_EndtData);
        DataLn.newClick(ObjectStore.B_SaveTemplateOne);
		DataLn.Query();
		DataLn.newClick(ObjectStore.SaveInput);
		DataLn.newType(ObjectStore.SaveInput, DataStore.B_CustomOne);
		DataLn.newClick(ObjectStore.SaveButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest14, true, DataLn.isTextPresent(ObjectStore.B_CustomVerifiationOne));
	}
	@Test
	public void test015() throws Exception {
		String DataLnBrandHousingPricesTest15="品牌房企统计分析-模板查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.B_SaveTempList);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest15, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_SaveTempListVerifiation)));
	}
	@Test
	public void test016() throws Exception {
		String DataLnBrandHousingPricesTest16="品牌房企统计分析-下载数据";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.DownloadData);
		RobotKeyboard.getInstance().typeKey(ObjectStore.DownloadDataButton, ObjectStore.Enter);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.DownloadDataOneTwo);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest16, true, DataLn.isTextPresent(ObjectStore.B_DownloadDataVerifiation));
	}
	@Test
	public void test017() throws Exception {
		String DataLnBrandHousingPricesTest17="项目统计分析-显示更多列-减少";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.B_LoopLineOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest17, false, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_LoopLineOneVerifiation)));
	}
	@Test
	public void test018() throws Exception {
		String DataLnBrandHousingPricesTest18="项目统计分析-显示更多列-增加";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.B_LoopLineOne);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest18, true, DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_LoopLineOneVerifiation)));
	}
	@Test
	public void test019() throws Exception {
		String DataLnBrandHousingPricesTest19="品牌房企统计分析-供应穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.B_SaveTempList);
		DataLn.newClick(ObjectStore.B_SupplyDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest19, true, DataLn.isTextPresent(ObjectStore.B_SupplyDetailsVerifiation));
	}
	@Test
	public void test020() throws Exception {
		String DataLnBrandHousingPricesTest20="品牌房企统计分析-成交穿透明细";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.B_SaveTempList);
		DataLn.newClick(ObjectStore.B_TransactionDetails);
		DataLn.swithchToWindow(TitleStore.P_DetailQuery);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest20, true, DataLn.isTextPresent(ObjectStore.B_SupplyDetailsVerifiation));
	}
	@Test
	public void test021() throws Exception {
		String DataLnBrandHousingPricesTest21="品牌统计分析-总价自定义模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
		DataLn.newClick(ObjectStore.P_Open);
		DataLn.moveToElement(ObjectStore.P_Custom);
		DataLn.newClick(ObjectStore.P_CustomAdd);
		DataLn.newType(ObjectStore.P_CustomAddStartOne, DataStore.D__CustomAddStart);
		DataLn.newType(ObjectStore.P_CustomAddEndOne, DataStore.D__CustomAddEnd);
		DataLn.newClick(ObjectStore.P_AddToOne);
		DataLn.newClick(ObjectStore.P_CustomSaveTemplate);
		DataLn.newType(ObjectStore.P_CustomInput,DataStore.B_Custom);
		DataLn.newClick(ObjectStore.P_CustomSaveButton);
		DataLn.moveToElement(ObjectStore.P_CustomMove);
		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest21, true, DataLn.isTextPresent(ObjectStore.B_CustomVerifiation));
	}
//	@Test
//	public void test022() throws Exception {
//		String DataLnBrandHousingPricesTest22="品牌房企统计分析-多项目查询";
//		DataLn.newClick(ObjectStore.ProjectQuery);
//		DataLn.newClick(ObjectStore.BrandHousingPricesButton);
//		DataLn.newClick(ObjectStore.P_MultiQroject);
//		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
//		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
//		DataLn.newClick(ObjectStore.P_btnSh);
//		DataLn.newClick(ObjectStore.P_Search);
//		DataLn.newClick(ObjectStore.P_Button);
//		DataLn.switchToContent();
//		DataLn.Query();
//		DataLn.newVerifyEquals(DataLnBrandHousingPricesTest22, true,DataLn.isElementPresent(DataLn.parseObject(ObjectStore.B_MultiQrojectVerifiation)));
//	}
}
