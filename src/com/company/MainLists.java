package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaly on 01.04.2015.
 */
public class MainLists {
    public static void main(String[] args) {
        // Вариант с массивом
        int [] a = {1,2,3,4,5};
        String[] s = {"Hello ", "class", "."};

        // Вариант со списком
        List<String> f = new ArrayList<String>();
        f.add("Privet, ");
        f.add("group");
        f.add("!");

        // Вывод значений
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        System.out.println(s.length);
        System.out.println(f.size());

        // Со списком можно играться - менять кол-во элементов, удалять первую запись и т.д.

    }
}
