package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
      public static void main(String[] args) {
		
		ChromeDriver ch = new ChromeDriver();
		ch.get("http://www.leaftaps.com/opentaps/control/main");
		ch.manage().window().maximize();
		WebElement usernamefield = ch.findElement(By.id("username"));
		usernamefield.sendKeys("Democsr");
		WebElement password = ch.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		WebElement login = ch.findElement(By.className("decorativeSubmit"));
		login.click();
		
		 ch.findElement(By.linkText("CRM/SFA")).click();
	//Locate the Leads tab and click
				ch.findElement(By.linkText("Leads")).click();
				
				//Locate the Create Lead from shortcut menu and click
				ch.findElement(By.linkText("Create Lead")).click();
				
				//Locate the Company name filed and enter TestLeaf
				ch.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				//Locate the first name field and enter your name
				ch.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
				
				//Locate the last name filed and enter your last name
				ch.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				
				//Locate Source Dropdown and Select Partner
					//Step1: Locate the Dropdown Element
				WebElement sourceWE = ch.findElement(By.id("createLeadForm_dataSourceId"));
					//Step2: Create object for Select and pass WebElement reference inside the constructor
				Select sourceDD = new Select(sourceWE);
					//step3: Use select methods to select value
				sourceDD.selectByIndex(7);
				
				//Locate the Industry dropdown and select computer software
					//Step1: Locate the Dropdown Element
				WebElement industryWE = ch.findElement(By.id("createLeadForm_industryEnumId"));
					//Step2: Create object for Select and pass WebElement reference inside the constructor
				Select industryDD = new Select(industryWE);
					//step3: Use select methods to select value
				industryDD.selectByValue("IND_SOFTWARE");
				
				//Locate the ownership dropdown and select partnership
					//Step1: Locate the Dropdown Element
				WebElement ownershipWE = ch.findElement(By.id("createLeadForm_ownershipEnumId"));
					//Step2: Create object for Select and pass WebElement reference inside the constructor
				Select ownershipDD = new Select(ownershipWE);
					//step3: Use select methods to select value
				ownershipDD.selectByVisibleText("Partnership");
				
				
				//Locate the Create Lead button and click
				ch.findElement(By.className("smallSubmit")).click();
				
				//Locate the Lead Id and print it 
				String leadID = ch.findElement(By.id("viewLead_companyName_sp")).getText();
				System.out.println(leadID);
				// To get the title
				String title = ch.getTitle();
				// Print the title
				System.out.println(title);
			
				// To close the browser
				ch.close();


			}

}
		//String title = ch.getTitle();
				//System.out.println(title);
	    //ch.close();

