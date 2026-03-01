
@Component      : Marks a class as a Spring-managed component, such as a utility or helper class - for dependency injection.
@Service        : Marks a class as a Spring service, typically for BUSINESS LOGIC.

@Value          : Injects a value from configuration (e.g., properties file) into a field or method - @Value("${app.version}")
@Primary        : Designates a bean as the default when multiple candidates exist for auto wiring.
@RestController : Marks a class as a RESTful web controller in Spring.
@RequestMapping : Maps HTTP requests to handler methods in Spring controllers.

@GetMapping     : handles HTTP GET requests for retrieving data.
@PostMapping    : handles HTTP POST requests for creating or submitting data.
@PutMapping     : handles HTTP PUT requests for updating existing data.
@DeleteMapping  : handles HTTP DELETE requests for removing data.
@PatchMapping   : handles HTTP PATCH requests for partially updating data.

@Qualifier      : Specifies which bean to inject when multiple candidates exist. @Qualifier("emailNotificationService") - specify which implementation to use
@Profile        : Restricts bean registration to specific Spring profiles (e.g., "dev", "prod").

@Autowired      : No need to create object of another class - automatically creates it. Automatically injects dependencies by type in Spring.
@Override       : Indicates a method overrides a superclass or interface method.


# Production-Grade Annotation Examples in Java (Spring)
---

## 1. @Component
Defines a reusable Spring-managed bean, such as a utility or helper class.
```java
@Component
public class EmailValidator {
    public boolean isValid(String email) {
        // Validation logic
        return email.contains("@");
    }
}
```

## 2. @Value
Injects configuration values from property files, supporting environment-specific settings.
The @Value annotation should be placed directly above the field (variable) you want to inject the value into.
```java
@Component
public class AppProperties {
    @Value("${app.version}")
    private String version;
}
```

## 3. @Service
Encapsulates business logic and service operations, promoting separation of concerns.
```java
@Service
public class UserService {
    public User findUserById(Long id) {
        // Business logic to retrieve user
    }
}
```

## 4. @Primary
Specifies the default bean to use when multiple candidates are available for autowiring.
```java
@Primary
@Service
public class DefaultNotificationService implements NotificationService {
    // Implementation details
}
```

## 5. @RestController
Exposes RESTful endpoints for client-server communication.
```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // Fetch user by ID
    }
}
```

## 6. @RequestMapping
Maps HTTP requests to controller classes or handler methods, supporting flexible routing.
```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<Product> listProducts() {
        // Return product list
    }
}
```

## 7. @Autowired
No need to create object of another class - automatically creates it
Automatically injects (makes available required) dependencies, enabling loose coupling and easier testing.

```java
@Component
public class Car {
    @Autowired
    private Engine engine;              // Spring injects Engine

    @Autowired
    private Transmission transmission;  // Spring injects Transmission

    public void startCar() {
        engine.start();
        transmission.shiftToDrive();
    }
}
```

## 8. @Qualifier
Disambiguates bean injection when multiple implementations exist.
```java
    public interface NotificationService {
        void send(String message);
    }
    
    @Component("emailNotificationService")
    public class EmailNotificationService implements NotificationService {
        public void send(String message) {
            // send email
        }
    }
    
    @Component("smsNotificationService")
    public class SmsNotificationService implements NotificationService {
        public void send(String message) {
            // send SMS
        }
    }
    
    @Component
    public class AlertManager {
        @Autowired
        @Qualifier("emailNotificationService")                  // specify which implementation to use
        private NotificationService notificationService;
    
        public void sendAlert(String msg) {
            notificationService.send(msg); // uses EmailNotificationService
        }
    }
```

## 9. @PostMapping
Handles HTTP POST requests for resource creation or data submission.
```java
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "Hello!";
    }

    @PostMapping
    public String postGreeting(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
```

## 10. @Profile
Activates beans only for specified environments, supporting environment-specific configurations.
```java
@Service
@Profile("production")          // spring profile
public class ProductionDataSourceConfig { }
```

## 11. @Override
Indicates a method overrides a superclass or interface method, ensuring correct implementation.
```java
@Override
public boolean equals(Object obj) {
    // Custom equality logic
}
```

