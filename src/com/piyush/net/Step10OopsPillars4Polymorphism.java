package com.piyush.net;

// 1. THE ABSTRACTION (The Interface)
interface MessageSender {
    void send(String msg);
}

// 2. THE FORMS (The Implementations)
class SqsSender implements MessageSender {
    public void send(String msg) { System.out.println("AWS SQS: " + msg); }
}

class KafkaSender implements MessageSender {
    public void send(String msg) { System.out.println("Kafka Topic: " + msg); }
}


// Polymorphism means the same variable can take different forms (SQS or Kafka)
// depending on what you plug into it.
