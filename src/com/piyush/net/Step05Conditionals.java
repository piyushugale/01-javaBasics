package com.piyush.net;

public class Step05Conditionals {

    public static void conditionals(){

        int i=2;
        if(3 == 3) {
            System.out.println("outer if is true");
            if (i < 2) {
                System.out.println("i is < 2");
            } else if (i > 2) {
                System.out.println("i is > 2");
            } else {
                System.out.println("i is 2");
            }
        }else {
            System.out.println("outer if condition false");
        }

        int a =3, b=4;
        int max = a>b ? a:b;
        System.out.println("max is "+max);

        System.out.println("-------------------------");

    }
}
