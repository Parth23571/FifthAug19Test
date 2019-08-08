package fifthAug19Retest.fifthAug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//First Commits Test and Retest and ReRun - another Test - 08/08
public class ReTest1 {
  
@Test
  public void f() {
	  System.out.println("Hello TestNG");
	  
	  //System.setProperty("webdriver.chrome.driver","C:\\Browers\\chromedriver.exe");
	  System.setProperty("webdriver.internet.driver","C:\\Browers\\IEDriverServer.exe");
	  //String strPath="https://www.google.com";
	  String strPath="file:///C:/Satish/JMP/IngeniousLogin.html";
	  WebDriver driver=new ChromeDriver();
	  driver.get(strPath);
	  driver.manage().window().maximize();
	  driver.findElement(By.name("userid")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("password");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
