import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class CheckWorkOfAdmin {

    public static void main(String[] args) {

        WebDriver driver = getDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));

        WebElement loginInput = driver.findElement(By.id("email"));
        loginInput.sendKeys(" webinar.test@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminParentOrders")));

        WebElement orderItem = driver.findElement(By.id("subtab-AdminParentOrders"));
        orderItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminCatalog")));

        WebElement catalogItem = driver.findElement(By.id("subtab-AdminCatalog"));
        catalogItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/nav/ul/li[5]")));

        WebElement customerItem = driver.findElement(By.xpath("/html/body/nav/ul/li[5]"));
        customerItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminParentCustomerThreads")));

        WebElement customerThreadItem = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        customerThreadItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminStats")));

        WebElement statsItem = driver.findElement(By.id("subtab-AdminStats"));
        statsItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"subtab-AdminParentModulesSf\"]")));

        WebElement modulesItem = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentModulesSf\"]"));
        modulesItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/nav/ul/li[10]")));

        WebElement designItem = driver.findElement(By.xpath("/html/body/nav/ul/li[10]"));
        designItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminParentShipping")));

        WebElement shippingItem = driver.findElement(By.id("subtab-AdminParentShipping"));
        shippingItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminParentPayment")));

        WebElement paymentItem = driver.findElement(By.id("subtab-AdminParentPayment"));
        paymentItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminInternational")));

        WebElement internationalItem = driver.findElement(By.id("subtab-AdminInternational"));
        internationalItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-ShopParameters")));

        WebElement shopItem = driver.findElement(By.id("subtab-ShopParameters"));
        shopItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminAdvancedParameters")));

        WebElement advancedItem = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        advancedItem.click();
        System.out.println("Page title is " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page title is " + driver.getTitle());


    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
        return new ChromeDriver();

    }
}


