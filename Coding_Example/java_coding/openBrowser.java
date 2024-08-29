package java_coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/ ");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span\n"
				+ "")).click();
	}

}
 