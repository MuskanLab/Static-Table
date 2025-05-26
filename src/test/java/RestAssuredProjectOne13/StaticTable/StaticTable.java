package RestAssuredProjectOne13.StaticTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class StaticTable {
	
	WebDriver driver;
	@Test
	void staticTable() {
		
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50000));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id='customers' and @class='ws-table-all']//tr")));
	List<WebElement> Listrow =driver.findElements(By.xpath("//table[@id='customers' and @class='ws-table-all']//tr"));
	List<WebElement> Listcol= driver.findElements(By.xpath("//table[@id='customers' and @class='ws-table-all']//tr//th"));
	System.out.println("-------------------------------------27");
	for(int i=1; i<=Listrow.size(); i++)
	{
		for(int j=1; j<=Listcol.size(); j++)
		{
			System.out.println("-------------------------------------32");
			String value1="//table[@id='customers']/tr["+i+"]/td["+j+"]";
			System.out.println("-------------------------------------34");
			WebElement cell = driver.findElement(By.xpath(value1));
			System.out.println("-------------------------------------36");
	        System.out.print(cell.getText() + " | ");
			
		
		}
		System.out.println("-------------------------------------");
<<<<<<< HEAD
<<<<<<< HEAD
		//System.out.println("new value");
=======
	System.out.println("-------------------------------------2");
=======
	System.out.println("-------------------------------------3");
>>>>>>> MuskanDev
		
>>>>>>> ad152f5c597e8c3c1bb53a79fa4ed8319d737a55
	}
	
	
	}
}
