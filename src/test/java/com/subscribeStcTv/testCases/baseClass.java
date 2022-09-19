package com.subscribeStcTv.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

import com.subscribeStcTv.actions.action;
import com.subscribeStcTv.utilities.log;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static Properties prop;
	
	public static ThreadLocal<RemoteWebDriver> driver= new ThreadLocal<>();
		
	@BeforeSuite
	public void loadConfig() {
		DOMConfigurator.configure("log4j.xml");
		
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\configuration\\config.properties");

		prop.load(ip);
	}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	public  void launchApp(String br) {
		
		log.info("driver launching="+br);
		
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 ChromeOptions op = new ChromeOptions();
		      //disable notification parameter
		      op.addArguments("--disable-notifications");
			driver.set(new ChromeDriver(op));  
			log.info("Chrome driver launched");
		}
		else if (br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			
			driver.set(new FirefoxDriver());
			log.info("firefox driver launched");
		}
		
		
		getDriver().manage().deleteAllCookies(); 
		log.info("all cookies deleted");
		getDriver().get(prop.getProperty("baseURL"));
		action.implicitWait(getDriver(),20);
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
	
	
	


}
