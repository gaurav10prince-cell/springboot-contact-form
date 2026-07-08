# 📬 Spring Boot Contact Form

A full-stack Contact Form application built using **Spring Boot**, **MySQL**, **HTML**, **CSS**, and **JavaScript**.

The application allows users to submit contact information, stores it in a MySQL database, and provides a dashboard to view all submitted contacts.

---

## 🚀 Features

- Contact form with Name, Email, and Message fields
- Save contact details to MySQL database
- REST API for submitting contact data
- REST API to retrieve all contacts
- Contact Management Dashboard
- Dynamic data loading using JavaScript Fetch API
- Responsive and clean user interface

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Maven

### Frontend
- HTML
- CSS
- JavaScript

### Database
- MySQL

### Tools
- Spring Tool Suite (STS 4)
- MySQL Workbench
- Git
- GitHub

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │    └── com.example.contactform
 │   │          ├── controller
 │   │          ├── entity
 │   │          ├── repository
 │   │          └── ContactFormApplication.java
 │   │
 │   └── resources
 │        ├── static
 │        │     ├── index.html
 │        │     └── contacts.html
 │        └── application.properties
 │
 └── test
```

---

## ⚙️ Installation

### 1. Clone the repository

```bash
git clone https://github.com/gaurav10prince-cell/springboot-contact-form.git
```

### 2. Open the project

Open the project using **Spring Tool Suite (STS 4)** or **IntelliJ IDEA**.

### 3. Configure MySQL

Create a database named:

```sql
CREATE DATABASE contactdb;
```

Update the database configuration in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the project

Run the Spring Boot application.

---

## 🌐 URLs

### Contact Form

```
http://localhost:8080/
```

### Contact Dashboard

```
http://localhost:8080/contacts.html
```

### REST API

#### Save Contact

```
POST /contact
```

#### Get All Contacts

```
GET /contacts
```

---

## 📸 Screenshots

Add screenshots here after uploading them.

Example:

- Contact Form
- Contact Dashboard
- MySQL Database

---

## 🎯 Learning Outcomes

Through this project I learned:

- Spring Boot fundamentals
- REST API development
- Spring Data JPA
- MySQL integration
- Fetch API
- CRUD operations
- Git & GitHub workflow

---

## 👨‍💻 Author

**Gaurav Pandey**

GitHub:
https://github.com/gaurav10prince-cell

LinkedIn:
https://www.linkedin.com/in/gaurav10pandey/

---

⭐ If you found this project useful, consider giving it a star.
