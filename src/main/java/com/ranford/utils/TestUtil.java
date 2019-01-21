package com.ranford.utils;

import com.ranford.base.TestBase;

public class TestUtil extends TestBase{

	
	public static long pageLoadTime=40;
	public static long implicitTime=20;
	
	
	public static void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
}
