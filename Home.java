package com.dyt.ors.Screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.Generic.Weblibrary;
import com.dyt.Reports.Reporter;

public class Home extends Weblibrary{
	
	//===============WebElements for Home page==========
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement link_Login;
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement link_Register;
	
	@FindBy(xpath="//div[@id='navbarTogglerDemo02']/ul/li[2]/a")
	public static WebElement tab_AboutOrbit;
	
	@FindBy(xpath="//div[@id='navbarTogglerDemo02']/ul/li[3]/a")
	public static WebElement tab_Product;
	
	@FindBy(xpath="//div[@id='navbarTogglerDemo02']/ul/li[4]/a")
	public static WebElement tab_COA;
	
	@FindBy(xpath="//div[@id='navbarTogglerDemo02']/ul/li[5]/a")
	public static WebElement tab_Literatures;
	
	@FindBy(xpath="//div[@id='navbarTogglerDemo02']/ul/li[6]/a")
	public static WebElement tab_Contactus;


	@FindBy(xpath="//input[@id='searchRecord']")
	public static WebElement edit_Name;	
	
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	public static WebElement icon_Search;	
	
	@FindBy(xpath="//a[text()='chemical']")
	public static WebElement particulat_Product;
	
	
	
	
	
	//===================methods========================
	public static void navLoginpage() {		
		boolean bStatus = clickElement(link_Login);
		Reporter.log(bStatus, "Login link clicked", "Login link not clicked");
	}	
	//====================================================
	public static void navRegisterpage() {		
		boolean bStatus = clickElement(link_Register);
		Reporter.log(bStatus, "Register link clicked", "Register link not clicked");
	}	
	
	
	//=================Methods for Search the product =========================
	
	public static void searchproduct()
	{
		boolean bstatus;
		
		bstatus = setEditValue(edit_Name, "chemical");
		Reporter.log(bstatus, "Product Name Entered","Product Name Not Entered");
		
		bstatus = clickElement(icon_Search);
		Reporter.log(bstatus, "Search Icon Clicked","Search Icon Not Clicked");
		
		bstatus = clickElement(particulat_Product);
		Reporter.log(bstatus, "Particular Product Clicked", "Particular Product Not Clicked");
	}
	
	public static void navAboutOrbit()
	{
		boolean bstatus;
		
		bstatus = clickElement(tab_AboutOrbit);
		Reporter.log(bstatus, "AboutOrbit tab is Clicked","AboutOrbit tab Not Clicked");
	}
	
	public static void navProduct()
	{
		boolean bstatus;
		
		bstatus = clickElement(tab_Product);
		Reporter.log(bstatus, "Product tab is Clicked","Product tab is Not Clicked");
	}

	public static void navCOA()
	{
		boolean bstatus;
		
		bstatus = clickElement(tab_COA);
		Reporter.log(bstatus, "COA tab is Clicked","COA tab is Not Clicked");
	}

	public static void navLiteratures()
	{
		boolean bstatus;
		
		bstatus = clickElement(tab_Literatures);
		Reporter.log(bstatus, "Literatures tab is Clicked","Literatures tab is Not Clicked");
	}

	public static void navContactus()
	{
		boolean bstatus;
		
		bstatus = clickElement(tab_Contactus);
		Reporter.log(bstatus, "Contactus tab is Clicked","Contactus tab is Not Clicked");
	}

}
