# Getting Started

### Testing the Plugin
* mvn clean install

### Move to location 
* $ cd /maven-plugin/sample-maven-plugin-application

### then Executing Our Plugin
* mvn groupId:artifactId:version:goal
* mvn com.espark.adarsh:sample-maven-plugin:0.0.1-SNAPSHOT:sample-message
* /maven-plugin/sample-maven-plugin-application $ mvn com.espark.adarsh:sample-maven-plugin:0.0.1-SNAPSHOT:sample-message

```
sample-maven-plugin-application us-guest$ mvn com.espark.adarsh:sample-maven-plugin:0.0.1-SNAPSHOT:sample-message
[INFO] Scanning for projects...
[INFO] 
[INFO] ------< org.springframework.boot:sample-maven-plugin-application >------
[INFO] Building sample-maven-plugin-application 3.2.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- sample-maven-plugin:0.0.1-SNAPSHOT:sample-message (default-cli) @ sample-maven-plugin-application ---
[INFO] Sample message plugin Welcome To Espark Adarsh
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.588 s
[INFO] Finished at: 2024-01-04T21:00:26-06:00
[INFO] ------------------------------------------------------------------------
```