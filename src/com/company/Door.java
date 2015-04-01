package com.company;

/**
 * Created by Vitaly on 30.03.2015.
 */
// Примеры с новым классом и ООП
// Рассказываем яве всё, что ей нужно знать о двери
public class Door {                 // это - класс
    public int height;
    public boolean isOpened;
    final String material = "paper";
    public Door (int h) {           // это - конструктор
        height = 20; // вариант:   this.height - это к только что созданному объекту
        //material = "paper";
        isOpened = false;
    }

    public int Volume (int vl){
        vl = vl * 333;
        return vl;
    }

    public void Close () {          // а это уже - функция
        isOpened = false;
        //System.out.println("Closing door");
    }

    public void Print () {
        System.out.println(height);
        if (isOpened) {
            //System.out.println("Door is opened");
        }
        else {
           //System.out.println("Door is closed");
        }
    }
}
