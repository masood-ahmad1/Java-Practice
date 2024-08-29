package java_coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/ ");
		driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).click();
	}

}
