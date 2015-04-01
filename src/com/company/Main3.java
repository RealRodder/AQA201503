package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
      // Вывести тайтл страницы - getTitle()
      System.out.println(gc_browser.getTitle());
      // Ввести в окно поиска некий текст
      // Сначала находим элемент
      WebElement s = gc_browser.findElement(By.name("q"));
      // Теперь в этот элемент пишем текст и нажимаем Enter - кстати, можно было в две команды s.sendKeys: сначала текст, потом нажатиие Enter
      s.sendKeys("qa factory Киев", Keys.ENTER);
      // Задержка для прогрузки страницы
      Thread.sleep(3000);
      // Вывести в консоль значение первой строки поиска - находи в структуре самый ближний id (идём ввверх)
      WebElement rso = gc_browser.findElement(By.id("rso"));
      // Найти элемент по таг-имени
      WebElement f = rso.findElement(By.tagName("a"));
      System.out.println(f.getText());
      // Собираем список
      List<WebElement> as = rso.findElements(By.tagName("a"));
      // Выводим весь список
      for (int i=0; i < as.size(); i++ ){
          WebElement cur = as.get(i);
          // Два варианта
          //System.out.println(cur.getText());
          System.out.println(as.get(i).getText());
          System.out.println(as.get(i).getAttribute("href"));
      }

      // А теперь найдём новый текст и нажмём линзу
      s.clear();
      s.sendKeys("angel sha1");
      gc_browser.findElement(By.name("btnG")).click();


      // Подождать 5 секунд
      //Thread.sleep(5000);
      // Закрыть хром
      // gc_browser.quit();
    }
}
