package com.piyush.net;

public class Step08Methods {

            public static void methods(){}

            // 1. The Display Example: Performing an Action - Used when you want the program to do something (like display text) rather than return a value.
            public static void welcomeUser(String name) {
                System.out.println("Welcome back, " + name + "!");     // Returns nothing, only prints
            }

            // 2. The "Setter" Example: Updating an Object - void methods are used as setters to change the state (data) of an object.
            class Car {
                private static float speed;
                public static void setSpeed(float newSpeed) {                    // Void because we are just updating the car's speed, not calculating it.
                    speed = newSpeed;
                    System.out.println(speed);
                    System.out.println("-------------------------");
                }
            }

}

/*
Class  is a blueprint
Method is the action that blueprint can perform.

Major Java Method Types:

Method Type	    Keyword	        Small Code Example	        Access Rule
--------------------------------------------------------------------------------
Instance	    (None)	        void play() { ... }     	Needs new MyClass().
Static	        static	        static int add(int a, b)	Call via MyClass.add().
Abstract	    abstract	    abstract void save();	    No body {}; must override.
Final	        final	        final void lock() { }	    Cannot be changed by child.
Default	        default	        default void log() { }	    Only inside an Interface.
Synchronized	synchronized	synchronized void up()	    Only 1 thread at a time.
*/