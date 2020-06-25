package week8Abstract;

public abstract class RemoteWebDriver {
	
	public abstract void get(String URL);
	public abstract void quit();
	
	
}
class FireFoxDriver extends RemoteWebDriver{

	
	public void get(String URL) {
		System.out.println("Opening " + URL + " in FireFox browser...");
	}

	
	public void quit() {
		System.out.println("Closing FireFox Browser...");
	}
	
}
class ChromeDriver extends RemoteWebDriver{

	@Override
	public void get(String URL) {
		System.out.println("Opening " + URL + " in chrome browser...");
	}

	@Override
	public void quit() {
		System.out.println("Closing chrome Browser...");
	}
	
}


class OperaDriver extends RemoteWebDriver{

	@Override
	public void get(String URL) {
		System.out.println("Opening " + URL + " in opera browser...");
	}

	@Override
	public void quit() {
		System.out.println("Closing Opera Browser...");
		
	}
	
}