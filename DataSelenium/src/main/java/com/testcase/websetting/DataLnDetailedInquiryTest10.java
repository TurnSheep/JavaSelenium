package com.testcase.websetting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autoframe.lib.DataStore;
import com.autoframe.lib.RobotKeyboard;
import com.project.lib.ObjectStore;

public class DataLnDetailedInquiryTest10 {

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
		 String DataLnDetailedInquiryTest01="成交明细-日期搜索";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest01, true, DataLn.isTextPresent(ObjectStore.F_DealVerifiation));
	}
	@Test
	public void test002() throws Exception {
		 String DataLnDetailedInquiryTest02="成交明细-备案名/推广名搜索";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_RecordName);
			DataLn.newType(ObjectStore.F_RecordName, DataStore.F_Input);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest02, true, DataLn.isTextPresent(ObjectStore.F_RecordNameVerifiation));
	}
	@Test
	public void test003() throws Exception {
		 String DataLnDetailedInquiryTest03="成交明细-销售状态-在售";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_SalesStatusOne);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest03, true, DataLn.isTextPresent(ObjectStore.F_OneVerifiation));
	}
	@Test
	public void test004() throws Exception {
		 String DataLnDetailedInquiryTest04="成交明细-销售状态-售罄";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_SalesStatusTwo);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest04, true, DataLn.isTextPresent(ObjectStore.F_TwoVerifiation));
	}
	@Test
	public void test005() throws Exception {
		 String DataLnDetailedInquiryTest05="成交明细-销售状态-待售";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_SalesStatusThree);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest05, true, DataLn.isTextPresent(ObjectStore.F_ThreeVerifiation));
	}
	@Test
	public void test006() throws Exception {
		 String DataLnDetailedInquiryTest06="成交明细-成交状态-成交（含已付定金）";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_TransactionStatusOne);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest06, true, DataLn.isTextPresent(ObjectStore.F_TransactionVerifiation));
	}
	@Test
	public void test007() throws Exception {
		 String DataLnDetailedInquiryTest07="成交明细-成交状态-成交（不含已付定金）";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.F_TransactionStatusTwo);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest07, true, DataLn.isTextPresent(ObjectStore.F_TransactionTWOVerifiation));
	}
	@Test
	public void test008() throws Exception {
		 String DataLnDetailedInquiryTest08="成交明细-成交状态-成交（不含已付定金）";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest08, true, DataLn.isTextPresent(ObjectStore.F_AreaVerifiation));
	}
	@Test
	public void test009() throws Exception {
		 String DataLnDetailedInquiryTest09="成交明细-区县";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest09, true, DataLn.isTextPresent(ObjectStore.F_AreaVerifiation));
	}
	@Test
	public void test010() throws Exception {
		 String DataLnDetailedInquiryTest10="成交明细-物业类型";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.newClick(ObjectStore.PropertyOne);
			DataLn.newClick(ObjectStore.PropertyOne);
			DataLn.newClick(ObjectStore.B_Property);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest10, true, DataLn.isTextPresent(ObjectStore.F_RoomTypeVerifiation));
	}
	@Test
	public void test011() throws Exception {
		 String DataLnDetailedInquiryTest11="成交明细-户型";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.C_RoomTypeOne);
			DataLn.newClick(ObjectStore.C_RoomTypeTwo);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest11, true, DataLn.isTextPresent(ObjectStore.F_VerifiationOne));
	}
	@Test
	public void test012() throws Exception {
		 String DataLnDetailedInquiryTest12="成交明细-总价";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest12, true, DataLn.isTextPresent(ObjectStore.F_VerifiationTwo));
	}
	@Test
	public void test013() throws Exception {
		 String DataLnDetailedInquiryTest13="成交明细-房间面积";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
            DataLn.newClick(ObjectStore.B_MeasureArea);
            DataLn.newClick(ObjectStore.B_MeasureAreaOne);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest13, true, DataLn.isTextPresent(ObjectStore.F_VerifiationThree));
	}
	@Test
	public void test014() throws Exception {
		 String DataLnDetailedInquiryTest14="成交明细-单价";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.newClick(ObjectStore.B_Property);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
            DataLn.newClick(ObjectStore.B_MeasureArea);
            DataLn.newClick(ObjectStore.B_MeasureAreaOne);
            DataLn.newClick(ObjectStore.P_UnitPriceOne);
            DataLn.newClick(ObjectStore.F_UnitPrice);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest14, true, DataLn.isTextPresent(ObjectStore.F_UnitPriceVerifiation));
	}
	@Test
	public void test015() throws Exception {
		 String DataLnDetailedInquiryTest15="成交明细-最高楼层";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.newClick(ObjectStore.B_Property);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
            DataLn.newClick(ObjectStore.B_MeasureArea);
            DataLn.newClick(ObjectStore.B_MeasureAreaOne);
            DataLn.newClick(ObjectStore.P_UnitPriceOne);
            DataLn.newClick(ObjectStore.F_UnitPrice);
            DataLn.newClick(ObjectStore.F_Floor);
            DataLn.newClick(ObjectStore.C_Floor);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest15, true, DataLn.isTextPresent(ObjectStore.F_FloorVerifiation));
	}
	@Test
	public void test016() throws Exception {
		 String DataLnDetailedInquiryTest16="成交明细-环线";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.newClick(ObjectStore.B_Property);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
            DataLn.newClick(ObjectStore.B_MeasureArea);
            DataLn.newClick(ObjectStore.B_MeasureAreaOne);
            DataLn.newClick(ObjectStore.P_UnitPriceOne);
            DataLn.newClick(ObjectStore.F_UnitPrice);
            DataLn.newClick(ObjectStore.F_Floor);
            DataLn.newClick(ObjectStore.C_Floor);
            DataLn.newClick(ObjectStore.C_LoopLine);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest16, true, DataLn.isTextPresent(ObjectStore.F_LoopVerifiation));
	}
	@Test
	public void test017() throws Exception {
		 String DataLnDetailedInquiryTest16="成交明细-地铁线路";
			DataLn.newClick(ObjectStore.ProjectQuery);
			DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
			DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.F_StartData);
			DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.F_EndtData);
			DataLn.newClick(ObjectStore.p_Area);
			DataLn.newClick(ObjectStore.B_Property);
			DataLn.newClick(ObjectStore.P_Open);
            DataLn.newClick(ObjectStore.P_TotalOne);
            DataLn.newClick(ObjectStore.B_TotalOne);
            DataLn.newClick(ObjectStore.B_MeasureArea);
            DataLn.newClick(ObjectStore.B_MeasureAreaOne);
            DataLn.newClick(ObjectStore.P_UnitPriceOne);
            DataLn.newClick(ObjectStore.F_UnitPrice);
            DataLn.newClick(ObjectStore.F_Floor);
            DataLn.newClick(ObjectStore.C_Floor);
            DataLn.newClick(ObjectStore.C_LoopLine);
            DataLn.newClick(ObjectStore.F_LoopLine);
			DataLn.Query();
			DataLn.newVerifyEquals(DataLnDetailedInquiryTest16, true, DataLn.isTextPresent(ObjectStore.F_LoopLineVerifiation));
	}
	@Test
	public void test018() throws Exception {
		String DataLnDetailedInquiryTest17="成交明细-保存模板";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
		DataLn.newClick(ObjectStore.SaveInput);
		DataLn.newType(ObjectStore.SaveInput, DataStore.F_SaveInputTwo);
		DataLn.newClick(ObjectStore.SaveButton);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newVerifyEquals(DataLnDetailedInquiryTest17, true, DataLn.isTextPresent(ObjectStore.F_SaveTemplateVerifiation));
	}
	@Test
	public void test019() throws Exception {
		String DataLnDetailedInquiryTest18="成交明细-根据模板查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.F_SaveTempList);
		DataLn.newVerifyEquals(DataLnDetailedInquiryTest18, true, DataLn.isTextPresent(ObjectStore.F_LoopLineVerifiation));
	}
	@Test
	public void test020() throws Exception {
		String DataLnDetailedInquiryTest19="成交明细-下载数据";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
		DataLn.newClick(ObjectStore.SaveList);
		DataLn.newClick(ObjectStore.C_SaveTempList);
		DataLn.newClick(ObjectStore.DownloadData);
		RobotKeyboard.getInstance().typeKey(ObjectStore.DownloadDataButton, ObjectStore.Enter);
		DataLn.newClick(ObjectStore.DownloadDataOne);
		DataLn.newClick(ObjectStore.DownloadDataOneTwo);
		DataLn.newVerifyEquals(DataLnDetailedInquiryTest19, true, DataLn.isTextPresent(ObjectStore.F_DownloadDataVerifiation));
	}
	@Test
	public void test021() throws Exception {
		String DataLnDetailedInquiryTest20="成交明细-显示更多列-减少";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.F_More);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnDetailedInquiryTest20, false, DataLn.isTextPresent(ObjectStore.F_MoreVerifiation));
	}
	@Test
	public void test022() throws Exception {
		String DataLnDetailedInquiryTest21="成交明细-显示更多列-增加";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.F_DataLnDetailedInquiry);
		DataLn.newClick(ObjectStore.ShowMoreColumns);
		DataLn.newClick(ObjectStore.F_More);
		DataLn.newClick(ObjectStore.ShowMoreColumnsButton);
		DataLn.newVerifyEquals(DataLnDetailedInquiryTest21, true, DataLn.isTextPresent(ObjectStore.F_MoreVerifiation));
	}


}
