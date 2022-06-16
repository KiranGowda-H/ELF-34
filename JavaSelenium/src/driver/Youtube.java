package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube{
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer kannada");
	driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("ytd-video-renderer[class='style-scope ytd-item-section-renderer']")).click();
}
}
