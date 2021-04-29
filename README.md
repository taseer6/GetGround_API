# GetGround_API


# SET UP AND RUN TESTS
-Maven or -TestNG
> you can run the project using maven commands (e.g mvn clean install/ mvn test) or through TestNG.




# API Testing Automation Framework
Framework is build using Maven as Project management tool in JAVA Language. Spring Library for testing and validating REST APIs. TestNG Third-party free library for Running and managing test cases, and Jackson for Serialization and De-Serialization.
      
#### Project structure
> This project uses a standard Maven Java project with standard java folder structure and POM.xml.

   src/main/java have following packages
 - Implementations (Implementation are created to help the SOLID principles)
 - Constants (contains clasess storing constants e.g endpoints)
 - Services (contains clasess for each endpoint to request endpoints and contain methods related to relevant endpoints)
 - Utils ( Utils is a collection of small  methods and classes which make common patterns shorter and easier.)
 
  src/test/java contain test cases
  - each end point will have its own class
  - src/test/resource containt .xml files to run all test cases (like regressioin test suits)
  
  pom.xml
  - runs test cases using regression.xml file.
  
  Properties<a name="properties"></a>
 - config.properties file is to store various constants like application Base URL.
 
 


#### test Result<a name="reports"></a>
> TC Failure: Prints failure response body on console

> TC Successful: Shows testng default message on console

