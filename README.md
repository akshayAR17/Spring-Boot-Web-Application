I've built a Spring Boot REST API application that handles CRUD operations on a student table.

*** Project Dependencies ***
1. Spring Web: Used for constructing web applications, including RESTful applications, through Spring MVC.
2. Spring Data JPA: Employed to persist data in SQL databases using JPA (Java Persistence API) with Spring Data and Hibernate.
3. MySQL JDBC Driver: Ensures connectivity between the application and the MySQL database.
4. Thymeleaf Template Engine: A contemporary server-side Java template engine suitable for both web and standalone environments. It enables the correct rendering of HTML in web browsers.

*** POSTMAN API ***
Postman is an API testing tool that simplifies the testing and development of APIs. It allows users to create, share, and test API requests, providing a comprehensive environment for API development and testing. 
   
Also the application is hosted on Apache Tomcat Server.
URL of local server: http://localhost:8081

*** End-points ***
1. To display the home page: http://localhost:8081/students
2. To store the data in the database: http://localhost:8081/students/storeData
3. To fetch all the records of the table: http://localhost:8081/students/fetchData
4. To fetch the student by USN: http://localhost:8081/students/fetchDataByUSN/{usn}
5. To update the student data: http://localhost:8081/students/updateStudentData
6. To delete the student data by USN: http://localhost:8081/students/deleteStudentData/{usn}

*** SQL Workbench is used which provides a user-friendly interface for executing SQL queries, managing database connections, and performing database administration tasks ***    
