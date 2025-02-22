package Selenium;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Resources/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        String url = "https://rahulshettyacademy.com/AutomationPractice/";
        driver.get(url);
        String testPageTitle = driver.getTitle();
        System.out.println(testPageTitle);

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        radioButton1.click();
        System.out.println(radioButton1.isSelected());

        //id="ui-id-1"
        WebElement suggestionClass = driver.findElement(By.id("autocomplete"));
        String expectedCountry = "Mexico";
        suggestionClass.sendKeys("Me");
        Thread.sleep(Duration.ofSeconds(2));
        List<WebElement> countries = driver.findElements(By.cssSelector("ul#ui-id-1 li"));
        countries.forEach(country -> {
           if(country.getText().equalsIgnoreCase(expectedCountry)) {
               country.click();
           }
        });

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdownSelect = new Select(dropdown);
        dropdownSelect.selectByValue("option1");

        WebElement inputNameField = driver.findElement(By.id("name"));
        inputNameField.sendKeys("Adrian");
        WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
        confirmButton.click();
        Thread.sleep(Duration.ofSeconds(2));
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();

        //Switch to new tabs
        WebElement openTabButton = driver.findElement(By.cssSelector("a#opentab"));
        openTabButton.click();

        Set<String> allTabs = driver.getWindowHandles();
        Iterator<String> iterator = allTabs.iterator();
        String parentTab = iterator.next();
        while (iterator.hasNext()) {
            driver.switchTo().window(iterator.next());
            System.out.println("Page title: " + driver.getTitle());
        }
        driver.switchTo().window(parentTab);

        Thread.sleep(Duration.ofSeconds(2));

        driver.close();
        driver.quit();
    }
}
