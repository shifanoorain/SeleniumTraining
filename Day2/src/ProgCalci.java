import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgCalci {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.id("food")).sendKeys("200");
		driver.findElement(By.id("clothing")).sendKeys("100");
		driver.findElement(By.id("shelter")).sendKeys("300");
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		driver.findElement(By.id("monthlyOther")).sendKeys("200");
		Thread.sleep(2000);
		System.out.println("totoal monthly expense:"+driver.findElement(By.id("totalMonthlyExpenses")).getText());
		System.out.println("totoal monthly Income:"+driver.findElement(By.id("totalMonthlyIncome")).getText());
		

	}

}
