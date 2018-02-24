package com.report.properties;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

import com.report.base.IFile;

//关于Properties类常用的操作
public class PropertiesFile implements IFile {
  //根据Key读取Value
	  private Properties pps = new Properties();
	  private InputStream in=null;
	  private String filePath=null;
	  File file;
	  @Override
	  public void createLog(String p_filePath){
		  this.filePath=p_filePath;
		  file = new File(this.filePath);
			if (!file.exists())
			{
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}	  
		  
	  }

	  
  public String read(String p_key) {
    
      try {
    	  in = new BufferedInputStream (new FileInputStream(this.filePath));  
          pps.load(in);
          if (pps.containsKey(p_key)){
        	  String value = pps.getProperty(p_key);
              System.out.println(p_key + " = " + value);
              return value;
          }else
          {
        	  System.out.println("the key name is wrong");
        	  return null;
        	
          }
         
          
      }catch (IOException e) {
          e.printStackTrace();
          return null;
      }
  }
  
  //读取Properties的全部信息
  public String read() {
      try {
		in = new BufferedInputStream(new FileInputStream(this.filePath));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		pps.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      Enumeration<?> en = pps.propertyNames(); //得到配置文件的名字
      
      while(en.hasMoreElements()) {
          String strKey = (String) en.nextElement();
          String strValue = pps.getProperty(strKey);
          System.out.println(strKey + "=" + strValue);
      }
      return en.toString();
  }
  
  //写入Properties信息
  public void write (String p_key, String p_value)  {
    
      
      try {
		in = new FileInputStream(this.filePath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //从输入流中读取属性列表（键和元素对） 
      try {
		pps.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。  
      //强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
      OutputStream out;
	try {
		out = new FileOutputStream(this.filePath);
		pps.setProperty(p_key, p_value);
		pps.store(out,"");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
  }


@Override
public void write(String p_info) {
	// TODO Auto-generated method stub
	
}


@Override
public void write(String p_section, String p_key, String p_info) {
	// TODO Auto-generated method stub
	
}


@Override
public String read(String p_section, String p_key) {
	// TODO Auto-generated method stub
	return null;
}




@Override
public void closeLog() {
	// TODO Auto-generated method stub
	this.in=null;
	this.file=null;
	
	
}



    
  
}