  # Human Resource Management System - Backend
<p align="center"><img src="İmage/HRMS.gif">

---

<h3 align="left">Language and Tools:</h3>
<p align="left"> <a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a>
<a href="https://www.postgresql.org/" target="_blank"> <img src="https://upload.wikimedia.org/wikipedia/commons/2/29/Postgresql_elephant.svg" width="40"height="40"/> 
<a href="https://cloudinary.com/" target="_blank"> <img src="https://seeklogo.com/images/C/cloudinary-logo-91D46BA298-seeklogo.com.png" width="40"height="40"/> 
<a href="https://projectlombok.org/" target="_blank"> <img src="https://avatars.githubusercontent.com/u/45949248?s=200&v=4" alt="projectlombok" width="40" height="40"/> 
<a href="https://hibernate.org/" target="_blank"> <img src="https://cdn.freebiesupply.com/logos/large/2x/hibernate-logo-png-transparent.png" width="40" height="40"/> 
<a href="https://swagger.io/" target="_blank"> <img src="https://seeklogo.com/images/S/swagger-logo-A49F73BAF4-seeklogo.com.png" width="40" height="40"/> 
<a href="https://spring.io/projects/spring-data-jpa" target="_blank"> <img src="https://huongdanjava.com/wp-content/uploads/2018/01/spring-data.png" width="40"height="40"/>
</a>
</p>
  
  ## *BACKEND REQUESTS* 

## *🛠️ Req 1 : Job Seekers must be able to register in the system.*

📌	During registration, the user is asked for name, surname, Identity number, year of birth, e-mail, password, password repeat information.
<br>
📌	All fields are required. (The user is informed.)
<br>
📌	Mernis verification is done and the system is registered. ( Simulation ) 
<br>
📌	If validation fails, the user is notified.
<br>
📌	If there is a previously registered e-mail or Identity number, the registration will not take place. (The user is informed.)
<br>
📌	Email verification is required for registration to take place.

---

## *🛠️ Req 2 : Employers must be able to register in the system.*

📌 During registration, the user is asked for company name, website, e-mail address with the same domain as the website, phone number, new account password, password repetition information. The purpose here is to prevent non-companies from joining the system.
<br>
📌 All fields are required. (The user is informed.)
<br>
📌 Company records are verified in two ways. 1.) Email verification is required for registration to take place. 2.) Approval from HRMS staff (our approval :)) is required.
<br>
📌 If there is a previously registered e-mail, the registration will not take place. (The user is informed.)

---

## *🛠️ Req 3 : General job position names should be added to the system. (For example: Software Developer, Software Architect.)*


📌 These positions cannot be repeated. (The user is warned.)

---

## *🛠️ Req 4 : Employers should be able to be listed. (Whole list only)*

---

## *🛠️ Req 5 : Job seeker should be able to be listed. (Whole list only)*

---

## *🛠️ Req 6 : Job positions should be able to be listed. (Whole list only)*

---

## *🛠️ Req 7 : Employers should be able to add job postings to the system.*

 # 📄 In the job posting form;
 
📌 General job position can be selected from the dropdown list. (For example: Java Developer) (Required)
<br>
📌 Job description entry should be possible. (For example; For our company, he is proficient in languages such as JAVA, C #, etc....) (Required)
<br>
📌 City information should be able to be selected from the drop-down list. (Compulsory)
<br>
📌 It should be possible to enter min-max for the salary scale. (Optional)
<br>
📌 The number of open positions must be entered. (Compulsory)
<br>
📌 Finish the application deadline must be entered.

---

## *🛠️ Req 8 : All active job postings in the system should be listed..*

📌 The list should come in tabular form.
<br>
📌 Company name, general job position name, number of open positions, publication date, nish the application deadline must be entered

---

## *🛠️ Req 9 : All active job postings of a company should be listed in the system by date.*

📌 The list should come in tabular form.
<br>
📌 Company name, general job position name, number of open positions, publication date, nish the application deadline must be entered

---

## *🛠️ Req 10 : All active job postings of a company should be listed in the system.*

📌 The list should come in tabular form.
<br>
📌 Company name, general job position name, number of open positions, publication date, nish the application deadline must be entered

---

## *🛠️ Req 11 : Employers should be able to close a posting in the system. (Passive posting)*

---

## *🛠️ Req 12 : Job seekers should be able to enter their CV into the system.*
  
### PostgreSQL - Database
### <a href="Database.sql">Click</a> for script codes.
* * *
### ER Diagram with PostgreSQL
<p align="center"><img src="İmage/hrms.png"></p>




## *Backend - Swagger xxx*    

<img src="xxxxxxxxx" width="80%" />


---

## Projemi Geliştirirken Faydalandığım linkler 
---
- Genel olarak :[Baeldung](https://www.baeldung.com)
- Validasyon işlemleri için : [Validation](https://www.baeldung.com/javax-validation)
- Entitites Katmanında Db Bğlantısı ve ayarlar için [Jpa Entities](https://www.baeldung.com/jpa-entities)
- List of Rules kuralları için : [List of Rules](https://www.baeldung.com/java-rule-engines)
- Spring Data Jpa [Spring Data Jpa](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories)
- MicroService [Microservice Mimarisi](https://gokhana.medium.com/microservice-mimarisi-nedir-microservice-mimarisine-giri%C5%9F-948e30cf65b1)
- Derived Query Methods in Spring Data JPA Repositories [Derived Query Methods](https://www.baeldung.com/spring-data-derived-queries)
- @Request Param Annotation [Spring @RequestParam Annotation](https://www.baeldung.com/spring-request-param)
- Spring Cache [Spring Cache](https://www.baeldung.com/spring-cache-tutorial)
- Spring FrameWork Ekosistemi [Spring Ekosistemi](https://medium.com/huawei-developers-tr/2-spring-nedir-spring-boot-ve-spring-framework-neden-kullanılır-2cccb8f3a4fa)
- Hibernate Mapping : [Hibernatte Inheritance Mapping](https://www.baeldung.com/hibernate-inheritance)
- ModelMapper : [ModelMapper](https://www.baeldung.com/java-modelmapper-lists)
