package com.piyush.net;

import java.util.Arrays;
import java.util.List;

public class Step01Datatypes {

    public static void dataTypes(){

        System.out.println("Here are all Data Types -");

        int a = 1;
        double d = 3.14;
        float f = 3.14f;
        long l = 123456789L;
        char c = 'c';
        String name = "Piyush";
        int[] num = {1, 2, 3, 4};
        List<Integer> numbers = List.of(1,2,3,4);
        String[] names = {"ab","bc","cd"};
        System.out.println("start"+a +"\n"+d+"\n"+f+"\n"+l+"\n"+c+"\n"+name+"\n"+ Arrays.toString(num)+"\n"+ Arrays.toString(names)+"\n"+"end");

        System.out.println("-------------------------");
    }

}






/*
    Primitive DataTypes:
        byte    : byte age = 25; (Small integers, 1 byte)
        short   : short year = 2024; (Medium integers, 2 bytes)
        int     : int salary = 50000; (Standard integers, 4 bytes)
        long    : long distance = 9876543210L; (Large integers, 8 bytes)
        float   : float price = 19.99f; (Small decimals, 4 bytes)
        double  : double pi = 3.1415926535; (Precise decimals, 8 bytes)
        boolean : boolean isJavaFun = true; (Logic: true or false)
        char    : char grade = 'A'; (Single character in single quotes)
    Non-Primitive DataTypes:
        String  : String name = "Java"; (Text in double quotes)
        Array   : int[] numbers = {1, 2, 3}; (List of values)
        Class   : Scanner input = new Scanner(System.in); (Object instances)

        ----------------------------------------------------------------------------------
        Feature	    Primitive	                    Non-Primitive (Reference)
        ----------------------------------------------------------------------------------
        Size	    Fixed (e.g., int is 4 bytes).	Variable (depends on the object).
        Nullability	Cannot be null.	                Can be null.
        Methods	    Cannot call methods on them.	Can call methods (e.g., .length()).
        Memory	    Value stored on the Stack.	    Reference stored on Heap.
        Naming	    Starts with lowercase (int).	Starts with Uppercase (String).
        Creation	Predefined by Java.	            Created by programmer (except String).
        Examples	int, char, boolean, double	    String, Array, Class, Interface
        ----------------------------------------------------------------------------------
*/