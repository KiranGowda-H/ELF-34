package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube1{
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer kannada");
	driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ytd-video-renderer[@class='style-scope ytd-item-section-renderer']")).click();
}
}
