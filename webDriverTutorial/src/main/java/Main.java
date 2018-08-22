import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://google.com");
        WebElement webEl = ((ChromeDriver) chromeDriver).findElementByName("q");
        CharSequence message = "olololo";
       /*
        webEl.sendKeys(message);
        Thread.sleep(3000);
        webEl.submit();
        //List webEls = chromeDriver.findElements(By.cssSelector("a"));
        WebElement videoEl = chromeDriver.findElements(By.cssSelector("a")).get(57);
        videoEl.click();
        chromeDriver.manage().window().maximize();
        Thread.sleep(3000);
        chromeDriver.findElement(By.tagName("html")).sendKeys("f");
        Thread.sleep(3000);
        chromeDriver.findElement(By.tagName("html")).sendKeys("f");
        */
        CharSequence openNewTab = Keys.chord(Keys.CONTROL,"t");
        chromeDriver.findElement(By.tagName("html")).sendKeys(openNewTab);

      /*
       for (int i = 0; i < webEls.size(); i++) {
            WebElement el = (WebElement) webEls.get(i);
            System.out.println(i+" -   "+el.getAttribute("ping"));
        }
      */

    }
}
