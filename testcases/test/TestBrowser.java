
package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		System.out.print("Hello Java");

		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//
		driver.get("http://www.javatpoint.com/");
		driver.quit();
//		SafariDriver driver1 =new SafariDriver();
//		driver1.get("http://www.javatpoint.com/");

	}

}
