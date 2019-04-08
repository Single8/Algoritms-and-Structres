package ru.geekbrains.catch_the_drop;

import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {
	int a = 4;
	String str = new String("abc");

        System.out.println("Value is " + a);
        System.out.println("a = 4 " + (a == 4));
        System.out.println("Variable str = abc " + (str == "abc"));

        String str2 = "abc";//002
        String str3 = str; //002
        System.out.println("Variable str = abc " + (str == str2));
        System.out.println("Variable str = abc " + (str == str2));
        System.out.println("Variable str = str3 " + (str == str3));
        System.out.println("Variable by equals str = str3 " + (str.equals(str2)));

        System.out.println("--------------------------------");

        test(a, str);
        System.out.println("a = " + a);
        System.out.println("str = " + str);

        System.out.println("--------------------------------");
        Person p = new Person ("Oleg");
        test2(p);
        System.out.println("p = " + p);

        int arr[] = new int [5];
        arr [0] = 5;
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void test(int a, String str) {
        a += 1;
        str = ("def");
    }

    private static void test2(Person p) {
//    p.setName("Pavel");
        p = new Person ("Pavel");
    }
}
