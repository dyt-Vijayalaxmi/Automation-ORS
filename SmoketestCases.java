package com.dyt.ors.SmokeTC;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.Generic.BaseClass;
import com.dyt.ors.Screenpages.AddMainCategory;
import com.dyt.ors.Screenpages.AddProducts;
import com.dyt.ors.Screenpages.AddSubCategory;
import com.dyt.ors.Screenpages.DashBoard;
import com.dyt.ors.Screenpages.EditMainCategory;
import com.dyt.ors.Screenpages.EditProducts;
import com.dyt.ors.Screenpages.EditSubCategory;
import com.dyt.ors.Screenpages.Home;
import com.dyt.ors.Screenpages.Login;

public class SmoketestCases extends BaseClass{
	@Test
	public static void TC001_addMainCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		AddMainCategory addMainCategory= PageFactory.initElements(driver, AddMainCategory.class);
		
		home.navLoginpage();;
		login.loginApp("admin","admin@123");
		addMainCategory.navAddmainCategory();
		addMainCategory.AddMainCategory("4chlorine", "T");
				
	}

	@Test
	public static void TC002_addSubCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		AddSubCategory addSubCategory= PageFactory.initElements(driver, AddSubCategory.class);
		
		home.navLoginpage();;
		login.loginApp("admin","admin@123");
		addSubCategory.navAddSubCategory();
		addSubCategory.AddSubCategory("ethane", "Mathane", "H");;
				
	}
	@Test
	public static void TC003_addProducts()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		AddProducts addproduts= PageFactory.initElements(driver, AddProducts.class);
		
		home.navLoginpage();;
		login.loginApp("admin","admin@123");
		addproduts.navAddProducts();
		addproduts.AddProducts("mono", "inse", "456", "chemical", "A++", "chemical", "678", "reddyslab", "30", "10", "Code150", "6000", "E");
				
	}
	
	@Test
	public static void TC004_editMainCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		DashBoard dashBoard = PageFactory.initElements(driver, DashBoard.class);
		EditMainCategory editMainCategory= PageFactory.initElements(driver, EditMainCategory.class);
		
		home.navLoginpage();;
		login.loginApp("admin","admin@123");
		dashBoard.navMainCategories();
		editMainCategory.selectEditicon("ethane");
		editMainCategory.editMainCategoryPage("dimethy", "E","C:\\Users\\Chaitanya\\Desktop\\Project details\\Sample images\\bencodryl-sf-500x500.jpg");
		
		
	}
	
	@Test
	public static void TC005_editSubCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		DashBoard dashBoard = PageFactory.initElements(driver, DashBoard.class);
		EditSubCategory editSubCategory= PageFactory.initElements(driver, EditSubCategory.class);
		
		home.navLoginpage();
		login.loginApp("admin","admin@123");
		dashBoard.navSubCategories();
		editSubCategory.selectEditicon("sample");
		editSubCategory.editSubcategoryPage("testsample", "E");
		
		}
	
	@Test
	public static void TC006_editProducts()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		DashBoard dashBoard = PageFactory.initElements(driver, DashBoard.class);
		EditProducts editProduct= PageFactory.initElements(driver, EditProducts.class);
		
		home.navLoginpage();;
		login.loginApp("admin","admin@123");
		dashBoard.navProducts();
		editProduct.selectEditicon("123");
		editProduct.editProduct( "chlorine", "B++", "reddys", "2litres","50units","50000");
		}
	
	@Test
	public static void TC007_searchProducts()
	{		
		
		Home home = PageFactory.initElements(driver, Home.class);
		home.searchproduct();
		home.navAboutOrbit();
		home.navCOA();
		home.navLiteratures();
		home.navProduct();
		home.navContactus();
	}

}
