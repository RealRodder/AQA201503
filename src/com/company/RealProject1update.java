package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

/**
 * Created by Vitaly on 06.04.2015.
 */
public class RealProject1update {
    public static void main(String[] args) throws InterruptedException {
        String FinalPassword_value = "";
        // Путь системе к хром драйверу
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Java/chromedriver.exe");
        // Запустить хром
        WebDriver gc_browser = new ChromeDriver();
        // Развернуть на весь экран
        // gc_browser.manage().window().maximize();
        // Перейти по ссылке
        gc_browser.get("http://angel.net/~nic/passwd.current.html");
        // Задержка для прогрузки страницы
        Thread.sleep(1000);
/*
        // Тут обратимся к нашей функции и выведем результат в консоль
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype");
        System.out.println(FinalPassword_value);
        Thread.sleep(1000);

        // Тут обратимся к нашей функции и выведем результат в консоль
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com");
        System.out.println(FinalPassword_value);
        Thread.sleep(1000);

        // Тут обратимся к нашей функции и выведем результат в консоль
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com.ru");
        System.out.println(FinalPassword_value);
        Thread.sleep(1000);
*/
/*
        // Типа тест
        // Проверка 1
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype");
        if (FinalPassword_value.equals ("6YmvHigU/tdHM@1a")){
            System.out.println("Test skype passed");
        }
        else { System.out.println("Test skype failed");}
        // Проверка 2
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com");
        if (FinalPassword_value.equals("yTOpCTextLd+m@1a")){
            System.out.println("Test skype.com passed");
        }
        else { System.out.println("Test skype.com failed");}
        // Проверка 3
        FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com.ru");
        if (FinalPassword_value.equals("-JJopGBcCKvuaJ@1a")){
            System.out.println("Test skype.com.ru passed");
        }
        else { System.out.println("Test skype.com.ru failed");}
*/
        // Полноценный тест "как настоящий"
        Test1 ("Skype", "6YmvHigU/tdHM@1a", FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype"));
        Test1 ("Skype.com", "yTOpCTextLd+m@1a", FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com"));
        Test1 ("Skype.com.ru", "-JJopGBcCKvuaJ@1a", FinalPassword_value = ExtractPassword(gc_browser, "12345678", "skype.com.ru"));

        // Закрыть хром
        gc_browser.quit();

    }

    public static String ExtractPassword (WebDriver BrowserName, String FieldBasePassword_value, String FieldSiteName_value) {
        // Сначала находим элемент для ввода мастер пароля

        WebElement edit_field_master = BrowserName.findElement(By.name("master"));
        // Очистить и пишем текст
        edit_field_master.clear();
        edit_field_master.sendKeys(FieldBasePassword_value);
        // Затем находим элемент для ввода имени сайта
        WebElement edit_field_site = BrowserName.findElement(By.name("site"));
        // Очистить и пишем текст
        edit_field_site.clear();
        edit_field_site.sendKeys(FieldSiteName_value, ENTER);
        // Затем находим элемент кнопки "Generate"
        String ExtractedPassword = BrowserName.findElement(By.name("password")).getAttribute("value");
        return ExtractedPassword;
    }

    public static String Test1 (String TestName, String Etalon, String ResultFromSite) {
        String Resultat = TestName;
        if (Etalon.equals(ResultFromSite)){
            Resultat = Resultat + " passed.";
        }
        else { Resultat = "!!! " + Resultat + " failed.";}

        System.out.println(Resultat);
        return Resultat;
    }

}
