package com.piyush.net;

class main {

    public static void main(String args[] ){            // JVM will look for com.piyush.net.main method to instantiate
        System.out.println("Welcome to java1");

//        show();
//        operators();
//
//        com.piyush.net.Step01Datatypes.dataTypes();

//        (create object of class and then use it)
//        com.piyush.net.Step02VariableScopes myVideo = new com.piyush.net.Step02VariableScopes();
//        myVideo.videoTitle = "UK Trip";
//        myVideo.youtubeViews(100000);

//        com.piyush.net.Step03Loops.loops();
//        com.piyush.net.Step04ExceptionHandling.exceptionHandling();
//        com.piyush.net.Step05Conditionals.conditionals();
//        com.piyush.net.Step06InbuiltMethods.inbuiltMethods();
//        new com.piyush.net.Step07Class();
//        com.piyush.net.Step08Methods.welcomeUser("Piyush");
//        com.piyush.net.Step08Methods.Car.setSpeed(100);
//        com.piyush.net.Step08MethodsConstructors obj = new com.piyush.net.Step08MethodsConstructors("Mark",20);

//        Step10OopsPillars1Abstraction_AbstractClassAndMethod.java -
//        MessageSenderS.com.piyush.net.Step10OopsPillars1Abstraction_AbstractClassAndMethod.MessageSender objsqs = new com.piyush.net.Step10OopsPillars1Abstraction_AbstractClassAndMethod.SqsSender();
//        objsqs.sendMessage("sending to SQS ...");
//        MessageSenderS.com.piyush.net.Step10OopsPillars1Abstraction_AbstractClassAndMethod.MessageSender objkafka = new com.piyush.net.Step10OopsPillars1Abstraction_AbstractClassAndMethod.KafkaSender();
//        objkafka.sendMessage("sending to Kafka ...");

//        com.piyush.net.Step10OopsPillars2Encapsulation obj = new com.piyush.net.Step10OopsPillars2Encapsulation();
//        obj.setName("aurora"); // not done in production, only in tutorials
//        System.out.println(obj.getName());

//        SqsMessage obj = new SqsMessage();
//        obj.showDetails();






    }

    public static void show(){
        System.out.println("calling show method");      // type sout and tab or enter
    }
    public static void operators(){
        System.out.println("sum of 2 numbers is haha");
    }

}


/*
Naming Convention -
    Item 	            Format	                e.g.
    ------------------------------------------------------------
    Class/Interface	    UpperCamelCase	        InvoiceManager
    Method	            lowerCamelCase	        sendEmail()
    Variable	        lowerCamelCase	        totalAmount
    Constant	        SCREAMING_SNAKE_CASE	MAX_RETRY_COUNT

    public          : Access — allows the JVM to find and run the method from outside the class.
    static          : No Object — let the JVM start the program without creating a new instance of your class.
    void            : No Return — tells the system this method doesn't give any value back after it finishes.
    com.piyush.net.main            : Start Name — the exact identifier the JVM searches for to begin execution.
    String args[]   : Input — a list of text command-line arguments passed to the program at launch.

*/
