import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String BaseUrl = "https://courses.ultimateqa.com/users/sign_in";//Launch the Chrome browser
        WebDriver driver = new ChromeDriver();//Open URL into browser
        driver.get(BaseUrl);//places URL to browser(using the get method to open the URL
        driver.manage().window().maximize();//Maximise the window
        System.out.println("The title of the page is " + driver.getTitle());//print title directly without storing
        System.out.println("The current URL is:  " + driver.getCurrentUrl());//print current url directly without storing
        System.out.println("The page source is:  " + driver.getPageSource());//print page source directly without storing
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@testing.com");//places username to username field
        driver.findElement(By.id("user[password]")).sendKeys("Password123");//places password to password field
        driver.close();//close browser
    }
}
