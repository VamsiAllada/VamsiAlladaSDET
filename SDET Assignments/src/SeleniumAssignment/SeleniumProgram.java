package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {
	 
	         public static void main(String [] args) throws InterruptedException{
	                  //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
					  @BeforeSuite
					  @Test(priority=1)
	                  Public void setup()
					  {
					  System.setProperty("webdriver.chrome.driver", "D:/SeleniumEnvironment/chromedriver_win32/chromedriver.exe");
	                  WebDriver driver = new ChromeDriver();
	                  String URL=driver.get("https://urldefense.com/v3/__https://opensource-demo.orangehrmlive.com/__;!!Ebr-cpPeAnfNniQ8HSAI-g_K5b7VKg!eUHa_zE72R-79ztwN6ALT8JbxDwH7TLbsfr_LU-0IgTj2mXcrVSTxn1nr0xAjGrVFltk0A$ ");
					  
					  }
					  @Test(priority=2)
					  Public void ImagesInLoginpage()
					  {
					  String Image1=driver.findElement(By.xpath("//*[@id="divLogo"]/img");
					  Sytem.out.println("The Logo Oraange  HRM is identified in the login page"+Image1);
					  String Image2=driver.findElement(BLogin Panel y.id("logInPanelHeading");
					  Sytem.out.println("The Login Panel is identified in the login page"+Image2);
					  String Image3=driver.findElement(By.xpath("//*[@id="forgotPasswordLink"]/a");
					  Sytem.out.println("The Forgot Password is identified in the login page"+Image3);
					  }
					  @Test(priority=3)
					  Public void Login Page()
					  {
					  driver.findElement(By.id("txtUsername").sendkeys("Admin");
	                  driver.findElement(By.id("txtPassword").sendkeys("admin123");
	                  driver.findElement(By.id("btnLogin").click();
					  String tilte=driver.gettitle();
	                  Sytem.out.println("The title of the application is"+title);
	                  }	
					  @Test(priority=4)
	                  public void ValidateDashboard()
	                  {
	                    String Admin=driver.findElement(By.xpath("//*[@id="menu_admin_UserManagement"]").click();
						Admin.implictwait(20);
						String UserManagement=driver.findElement(By.xpath("//*[@id="menu_admin_viewAdminModule");
						String Jobs=driver.findElement(By.id("menu_admin_Job");
						String Organization=driver.findElement(By.id("menu_admin_Organization");
						String Qualification=driver.findElement(By.id("menu_admin_Qualifications");
	                  }
			
					  public void ValidateData()
					  {
							 String PIM=driver.findElement(By.Cssselector("#menu_pim_viewPimModule > b");.
							 driver.findElement(By.xpath("//*[@id="empsearch_employee_name_empName"]").sendkeys("Linda Anderson");
							 driver.findElement(By.xpath("//*[@id="searchBtn"]")
							 
	                         File screenshot=((Take Screenshot)driver).getScreenshot(OutputType.FILE);
							 try
							 {
							 
							   FileUtils.copyFile(screenshot, new File(" screenshot Path of the location");
							   }
							   Catch(Exception e)
							   {
							      e.getMessage();
								  }
						}
					  
					  @Test
					  public void ValidateDashboardMenusWithCSSSelector()
					  {
	                        String PIM=driver.findElement(By.Cssselector("#menu_pim_viewPimModule > b");
							
							String Time=driver.findElement(By.Cssselctor("#menu_time_viewTimeModule > b");
							String Maintainance=driver.findElement(By.Cssselctori("#menu_maintenance_purgeEmployee > b");
							
					  }
	                   @Test
					  public void ValidateDashboardMenusWithXpath()
					  {
					     driver.findElement(By.xpath("//*[@id="MP_link"]");
						 driver.findElement(By.xpath("//*[@id="welcome"]");
						 driver.findElement(By.xpath("//*[contains(text(),'Leave List)]");
					   }
					  
					  // Reading the dashbaord titile and Minimize the browser window
					  
					  String Dashboardtitle=driver.findElement(By.xpath("//*[@id="content"]/div/div[1]/h1").gettext();
					  System.out.println("The title in the Dashboard is"+Dashboardtitle);
					  driver.manage.window().minimze();
					  
					  
					   //Quite a driver
					     driver.quite(); //To close all browsers;
						 or 
						 driver.close();  //To close only the opened browser
}
