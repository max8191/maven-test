import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCode {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        String searc_term= "chatGPT";
        search.sendKeys(searc_term, Keys.ENTER);
       String currentTitle =  driver.getTitle();
       if(currentTitle.contains(searc_term)){
           System.out.println("Passed");
       }else System.out.println("fale.Current titlr is " + currentTitle);

    }
}
