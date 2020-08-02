package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Desktop/Ashok/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/29058/eng-vs-wi-3rd-test-west-indies-tour-of-england-2020");
		driver.manage().window().maximize();
		for(int i=3;i<12;i++) {
			
			String score = driver.findElements(By.xpath("//div[@id='innings_1']/div[1]/div[3]/div[3]")).get(i).getText();
			System.out.println(score);
			
		}
		/*String score = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[3]/div[3]")).getText();
		System.out.println(score);

		String score1 = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[4]/div[3]")).getText();
		System.out.println(score1);*/
	}
}
