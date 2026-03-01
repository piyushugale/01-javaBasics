//1. The Interface (The Contract)
//2. SQS Implementation (Detail A)
//3. Kafka Implementation (Detail B)
//4. The Controller (The Orchestrator)
//------------------------------------

//1. The Interface (The Contract)

    package com.piyush.net;

    public interface MessageSender {
        void sendMessage(String msg);
    }

//2. SQS Implementation (Detail A)

    import com.piyush.net.MessageSender;
    import org.springframework.stereotype.Service;

    @Service("sqs")
    public class SqsSenderImpl implements MessageSender {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Processing via AWS SQS SDK: " + msg);
        }
    }

//3. Kafka Implementation (Detail B)

    import com.piyush.net.MessageSender;
    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Service;

    @Primary // <--- This makes Kafka the default for polymorphism
    @Service("kafka")
    public class KafkaSenderImpl implements MessageSender {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Pushing to Kafka Cluster Topic: " + msg);
        }
    }



//4. The Controller (The Orchestrator)

    import com.piyush.net.MessageSender;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/v1/messages")
    public class MessageController {

        private final MessageSender defaultSender;
        private final MessageSender specificSqsSender;

        @Autowired
        public MessageController(
                MessageSender defaultSender, // Injects Kafka because of @Primary
                @Qualifier("sqs") MessageSender specificSqsSender // Specifically asks for SQS
        ) {
            this.defaultSender = defaultSender;
            this.specificSqsSender = specificSqsSender;
        }

        @PostMapping("/send-default")
        public String sendDefault(@RequestParam String msg) {
            defaultSender.sendMessage(msg); // Output: Pushing to Kafka...
            return "Sent via Default Provider";
        }

        @PostMapping("/send-sqs")
        public String sendSqs(@RequestParam String msg) {
            specificSqsSender.sendMessage(msg); // Output: Processing via AWS SQS...
            return "Sent via SQS Provider";
        }
    }
