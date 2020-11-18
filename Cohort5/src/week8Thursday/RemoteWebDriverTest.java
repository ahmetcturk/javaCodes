package week8Thursday;

public class RemoteWebDriverTest {
	// non-static fields can not be used in static methods
	static RemoteWebDriver driver;
	public static void main(String[] args) {
		// local variable
		driver = new ChromeDriver();
		driver.get("https://www.siliconelabs.com");
		
		driver = new OperaDriver();
		driver.get("https://www.google.com");
		
		driver = new FireFoxDriver();
		driver.get("https://www.facebook.com/login");

	}
	void method(){
		driver = new OperaDriver();
	}

}
