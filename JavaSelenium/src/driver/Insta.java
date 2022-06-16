package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8147655457");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ekangi@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();
}
}
