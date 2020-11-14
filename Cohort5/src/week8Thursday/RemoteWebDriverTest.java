package week8Thursday;

public class RemoteWebDriverTest {
	static RemoteWebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.siliconelabs.com");
		
		driver = new OperaDriver();
		driver.get("https://www.google.com");
		
		driver = new FireFoxDriver();
		driver.get("https://www.facebook.com/login");

	}

}
