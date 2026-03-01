/*

Package is simply a folder used to group related classes.
It’s the "File Directory" of your project that prevents naming conflicts and controls visibility.

import package.name.Class;   // Import a single class
import package.name.*;       // Import the whole package
import java.util.*;



com.piyush.net.model	    Data classes (Entities for Postgres/Aurora).
com.piyush.net.service	Business logic (Your SQS/Kafka senders).
com.piyush.net.controller	REST API entry points.
com.piyush.net.config	    Setup files for AWS or Security.

*/