package week2.day2;


import java.util.concurrent.TimeUnit;

import org.bouncycastle.cert.selector.jcajce.JcaX509CertificateHolderSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement findElement = driver.findElement(By.xpath("//input[@name='firstname']"));
		findElement.sendKeys("Meenakshi");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='lastname']"));
		findElement2.sendKeys("Sundarrajan");
		WebElement findElement3 = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		findElement3.sendKeys("9120320233");
		//findElement.sendKeys("ala.m@gmail.com");
	    WebElement findElement4 = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		findElement4.sendKeys("pomxml123");
		WebElement datedropdown = driver.findElement(By.name("birthday_day"));
		Select dropdown1=new Select(datedropdown);
		dropdown1.selectByValue("1");
		WebElement monthdropdown = driver.findElement(By.name("birthday_month"));
		Select dropdown2=new Select (monthdropdown);
		dropdown2.selectByVisibleText("Jan");
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select dropdown3=new Select(yeardropdown);
		 dropdown3.selectByValue("1988");
		 WebElement radiobutton1 = driver.findElement(By.name("sex"));
		 radiobutton1.click();
	     driver.close();

	}

}
