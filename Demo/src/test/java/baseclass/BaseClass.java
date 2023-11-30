package baseclass;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver chromeLaunch() {
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void browserLaunch(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();

		} else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
	}

	public static void urlLaunch(String url) {
		driver.get(url);

	}
	public static void deleteAllCookies(){
		driver.manage().deleteAllCookies();	
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);
	}

//	public static void click(WebElement e) {
//		e.click();
//	}

	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void quit() {
		driver.quit();
	}

	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	public static String generateRandomName() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();

        // Generate a random name of a specific length (e.g., 8 characters)
        int nameLength = 8;
        Random random = new Random();

        for (int i = 0; i < nameLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            name.append(randomChar);
        }

        return name.toString();

    }
	 public static String generateRandomColor() {
	        Random random = new Random();
	        // Generate random values for red, green, and blue components
	        int red = random.nextInt(256);
	        int green = random.nextInt(256);
	        int blue = random.nextInt(256);

	        // Convert RGB values to hexadecimal format
	        return String.format("#%02x%02x%02x", red, green, blue);
	    }
}
