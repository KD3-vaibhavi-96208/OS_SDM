package com.sunbeam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrapingMain {
	
	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://nilesh-g.github.io/learn-web/HTML/demo14.html";
		driver.get(url);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		for(int i = 1; i < rows.size()-1; i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			System.out.println(
					cols.get(0).getText() + " | " +
					cols.get(1).getText() + " | " +
					cols.get(2).getText() + " | " +
					cols.get(3).getText() + " | " +
					cols.get(4).getText()
					);
			
		}
		
		driver.quit();
		
	}

}
