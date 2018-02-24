package com.testcase.websetting;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MySuite {
	
	public static class TestSuite1 {  
		public static Test suite() {  
		TestSuite suite = new TestSuite("all test from websettingpackge");  
		  
		suite.addTest(new JUnit4TestAdapter(DataLnLoginTest1.class)); 
		suite.addTest(new JUnit4TestAdapter(DataLnHomePageTest2.class)); 
		suite.addTest(new JUnit4TestAdapter(DataLnMapSearchTest3.class));
		suite.addTest(new JUnit4TestAdapter(DataLnProjectQueryTest4.class));
		suite.addTest(new JUnit4TestAdapter(DataLnProjectStatisticalAnalysis5.class));
		suite.addTest(new JUnit4TestAdapter(DataLnBrandHousingPricesTest6.class));
		suite.addTest(new JUnit4TestAdapter(DataLnCityStatisticsTest7.class));
		suite.addTest(new JUnit4TestAdapter(DataLnCurrentStockTest8.class));
//		suite.addTest(new JUnit4TestAdapter(DataLnCompetingProductsTest9.class));
		suite.addTest(new JUnit4TestAdapter(DataLnDetailedInquiryTest10.class));
		return suite;  
		}  
		}  
	
	 public static void main(String[] args) throws Exception{

         junit.textui.TestRunner.run(TestSuite1.suite());

}
}
