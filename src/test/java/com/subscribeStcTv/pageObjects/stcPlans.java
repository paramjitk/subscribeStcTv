package com.subscribeStcTv.pageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.subscribeStcTv.actions.action;
import com.subscribeStcTv.testCases.baseClass;

public class stcPlans extends baseClass {
	
	public stcPlans(){
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy (xpath="//div[@class='header-btns']/a[1]/span")
	WebElement defaultCountry;
	
	@FindBy (xpath="//div[@class='header-btns']/a[1]")
	WebElement showCountrylist;
	
	@FindBy (xpath="//div[@class='countryList-copy']")
	WebElement countrypopup;
	
	@FindBy (xpath="//div[1]/ul[@class='countryList-items']/li']")
	List<WebElement> countrylist;
	
	@FindBy(xpath ="//div/ul/li[@id='bh']")
	WebElement bahrain;
	
	@FindBy(xpath="//div/ul/li[@id='sa']")
	WebElement KSA;
	
	@FindBy(xpath="//div/ul/li[@id='kw']")
	WebElement kuwait;
	
	@FindBy (xpath="//div[1]/h1[contains(text(),'Lite')]")
	WebElement lite;
	
	@FindBy (xpath="//div[2]/h1[contains(text(),'Classic')]")
	WebElement classic;
	@FindBy (xpath="//div[3]/h1[contains(text(),'Premium')]")
	WebElement premium;
	@FindBy (xpath="//div[1]/div/span[@class='amount']")
	WebElement amount1;
	@FindBy (xpath="//div[1]/div/span[@class='currency']")
	WebElement countryCurrency1;
	@FindBy (xpath="//div[2]/div/span[@class='amount']")
	WebElement amount2;
	@FindBy (xpath="//div[2]/div/span[@class='currency']")
	WebElement countryCurrency2;
	@FindBy (xpath="//div[3]/div/span[@class='amount']")
	WebElement amount3;
	@FindBy (xpath="//div[3]/div/span[@class='currency']")
	WebElement countryCurrency3;
	
	public boolean validateCountry() {
		return action.isDisplayed(getDriver(), defaultCountry);
	}
	public String getCountryName() {
		String defaultcountryselected = defaultCountry.getText();
		return defaultcountryselected;
	}
	public boolean validateCountryPopup() {
		return action.isDisplayed(getDriver(), countrypopup);
	}
	
	public void countryListPopup() {
		action.click(getDriver(), showCountrylist);
	}
	public void selectCountry1() {
		bahrain.click();
		action.implicitWait(getDriver(),20);
	}
	public void selectCountry2() {
		KSA.click();
		action.implicitWait(getDriver(),30);
	}
	public void selectCountry3() {
		kuwait.click();
		action.implicitWait(getDriver(),30);
	}
	
	//Lite
	public String litePackageName(){
		String liteplan = lite.getText();
		return liteplan;
	}
	public double litePackageAmount() {
		String liteprice=amount1.getText();
		double finalLitePrice=Double.parseDouble(liteprice);
		return finalLitePrice;
	}
	public String litePackageCurrency() {
		String liteCurrency =countryCurrency1.getText();
		return liteCurrency;
	}
	
	//classic
	public String classicPackageName() {	
		String classicplan = classic.getText();
		return classicplan;
	}
	public double classicPackageAmount() {
		String classicPrice=amount2.getText();
		double finalClassicPrice=Double.parseDouble(classicPrice);
		return finalClassicPrice;
	}
	public String classicPackageCurrency() {
		String ClassicCurrency =countryCurrency2.getText();
		return ClassicCurrency;
	}
	//premium
	public String premiumPackageName(){
		String premiumPlan = premium.getText();
		return premiumPlan;	
	}
	public double premiumPackageAmount() {
		String premiumPrice=amount3.getText();
		double finalpremiumPrice=Double.parseDouble(premiumPrice);
		return finalpremiumPrice;
	}
	public String premiumPackageCurrency() {
		String premiumCurrency =countryCurrency3.getText();
		return premiumCurrency;
	}
	public void close(){
		getDriver().quit();
	}
	
}
