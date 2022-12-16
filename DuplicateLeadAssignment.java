package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement findElement = driver.findElement(By.name("USERNAME"));
		 findElement.sendKeys("democsr");
		 WebElement findElement2 = driver.findElement(By.id("password"));
		 findElement2.sendKeys("crmsfa");
		 WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		 findElement3.click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("alagum@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("id=\"ext-gen902\"")).click();
		//WebElement findElement4 = driver.findElement(By.xpath("//a[@id='ext-gen805']");
	   // String = getText();
	}

}
