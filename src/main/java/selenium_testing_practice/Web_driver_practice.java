package selenium_testing_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_driver_practice {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "lib2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");
//		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
//
//		System.out.println("no of elements capture" + links.size());
//		for (WebElement itr : links) {
//			System.out.println(itr.getText());
//
//		}
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		WebElement mail=driver.findElement(By.xpath("//input[@id='Email']"));
//		String a=mail.getAttribute("data-val-email");
//		System.out.println(a);
//		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
//		String b=button.getTagName();
//		System.out.println(b);
//		String c=button.getText();
//		System.out.println(c);

		driver.get("https://www.twoplugs.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement drpelement = driver.findElement(By.name("category_id"));
		Select drpselect = new Select(drpelement);

		List<WebElement> options = drpselect.getOptions();

		ArrayList originallist = new ArrayList();
		ArrayList temporarylist = new ArrayList();

		for (WebElement option : options) {

			originallist.add(option.getText());
			temporarylist.add(option.getText());

		}
		
		System.out.println("original list"+ originallist);
		System.out.println("temporary list"+ temporarylist);
		
		Collections.sort(temporarylist);
		
		System.out.println("original list"+ originallist);
		System.out.println("templist after sorting "+temporarylist);

	}

}
