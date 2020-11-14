package week8Thursday;

public abstract class RemoteWebDriver {
	abstract void get(String url);
	abstract void quit();
	
}
class OperaDriver extends RemoteWebDriver{

	@Override
	void get(String url) {
		System.out.println("Opening " + url + " in opera browser");
		
	}

	@Override
	void quit() {
		System.out.println("Closing opera browser");
		
	}}



class ChromeDriver extends RemoteWebDriver{

	@Override
	void get(String url) {
		System.out.println("Opening " + url + " in chrome browser");
		
	}

	@Override
	void quit() {
		System.out.println("Closing chrome browser");
		
	}}


class FireFoxDriver extends RemoteWebDriver{

	@Override
	void get(String url) {
		System.out.println("Opening " + url + " in firefox browser");
	}

	@Override
	void quit() {
		System.out.println("Closing firefox browser");
		
	}}
