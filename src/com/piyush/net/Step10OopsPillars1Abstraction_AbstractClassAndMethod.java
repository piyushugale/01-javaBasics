package com.piyush.net;

// The Contract - abstract class/method - partial hiding implementation
abstract class MessageSender {
    abstract void sendMessage(String msg);
}

// use 'sendMessage' (which is abstract method) for sending msg to SQS & Kafka
// The Details -
class SqsSender extends MessageSender {
    void sendMessage(String msg) {
        System.out.println("Sending to AWS SQS: " + msg);
    }
}

class KafkaSender extends MessageSender {
    void sendMessage(String msg) {
        System.out.println("Pushing to Kafka Topic: " + msg);
    }
}


/*

@Override is a safety check for your code.
- Prevents Typos          : If you misspell the method name (e.g., sendMesage instead of sendMessage), the Java Compiler will stop you with an error immediately.
- Confirms the Connection : It proves that your method is correctly linked to the parent Abstract Class or Interface.
- Improves Readability    : It tells other developers, "This method isn't new; it's fulfilling a requirement from above."

Abstraction : Hiding internal complexity and showing only essential features.
 e.g. TV "Power" button. You don't need to know how the circuit board sends an infrared signal to the TV.
 You just press power()

Abstraction: Hiding internal complexity and showing only essential features.
    Interview Tip: Know the difference between Abstract Classes (partial abstraction) and Interfaces (100% abstraction).

*/