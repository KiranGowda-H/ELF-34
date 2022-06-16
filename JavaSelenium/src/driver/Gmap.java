package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmap {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9662976,77.6011776,12z");
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@class='LoJzbe keynav-mode-off highres screen-mode']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysuru, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@class='LoJzbe keynav-mode-off highres screen-mode']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@aria-label='Driving']")).click();
		driver.findElement(By.xpath("//img[@aria-label='Recommended travel mode']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ue5qRc tUEI8e fontBodyMedium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-labelledby='section-directions-trip-details-msg-2']")).click();
}
}