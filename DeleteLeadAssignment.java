package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

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
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("456789"); 
	 driver.findElement(By.xpath("//td[@id='ext-gen333']")).click();
	 driver.findElement(By.xpath("//div[@unselectable='on'][1]")).click();	 
	 //driver.close();
	}	

}
