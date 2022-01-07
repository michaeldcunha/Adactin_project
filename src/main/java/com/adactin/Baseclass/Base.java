

package com.adactin.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	
	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void currentUrl() {
		String name = driver.getCurrentUrl();
		
		System.out.println(name);

	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void close() {
		driver.close();

	}

	public static void quite() {
		driver.quit();
	}

	public static void getTitle() {
		String name1 =driver.getTitle();
		
		System.out.println(name1);
	}

	public static void enabled(WebElement element) {
		element.isEnabled();
	}

	public static void displayed(WebElement element) {
		element.isDisplayed();
	}

	public static void selected(WebElement element) {
		element.isSelected();
	}

	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinateFile = new File(path);
		FileUtils.copyFileToDirectory(sourceFile, destinateFile);

	}
	
	 public static void particularScreenshot(WebElement element, String path ) throws IOException {
		    File sourceFile = element.getScreenshotAs(OutputType.FILE);
			File destinateFile = new File(path);
			FileUtils.copyFileToDirectory(sourceFile, destinateFile);

	}

	public static void selection(WebElement element, String Option, String value) {
		Select sc = new Select(element);
		
		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
		 
	
		
		

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();

	}

	public static void confirmAlert(String input) {
		if (input.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();

		} else if (input.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();

		}
	}

	public static void promptAlert(String input, String value) {
		if (input.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();

		} else if (input.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();

		}
	}

	public static void actionMethod(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element).build().perform();

	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	public static void DragDrop(WebElement Element, WebElement Element1) {
		Actions ad = new Actions(driver);
		ad.dragAndDrop(Element, Element1).build().perform();

	}
	
	

	public static void robotClass() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void pageUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void pageDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void mouseclick( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}
	public static void frameMethod(String option, String value, WebElement element) {
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(element);

			} else if (option.equalsIgnoreCase("byString")) {
				driver.switchTo().frame(value);
			} else {
				System.out.println("Invalid selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}
	
	public static void  def() {
		
		driver.switchTo().defaultContent();
	}


	public static  void implicit() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void elementClear(WebElement element) {
		element.clear();
		
	}
	
	public static void windowhandel() {
		
		String parentid = driver.getWindowHandle();
	     
		System.out.println(parentid);

	}

	public static void windowHandles(String Title1 , String Title2 ) {
		Set<String> element = driver.getWindowHandles();
		
		System.out.println(element);

		for (String st : element) {
			System.out.println(st);
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
			
			if (title.contains(Title1)) {
				
				driver.close();
				
			}
			
			else if (title.contains(Title2)) {
				
				driver.close();
				
			}
			
		}
		
		
		


	}

}
