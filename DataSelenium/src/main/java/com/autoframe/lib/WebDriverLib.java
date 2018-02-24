package com.autoframe.lib;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import com.report.entry.ReportEntry;

import io.appium.java_client.android.AndroidDriver;



public class WebDriverLib {
	


	public static Logger logger = Logger.getLogger(WebDriverLib.class.getName());
	private WebDriver driver=null;
	static ReportEntry re=new ReportEntry();
	private String browser=DataStore.D_Browser;
//	private String baseUrl=DataStore.D_URL;	//正式网址
	private String baseUrl=DataStore.D_URL;//测试网址
	

		
		
		/**
	     * Constructor that takes in the instrumentation.
	     *
	     * @param instrumentation the {@link Instrumentation} instance
	     *T
	     */
	  
	 public void newSetup()
	   
		
	 	{

	  
		 if (browser.equalsIgnoreCase("chrome")) {
				// System.setProperty("webdriver.chrome.driver","D:\\MyWorkplace\\webdriverServer\\chromedriver.exe");
				
				 driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("ie")) {

				
					driver = new InternetExplorerDriver();
			
		}else if (browser.equalsIgnoreCase("safari")) {
				// System.setProperty("webdriver.safari.noinstall","C:\\Program Files\\Safari\\Safari.exe");
				Platform current = Platform.getCurrent();
				if (Platform.WINDOWS.is(current))
					driver = new SafariDriver();


		}else{ 
				   ProfilesIni pi = new ProfilesIni();
				   FirefoxProfile profile = pi.getProfile("default");
				   driver = new FirefoxDriver();
//			System.setProperty("webdriver.firefox.bin", "D:\\firefox\\firefox.exe");
//		    driver = new FirefoxDriver();
		}
		    if (driver!=null)
            {if (!new File("d:\\Result\\test.html").exists())
                re.crateLog("d:\\Result\\test.html");
//            	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    			driver.get(baseUrl);
    			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    			driver.manage().window().maximize();
    			logger.info(TextStore.T_Init + TextStore.T_Pass);
    			//logger.info("初始化成功");
            }
	 	}
	  public void newTeardown(){
		  
		  logger.info("");	
//		  re.closeLog();	 
		  driver.quit();	     

	  } 
	    public By parseObject(String p_object) {
			String newObjecyt = null;

			if (p_object.startsWith(".//") || p_object.startsWith("//")) {
				return By.xpath(p_object);
			} else if ( p_object.startsWith("linkText=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.linkText(newObjecyt);
			} else if (p_object.startsWith("xpath=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.xpath(newObjecyt);
			} else if (p_object.startsWith("id=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.id(newObjecyt);
			} else if (p_object.startsWith("css=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.cssSelector(newObjecyt);
			} else if (p_object.startsWith("className=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.className(newObjecyt);
			} else if (p_object.startsWith("tagName=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.tagName(newObjecyt);
			} else if (p_object.startsWith("name=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.name(newObjecyt);
			} else if (p_object.startsWith("partialLinkText=")) {
				newObjecyt = p_object.substring(p_object.indexOf("=") + 1);
				return By.name(newObjecyt);
			} else
				return null;

		}
	    
		
		public void newClick(String p_id){		
			
			CommonLib.sleep(DataStore.D_Wait_MediumTime);
			
			try {
				driver.findElement(parseObject(p_id)).click();
				logger.info(TextStore.T_ClickObject + p_id + TextStore.T_Pass);

			}

			catch (Exception e) {
				logger.severe(TextStore.T_Exception + "newClick(String p_id)"
						+ TextStore.T_DetailInfo + e.toString());

			}
			
			    
		}
		
		public void newDoubleClick(String p_id){//鼠标事件双击操作
			
			CommonLib.sleep(DataStore.D_Wait_MediumTime);
			
			try {
				Actions action = new Actions(driver);
			    action.doubleClick(driver.findElement(parseObject(p_id))).perform();
				logger.info(TextStore.T_ClickObject + p_id + TextStore.T_Pass);

			}

			catch (Exception e) {
				logger.severe(TextStore.T_Exception + "newClick(String p_id)"
						+ TextStore.T_DetailInfo + e.toString());
			}

			}
			public void moveToElement(String p_id){//鼠标悬浮
				
				CommonLib.sleep(DataStore.D_Wait_MediumTime);
				try{
					Actions action = new Actions(driver);
					action.moveToElement(driver.findElement(parseObject(p_id))).perform();
					logger.info(TextStore.T_ClickObject + p_id + TextStore.T_Pass);

				}

				catch (Exception e) {
					logger.severe(TextStore.T_Exception + "newClick(String p_id)"
							+ TextStore.T_DetailInfo + e.toString());
				}

				}
				
	    public void switchTo(String p_id){
	    	CommonLib.sleep(DataStore.D_Wait_MediumTime);
	    	try {
				driver.switchTo().frame(p_id);//切换frame层
				logger.info(TextStore.T_iFrame + p_id + TextStore.T_To + p_id
						+ TextStore.T_Pass);

			} catch (Exception e) {
				logger.severe(TextStore.T_Exception + "newType"
						+ TextStore.T_DetailInfo + e.toString());
			}
	    }
	    public void switchToContent(){//跳出层外
	    	CommonLib.sleep(DataStore.D_Wait_MediumTime);
	    	
	    		driver.switchTo().defaultContent();
				
	    }
	    public void selectByVisibleText(String P_id,String V_id){
	    	CommonLib.sleep(DataStore.D_Wait_MediumTime);
	    	try{
	    		new Select(driver.findElement(parseObject(P_id))).selectByVisibleText(V_id);
	    		logger.info(TextStore.T_List + P_id + TextStore.T_SelectListValue + V_id
						+ TextStore.T_Pass);
	    	}
	    	catch(Exception e){
	    		logger.severe(TextStore.T_Exception + "newType"
						+ TextStore.T_DetailInfo + e.toString());	
	    	}
	    }
	    
		public void newType(String p_id,String p_text){
			CommonLib.sleep(DataStore.D_Wait_MediumTime);
			
			try {
				driver.findElement(parseObject(p_id)).clear(); // 输入文字前，清除文本框中的文字
				driver.findElement(parseObject(p_id)).sendKeys(p_text);
				logger.info(TextStore.T_Input + p_text + TextStore.T_To + p_id
						+ TextStore.T_Pass);

			} catch (Exception e) {
				logger.severe(TextStore.T_Exception + "newType"
						+ TextStore.T_DetailInfo + e.toString());
			}
		}
			
		
	
	   
	   
	   public void newVerifyEquals(String p_message, Object p_expected,
				Object p_actual) throws Exception {

			if (p_expected.equals(p_actual)) {
			    re.write(p_message, p_expected.toString(), p_actual.toString());//写入html report or debug report
				logger.info("");
			
			} else {
				re.write(p_message, p_expected.toString(), p_actual.toString());//写入html report or debug report
				logger.severe("");
	

				
			}
		}
	   
	   public void newAssertEquals(String p_message, Object p_expected,
				Object p_actual) throws Exception {
	      
			if (p_expected.equals(p_actual)) {
			    re.write(p_message, p_expected.toString(), p_actual.toString());//写入html report or debug report
				logger.info("");
			
			} else {
				re.write(p_message, p_expected.toString(), p_actual.toString());//写入html report or debug report
				re.closeLog();
			    driver.close();
				logger.severe("");
	

				
			}
		}
	   
	   
	   public void swithchToWindow(String p_windowName){
		   CommonLib.sleep(DataStore.D_Wait_MediumTime);
		   for (String s : driver.getWindowHandles()) {
				driver.switchTo().window(s);
				if (driver.getTitle().equals(p_windowName)) {
					{
						logger.info("切换到窗口：" + p_windowName + TextStore.T_Pass);
						break;
					}
					
				}
		    }
	   }
	   
	   
	   public void newRunScript(String p_script) {
		   
		   CommonLib.sleep(DataStore.D_Wait_MediumTime);

			try {
				((JavascriptExecutor) driver).executeScript(p_script);
				logger.info("执行jS代码：" + p_script + TextStore.T_Pass);

			} catch (Exception e) {
				logger.severe(TextStore.T_Exception
						+ "newRunScript(String p_script)" + TextStore.T_DetailInfo
						+ e.toString());
			}
	   }
	   public void newJsHidden(String C_script,String S_script) {
		   
		   CommonLib.sleep(DataStore.D_Wait_MediumTime);

			try {
				driver.findElement(parseObject(C_script));
				JavascriptExecutor jse=(JavascriptExecutor) driver;
				jse.executeScript(S_script); 
				logger.info("执行jS代码：" + S_script + TextStore.T_Pass);

			} catch (Exception e) {
				logger.severe(TextStore.T_Exception
						+ "newRunScript(String p_script)" + TextStore.T_DetailInfo
						+ e.toString());
			}
	   }
       public void RemoveScript(String R_id,String R_script,String R_text) {
		   //移除日期控件的readonly属性
		   CommonLib.sleep(DataStore.D_Wait_MediumTime);

			try {
				driver.findElement(parseObject(R_id));
				JavascriptExecutor RemoveJs=(JavascriptExecutor) driver;
				RemoveJs.executeScript(R_script);
				driver.findElement(parseObject(R_id)).clear();
				driver.findElement(parseObject(R_id)).sendKeys(R_text);
				logger.info("执行jS代码：" + R_script + TextStore.T_Pass);

			} catch (Exception e) {
				logger.severe(TextStore.T_Exception
						+ "RemoveScript(String R_script)" + TextStore.T_DetailInfo
						+ e.toString());

			}
			
			 
	   
	   }
	   
       
	   public boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
//	   public  boolean isTextPresent(String what) {
//		    String pass=driver.findElement(By.tagName("body")).getText();
//			if(pass.equals(what)){
//				return true;
//			}// 遍历body节点下的所有节点 取其文本值 并判断是否包含 文本
//		 
//			else
//			{
//				return false;
//			}
//			}
	   public  boolean isTextPresent(String what) {

		   try{
			   return driver.findElement(By.tagName("body")).getText().contains(what);// 遍历body节点下的所有节点 取其文本值 并判断是否包含 文本 what

		   }
		   catch (Exception e){
		   return false;
		   }

		   }
					
		   
	   
	   public void newSelect(String p_id,String p_txt){

			CommonLib.sleep(DataStore.D_Wait_MediumTime);
			
			try {
				//new Select(driver.findElement(By.name("selectEntry"))).selectByVisibleText("在做");
				new Select(driver.findElement(parseObject(p_id))).selectByVisibleText(p_txt);
				//logger.info(TextStore.T_ClickObject + p_id + TextStore.T_Pass);

			}

			catch (Exception e) {
				//logger.severe(TextStore.T_Exception + "newClick(String p_id)"
				//		+ TextStore.T_DetailInfo + e.toString());

			}
		   
	   }
	   
	   
	   public boolean getPageIncludeInfo(String p_txt){
		   
		   return isElementPresent(By.xpath("//*[contains(.,p_txt)]"));
		   
	   }
	  
	   
	   
}
