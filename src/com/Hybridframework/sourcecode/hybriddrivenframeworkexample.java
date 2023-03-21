package com.Hybridframework.sourcecode;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hybriddrivenframeworkexample {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			FileInputStream fis = new FileInputStream("D:\\ExcelR\\Selenium class\\Hybidframework\\src\\hybrid\\utils\\data.properties");
			Properties p = new Properties();
			p.load(fis);
			String url = p.getProperty("url");
			String topicitems = p.getProperty("topicitem");
			String principalamount = p.getProperty("principalamount");
			String interest = p.getProperty("interest");
			String intrestunits = p.getProperty("intrestunit");
			String desiredtime = p.getProperty("desiredtime");
			String desiredtimeunit = p.getProperty("desiredtimeunits");
			String GeneralmathLocator = p.getProperty("generalmath_locator");
			String TopicItemLocator = p.getProperty("topicItem_locator");
			String PrincipalAmountLocator = p.getProperty("principalamount_locator");
			String IntrestLocator = p.getProperty("intrest_locator");
			String IntrestnitLocator = p.getProperty("intrestunit_locator");
			String DesiredTimeLocator = p.getProperty("desiredtime_locator");
			String DesiredTimeUnitLocator = p.getProperty("desiredtimeunit_locator");
			String SubmitbuttonLocator = p.getProperty("submitbutton_locator");
            driver.get(url);
			Thread.sleep(3000);
			WebElement generalmath = driver.findElement(By.cssSelector(GeneralmathLocator));
			generalmath.click();
			Thread.sleep(2000);
			WebElement topicitem = driver.findElement(By.name(TopicItemLocator));
			Select topicitemselect = new Select(topicitem);
			Thread.sleep(2000);
			topicitemselect.selectByVisibleText(topicitems);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(PrincipalAmountLocator)).sendKeys(principalamount);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(IntrestLocator)).sendKeys(interest);
			Thread.sleep(2000);
			WebElement intrestunit = driver.findElement(By.cssSelector(IntrestnitLocator));
			Select intrestunitselect = new Select(intrestunit);
			intrestunitselect.selectByIndex(Integer.parseInt(intrestunits));
			Thread.sleep(2000);
driver.findElement(By.cssSelector(DesiredTimeLocator)).sendKeys(desiredtime);
			Thread.sleep(2000);
			WebElement desiredtimeunits = driver.findElement(By.cssSelector(DesiredTimeUnitLocator));
			Select desiredtimeunitselect = new Select(desiredtimeunits);
			desiredtimeunitselect.selectByIndex(Integer.parseInt(desiredtimeunit));
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(SubmitbuttonLocator)).click();
			Thread.sleep(3000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}



	}


