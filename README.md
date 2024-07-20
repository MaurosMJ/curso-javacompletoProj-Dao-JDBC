# Complete Java Course - Object-Oriented Programming - Simple JDBC App

###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://www.oracle.com/a/ocom/img/jdbc.svg" alt="JDBC Logo" width="100" height="100">
</div>

The goal of this project is to create a system that communicates with a database using the JDBC API. This stage of the course included approximately 4 hours of video lessons, but it took me around 7 hours to complete due to testing, code reviews, fixing implementation errors, and occasionally rewatching the videos for better understanding.

**Documentation:**  
- [JDBC Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)
- [JDBC API Documentation](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)  
- Packages: `java.sql` and `javax.sql` (supplementary API for servers)

**Technologies:**

- **DBMS Tool:** MySQL Workbench  
- **JDBC Connector:** MySQL Java Connector  
- **IDE:** Eclipse

**More Information:**

- **Course Link:** [Udemy Course](https://www.udemy.com/course/java-curso-completo)  
- **Section 21:** Project: Database access with JDBC

## Index

- [Architecture](#architecture)
- [Worknotes & Commits](#worknotes--commits)
- [Credits](#credits)

## Architecture:

### JDBC Overview:

<div style="text-align:center;">
    <img src="https://imgur.com/dVlLTjn.png" alt="JDBC Overview">
</div>

### DAO (Data Access Object):

<div style="text-align:center;">
    <img src="https://imgur.com/3XsmluH.png" alt="DAO Pattern">
</div>

### Entities:

<div style="text-align:center;">
    <img src="https://imgur.com/n3fZwPY.png" alt="Entities">
</div>

### Associated Objects:

<div style="text-align:center;">
    <img src="https://imgur.com/jLyqsXl.png" alt="Associated Objects">
</div>

## Worknotes & Commits:

##### Worknote #1 - Created Department Class
Commit hash: [46b7c6ac16c4456c27f5a7ff467dc2b28bc3003e](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/46b7c6ac16c4456c27f5a7ff467dc2b28bc3003e)  
Checklist:
* Attributes
* Constructors
* Getters/Setters
* `hashCode` and `equals`
* `toString`
* Implements `Serializable`

##### Worknote #2 - Created Seller Class
Commit hash: [a87219c489f2b3837bbd03d9f812110ec9e85ec8](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/a87219c489f2b3837bbd03d9f812110ec9e85ec8)  
Checklist:
* Attributes
* Constructors
* Getters/Setters
* `hashCode` and `equals`
* `toString`
* Implements `Serializable`

##### Worknote #3 - Created DepartmentDao and SellerDao Classes
Commit hash: [7d4cf8e5f3dc0b1f08e7ad3ffed38749cc96aa1e](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/7d4cf8e5f3dc0b1f08e7ad3ffed38749cc96aa1e)  
Checklist:
* Created `DepartmentDao` and `SellerDao` classes [public]

##### Worknote #4 - Created DaoFactory and SellerDaoJDBC
Commit hash: [5fc028068552036140160dbcdafd8af53e4843fd](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/5fc028068552036140160dbcdafd8af53e4843fd)  
Checklist:
* Created `DaoFactory` and `SellerDaoJDBC` classes [public]
* Method: `createSellerDao`

##### Worknote #5 - Created SellerDaoJDBC SQL Statements
Commit hash: [6ec2e16eb8eb6ae25d0f6dd5ca258c8126ccc114](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/6ec2e16eb8eb6ae25d0f6dd5ca258c8126ccc114)  
Checklist:
* Created `SellerDaoJDBC` class [public]
* Method: `findById`

##### Worknote #6 - Fixed SellerDaoJDBC Class
Commit hash: [a0c6988bf46e7d61ae1b84e99604043599183e33](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/a0c6988bf46e7d61ae1b84e99604043599183e33)  
Checklist:
* Updated `SellerDaoJDBC` class [public]
* Method: `findById`

##### Worknote #7 - Improved findById Function
Commit hash: [1aff29f78170f1a714c564c6dddc9851d2cf4f00](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/1aff29f78170f1a714c564c6dddc9851d2cf4f00)  
Checklist:
* Improved `findById` method in `SellerDaoJDBC` class [public]

##### Worknote #8 - Created findByDepartment Function
Commit hash: [8f4c97e3fc5cf5dec271b67acf13566bc777510a](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/8f4c97e3fc5cf5dec271b67acf13566bc777510a)  
Checklist:
* Created `findByDepartment` method in `SellerDaoJDBC` class [public]

##### Worknote #9 - Created findAll Function
Commit hash: [02df17b6767d5bd43e32e30e3f38bb506b017fbc](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/02df17b6767d5bd43e32e30e3f38bb506b017fbc)  
Checklist:
* Created `findAll` method in `SellerDaoJDBC` class [public]

##### Worknote #10 - Created Insert Statement Function
Commit hash: [c17fff0dbc49bee89cea8c306544c138c5b89620](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/c17fff0dbc49bee89cea8c306544c138c5b89620)  
Checklist:
* Created `insert` method in `SellerDaoJDBC` class [public]

##### Worknote #11 - Created Update Statement (Seller Class)
Commit hash: [986003ddd5dc6bc2aadd5286a43fbbfd737ac7fa](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/986003ddd5dc6bc2aadd5286a43fbbfd737ac7fa)  
Checklist:
* Created `update` method in `SellerDaoJDBC` class [public]

##### Worknote #12 - Created Delete Statement
Commit hash: [0a8f69dc90f7dd271ceebabcdd6e8347a17846ca](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/0a8f69dc90f7dd271ceebabcdd6e8347a17846ca)  
Checklist:
* Created `delete` method in `SellerDaoJDBC` class [public]

##### Worknote #13 - Implemented Reinforcement Exercise: DepartmentDao
Commit hash: [1c994797434cdac87e49b54d3079f80e7cf06c0f](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/1c994797434cdac87e49b54d3079f80e7cf06c0f)  
Checklist:
* Implemented `DepartmentDaoJDBC` class [public]
* Methods: `insert`, `update`, `deleteById`, `findById`, `instantiateDepartment`, and `findAll`

##### Worknote #14 - Removed Unnecessary Lines and Added Final Database Script
Commit hash: [ff4e756f18ec3668a4392d4bd4468ec93195d762](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/ff4e756f18ec3668a4392d4bd4468ec93195d762)

## Credits:
This repository is maintained by [MaurosMJ](https://github.com/MaurosMJ). The Projects are based on the 'Java COMPLETO Programação Orientada a Objetos + Projetos' course.
