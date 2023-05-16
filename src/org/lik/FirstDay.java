package org.lik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse\\Selenium\\ss\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
}
}
