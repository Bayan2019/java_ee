# Java Enterprise Edition -- Java EE

## Installing and Running Java EE

- [Task 1](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_1.java)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_2.java)
- [Task 3](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_3.java)
- [Task 4](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_4.java)
- [Task 5](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_5.java)
- [Task 6](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_6.java)
- [Task 7](https://github.com/Bayan2019/java_ee/blob/master/src/ch01/Task_01_7.java)

## Java Server Pages

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/ch02/bitlabShop)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/ch02/bitlabShop/Task_02_Details.java)
- [Task 3](https://github.com/Bayan2019/java_ee/tree/master/src/ch02/bitlabNews)
- [Sprint Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/ch02/sprint1)

## JDBC

- [Task 1](https://github.com/Bayan2019/java_ee/blob/master/src/ch03/bitlabAcademy/Task_03_Main.java)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/ch03/bitlabAcademy/Task_03_Details.java)

We Created SQL Table `students` for [BITLAB Academy](https://github.com/Bayan2019/java_ee/blob/master/src/ch03/bitlabAcademy):

> `CREATE TABLE students(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`surname VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`birthdate DATE,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`city VARCHAR(100)`\
>`);`

## JDBC, continued

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/ch03/bitlabAcademy)
- [Sprint Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/ch03/sprint2)

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

for [Sprint Task 2](https://github.com/Bayan2019/java_ee/tree/master/src/ch03/sprint2).

## JDBC -- Table Relationships

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/ch03/bitlabAcademy)
- [Task 2]()

We Created SQL Table `cities` for [BITLAB Academy](https://github.com/Bayan2019/java_ee/blob/master/src/ch03/bitlabAcademy):

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

for [BITLAB Academy](https://github.com/Bayan2019/java_ee/blob/master/src/ch03/bitlabAcademy).

## Cookies

## Sessions

## Authentication, Registration, Adding a Blog, and Comments
