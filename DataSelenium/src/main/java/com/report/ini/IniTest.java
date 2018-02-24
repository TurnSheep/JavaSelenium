package com.report.ini;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

public class IniTest {

	public static void main(String[] args) throws InvalidFileFormatException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//******核心实现 api *******
		String fileName="d:\\test.ini";
		Wini  ini = new Wini ();
		ini.load(new FileReader(fileName));
		System.out.println(ini.get("info", "name"));
		ini.put("info", "age", "36");
		ini.store(new FileWriter(fileName));
		//******核心实现 api *******
		
		
		//******封装后的 api 实现 *******
		IniFile ini2=new IniFile();
		ini2.createLog("d:\\test.ini");
		System.out.println("方法"+ini2.read("info", "name"));
		ini2.write("work", "unit","road2");
		ini2.closeLog();
		//******封装后的 api 实现 *******

	}

}
