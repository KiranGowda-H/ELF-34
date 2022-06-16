package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	ChromeDriver c=new ChromeDriver();
	FirefoxDriver f=new FirefoxDriver();
}
}
