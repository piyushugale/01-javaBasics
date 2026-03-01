package com.piyush.net;

public class Step08MethodsConstructors {

    String name = "Mark";
    int age = 40;

    public Step08MethodsConstructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Object created for " + this.name + " with age " + age);
    }

// 1. Default Constructor: Default (No-Arg) Constructor

    public class SqsConfig {
        String queueName;

        public SqsConfig() {
            this.queueName = "default-queue";
            System.out.println("Default Constructor called");
        }
    }

// 2. Parameterised Constructor

    public class KafkaTopic {
        String name;

        public KafkaTopic(String name) {
            this.name = name;
            System.out.println("Topic created: " + this.name);
        }
    }

// 3. Copy Constructor

    public class Message {
        String content;

        public Message(String content) {
            this.content = content;
        }

        public Message(Message otherMessage) {
            this.content = otherMessage.content;
            System.out.println("Copied message content!");
        }
    }

// 4. Constructor Overloading

    public class User {
        String name;
        int id;

        // Overload 1: Only name
        public User(String name) {
            this.name = name;
            this.id = 0;
        }

        // Overload 2: Name and ID
        public User(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}


// call from com.piyush.net.main() method
//      this(name, 0);  // Calls the second constructor automatically!
//      this(name);     // Calls the first constructor automatically!

// Pro Tip!
// constructor must have same name as class name

