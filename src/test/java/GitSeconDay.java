import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GitSeconDay extends BaseClass{
public static void main(String[] args) {
	System.out.println("Hi");
	launchBroser();
	loadUrl("https://www.facebook.com/");
	WebElement txtLogin = driver.findElement(By.id("login"));
	txtLogin.sendKeys("madhuri");
	WebElement btnsignin = driver.findElement(By.id("signin"));
	btnsignin.click();
	
}
}
