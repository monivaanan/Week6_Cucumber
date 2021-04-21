package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadFunctions {
	
	public ChromeDriver driver;
	String leadID;
	String leadIDMerge;
	List<String> allhandles = new ArrayList<String>();
	List<String> allhandles2 = new ArrayList<String>();

@Given("Open the chrome browser")
public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
@And ("Load the application URL")
public void loadAppUrl() {
		
		driver.get("http://leaftaps.com/opentaps/main");
		
	}
	
@Given("Enter username as {string}")
public void  enterUserName(String username){
		
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	
@Given("Enter password as {string}")
public void enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
@When("click on Login button")
public void clickLoginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
@Then("Click on CRMSFA link")
public void clickLink() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
@And ("Click on Leads")
public void clickHomePageLeads() {
		
		driver.findElement(By.linkText("Leads")).click();
	}
	
@And("Click on Create Lead")
public void clickHomePageCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
@And ("Enter the Company Name as {string}")
public void enterCompanyName(String compName) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
	}
	
@And("Enter the First Name as {string}")
public void enterFirstName(String fName) {
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	
@And("Enter the Last Name as {string}")
public void enterLastName(String lName) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	
@Then("Submit button is clicked")
public void submitCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
	}

	
@Then("Click on Find Leads")
public void clickOnFindLeads() {
		
		driver.findElement(By.linkText("Find Leads")).click();

	}
	
@Then("Click on phone Number tab")
public void clickOnPhoneNumberTab() {
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	}
	
@And ("Enter Phone Number as {string}")
public void enterPhoneNumber(String phoneNum) {
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
	}
	
@And ("Click on Find Leads button")
public void findLeadsButton() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
@Then("Click on Lead Record")
public void clickLeadRecord() {
		
		//leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	
@And ("Click on Edit button")
public void editButton() {
		
		driver.findElement(By.linkText("Edit")).click();
	}
	
@And ("Edit CompanyName as {string}")
public void editCompanyName(String compName) {
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
	}
	
@And ("Click on Submit button")
public void updateLead() {
		
		driver.findElement(By.name("submitButton")).click();
	}
	
@Given ("Click on Duplicate Lead")
public void clickDuplicateLeadButton() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
@And ("Click on createLead button")
public void createDuplicateLead() {
		
		driver.findElement(By.name("submitButton")).click();
	}
	
	
@Then("Click on Find Leads for Delete lead")
public void clickOnFindLeadsDeleteLead() {
		  
		driver.findElement(By.linkText("Find Leads")).click();

	}
	
@Then("Click on phone Number tab for Delete lead")
public void clickOnPhoneNumberTabDeleteLead() {
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	}
	
@And ("Enter Phone Number as {string} for Delete lead")
public void enterPhoneNumberDeleteLead(String phoneNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
	}
	
@And ("Click on Find Leads button for Delete lead")
public void findLeadsButtonDeleteLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
@Then("Click on Lead Record for Delete lead")
public void clickLeadRecordDeleteLead() {
		
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The lead ID to be deleted :" +leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	
@Then ("Click on Delete Lead button")
public void clickDeleteLead() {
		
		driver.findElement(By.linkText("Delete")).click();
	}
	
@Then ("Verify if Lead is deleted")
public void deleteVerify() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
	}


@Given("Click on Merge leads")
public void clickOnMergeLeads() {
	driver.findElement(By.linkText("Merge Leads")).click();
}

@Then("Click on From Lead Look up")
public void clickOnFromLeadLookUp() {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
}

@Then("Enter first name as {string} From lookup")
public void enterFirstNameAsFromLookup(String firstNameFrom) {
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstNameFrom);

}

@Then("Click on From lead record")
public void clickOnFromLeadRecord() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	leadIDMerge = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles.get(0));
}


@Then("Click on To Lead Look up")
public void clickOnToLeadLookUp() {

	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
}

@Then("Enter first name as {string} To lookup")
public void enterFirstNameAsToLookup(String firstNameTo) {
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstNameTo);
}

@Then("Click on To lead record")
public void clickOnToLeadRecord() throws InterruptedException {

	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles2.get(0));
}

@Then("Click on Merge button")
public void clickOnMergeButton() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
}

@Then("Click on Alert")
public void clickOnAlert() {
   driver.switchTo().alert().accept();
}

@When("Click on Find Leads and verify if from Lead ID retruns")
public void clickOnFindLeadsAndVerifyIfFromLeadIDRetruns() {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDMerge);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched. Merge Leads Successful");
	}
}

@Then ("close the browser")
	public void closeBrowser() {
		driver.close();

}
	
}
