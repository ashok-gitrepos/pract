package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Desktop/Ashok/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")).click();;
		driver.findElement(By.cssSelector("span.shortYear")).click();
		
		
		
		String s1=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[text()='August 2020']")).
				getText();
		System.out.println(s1);
		driver.close();
	}

}
