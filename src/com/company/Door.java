package com.company;

/**
 * Created by Vitaly on 30.03.2015.
 */
// Примеры с новым классом и ООП
// Рассказываем яве всё, что ей нужно знать о двери
public class Door {                 // это - класс
    public int height;
    public boolean isOpened;
    public Door (int h) {           // это - конструктор
        height = h;                 // вариант:   this.height - это к только что созданному объекту
        isOpened = false;
    }

    public void Close () {          // а это уже - функция
        isOpened = false;
        System.out.println("Closing door");
    }

    public void Print () {
        System.out.println(height);
    }
}
