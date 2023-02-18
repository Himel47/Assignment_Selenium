package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class mainClass {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BS358\\Downloads\\chromedriver_win32\\chromedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(3000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("User Logged In Sucessfully!");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        System.out.println("Item added Successfully!");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        System.out.println("Item added Successfully!");

        Thread.sleep(3000);
        System.out.println("Navigating Item Cart ...");
        driver.get("https://www.saucedemo.com/cart.html");

        Thread.sleep(3000);
        System.out.println("Checking Out ...");
        driver.findElement(By.id("checkout")).click();

        Thread.sleep(3000);
        System.out.println("Filling out Necessary Info ...");
        driver.findElement(By.id("first-name")).sendKeys("MD. Shahriar Kabir");
        driver.findElement(By.id("last-name")).sendKeys("Himel");
        driver.findElement(By.id("postal-code")).sendKeys("1219");
        driver.findElement(By.id("continue")).click();

        System.out.println("Confirming Order ...");

        Thread.sleep(3000);
        driver.findElement(By.id("finish")).click();
        System.out.println("Order Confirmed!");
        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        System.out.println("Back to Home Page");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();

        System.out.println("Logged Out Successfully after placing Order!");
    }
}
