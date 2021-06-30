package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    // With Generics
    public static void main(String[] args) {
        // must set ArrayList type to Integer to be able to add
        // integers to the list
	    ArrayList<Integer> items = new ArrayList<Integer>();
	    items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        // can set to int instead of Integer
        for(Integer i : n) {
            System.out.println(i * 2);
        }
    }


    // Without Generics

//    public static void main(String[] args) {
//
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add("Tim");
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//    }
//
//    private static void printDoubled(ArrayList n) {
//        // can set to int instead of Integer
//        for(Object i : n) {
//            System.out.println((Integer) i * 2);
//        }
//    }


}























