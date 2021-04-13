package com.tricentis.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LaunchBrowser {

	WebDriver dr;

	@Test
	public void launchBrowser() {
		// Browser path

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anjali\\Documents\\automation\\Web drivers\\ChromeDriver\\Version 88\\chromedriver_win32\\chromedriver.exe");

		dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("http://sampleapp.tricentis.com/101/index.php");

	}

	@Test(dependsOnMethods = "launchBrowser")
	public void validate_motorCycle_event_VehicleData() {

//		dr.findElement(By.partialLinkText("Automobile")).click();

//		Relative xpath
//		//tagName[@attributeName='attributeValue']

//		dr.findElement(By.xpath("//a[@id= 'nav_automobile']")).click();

//		//a[text()= 'Automobile']  text is a function and not attribute

		dr.findElement(By.xpath("//a[text()= 'Automobile']")).click();

	}
	/*
	 * @Test(dependsOnMethods = "validate_motorCycle_event_VehicleData") public void
	 * validate_Make_Dropdown() throws InterruptedException {
	 * 
	 * WebElement make = dr.findElement(By.id("make"));
	 * 
	 * Select sel = new Select(make);
	 * 
	 * sel.selectByIndex(13); Thread.sleep(2000); sel.selectByValue("Mazda");
	 * Thread.sleep(2000); sel.selectByVisibleText("Renault");
	 * 
	 * }
	 * 
	 * @Test(dependsOnMethods = "validate_Make_Dropdown") public void
	 * validate_EnginePerformance_textBox() {
	 * 
	 * dr.findElement(By.id("engineperformance")).sendKeys("1223");
	 * 
	 * }
	 * 
	 * @Test(dependsOnMethods = "validate_EnginePerformance_textBox") public void
	 * validate_DateOfManufacture() throws InterruptedException {
	 * 
	 * // dr.findElement(By.id("dateofmanufacture")).sendKeys("10/23/2010");
	 * 
	 * dr.findElement(By.xpath("//button[@class= 'ui-datepicker-trigger']")).click()
	 * ;
	 * 
	 * // 01/01/1999
	 * 
	 * // Year xpath= //div[@class='ui-datepicker-title']/span[@class=
	 * 'ui-datepicker-year'] // Previous xpath = //a[@title= 'Prev'] // Month xpath
	 * = //div[@class= 'ui-datepicker-title']/span[@class = 'ui-datepicker-month']
	 * // Date xpath = //a[text()= '1']
	 * 
	 * Thread.sleep(2000);
	 * 
	 * String expectedYear = "1999"; String expectedMonth = "January";
	 * 
	 * String year = dr.findElement(By.
	 * xpath("//div[@class='ui-datepicker-title']/span[@class= 'ui-datepicker-year']"
	 * )) .getText();
	 * 
	 * while (!year.equals(expectedYear)) {
	 * 
	 * dr.findElement(By.xpath("//a[@title= 'Prev']")).click();
	 * 
	 * year = dr.findElement(By.
	 * xpath("//div[@class='ui-datepicker-title']/span[@class= 'ui-datepicker-year']"
	 * )) .getText();
	 * 
	 * }
	 * 
	 * String month = dr .findElement(By.
	 * xpath("//div[@class= 'ui-datepicker-title']/span[@class = 'ui-datepicker-month']"
	 * )) .getText(); while (!month.equals(expectedMonth)) {
	 * 
	 * dr.findElement(By.xpath("//a[@title= 'Prev']")).click();
	 * 
	 * month = dr .findElement(By.
	 * xpath("//div[@class= 'ui-datepicker-title']/span[@class = 'ui-datepicker-month']"
	 * )) .getText();
	 * 
	 * }
	 * 
	 * dr.findElement(By.xpath("//a[text()= '1']")).click();
	 * 
	 * // System.out.println(year); // System.out.println(month);
	 * 
	 * }
	 * 
	 * @Test(dependsOnMethods = "validate_EnginePerformance_textBox") public void
	 * completeTheForm() {
	 * 
	 * WebElement ele = dr.findElement(By.id("numberofseats"));
	 * 
	 * Select sel = new Select(ele); sel.selectByIndex(2);
	 * 
	 * sel = new Select(dr.findElement(By.id("fuel"))); sel.selectByValue("Diesel");
	 * 
	 * dr.findElement(By.id("listprice")).sendKeys("1234");
	 * 
	 * dr.findElement(By.id("licenseplatenumber")).sendKeys("MH12ES1234");
	 * 
	 * dr.findElement(By.id("annualmileage")).sendKeys("15Kms");
	 * 
	 * dr.findElement(By.id("nextenterinsurantdata")).click();
	 * 
	 * }
	 * 
	 * @Test(dependsOnMethods = "completeTheForm") public void
	 * radioButtonAndCheckbox() throws AWTException, Exception {
	 * 
	 * dr.findElement(By.xpath("//input[@id = 'gendermale']/..")).click();
	 * 
	 * dr.findElement(By.xpath("//label[contains(.,' Cliff Diving')]")).click();
	 * 
	 * dr.findElement(By.id("open")).click();
	 * 
	 * // Robot Class
	 * 
	 * Robot robot = new Robot();
	 * 
	 * StringSelection cb = new
	 * StringSelection("C:\\Users\\Anjali\\Pictures\\Saved Pictures\\Photos\\Screenshot_20190106-011100.jpg"
	 * ); Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
	 * 
	 * Thread.sleep(10000); robot.keyPress(KeyEvent.VK_CONTROL);
	 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
	 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.delay(2000);
	 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
	 * 
	 * 
	 * 
	 * }
	 */

}
