import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
public static void launchBroser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhusagar\\Desktop\\Clonning\\GitSecondDay\\driver\\chromedriver.exe");
}
public static void loadUrl(String url) {
	driver.get(url);
}
}
