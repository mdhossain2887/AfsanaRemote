package com.bit.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	Properties prop;
	WebDriver driver;
	public void start() {
		String browser=System.getProperty("browser");
		String run=System.getProperty("run");
		if(browser.equals("Chrome")) {
			if(run.equals("local")) {
				driver=new ChromeDriver();
			}
			else if(run.equals("remote")) {
				System.out.println("run remotely");
			}
		}
		else if(browser.equals("Firefox")) {
			if(run.equals("local")) {
				driver=new FirefoxDriver();
			}
			else if(run.equals("remotely")) {
				System.out.println("run remotely");
			}
		}
	}

}
