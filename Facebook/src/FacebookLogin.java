import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https:\\facebook.com");
		WebElement e=w.findElement(By.name("email"));
		WebElement p=w.findElement(By.name("pass"));
		e.sendKeys("r0nniee");
		p.sendKeys("ArnabSil");
		p.submit();
		//for(double i=0; i<999999; i++);
		WebElement s=w.findElement(By.id("navAccount"));
		s.click();
		WebElement l=w.findElement(By.xpath("//input[@class='uiLinkButtonInput']"));
		l.click();
	}
}
