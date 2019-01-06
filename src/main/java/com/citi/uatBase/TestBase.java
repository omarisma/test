package com.citi.uatBase;

import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	static WebDriver driver;
	public static Properties prop;
	private Reader fileInputStream;
	 
	public TestBase() {
		
		try {
			prop = new Properties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

