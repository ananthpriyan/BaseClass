package org.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omrbranch.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("ananth@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ananth@123"); 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
