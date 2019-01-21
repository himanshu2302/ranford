package com.ranford.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.helpers.UtilLoggingLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ranford.utils.TestUtil;

public class TestBase {


	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\Ranford1\\src\\main\\java\\com\\ranford\\config\\config.properties");
			prop.load(fis);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himanshu.Dubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitTime, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
