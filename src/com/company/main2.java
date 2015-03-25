package com.company;

/**
 * Created by Vitaly on 25.03.2015.
 */
public class main2 {
    public static void main(String[] args) {
        /*
      // Если первый элемент args равен "Hello", тогда напечатать в консоль
      // "Class", иначе - напечатать "Good bye!"
        if (args[0].equals ("Hello"))
        {
            System.out.println("Class!");
        }
        else
        {
            System.out.println("Good bye!");
        }
        */
      // Если первый элемент args равен "Hello", а второй "Class" тогда напечатать в консоль
      // "Success", иначе - напечатать "Good bye!"
        /*
        if (args[0].equals ("Hello") && args[1].equals ("Class"))
        {
            System.out.println("Success!");
        }
        else
        {
            System.out.println("Good bye!");
        }
        */

        // Цикл while
        int a = 10;
        while (a <= 15)
        {
            System.out.println("a is: " + a);
            a = a+1;
        }

        while (true)
        {
          if (a <= 20)
          {
            System.out.println("Break!");
            break; // Выход из цикла while (true)
          }
          a = a + 1;
        }


    }
}
