package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by Vitaly on 06.04.2015.
 */
public class RealProject1 {
    public static void main(String[] args) throws InterruptedException {
        // Путь системе к хром драйверу
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Java/chromedriver.exe");
        // Запустить хром
        WebDriver gc_browser = new ChromeDriver();
        // Развернуть на весь экран
        // gc_browser.manage().window().maximize();
        // Перейти по ссылке
        gc_browser.get("http://angel.net/~nic/passwd.current.html");
        // Задержка для прогрузки страницы
        Thread.sleep(1000);
        // Сначала находим элемент для ввода мастер пароля
        WebElement edit_field_master = gc_browser.findElement(By.name("master"));
        // Теперь в этот элемент пишем текст
        edit_field_master.sendKeys("12345678");
        // Затем находим элемент для ввода имени сайта
        WebElement edit_field_site = gc_browser.findElement(By.name("site"));
        // Теперь в этот элемент пишем текст
        edit_field_site.sendKeys("skype", ENTER);
        // Затем находим элемент кнопки "Generate"
        String edit_field_password = gc_browser.findElement(By.name("password")).getAttribute("value");
        // Выводим в консоль
        System.out.println(edit_field_password);
        // Закрыть хром
        gc_browser.quit();
    }
}

