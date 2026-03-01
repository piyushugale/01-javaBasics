package com.piyush.net;

public class Step06InbuiltMethods {

    public static void inbuiltMethods(){

        String text = "Learning Java";

        // Using String methods
        int size = text.length();
        String upper = text.toUpperCase();

        // Using Math methods
        double root = Math.sqrt(64);

        // Using System methods to output
        System.out.println("Length: " + size);   // 13
        System.out.println("Upper: " + upper);   // LEARNING JAVA
        System.out.println("Square root: " + root); // 8.0
        System.out.println("Hi".equals("hi"));
        System.out.println("-------------------------");

    }
}

// Java compiler automatically adds import java.lang.*; to every single file you create before it even starts compiling.
// It’s like a "hidden" line of code at the very top.

/*
---------------------------------------------------------------
Category 	Method	    Small Code              Example
---------------------------------------------------------------
String	    .equals()	"Hi".equals("hi")       false
            .split()	"A,B,C".split(",")      ["A", "B", "C"]
            .trim()	    " hi ".trim()           "hi"
            .substring()"Hello".substring(0,2)  "He"
            .contains()	"Java".contains("av")   true

Collections	.add()	    list.add("Video1");
            .size()	    myList.size();          5
            .isEmpty()	list.isEmpty();         false
            .get()/.put()map.put("ID", 1);      map.get("ID");
            .forEach()	list.forEach(i -> System.out.print(i));

Object	    .toString()	myObj.toString();       "User@1a2b3c"
            .hashCode()	obj.hashCode();         1553668604
            .getClass()	obj.getClass();         class MyClass

System	    currTime...()	long start = System.currentTimeMillis();
            Thread.sleep()	Thread.sleep(1000); (Pauses for 1 sec)
            List.of()	    List.of("A", "B"); (Quick list creation)
---------------------------------------------------------------

*/