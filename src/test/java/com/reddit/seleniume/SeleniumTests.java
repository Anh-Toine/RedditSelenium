package com.reddit.seleniume;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(SeleniumExtension.class)
public class SeleniumTests {

    ChromeDriver driver;

    public SeleniumTests(ChromeDriver driver) {
        this.driver = driver;
    }

    public void sleep(int time){
        try{
            Thread.sleep(time*1000L);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test
    void search_test(){
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        //sleep(5);

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        searchBox.sendKeys("Chris Chan Geno Samuel");
        searchBox.sendKeys(Keys.RETURN);
        sleep(5);

//        WebElement communities = driver.findElement(By.xpath("//*[@id=\"SHORTCUT_FOCUSABLE_DIV\"]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div[1]/a[2]/button"));
//        communities.click();
//
//        WebElement join = driver.findElement(By.xpath("//*[@id=\"SHORTCUT_FOCUSABLE_DIV\"]/div[2" +
//                "]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/a/div[3]/button"));
//        join.click();
        driver.quit();
    }
}
