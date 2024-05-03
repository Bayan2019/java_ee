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

- [Task 1](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/ch07)
- [Task 2](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/ch07/Task_2.java)
- [Task 3](https://github.com/Bayan2019/java_ee/blob/master/src/servlets/project/Login.java) -- Project -- Login Servlet

## Authentication, Registration, Adding a Blog, and Comments

- [Project](https://github.com/Bayan2019/java_ee/tree/master/src/servlets/project)

First we create `news` table 
>`CREATE TABLE news(`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id BIGSERIAL PRIMARY KEY,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`title VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`content TEXT,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`author VARCHAR(255),`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`category_id INTEGER,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`language_id INTEGER,`\
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`post_date TIMESTAMP`\
>`);`

We can also create `categories` table

>`CREATE TABLE categories(`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id SERIAL PRIMARY KEY,`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(255)`\
>`);`

and `languages` table

>`CREATE TABLE languages(`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`id SERIAL PRIMARY KEY,`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`name VARCHAR(255),`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`alpha2 VARCHAR(2),`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`alpha3 VARCHAR(3)`\
>`);`

Then we decide to put default value for the `post_date` column:
>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ALTER COLUMN post_date SET DEFAULT NOW();`

and add foreign key

>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ADD COLUMN author_id BIGINT;`

with setted values

>`UPDATE news SET author_id=users.id`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`FROM users`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`WHERE users.fullname=author;`

and foreign constraint
>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ADD CONSTRAINT author_id_fkey`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`FOREIGN KEY (author_id) REFERENCES users (id);`

Therefore, we can drop author column
>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`DROP COLUMN author;`

By the way we can two other foreign key constraints
>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ADD CONSTRAINT category_id_fkey`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`FOREIGN KEY (category_id) REFERENCES categories (id);`

and 

>`ALTER TABLE news`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ADD CONSTRAINT language_id_fkey`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`FOREIGN KEY (language_id) REFERENCES languages (id);`

Then we edit `users` table with queries:
>`ALTER TABLE users`\
>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`ADD CONSTRAINT unique_emails UNIQUE(email);`

and
>`ALTER TABLE users`\
>`ADD COLUMN role_id INTEGER DEFAULT 2;`