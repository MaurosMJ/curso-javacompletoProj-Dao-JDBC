# curso-javacompletoProj-Dao-JDBC


###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://www.oracle.com/a/ocom/img/jdbc.svg" alt="Descrição da imagem" width="100" height="100">
</div>
This repository contains a project using the standard Java API for database access, JDBC, with the help of Professor Nélio Alves in the course 'Java Complete Object-Oriented Programming + Projects'. As the professor explained and taught, I replicated and implemented the logic in my project and published it here on GitHub to improve my learning.

The goal of this project is to create a system that communicates with a database using the JDBC API. This stage of the course had about 4 hours of video lessons; however, it took me around 7 hours to complete due to the need to perform tests, review code, fix implementation errors, and sometimes rewatch the videos for better understanding.

DOCS:  
https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html  
Packages: java.sql and javax.sql (supplementary API for servers)

Technologies:

DBMS Tool: MySQL Workbench  
JDBC Connector: MySQL Java Connector  
IDE: Eclipse

##### More information:
Course Link: [Link](https://www.udemy.com/course/java-curso-completo)  
Section 21. Project: Database access with JDBC

## Index

- [Architecture](#architecture-1)
- [Worknotes & Commits](#Worknotes&Commits)
- [Credits](#Credits)

## Architecture:

Examples:

### JDBC OVERVIEW:

<div style="text-align:center;">
    <img src="https://imgur.com/dVlLTjn.png" alt="Descrição da imagem">
</div>

###  DAO (Data Access Object):

<div style="text-align:center;">
    <img src="https://imgur.com/3XsmluH.png" alt="Descrição da imagem">
</div>

### Entities:  

<div style="text-align:center;">
    <img src="https://imgur.com/n3fZwPY.png" alt="Descrição da imagem">
</div>

### Associated objects:  

<div style="text-align:center;">
    <img src="https://imgur.com/jLyqsXl.png" alt="Descrição da imagem">
</div>

## Worknotes & Commits:

##### Worknote #1 - Created department class
Commit hash: [46b7c6ac16c4456c27f5a7ff467dc2b28bc3003e](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/46b7c6ac16c4456c27f5a7ff467dc2b28bc3003e)  
Checklist:
* Attributes
* Constructors
* Getters/Setters
* hashCode and equals
* toString
* implements Serializable

##### Worknote #2 - Created Seller class
Commit hash: [a87219c489f2b3837bbd03d9f812110ec9e85ec8](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/a87219c489f2b3837bbd03d9f812110ec9e85ec8)  
Checklist:
* Attributes
* Constructors
* Getters/Setters
* hashCode and equals
* toString
* implements Serializable

##### Worknote #3 - Created DepartmentDao and SellerDao class
Commit hash: [7d4cf8e5f3dc0b1f08e7ad3ffed38749cc96aa1e](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/7d4cf8e5f3dc0b1f08e7ad3ffed38749cc96aa1e)  
Checklist:
* Classes DepartmentDao, SellerDao [public]

##### Worknote #4 - Created DaoFactory and SellerDaoJDBC
Commit hash: [5fc028068552036140160dbcdafd8af53e4843fd](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/5fc028068552036140160dbcdafd8af53e4843fd)  
Checklist:
* Classes DaoFactory, SellerDaoJDBC [public]
* Method: createSellerDao

##### Worknote #5 - Created SellerDaoJDBC SQL Statements
Commit hash: [6ec2e16eb8eb6ae25d0f6dd5ca258c8126ccc114](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/6ec2e16eb8eb6ae25d0f6dd5ca258c8126ccc114)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: findById

##### Worknote #6 - Fixed SellerDaoJDBC class
Commit hash: [a0c6988bf46e7d61ae1b84e99604043599183e33](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/a0c6988bf46e7d61ae1b84e99604043599183e33)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: findById

##### Worknote #7 - Improved findById fuction
Commit hash: [1aff29f78170f1a714c564c6dddc9851d2cf4f00](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/1aff29f78170f1a714c564c6dddc9851d2cf4f00)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: findById

##### Worknote #8 - Created findByDepartment function
Commit hash: [8f4c97e3fc5cf5dec271b67acf13566bc777510a](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/8f4c97e3fc5cf5dec271b67acf13566bc777510a)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: findByDepartment

##### Worknote #9 - Created findAll function
Commit hash: [02df17b6767d5bd43e32e30e3f38bb506b017fbc](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/02df17b6767d5bd43e32e30e3f38bb506b017fbc)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: findAll

##### Worknote #10 - Created insert statement function
Commit hash: [c17fff0dbc49bee89cea8c306544c138c5b89620](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/c17fff0dbc49bee89cea8c306544c138c5b89620)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: insert

##### Worknote #11 - Created update statement (class seller)
Commit hash: [986003ddd5dc6bc2aadd5286a43fbbfd737ac7fa](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/986003ddd5dc6bc2aadd5286a43fbbfd737ac7fa)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: update

##### Worknote #12 - Created delete statement
Commit hash: [0a8f69dc90f7dd271ceebabcdd6e8347a17846ca](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/0a8f69dc90f7dd271ceebabcdd6e8347a17846ca)  
Checklist:
* Class SellerDaoJDBC [public]
* Method: delete

##### Worknote #13 - Implemented a reinforcement exercise: DepartmentDao
Commit hash: [1c994797434cdac87e49b54d3079f80e7cf06c0f](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/1c994797434cdac87e49b54d3079f80e7cf06c0f)  
Checklist:
* Class DepartmentDaoJDBC [public]
* Methods: insert, update, deleteById, findById, instatiateDepartment and findAll

##### Worknote #14- Removed unnecessary lines and added database script (final)
Commit hash: [ff4e756f18ec3668a4392d4bd4468ec93195d762](https://github.com/MaurosMJ/curso-javacompletoProj-Dao-JDBC/commit/ff4e756f18ec3668a4392d4bd4468ec93195d762)  

# Credits:
[@acenelio (Nelio Alves)](https://github.com/acenelio)  
[@Me :)](https://github.com/MaurosMJ)
