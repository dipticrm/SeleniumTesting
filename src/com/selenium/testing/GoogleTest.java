/**
 * 
 */
package com.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author ANANTA
 *
 */
public class GoogleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://web.facebook.com/");
		System.out.println("welcome to Selenium Testing");
	}

}
