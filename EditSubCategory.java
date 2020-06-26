package com.dyt.ors.Screenpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.Generic.Weblibrary;
import com.dyt.Reports.Reporter;

public class EditSubCategory extends Weblibrary{
	//=================WebElements for EditSubCategorypage====================================
		@FindBy(xpath="//input[@id=orsMainCategories ors_mc_id']")
		public static WebElement click_editicon;
		
		@FindBy(xpath="//input[@id='subCatgName']")
		public static WebElement edit_Subcategory;
		//input[@id='subCatgName']
		@FindBy(xpath="//select[@id='ors_sub_order']")
		public static WebElement edit_Assignorder;
		
		@FindBy(xpath="//input[@name=Litimage']")
		public static WebElement edit_image;
		
		@FindBy(xpath="//input[@class=btn btn-success']")
		public static WebElement submit_button;
		
		//=============WebElements forEdit SubcategoryPage=========================================
		public static boolean selectEditicon(String expValue) {
			boolean bStatus = false;
			try {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
			int trcount=rows.size();
			System.out.println(trcount);
			
			for(int i=1; i<=trcount; i++) {
			String actValue=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(actValue);
			if ((actValue.equals(expValue)))  {
				driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+"]/td[5]/a[1]/i")).click();
				break;
			}
				
				}
			}
			
			catch(Exception e) {
				bStatus = false;
			}
			return bStatus;
			
			
		}
		//=======================================================================
		
		public static void editSubcategoryPage(String SubCategoryname, String ordervalue) {
			boolean bStatus;
			
			
			
			bStatus = setValueEscape(edit_Subcategory,SubCategoryname);
			Reporter.log(bStatus, "SubCategoryname is changed", "SubCategoryname is not changed");
			bStatus = clickElement(edit_Assignorder);
			Reporter.log(bStatus, " clicked", " not clicked");
		
			bStatus=selectListItem(edit_Assignorder,ordervalue);
			Reporter.log(bStatus, "Order value selected", "order value not selected");
			
			/*bStatus=uploadFile(edit_image,"C:\\Users\\Chaitanya\\Desktop\\Project details\\Sample images\\bencodryl-sf-500x500.jpg");
			Reporter.log(bStatus, "Image uploaded", "Image not uploaded");*/
			
			bStatus=clickElement(submit_button);
			Reporter.log(bStatus, "Submit button clicked", "Submit button not clicked");
			
		}
	

}
