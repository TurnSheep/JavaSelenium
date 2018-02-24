package com.report.ini;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

import com.report.base.IFile;

public  class IniFile implements IFile
{
	//private String fileName = null;
	private String fileName = null;
	Wini  ini = new Wini();
	
	
	@Override
	public void createLog(String p_fileName) {
		// TODO Auto-generated method stub
		this.fileName = p_fileName;
		File file = new File(this.fileName);
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


	@Override
	 public  void write(String section, String key, String value)
	{
				
		ini.put(section,key,value);
		try {
			ini.store(new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 @Override
	 public String read(String section, String key)
	 
	{	try {
		ini.load(new FileReader(fileName));
	} catch (InvalidFileFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return ini.get(section,key);
	}


	@Override
	public void write(String p_info) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void closeLog() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void write(String p_info1, String p_info2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String read() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String read(String p_info) {
		// TODO Auto-generated method stub
		return null;
	}




	
}