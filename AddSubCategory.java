package com.dyt.ors.Screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.Generic.Weblibrary;
import com.dyt.Reports.Reporter;

public class AddSubCategory extends Weblibrary{
	//===============WebElements for AddSubCategory============
	@FindBy(xpath="//span[text()='Products']")
	public static WebElement navlink_Products;	
	
	@FindBy(xpath="//a[text()='Sub Categories']")
	public static WebElement link_SubCategories;
	
	@FindBy(xpath="//a[@class='d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm']")
	public static WebElement btn_AddSubCategories;
	
		@FindBy(xpath="//select[@id ='mainCatgDropdown']")
		public static WebElement select_mainCategory;
		
		@FindBy(xpath="//input[@id ='subCatgName']")
		public static WebElement Enter_SubCategory;
		
		@FindBy(xpath="//select[@id ='ors_sub_order']")
		public static WebElement select_AssignedOrder;
		
		@FindBy(xpath="//input[@id='LitImage']")
		public static WebElement select_LiteratureImage;
		
		@FindBy(xpath="//input[@id='LitPDF']")
		public static WebElement select_LiteratureDocument;
		
		@FindBy(xpath="//input[@class='btn btn-success']")
		public static WebElement Submit_Button;
			
		//====================Methods For AddSubCategory Page ================
		public static void navAddSubCategory()
		{
			boolean bstatus;
			
			bstatus = clickElement(navlink_Products);
			Reporter.log(bstatus, "Products Navigation Clicked","Products Navigation Not Clicked");
			
			bstatus = clickElement(link_SubCategories);
			Reporter.log(bstatus, "Sub Category Link Clicked","Sub Category Link Not Clicked");
			
			bstatus = clickElement(btn_AddSubCategories);
			Reporter.log(bstatus, "Add Sub Category Button Clicked","Add Sub Category Button not Clicked");
			
		}
		
	//=========================================================================
		
		
		public static void AddSubCategory(String nameMainCategogy,String nameSubCategogy,String AssignedOrder )
		{
		boolean bstatus;
		
		 bstatus = selectListItem(select_mainCategory, nameMainCategogy );
		 Reporter.log(bstatus,"Main category is selected from dropdown","Main Category is not selected");
		 
		 bstatus = setEditValue(Enter_SubCategory, nameSubCategogy );
		 Reporter.log(bstatus,"Sub Category Value is Entered","Sub Category Value not entered");	
			
		 bstatus = selectListItem(select_AssignedOrder,AssignedOrder);
		 Reporter.log(bstatus,"Assigned Order is selected from dropdown","Assigned Order is not selected");
		
		 bstatus = clickElement(Submit_Button);
		 Reporter.log(bstatus,"Submit Button is clicked","Submit Button not clicked");
		 
		}
	}

