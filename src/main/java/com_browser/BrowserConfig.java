package com_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	public static WebDriver open_Browser(WebDriver driver, String browser_name, String url)
			throws InterruptedException {
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
			driver = new ChromeDriver();

		} else if (browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");

		} else {
			System.out.println("this browse does not support yet");
		}
		driver.get(url);
		driver.wait(5000);
		driver.manage().window().maximize();
		return driver;

	}

	public static void close_browser(WebDriver driver) {
		driver.quit();

	}

}
