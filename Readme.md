# Java Enterprise Edition -- Java EE

## Installing and Running Java EE

- [Task 1](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_1.java)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_2.java)
- [Task 3](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_3.java)
- [Task 4](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_4.java)
- [Task 5](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_5.java)
- [Task 6](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_6.java)
- [Task 7](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch01/Task_01_7.java)

## Java Server Pages

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch02/bitlabShop) -- BITLAB Shop -- Main and AddItem Servlets
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch02/bitlabShop/Task_02_Details.java) -- BITLAB Shop -- Details Servlet
- [Task 3](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch02/bitlabNews) -- BITLAB News
- [Sprint Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch02/sprint1)

## JDBC

- [Task 1](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch03/bitlabAcademy/Task_03_Main.java) -- BITLAB Academy -- Main Servlet
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch03/bitlabAcademy/Task_03_Details.java) -- BITLAB Academy -- Details Servlet

We Created SQL Table `students` for [BITLAB Academy](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/bitlabAcademy):

> `CREATE TABLE students(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`surname VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`birthdate DATE,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`city VARCHAR(100)`\
>`);`

## JDBC, continued

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/bitlabAcademy) -- BITLAB Academy -- Delete and Edit Servlets 
- [Sprint Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/sprint2)

We created tables `items`

> `CREATE TABLE items(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`description TEXT,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`price DECIMAL`\
>);`

and `users`

>`CREATE TABLE users(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`email VARCHAR(200),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`password VARCHAR(200),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`fullName VARCHAR(200)`\
>`);`

for [Sprint Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/sprint2).

## JDBC -- Table Relationships

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/bitlabAcademy) - BITLAB Academy
- [Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/sprint2) - Sprint Task 2

We Created SQL Table `cities` for [BITLAB Academy](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/bitlabAcademy):

> `CREATE TABLE cities(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(200),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`code VARCHAR(3)`\
>`);`

Then we alter the table `students`

>`ALTER TABLE students`\
>`ADD COLUMN city_id BIGINT`\
>`REFERENCES cities(id);`

to connect it with the table `cities`

>`UPDATE students`\
>`SET city_id=cities.id`\
>`FROM cities`\
>`WHERE students.city=cities.name;`

for [BITLAB Academy](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/bitlabAcademy)

We Created SQL Table `brands` for [Sprint Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch03/sprint2):

> `CREATE TABLE brands(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(200),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`country VARCHAR(3)`\
>`);`

Then we alter the table `items`

>`ALTER TABLE items`\
>`ADD COLUMN brand_id BIGINT`\
>`REFERENCES brands(id);`

to connect it with the table `brands`.

## Cookies

- [Task 1](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch06/Task_1.java)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch06/Task_2.java)
- [Task 3](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch06/Task_3.java)
- [Sprint Task 3](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/project/LanguageCookie.java) -- Project -- LanguageCookie Servlet

## Sessions

## Authentication, Registration, Adding a Blog, and Comments

- [Project](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/project)