package com.rameshsoft.testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {
	@Test
	public void demoTwo() {
		//System.s
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("TestTwo: Launch the Chrome Browser...");
		driver.manage().window().maximize();
		System.out.println("TestTwo:Maximize the screen..........");
		driver.get("https://www.rameshsoft.com");
		System.out.println("TestTwo: Navigate to www.rameshsoft.com");
		driver.close();
		System.out.println("Close the Browser.........");
		System.out.println("Person1 Modifications.......");

		System.out.println("Person1Person1 Modifications.......");

		System.out.println("Person2 Modifications.......");

		
	}
}
