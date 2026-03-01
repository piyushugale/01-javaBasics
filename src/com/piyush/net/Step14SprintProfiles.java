package com.piyush.net;

public interface MessageSender {
    void sendMessage(String msg);
}

@Service
@Profile("dev") // This service only exists when the "dev" profile is active
public class SqsSenderDevImpl implements MessageSender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("MOCK SQS (No cost): " + msg);
    }
}

@Service
@Profile("prod") // This service only exists when the "prod" profile is active
public class SqsSenderProdImpl implements MessageSender {
    @Override
    public void sendMessage(String msg) {
        // Real AWS Logic here
    }
}

/*

Locally:
Intellij > set active profiles (spring.profiles.active=dev)

In Cloud > set in your application.properties
spring.profiles.active=dev

CommandLine:
How you run it:
 To run as PROD : java -jar app.jar --spring.profiles.active=prod
 To run as DEV  : java -jar app.jar --spring.profiles.active=dev

How you isolate env level deployments? --> using Spring profiles + Terraform Workspaces

*/

// ENUM: Used only when you want to categorize data within single code
// Spring Profiles: to decide which env to run (e.g., DEV< UAT, PRODd).

