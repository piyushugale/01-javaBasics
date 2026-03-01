package com.piyush.net;

public class Step13ENUM {

    enum Level { DEV, TEST, PROD }            // Create list of fix vars for

    public static void main(String[] args) {    // 3. Main method inside Class
        Level myVar = Level.DEV;

        // Logic to run only if env is DEV
        if (myVar == Level.DEV) {
            runDevLogic();
        } else {
            System.out.println("Running in " + myVar + " mode. Skipping Dev tasks.");
        }
    }
}


// ENUM: Used only when you want to categorize data within single code
// Spring Profiles: to decide which env to run (e.g., DEV< UAT, PRODd).

