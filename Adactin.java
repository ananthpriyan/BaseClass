package org.framework;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Adactin ad=new Adactin();
		ad.browserConfigChrome();
		//Login page
		ad.openUrl("https://adactinhotelapp.com/index.php");
		WebElement locateById = ad.locateById("username");
		ad.textInputBysendKeys(locateById, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 6, 1));
	    WebElement locateById2 = ad.locateById("password");
	    ad.textInputBysendKeys(locateById2, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 6, 2));
		WebElement btnClick = ad.locateByName("login");
		ad.click(btnClick);
		// Search hotel page
		WebElement locateById3 = ad.locateById("location");
		ad.selectByVisibleText(locateById3, "London");
		WebElement locateById4 = ad.locateById("hotels");
		ad.selectByVisibleText(locateById4, "Hotel Creek");
		WebElement locateById5 = ad.locateById("room_type");
		ad.selectByVisibleText(locateById5, "Deluxe");
		WebElement locateById8 = ad.locateById("room_nos");
		ad.selectByVisibleText(locateById8,  "2 - Two");
		WebElement locateById6 = ad.locateById("datepick_in");
		ad.clearText(locateById6);
		ad.textInputBysendKeys(locateById6, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 6, 5));
		WebElement locateById7 = ad.locateById("datepick_out");
		ad.clearText(locateById7);
		ad.textInputBysendKeys(locateById7, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 6, 6));
		WebElement locateById9 = ad.locateById("adult_room");
		ad.selectByVisibleText(locateById9, "2 - Two");
		WebElement locateById10 = ad.locateById("child_room");
		ad.selectByVisibleText(locateById10, "1 - One");
		WebElement locateById11 = ad.locateById("Submit");
		ad.click(locateById11);
		//Booking details page
		WebElement locateById12 = ad.locateById("radiobutton_0");
		ad.click(locateById12);
		WebElement locateById13 = ad.locateById("continue");
		ad.click(locateById13);
		//Booking confirmation page
		WebElement locateById14 = ad.locateById("first_name");
		ad.textInputBysendKeys(locateById14, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 1, 1));
		WebElement locateById15 = ad.locateById("last_name");
		ad.textInputBysendKeys(locateById15, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 2, 1));
		WebElement locateByName = ad.locateByName("address");
		ad.textInputBysendKeys(locateByName, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 1, 7));
		WebElement locateByName2 = ad.locateByName("cc_num");
		ad.textInputBysendKeys(locateByName2, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 1, 8));
		WebElement locateByName3 = ad.locateByName("cc_type");
		ad.selectByVisibleText(locateByName3, "VISA");
		WebElement locateByName4 = ad.locateByName("cc_exp_month");
		ad.selectByVisibleText(locateByName4, "July");
		WebElement locateByName5 = ad.locateByName("cc_exp_year");
		ad.selectByVisibleText(locateByName5, "2022");
		WebElement locateByXpath = ad.locateByXpath("(//input[@class='reg_input'])[4]");
		ad.textInputBysendKeys(locateByXpath, ad.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2", 1, 9));
        // Cancel
		Thread.sleep(5000);
		WebElement locateById16 = ad.locateById("cancel");
        ad.click(locateById16);
        
        
        
	}

}
