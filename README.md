

    public static void com.piyush.net.main(String args[] ){                // JVM will look for com.piyush.net.main method to instantiate

        int a = 1;
        double d = 3.14;
        float f = 3.14f;
        long l = 123456789L;
        char c = 'c';
        String name = "Piyush";
        int[] num = {1, 2, 3, 4};
        String[] names = {"ab","bc","cd"};
        System.out.println("start"+a +"\n"+d+"\n"+f+"\n"+l+"\n"+c+"\n"+name+"\n"+ Arrays.toString(num)+"\n"+ Arrays.toString(names)+"\n"+"end");
        System.out.println("Welcome to java1");

        show();
        operators();
    }

Compile the code : javac com.piyush.net.main.java > this creates com.piyush.net.main.class file
Run the code     : java com.piyush.net.main

Arithmetic      : +, -, *, /, % (Math)
Assignment      : =, +=, -=, *=, /= (Values)
Comparison      : ==, !=, >, <, >=, <= (Boolean checks)
Logical         : &&, ||, ! (Conditional logic)
Unary           : ++, -- (Step changes)
Ternary         : ? : (Shorthand if-else)
Bitwise         : &, |, ^, ~, <<, >> (Bit manipulation)

    public static void operators(){
        int a = 1;
        int b = 2;
        int result = a+b;
        System.out.println("sum of 2 numbers is "+result);
    }


Operators
Conditional Statements
Iterators


