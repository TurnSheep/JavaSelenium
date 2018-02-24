package com.testcase.websetting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autoframe.lib.DataStore;
import com.project.lib.ObjectStore;

public class DataLnCompetingProductsTest9 {

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
		String DataLnCompetingProductsTest01="竞品分析-普通住宅查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyOne);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest01, true, DataLn.isTextPresent(ObjectStore.E_propertyOneVerifiation));
	}
	@Test
	public void test002() throws Exception {
		String DataLnCompetingProductsTest02="竞品分析-别墅查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyTwo);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest02, true, DataLn.isTextPresent(ObjectStore.E_propertyTwoVerifiation));
	}
	@Test
	public void test003() throws Exception {
		String DataLnCompetingProductsTest03="竞品分析-酒店式公寓查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyThree);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest03, true, DataLn.isTextPresent(ObjectStore.E_propertyThreeVerifiation));
	}
	@Test
	public void test004() throws Exception {
		String DataLnCompetingProductsTest04="竞品分析-办公查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyFour);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest04, true, DataLn.isTextPresent(ObjectStore.E_propertyFourVerifiation));
	}
	@Test
	public void test005() throws Exception {
		String DataLnCompetingProductsTest05="竞品分析-商铺查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyFive);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest05, true, DataLn.isTextPresent(ObjectStore.E_propertyFiveVerifiation));
	}
	@Test
	public void test006() throws Exception {
		String DataLnCompetingProductsTest06="竞品分析-政策房住宅查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertySix);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest06, true, DataLn.isTextPresent(ObjectStore.E_propertySixVerifiation));
	}
	@Test
	public void test007() throws Exception {
		String DataLnCompetingProductsTest07="竞品分析-车位查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertySeven);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest07, true, DataLn.isTextPresent(ObjectStore.E_propertySevenVerifiation));
	}
	@Test
	public void test008() throws Exception {
		String DataLnCompetingProductsTest08="竞品分析-车位查询";
		DataLn.newClick(ObjectStore.ProjectQuery);
		DataLn.newClick(ObjectStore.E_CompetingProducts);
		DataLn.RemoveScript(ObjectStore.P_StarDate, ObjectStore.P_StarDateID, DataStore.E_StartData);
		DataLn.RemoveScript(ObjectStore.P_EndDate, ObjectStore.P_EndDateID, DataStore.E_EndtData);
		DataLn.newClick(ObjectStore.E_propertyEight);
		DataLn.newClick(ObjectStore.P_MultiQroject);
		DataLn.switchTo(ObjectStore.P_MultiQrojectOne);
		DataLn.newClick(ObjectStore.P_SelectiveGrouping);
		DataLn.newClick(ObjectStore.P_btnSh);
		DataLn.newClick(ObjectStore.P_Search);
		DataLn.newClick(ObjectStore.P_Button);
		DataLn.switchToContent();
		DataLn.Query();
		DataLn.newVerifyEquals(DataLnCompetingProductsTest08, true, DataLn.isTextPresent(ObjectStore.E_propertyEightVerifiation));
	}

}
