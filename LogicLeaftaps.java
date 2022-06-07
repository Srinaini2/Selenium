package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogicLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Grm");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sree");
	WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select(source);
	dd1.selectByVisibleText("Other");
	WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2=new Select(industry);
	dd2.selectByVisibleText("Press");
	
	
		
	}

}