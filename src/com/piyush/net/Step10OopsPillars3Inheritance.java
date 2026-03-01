package com.piyush.net;

// 1. The PARENT Class (The Base)
class BaseMessage {
    String sender = "o773660";
    void displayTime() {
        System.out.println("Sent at: " + System.currentTimeMillis());
    }
}

// 2. The CHILD Class (Inherits everything from BaseMessage)
class SqsMessage extends BaseMessage {
    String queueName = "ts-functional-queue";

    void showDetails() {
        // We can use 'sender' and 'displayTime()' even though they aren't written here!
        System.out.println("Sender: " + sender);
        displayTime();
        System.out.println("Queue: " + queueName);
    }
}


// extends: add something additional to it
// implements: like implementing the interface (which defines default structure)


