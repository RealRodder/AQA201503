package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vitaly on 30.03.2015.
 * Открываем браузер из Java
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
      // Путь системе к хром драйверу
      System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Java/chromedriver.exe");
      // Запустить хром
      WebDriver gc_browser = new ChromeDriver();
      // Развернуть на весь экран
      gc_browser.manage().window().maximize();
      // Перейти по ссылке
      gc_browser.get("https://www.google.com.ua");
      // В текущее окно ввести текст
      //gc_browser.
      // Подождать 5 секунд
      Thread.sleep(5000);
      // Закрыть хром
      gc_browser.quit();
    }
}
