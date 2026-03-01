package com.piyush.net;

public class Step10OopsPillars2Encapsulation {

    private String db_name;

    // Getter
    public String getName(){
        return db_name;
    }
    // Setter
    public void setName(String db_name){
        String clean_name = db_name.trim().toLowerCase();

        if (db_name.trim().toLowerCase().isEmpty()){
            System.out.println("ALERT: Database name cannot be empty!");
        }
        else if(clean_name.equals("postgres")) {
            this.db_name = db_name.strip().toLowerCase();
        }
        else {
            System.out.println("ALERT: Incorrect database name!");
            throw new IllegalArgumentException("CRITICAL: Only 'postgres' is allowed!");
        }
    }

}

/*
hide internal details

e.g. using getter and setter (using this. keyword) to set the database name and don't allow changing it
-- added if clauses to validate and secure changes to db_name

Encapsulation: Restrict direct access - Bundling data (variables) and methods into a single unit (class) while restricting direct access.
   Implementation: Use private fields with public getters and setters.

private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get() and set() methods.

The get() method gets the variable value, and the set() method sets the value.

******
In a real Spring Boot production app, a developer almost never manually types obj.setName("postgres") in the com.piyush.net.main method. That only happens in tutorials.
In the real world, the "Initial Developer" sets the db_name via Configuration Files or Environment Variables.

# src/com.piyush.net.main/resources/application.properties
app.database.target=postgres

@Component
public class DatabaseConfig {

    private String db_name;

    @Value("${app.database.target}")
    public void setName(String db_name) {
        // YOUR ENCAPSULATION LOGIC RUNS HERE!
        if (!db_name.equals("postgres")) {
             throw new IllegalArgumentException("CRITICAL: Aurora is not supported yet!");
        }
        this.db_name = db_name;
    }
}

In application logs -
If the developer puts aurora in the properties file, the Spring Boot App will crash during startup.

******
use the Lombok @Value annotation - to make a class completely immutable (Read-Only) for production
e.g.
---
import lombok.Value;

@Value                  // Automatically makes all fields 'private final'
public class DatabaseConfig {

    String dbName;      // No Setter will be created
    String dbUrl;       // Can only be set once via the Constructor
    int connectionTimeout;

    // 2. You can still add custom logic inside a Constructor
    public DatabaseConfig(String dbName, String dbUrl, int timeout) {
        if (!"postgres".equals(dbName)) {
            throw new IllegalArgumentException("Only Postgres is allowed!");
        }
        this.dbName = dbName;
        this.dbUrl = dbUrl;
        this.connectionTimeout = timeout;
    }
}
---





*/