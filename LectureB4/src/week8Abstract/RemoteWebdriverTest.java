package week8Abstract;

public class RemoteWebdriverTest {

	public static void main(String[] args) {
		RemoteWebDriver driver = new FireFoxDriver();
		
		driver.get("https://www.google.com");
		driver.quit();
		
		driver = new ChromeDriver();
		driver.get("https://www.siliconelabs.com");
		driver.quit();

	}

}
