package Haier_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Haier_POM_clss {
	
	
	WebDriver driver;

	// Haier customer

	// dealer locator
	By option_are_button = By.xpath("//div[@title='Options are']");
	// Type Message Locator
	By Enter_Message = By.xpath("//div[@title='Type a message']");
	By searchbox = By.xpath("//div[@title='Search input textbox']");
	// Clear Chat
	By Setting_three_dot_icon = By.xpath("(//span[@data-testid='menu'])[2]");
	// By clear_continue_button =
	// By.xpath("//button[@data-testid='popup-controls-ok']");
	By Clear_message_locator = By.xpath("//div[text()='Clear messages']");
	By Checkbox = By.xpath("//div[@aria-hidden='true']");
	By clear_chat_button = By.xpath("//div[text()='Clear chat']");
	// All Displayed Chat Message Locators
	By dis_2 = By.xpath("(//div[@class='_amk6 _amlo'])[2]");
	By dis_3 = By.xpath("(//div[@class='_amk6 _amlo'])[3]");
	By dis_4 = By.xpath("(//div[@class='_amk6 _amlo'])[4]");
	By dis_5 = By.xpath("(//div[@class='_amk6 _amlo'])[5]");
	By dis_6 = By.xpath("(//div[@class='_amk6 _amlo'])[6]");
	By dis_7 = By.xpath("(//div[@class='_amk6 _amlo'])[7]");
	By dis_8 = By.xpath("(//div[@class='_amk6 _amlo'])[8]");
	By dis_9 = By.xpath("(//div[@class='_amk6 _amlo'])[9]");
	By dis_10 = By.xpath("(//div[@class='_amk6 _amlo'])[10]");
	By dis_11 = By.xpath("(//div[@class='_amk6 _amlo'])[11]");
	By dis_12 = By.xpath("(//div[@class='_amk6 _amlo'])[12]");
	By dis_13 = By.xpath("(//div[@class='_amk6 _amlo'])[13]");
	By dis_14 = By.xpath("(//div[@class='_amk6 _amlo'])[14]");
	By dis_15 = By.xpath("(//div[@class='_amk6 _amlo'])[15]");
	By dis_16 = By.xpath("(//div[@class='_amk6 _amlo'])[16]");
	By dis_17 = By.xpath("(//div[@class='_amk6 _amlo'])[17]");
	By dis_18 = By.xpath("(//div[@class='_amk6 _amlo'])[18]");
	By dis_19 = By.xpath("(//div[@class='_amk6 _amlo'])[19]");
	By dis_20 = By.xpath("(//div[@class='_amk6 _amlo'])[20]");
	By dis_21 = By.xpath("(//div[@class='_amk6 _amlo'])[21]");
	By dis_22 = By.xpath("(//div[@class='_amk6 _amlo'])[22]");
	By dis_23 = By.xpath("(//div[@class='_amk6 _amlo'])[23]");
	By dis_24 = By.xpath("(//div[@class='_amk6 _amlo'])[24]");
	By dis_25 = By.xpath("(//div[@class='_amk6 _amlo'])[25]");
	By dis_26 = By.xpath("(//div[@class='_amk6 _amlo'])[26]");
	By dis_27 = By.xpath("(//div[@class='_amk6 _amlo'])[27]");
	By dis_28 = By.xpath("(//div[@class='_amk6 _amlo'])[28]");
	By dis_29 = By.xpath("(//div[@class='_amk6 _amlo'])[29]");
	By dis_30 = By.xpath("(//div[@class='_amk6 _amlo'])[30]");
	By dis_31 = By.xpath("(//div[@class='_amk6 _amlo'])[31]");
	By dis_32 = By.xpath("(//div[@class='_amk6 _amlo'])[32]");
	By dis_33 = By.xpath("(//div[@class='_amk6 _amlo'])[33]");

		// Creating Constructor
		public Haier_POM_clss(WebDriver driver) {
			this.driver = driver;
			// creating page factory
			PageFactory.initElements(driver, this);

		}

		// @Chat_clear_Method
		public void chat_clear() throws Exception {
			Thread.sleep(6000);
			System.out.println("Inside Browser close Step");
			driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-label='Clear chat']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div/div/span[2]/div/div/div/div/div/div/div[3]/div/button[2]/div/div")).click();
			Thread.sleep(2000);
		}

		/**
		 * @frist_Chat_Flow
		 */
		public void search_haier_Number() {
			WebElement whatsapp_searchbox = driver.findElement(searchbox);
			Actions action = new Actions(driver);
			action.moveToElement(whatsapp_searchbox).click(whatsapp_searchbox).build().perform();
			whatsapp_searchbox.sendKeys("85530 49999", Keys.ENTER);
		}

		// @Send_Hi
		public void Enter_hi() {
			WebElement Enter_Hi = driver.findElement(Enter_Message);
			Enter_Hi.click();
			Enter_Hi.sendKeys("Hi", Keys.ENTER);
		}
		
		public WebElement verify_Frist_Ouput() {
			WebElement txt = driver.findElement(dis_2);	
			return txt;
		}

		// @Haier_Customer
		public void send_Haier_Customer() {
			WebElement Enter_Haier_Customer = driver.findElement(Enter_Message);
			Enter_Haier_Customer.click();
			Enter_Haier_Customer.sendKeys("Haier Customer", Keys.ENTER);
		}
		
		public WebElement verify_Second_OutPut() {
			WebElement txt = driver.findElement(dis_5);
			return txt;
		}

		// @Demo/Installation
		public void send_demo_installation() {
			WebElement Enter_demo_installation = driver.findElement(Enter_Message);
			Enter_demo_installation.click();
			Enter_demo_installation.sendKeys("Demo/Installation", Keys.ENTER);
		}
		
		public WebElement verify_Third_Output() {
			WebElement txt = driver.findElement(dis_8);
			return txt;
		}
		
		// frist Yes
		public void send_frist_Yes() {
			WebElement Enter_Yes = driver.findElement(Enter_Message);
			Enter_Yes.click();
			Enter_Yes.sendKeys("Yes", Keys.ENTER);
		}

		public WebElement verify_fourth_Output() {
			WebElement txt = driver.findElement(dis_11);
			return txt;
		}

		// second yes
		public void send_second_Yes() {
			WebElement Enter_second_Yes = driver.findElement(Enter_Message);
			Enter_second_Yes.click();
			Enter_second_Yes.sendKeys("Yes", Keys.ENTER);
		}


		public WebElement verify_fifth_Output() {
			WebElement txt = driver.findElement(dis_14);
			return txt;
		}

		// Select - Refrigerator from drop down
		public void select_Refrigerator() throws Exception {
			WebElement txt1 = driver.findElement(By.xpath("(//span[@data-icon='list-msg-icon'])[1]"));
			txt1.click();
			Thread.sleep(3000);
			WebElement txt2 = driver.findElement(By.xpath("(//div[@class='_ak8o'])[1]"));
			txt2.click();
			Thread.sleep(2000);
			WebElement txt3 = driver.findElement(By.xpath("//span[@data-icon='send']"));
			txt3.click();

		}

		public WebElement verify_Sixth_Output() {
			WebElement txt = driver.findElement(dis_16);
			return txt;
		}

		// Select - Direct cool from drop down
		public void select_Direct_cool() throws Exception {
			WebElement txt1 = driver.findElement(By.xpath("(//span[@data-icon='list-msg-icon'])[2]"));
			txt1.click();
			Thread.sleep(3000);
			WebElement txt2 = driver.findElement(By.xpath("(//div[@class='_ak8o'])[1]"));
			txt2.click();
			Thread.sleep(2000);
			WebElement txt3 = driver.findElement(By.xpath("//span[@data-icon='send']"));
			txt3.click();

		}
		
		public WebElement verify_Seventh_Output() {
			WebElement txt = driver.findElement(dis_18);
			return txt;
		}


		// Three Yes
		public void send_Third_Yes() {
			WebElement Enter_Third_Yes = driver.findElement(Enter_Message);
			Enter_Third_Yes.click();
			Enter_Third_Yes.sendKeys("Yes", Keys.ENTER);
		}
		
		public WebElement verify_Eighth_Output() {
			WebElement txt = driver.findElement(dis_21);
			return txt;
		}

		// Send - Exit
		public void Send_Exit() {
			WebElement Enter_Exit = driver.findElement(Enter_Message);
			Enter_Exit.click();
			Enter_Exit.sendKeys("Exit", Keys.ENTER);
		}

		public WebElement verify_nineth_Output() {
			WebElement txt = driver.findElement(dis_24);
			return txt;
		}
	
	/**
	 * @Client_Sending_Process
	 */
		public void Haier_Internal_Whatsapp_Group() {
			WebElement whatsapp_searchbox = driver.findElement(searchbox);
			Actions action = new Actions(driver);
			action.moveToElement(whatsapp_searchbox).click(whatsapp_searchbox).build().perform();
			whatsapp_searchbox.sendKeys("My Grp Chat", Keys.ENTER);
		}

		// @Send_Hi
		public void Send_Haier_Link() {
			String txt = "https://shorturl.at/cdeXY";
			WebElement Enter_link = driver.findElement(Enter_Message);
			Enter_link.click();
			Enter_link.sendKeys("https://shorturl.at/cdeXY", Keys.ENTER);
		}
		
		public void Send_Haier_Text() {
			WebElement Enter_Hi = driver.findElement(Enter_Message);
			Enter_Hi.click();
			Enter_Hi.sendKeys("Please Check the Report After 5 Mins : Haier", Keys.ENTER);
		}

		

		
		
		
		
		
		
		
		
		
}
