package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoo1{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/KIRAN%20GOWDA/OneDrive/Desktop/new.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).clear();
}
}
