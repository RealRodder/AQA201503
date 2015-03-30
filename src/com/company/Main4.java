package com.company;

/**
 * Created by Vitaly on 30.03.2015.
 */
public class Main4 {
    public static void main(String[] args) {
      Door k = new Door (100);
      Door l = new Door (190);
      int d = k.height;
      d = l.height;
      k.isOpened = true;

      System.out.println(d);
      if (k.isOpened) {
            System.out.println("Opened");
        }
        else {
          System.out.println("Closed");

      }

      k.Close();
        if (k.isOpened) {
            System.out.println("Opened");
        }
        else {
            System.out.println("Closed");

        }

      k.Print();
      l.Print();

      k.isOpened = true;

      k.Print();
      l.Print();

    }

}
