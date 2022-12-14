package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Meenakshi");
		driver.findElement(By.id("lastNameField")).sendKeys("Sundarrajan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Meena");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		driver.findElement(By.name("description")).sendKeys("Learning Automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("meena1232@gmail.com");
		WebElement statedropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1= new Select(statedropdown);
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Updating Important Note");
	//	//input[@class='smallSubmit']
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		driver.close();
	}


}
