package jenkinstry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login_page {
	
	@Test
	public void Testcase(){
		WebDriver d1=new FirefoxDriver();
		d1.get("http://www.google.com");
		d1.get("nbuyads.appinstitute.in/admin");
		d1.findElement(By.name("AdminLoginForm[email]")).sendKeys("balaji2469@gmail.com");
		d1.findElement(By.name("AdminLoginForm[password]")).sendKeys("4972gWBwBC");
		d1.findElement(By.name("login-button")).click();
		d1.quit();
	}
}

