package Mini;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.MediaSize.JIS;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 
public class Project {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ranjith\\eclipse-workspace\\Minipro\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("Ranjith270697");
			WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
			pass.sendKeys("1W7185");
			WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
			login.click();
			WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
			location.click();
			Thread.sleep(3000);
			Select tk = new Select(location);
			tk.selectByVisibleText("New York");
			Thread.sleep(3000);
			WebElement hotels = driver.findElement(By.xpath("//option[@value='Hotel Hervey']"));
			hotels.click();
			WebElement roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
			roomtype.click();
			Thread.sleep(3000);
			Select rt = new Select(roomtype);
			rt.selectByVisibleText("Super Deluxe");
			WebElement noroom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
			noroom.click();
			Thread.sleep(3000);
			Select nr = new Select(noroom);
			nr.selectByVisibleText("4 - Four");
			WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
			checkin.clear();
			checkin.sendKeys("25/06/2023");
			Thread.sleep(3000);
			WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
			checkout.clear();
			checkout.sendKeys("30/06/2023");
			Thread.sleep(3000);
			WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
			adultroom.click();
			Select ar = new Select(adultroom);
			ar.selectByVisibleText("3 - Three");
			Thread.sleep(3000);
			WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
			Select cr = new Select(childroom);
			cr.selectByVisibleText("3 - Three");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ranjith");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kumar");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[@name='address']"))
					.sendKeys(" 20, cooper Square New York NK 10003,USA");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("3467890765432187");
			Thread.sleep(3000);
			WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
			cardtype.click();
			Select ct = new Select(cardtype);
			ct.selectByVisibleText("VISA");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//select[@name='cc_exp_month']")).sendKeys("Aug");
			driver.findElement(By.xpath("//select[@name='cc_exp_year']")).sendKeys("2025");
			driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("271");
			driver.findElement(By.xpath("//input[@type='button']")).click();
			WebElement Logout = driver.findElement(By.xpath("//input[@value='Logout']"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("aruments[0].scrollIntoView();",Logout);
			//Logout.click();
			TakesScreenshot sc = (TakesScreenshot) driver;
			File Source = sc.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Ranjith\\eclipse-workspace\\Minipro\\Screenshot.s1.png");
			FileUtils.copyFile(Source, destination);
		}
	}


