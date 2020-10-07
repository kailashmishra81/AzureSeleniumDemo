package MvnProj2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
	
	public static void main (String Args[])
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\kailash.k.mishra\\Desktop\\ChromeDriver\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		  
		
		
	}

}
