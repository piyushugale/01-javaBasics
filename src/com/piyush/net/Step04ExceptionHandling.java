package com.piyush.net;

public class Step04ExceptionHandling {

    public static void exceptionHandling(){

        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("ERROR: division by zero error");
        }
        finally{
            System.out.println("end of operation");
        }

        System.out.println("-------------------------");

    }
}

/*
1. Runtime Exceptions (Unchecked) -These usually happen due to logic errors in your code.
- NullPointerException          : Occurs when you try to use an object that hasn't been initialized (is null).
- ArrayIndexOutOfBoundsException: Trying to access an index that doesn't exist (e.g., index 5 in a list of 3).
- ArithmeticException           : Illegal math operations, like dividing by zero.
- IllegalArgumentException      : When a method receives an argument that is inappropriate (common in API validation).
- ClassCastException            : Trying to cast an object to a subclass it doesn't belong to.

2. Checked Exceptions -The compiler forces you to wrap these in a try-catch block or declare them.
- IOException                   : Failed or interrupted I/O operations (common when reading files or network streams).
- SQLException                  : Errors related to Database access (very common in Spring Data JPA).
- ClassNotFoundException        : When the JVM tries to load a class by its string name but can't find it.

3. Spring Boot Specific Errors -
- MethodArgumentNotValidException: Thrown when @Valid fails on your API input.
- NoHandlerFoundException       : The classic 404 error when a requested URL doesn't match any Controller.
- HttpRequestMethodNotSupportedException: Sending a POST to an endpoint that only accepts GET.

4. Serious Errors (JVM level)
- OutOfMemoryError              : The JVM has run out of RAM.
- StackOverflowError            : Usually caused by infinite recursion (a method calling itself forever).
*/