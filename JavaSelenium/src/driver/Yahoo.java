package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo{
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.xpath("//div[@class='text']")).click();
	driver.findElement(By.xpath("//input[@class='phone-no']")).sendKeys("kiran2270");
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kannadiga@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@class='icon profile']")).click();
	driver.findElement(By.xpath("//div[@class='_yb_3uavo _yb_13g7t']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-iskeynav='true']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("kotteshmamaq@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@spellcheck='true']")).sendKeys("send dummy");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@dir='ltr']")).sendKeys("karthik... karthik....");
}
}
