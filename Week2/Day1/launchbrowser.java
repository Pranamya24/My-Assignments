package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	
	public static void main(String[] args) {
		
		ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.facebook.com/");
		ch.manage().window().maximize();
		WebElement user = ch.findElement(By.id("email"));
		user.sendKeys("testleaf.2023@gmail.com");
		WebElement password = ch.findElement(By.name("pass"));
		password.sendKeys("Tuna@321");
		WebElement login = ch.findElement(By.name("login"));
		login.click();
		String title = ch.getTitle();
				System.out.println(title);
	    ch.close();
		
		
		
		
		
		
		
		
	}

}
