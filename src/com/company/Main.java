package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
	// write your code here
        System.out.println("Hello world :)");

        List<Integer> listOfInteger;
        HashMap<Integer, String> hashMap;
        HashSet<String> hashSet;

        int x[] = {1,2,3};
        int y[] = {32,16,13};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                System.out.println(x[i] + ", " +y[j]);
            }
        }

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        HashMap<String, Integer> carSells = new HashMap<String, Integer>();
        carSells.put("Volvo", -113);
        carSells.put("BMW", -1233);
        carSells.put("Volvo", 33);
        carSells.put("BMW", 3233);
        carSells.put("MAZDA", 13);
        
        System.out.println(carSells);


    }
}
