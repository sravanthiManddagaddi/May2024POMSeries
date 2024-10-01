package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class TestPage {

	By loc = By.cssSelector(".test");
	
	public int getPage() {
		System.out.println("click on test");
		return 0;
	}
	
	
	
}
