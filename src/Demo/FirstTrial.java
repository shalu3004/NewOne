package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTrial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\codin\\eclipse-workspace\\NewOne\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
	}
	
	
	
	

}


