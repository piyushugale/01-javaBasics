package com.piyush.net;

import java.util.List;

public class Step03Loops {

    public static void loops(){

        // for: Best when you know exactly how many times you want to run
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("hi");
                }
            System.out.println();
            }

        // for-each: for iterating through ARRAYS or LIST (like a list of videos from an API). It's cleaner and prevents "index out of bounds" errors
        List<String> videos =  List.of("one", "two", "three");
        for(String i: videos){
            System.out.println("Processing " + i);
        }
        System.out.println("-------------------------");

        // while: When you don't know the count, but you have a condition that must remain true.
        int i=0;
        while( i<3 ){
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------------");

        // do-while: it guarantees at least one execution, even if the condition is false initially
        do{
            System.out.println("do-while");
        } while(false);
        System.out.println("-------------------------");

        // forEach: perfect for processing data collections in a single line.
        List<String> x;
        x = List.of("one", "two", "three");
        x.forEach(b -> System.out.println(b));

        // break

        for(int z=0; z<10; z++){
            if(z == 3){
                System.out.println("Found " + z + " - Breaking the loop");
                break;
            }
            System.out.println("Sending Message #" + z);
        }

        // continue

        for(int t=0; t<10; t++) {
            if (t == 3) {
                System.out.println("Skipping #" + t + " (Testing)");
                continue;
            }
        }

        System.out.println("-------------------------");

    }
}

/*
println vs print:
    ln - next line
    print() cannot be blank
    println() can be blank

for         : for a fixed number of repetitions (uses a counter).
for-each    : for iterating through Arrays or Lists (cleanest syntax).
while       : when the end condition is unknown (runs 0 to N times).
do-while    : when you need the code to run at least once.
forEach (Lambda): Modern Functional way to process collections in one line.
Stream.forEach(): Best for filtering or transforming data before looping.

*/
