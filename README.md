# DVD Rental - Backend

The DVD Rental project is being done by using [The Sakila Sample Database](https://dev.mysql.com/doc/sakila/en/) which is a complex relational database with 16 tables. This app is able to perform basic CRUD operations as well as some more complex queries.

## Schema

The following schema was used with a few modifications.

![Sakila Schema](https://github.com/Tomohiko10615/sakila/raw/main/sakila_full_database_schema_diagram.png)

## Stack

This project was done using Spring Framework (Spring Boot, Spring Data JPA)

![Spring](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

## API endpoints

### Basic CRUD

#### **Save new customer**

Type: **POST**
``` 
/customer/save
```

**Request Body**

`Required: application/json`

Responses
| Code | Description     |
| :-------- | :------- |
| `200` | `Returns saved customer` |

#### **Get all customers**

Type: **GET**
```
/customer/list
```

**Responses**
| Code | Description     |
| :-------- | :------- |
| `200` | `Returns all customers` |
| `204` | `There is no customers` |
