package com.subscribeStcTv.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.subscribeStcTv.pageObjects.stcPlans;

public class stcPlanTest extends baseClass{
	stcPlans stcplans;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		launchApp(browser);
		
	}
	@Test(priority =0)
	public void validateCountryavailability() {
		boolean countrydisplayed= stcplans.validateCountry();
		Assert.assertTrue(countrydisplayed);
	}
	@Test(priority =0)
	public void getCountry(){
		stcplans = new stcPlans();
		String countryname =stcplans.getCountryName();
		System.out.println("Default Country Name - "+countryname);
		
		showcountrypopup();
		stcplans.selectCountry1(); 
		String countryname1 =stcplans.getCountryName();
		System.out.println("Selected Country Name - "+countryname1);
		if(countryname1.equalsIgnoreCase("Bahrain")) {
		plandetails1();
		}else {System.out.println("country is not Bahrain");}
		
		showcountrypopup();
		stcplans.selectCountry2();
		System.out.println(" Selected Country Name - "+countryname);
		if(countryname.equalsIgnoreCase("KSA")) {
			plandetails2();
		}
		else {System.out.println(" country is not KSA");}
		
		showcountrypopup();
		stcplans.selectCountry3(); 
		String countryname2 =stcplans.getCountryName();
		System.out.println("Selected Country Name - "+countryname2);
		if(countryname2.equalsIgnoreCase("Kuwait")) {
		plandetails3();
		System.out.println("All plans are shown above");
		}
		else 
		{
			System.out.println(" country is not Kuwait");
		}
	
	}
	public void showcountrypopup() {
		stcplans.countryListPopup();
	}
	
	@Test(priority =2)
	public void validatecountrypopup() {
		stcplans.validateCountryPopup();
	}
	

	public void plandetails1() {
		//lite
		String litepackagename = stcplans.litePackageName();
		System.out.println("Plan name : "+litepackagename);
		
		Double liteAmount =stcplans.litePackageAmount();
		System.out.println("Lite Plan Amount : "+liteAmount);
		Double Amount1 = 2.0;
		Assert.assertEquals(Amount1, liteAmount);
		
		String litecurrency = stcplans.litePackageCurrency();
		System.out.println("Country Currency : "+litecurrency);
		String currency1 = "BHD";
		Assert.assertEquals(currency1, litecurrency);
		
		//Classic
		String classicpackagename =stcplans.classicPackageName();
		System.out.println("Plan name : "+classicpackagename);
		
		Double classicAmount =stcplans.classicPackageAmount();
		System.out.println("classic Plan Amount : "+classicAmount);
		Double Amount2 = 3.0;
		Assert.assertEquals(Amount2, classicAmount);
		
		String classiccurrency =stcplans.classicPackageCurrency();
		System.out.println("Country Currency : "+classiccurrency);
		String currency2 = "BHD";
		Assert.assertEquals(currency2, classiccurrency);
		
		//Premium
		String premiumpackagename=stcplans.premiumPackageName();
		System.out.println("Plan name : "+premiumpackagename);
		
		Double premiumAmount=stcplans.premiumPackageAmount();
		System.out.println("classic Plan Amount : "+premiumAmount);
		Double Amount3 = 6.0;
		Assert.assertEquals(Amount3, premiumAmount);
		
		String premiumcurrency =stcplans.premiumPackageCurrency();
		System.out.println("Country Currency : "+premiumcurrency);
		String currency3 = "BHD";
		Assert.assertEquals(currency3, premiumcurrency);
	}
	public void plandetails2() {
		//lite
		String litepackagename = stcplans.litePackageName();
		System.out.println("Plan name : "+litepackagename);
		
		Double liteAmount =stcplans.litePackageAmount();
		System.out.println("Lite Plan Amount : "+liteAmount);
		Double Amountl1 = 15.0;
		Assert.assertEquals(Amountl1, liteAmount);
		
		String litecurrency = stcplans.litePackageCurrency();
		System.out.println("Country Currency : "+litecurrency);
		String currencyl1 = "SAR";
		Assert.assertEquals(currencyl1, litecurrency);
		
		//Classic
		String classicpackagename =stcplans.classicPackageName();
		System.out.println("Plan name : "+classicpackagename);
		
		Double classicAmount =stcplans.classicPackageAmount();
		System.out.println("classic Plan Amount : "+classicAmount);
		Double Amountl2 = 25.0;
		Assert.assertEquals(Amountl2, classicAmount);
		
		String classiccurrency =stcplans.classicPackageCurrency();
		System.out.println("Country Currency : "+classiccurrency);
		String currencyl2 = "SAR";
		Assert.assertEquals(currencyl2, classiccurrency);
		
		//Premium
		String premiumpackagename=stcplans.premiumPackageName();
		System.out.println("Plan name : "+premiumpackagename);
		
		Double premiumAmount=stcplans.premiumPackageAmount();
		System.out.println("classic Plan Amount : "+premiumAmount);
		Double Amountl3 = 60.0;
		Assert.assertEquals(Amountl3, premiumAmount);
		
		String premiumcurrency =stcplans.premiumPackageCurrency();
		System.out.println("Country Currency : "+premiumcurrency);
		String currencyl3 = "SAR";
		Assert.assertEquals(currencyl3, premiumcurrency);
	}
	public void plandetails3() {
		//lite
		String litepackagename = stcplans.litePackageName();
		System.out.println("Plan name : "+litepackagename);
		
		Double liteAmount =stcplans.litePackageAmount();
		System.out.println("Lite Plan Amount : "+liteAmount);
		Double Amount1 = 1.2;
		Assert.assertEquals(Amount1, liteAmount);
		
		String litecurrency = stcplans.litePackageCurrency();
		System.out.println("Country Currency : "+litecurrency);
		String currency1 = "KWD";
		Assert.assertEquals(currency1, litecurrency);
		
		//Classic
		String classicpackagename =stcplans.classicPackageName();
		System.out.println("Plan name : "+classicpackagename);
		
		Double classicAmount =stcplans.classicPackageAmount();
		System.out.println("classic Plan Amount : "+classicAmount);
		Double Amount2 = 2.5;
		Assert.assertEquals(Amount2, classicAmount);
		
		String classiccurrency =stcplans.classicPackageCurrency();
		System.out.println("Country Currency : "+classiccurrency);
		String currency2 = "KWD";
		Assert.assertEquals(currency2, classiccurrency);
		
		//Premium
		String premiumpackagename=stcplans.premiumPackageName();
		System.out.println("Plan name : "+premiumpackagename);
		
		Double premiumAmount=stcplans.premiumPackageAmount();
		System.out.println("classic Plan Amount : "+premiumAmount);
		Double Amount3 = 4.8;
		Assert.assertEquals(Amount3, premiumAmount);
		
		String premiumcurrency =stcplans.premiumPackageCurrency();
		System.out.println("Country Currency : "+premiumcurrency);
		String currency3 = "KWD";
		Assert.assertEquals(currency3, premiumcurrency);
		
	}


}
