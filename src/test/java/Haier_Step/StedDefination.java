package Haier_Step;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Haier_POM.Haier_POM_clss;
import Utilities.LogCaptures;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StedDefination {
	
	WebDriver driver;

	String chromeProfile = "C://Users//rajatg//AppData//Local//Google//Chrome//User Data//User Data";
	String defaultprofile = "C://Users//rajatg//AppData//Local//Google//Chrome//User Data//Default";
	

	Haier_POM_clss POM_Obj;

	// Scenario Object CRaeting
	Scenario scn;

	@Before
	public void Editreport(Scenario s) {
		this.scn = s;
	}

	@After
	public void close_browser() throws Exception {
		System.out.println("I M Inside the scenario checking Condition");
		if(scn.isFailed()) {
			// this is Failed Condition
			String txt = scn.getName();
			System.out.println("Scenario Name :"+txt);
			Thread.sleep(2000);
			Status txt1 = scn.getStatus();
			System.out.println("Scenario Status is :"+txt1);
			System.out.println(txt+"is Failed SuccessFully");
			System.out.println(txt+"I M Inside Client Internal Group Report Sending Process");
			POM_Obj.Haier_Internal_Whatsapp_Group();
			Thread.sleep(4000);
			POM_Obj.Send_Haier_Link();
			Thread.sleep(2000);
			POM_Obj.Send_Haier_Text();
			System.out.println(txt+"I M Outside of Client Inetrnal Group Report Sending Process");
		}
		else {
			String text1 = scn.getName();
			System.out.println("Scenario Name :- "+text1);
			Thread.sleep(2000);
			Status text2 = scn.getStatus();
			System.out.println("Scenario Status is :- "+text2);	
			System.out.println(text2+"I M Inside Client Internal Group Report Sending Process");
			POM_Obj.Haier_Internal_Whatsapp_Group();
			Thread.sleep(4000);
			POM_Obj.Send_Haier_Link();
			Thread.sleep(2000);
			POM_Obj.Send_Haier_Text();
			System.out.println(text2+"I M Outside of Client Inetrnal Group Report Sending Process");
			System.out.println(text1+":- Scenario is Passed SuccessFully");	
		}
		System.out.println("I M Outside of Condition Checking process");
		Thread.sleep(2000);
		System.out.println("I M Inside browser Open Process");
		driver.quit();
		driver = null;
		System.out.println("I M Outside of Browser Closed Process");

	}

	/**
	 * @Bakground
	 * @throws Exception
	 */

	@Given("Whatsapp should be open")
	public void whatsapp_should_be_open() throws Exception {
		LogCaptures.takeLog("Whatsapp Open - Inside", "Haier Step - 1");
		System.out.println("WhatsApp is Open - Step -1");
		 WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\rajatg\\eclipse-workspace\\Daily_Whatsapp_Checklist\\src\\test\\resources\\Browser\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--user-data-dir=" + defaultprofile);
		DesiredCapabilities incgBrowserMode = new DesiredCapabilities();
		incgBrowserMode.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(incgBrowserMode);
		driver = new ChromeDriver(options);
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(30000);
		POM_Obj = new Haier_POM_clss(driver);
		LogCaptures.takeLog("Whatsapp Open - Complete", "Haier Step - 1");
	}

	/**
	 * @Haier_Chat_Flow
	 */
	@And("Send Hi and search Haier in the Searchbox")
	public void Send_Hi_and_search_Haier_in_the_Searchbox() throws Exception {
		LogCaptures.takeLog("Send Hi - Inside", "Haier Step - 2");
		System.out.println("Search name in the searchbox and click on Key Enter - Step 2");
		POM_Obj.search_haier_Number();
		Thread.sleep(3000);
		POM_Obj.chat_clear();
		Thread.sleep(4000);
		POM_Obj.Enter_hi();
		Thread.sleep(20000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Complete - Search Haier", "Haier Chat flow 1 - Step 2");
		LogCaptures.takeLog("Send Hi - Complete", "Haier Step - 2");
	}

	@When("Send Haier Customer for Frist Chat flow")
	public void send_haier_customer_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Inside - Send haier Customer", "Haier Chat flow 1 - Step 3");
		 WebElement txt1 = POM_Obj.verify_Frist_Ouput();
		 if(txt1.isDisplayed()) {
				Thread.sleep(4000);
				POM_Obj.send_Haier_Customer();
				Thread.sleep(15000);
				System.out.println("SuccessFully Enter the Haier Customer");
		 }
		 else {
			 driver.close();
			 System.out.println("NOt Enter in the Send Haier Customer");
		 }
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Send Haier - Complete", "Haier Step - 3");

	}

	@When("Send Demo installation for Frist Chat flow")
	public void send_demo_installation_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Send Demo/Installation - Inside", "Haier Step - 4");
			POM_Obj.send_demo_installation();
			Thread.sleep(12000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Send Demo/Installation - Complete", "Haier Step - 4");

	}

	@When("Send yes for Confirm below details for Frist Chat flow")
	public void send_yes_for_confirm_below_details_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Send - Yes - Inside", "Haier Step - 5");
			POM_Obj.send_frist_Yes();
			Thread.sleep(12000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Send - Yes - Complete", "Haier Step - 5");
	}

	@And("Send Again yes for registered details correct  for Frist Chat flow")
	public void Send_Again_yes_for_registered_details_correct_for_Frist_Chat_flow() throws Exception {
		LogCaptures.takeLog("Send - Yes Again - Inside", "Haier Step - 6");
			POM_Obj.send_second_Yes();
			Thread.sleep(15000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Send - Yes Again - Complete", "Haier Step - 6");

	}

	@When("Select Refrigerator from the Drop down for Frist Chat Flow")
	public void select_refrigerator_from_the_drop_down_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Send - Select Rfrigerator - Inside", "Haier Step - 7");
			POM_Obj.select_Refrigerator();
			Thread.sleep(12000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Send - Select Rfrigerator - Inside", "Haier Step - 7");

	}

	@When("Again Select Direct Cool from drop down for Frist Chat Flow")
	public void again_select_direct_cool_from_drop_down_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Inside - select Direct Cool", "Haier Chat flow 1 - Step 8");
			POM_Obj.select_Direct_cool();
			Thread.sleep(12000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Complete - select Direct Cool", "Haier Chat flow 1 - Step 8");
	}

	@When("Again Send Yes  for Frist Chat Flow")
	public void again_send_yes_for_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Inside - send Third - Yes", "Haier Chat flow 1 - Step 9");
			POM_Obj.send_Third_Yes();
			Thread.sleep(12000);
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Complete - send Third - Yes", "Haier Chat flow 1 - Step 9");

	}

	@Then("Send Exit  For the Frist Chat flow")
	public void send_exit_for_the_frist_chat_flow() throws Exception {
		LogCaptures.takeLog("Inside - send Exit", "Haier Chat flow 1 - Step 10");
			POM_Obj.Send_Exit();
			Thread.sleep(12000);
			POM_Obj.chat_clear();	
		// Screenshot Attachment
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		byte[] data = scrShot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", scn.getName());
		LogCaptures.takeLog("Complete - send Exit", "Haier Chat flow 1 - Step 10");

	}


}
