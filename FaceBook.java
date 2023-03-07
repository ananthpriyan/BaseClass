package org.framework;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class FaceBook extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		FaceBook fb=new FaceBook();
		
		fb.browserConfigChrome();
		fb.openUrl("https://www.facebook.com/");
		fb.maximizeWindow();
		WebElement locateById = fb.locateById("email");
		fb.textInputBysendKeys(locateById, fb.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx","SHEET 2" , 1, 2));
		WebElement locateById2 = fb.locateById("pass");
		fb.textInputBysendKeys(locateById2, fb.excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Datadriven\\Excel\\Small savings.xlsx", "SHEET 2", 1, 1));
		//WebElement btnClick = fb.locateByName("login");
		//fb.click(btnClick);
		//fb.closeBrowser();
	}

}
