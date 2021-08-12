import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderAction {
	public static WebDriver driver;

//	public static void main(String[] args) {}

	@BeforeTest
	public void OrderHover() {
		System.out.println(" hello Amazon application gm ");System.setProperty("webdriver.chrome.driver", "C:\\Users\\bibhpatr\\Downloads\\Selenium_Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void Demo() {
		Actions act = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(mainMenu).perform();
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"));
		act.moveToElement(subMenu);
		act.click().build().perform();
	}
	@Test(priority = 2)
	public void SignIn() {
		driver.findElement(By.id("ap_email")).sendKeys("bibhuptr1@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Revolution1@2");
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Test(priority = 3)
	public void Search() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bicycle");
		String SearchGo = "//*[@id=\"nav-search-submit-button\"]";
		driver.findElement(By.id(SearchGo)).click();

	}
	
}
