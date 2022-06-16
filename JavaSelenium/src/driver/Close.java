package driver;

import org.openqa.selenium.firefox.FirefoxDriver;
	public class Close {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(2000);
		f.close();
	}
}
