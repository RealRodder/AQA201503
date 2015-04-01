package com.company;

/**
 * Created by Vitaly on 30.03.2015.
 */
public class Main4 {
    public static void main(String[] args) {

      int prv_k = 0;
      int zz_vol = 0;
      System.out.println(prv_k);

      Door k = new Door (100);
      System.out.println(prv_k);

      prv_k = k.height;
      k.height = 0;
      zz_vol = k.Volume (1000);

      System.out.println(k.height);
      System.out.println(k.material);
      //k.material = "wood";
      System.out.println(k.material);
      System.out.println(prv_k);
      System.out.println(zz_vol);

      Door l = new Door (190);
      int d = k.height;
      d = l.height;
      k.isOpened = true;



      //System.out.println(k);
/*
      System.out.println(d);
      if (k.isOpened) {
            System.out.println("1 Opened");
        }
        else {
          System.out.println("1 Closed");

      }

      k.Close();
        if (k.isOpened) {
            System.out.println("2 Opened");
        }
        else {
            System.out.println("2 Closed");

        }

      k.Print();
      l.Print();

      k.isOpened = true;

      k.Print();
      l.Print();
*/
    }

}
