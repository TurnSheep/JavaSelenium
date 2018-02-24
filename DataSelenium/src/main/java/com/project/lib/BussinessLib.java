package com.project.lib;

import java.awt.AWTException;

import com.autoframe.lib.CommonLib;
import com.autoframe.lib.DataStore;





public class BussinessLib extends WebdriverLibExtension{
	
	//删除Log目录中的文件，为了满足report打包发送功能
	

	public void login() {

		try {
			
			super.newClick(ObjectStore.Login_LoginNameId);
			super.newType(ObjectStore.Login_LoginNameId,DataStore.D_Username);
//			super.newClick(ObjectStore.Login_VerificationCode);
			super.newClick(ObjectStore.Login_verificationCodeID);
			//super.swithchToWindow(ObjectStore.Login_LoginTab_Windowname);
            super.newType(ObjectStore.Login_verificationCodeID,DataStore.D_VerificationCode);
			super.newClick(ObjectStore.Login_LoginButton);
			super.newClick(ObjectStore.Home);
			//super.newClick(ObjectStore.ActivationCode);
			super.newClick(ObjectStore.PromptBulletBox);
		
		}

		catch (Exception ex) {
//			System.out.println(TextStore.T_Login + TextStore.T_Fail);
//			HTMLReport.logWriter(TextStore.T_Exception + TextStore.T_Login, "",
//					"", "Fail");
			ex.printStackTrace();
		}
	}
	
	// 登录，需要登录的用户名和密码
//		public void login(String p_name,String p_password) {
//				
//			try {
//				super.newClick(ObjectStore.Login_LoginEntry);
////				super.newClick(ObjectStore.Login_LoginFreeLink);
//				//super.swithchToWindow(ObjectStore.Login_LoginTab_Windowname);
//				super.newType(ObjectStore.Login_LoginTab_Username,
//						DataStore.D_Username);
//				super.newType(ObjectStore.Login_LoginTab_Password,
//						DataStore.D_Password);
//				super.newClick(ObjectStore.Login_LoginTab_LoginButton);
//					
//
//			}
//
//			catch (Exception ex) {
//				
////				HTMLReport.logWriter(TextStore.T_Exception + TextStore.T_Login, "",
////						"", "Fail");
//				ex.printStackTrace();
//
//			}
//		}
	
	// 退出，不需要参数
	public void logout() {
		super.newClick(ObjectStore.Logout_UserName);
		super.newClick(ObjectStore.Logout_Menu);
		CommonLib.sleep(DataStore.D_Wait_LongTime);

	}
	public void Query(){
		super.newClick(ObjectStore.ProjectQueryButton);
		
	}
	
	public void createTask(String p_taskname,String p_assignto){
		
	}

	
	
	

			
	
}

