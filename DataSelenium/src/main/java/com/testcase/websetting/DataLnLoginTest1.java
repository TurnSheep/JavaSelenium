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

public class DataLnLoginTest1 {
	static WebBussinessLib DataLn = new WebBussinessLib();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
		
	}

	@Before
	public void setUp() throws Exception {
		DataLn.newSetup();
		
	}

	@After
	public void tearDown() throws Exception {
		DataLn.newTeardown();
		
		
	}

	@Test
	public void test001() throws Exception {
		String DataLnCaseLongin1="正确的用户名及密码登陆功能";
		DataLn.newClick(ObjectStore.Login_LoginNameId);
		DataLn.newType(ObjectStore.Login_LoginNameId, DataStore.D_Username);
		DataLn.newClick(ObjectStore.Login_VerificationCode);
		DataLn.newClick(ObjectStore.Login_verificationCodeID);
		DataLn.newType(ObjectStore.Login_verificationCodeID, DataStore.D_VerificationCode);
		DataLn.newClick(ObjectStore.Login_LoginButton);
		DataLn.newClick(ObjectStore.Home);
		DataLn.newClick(ObjectStore.PromptBulletBox);
		DataLn.newVerifyEquals(DataLnCaseLongin1,true,DataLn.isTextPresent(ObjectStore.Home_AccountName));
	}
	    @Test
		public void test002() throws Exception {
		String DataLnCaseLongin4="账号退出功能";
		DataLn.login();
		DataLn.newClick(ObjectStore.Logout_UserName);
		DataLn.newClick(ObjectStore.Logout_Menu);
		DataLn.newVerifyEquals(DataLnCaseLongin4,true,DataLn.isElementPresent(DataLn.parseObject(ObjectStore.Login_LoginButton)));
	}
//	@Test
//	public void test003() throws Exception {
//		String DataLnCaseLongin2="错误的用户名和密码登陆功能";
//		DataLn.newClick(ObjectStore.Login_LoginNameId);
//		DataLn.newType(ObjectStore.Login_LoginNameId, DataStore.D_UsernameOne);
//		DataLn.newClick(ObjectStore.Login_VerificationCode);
//		DataLn.newClick(ObjectStore.Login_verificationCodeID);
//		DataLn.newType(ObjectStore.Login_verificationCodeID, DataStore.D_VerificationCodeOne);
//		DataLn.newClick(ObjectStore.Login_LoginButton);
//		DataLn.newVerifyEquals(DataLnCaseLongin2,true,DataLn.isElementPresent(DataLn.parseObject(ObjectStore.Home_File)));	
//	}
	@Test
	public void test004() throws Exception {
		String DataLnCaseLongin3="游客登陆功能";
		DataLn.newClick(ObjectStore.Login_TouristNameID);
		DataLn.newClick(ObjectStore.Login_TouristTwo);
		DataLn.newClick(ObjectStore.PromptBulletBox);
		DataLn.newVerifyEquals(DataLnCaseLongin3,true,DataLn.isTextPresent(ObjectStore.Home_TouristName));
		
	}

}

