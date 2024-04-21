<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="en">
    <%@include file="../vendor/head.jsp"%>
    <body>
        <%@include file="../vendor/header.jsp"%>
        <main>
            <h2>Installing and Running Java EE</h2>
            <h3><a href="task_1_1">Task 1</a></h3>
            <p>
                Create an application using servlets
                that displays the word  HELLO BITLAB 10 times in
                the first level header <code>&lth1&gt</code>.
            </p>
            <h3><a href="task_1_2">Task 2</a></h3>
            <p>
                Create a servlet that generates a table with a specific list of users.
                And the list is taken from an array or list (<code>ArrayList</code>).
            </p>
            <h3>Task 3</h3>
            <p>
                Create a servlet that sends a request to another servlet
                that processes the request.
                From the main page we submit a form in which we enter the first and last name,
                then our servlet must process this request and display the data we entered on the screen.
            </p>
            <form action="/task_1_3" method="get">
                <label class ='mb-3'>NAME: </label>
                <input type ='text' name = 'studentName' class='form-control w-50 mb-3' />
                <label class ='mb-3'>SURNAME: </label>
                <input type ='text' name ='studentSurname' class='form-control w-50 mb-3' />
                <button>SEND</button>
            </form>
            <h3>Task 4</h3>
            <p>
                Create a servlet that processes the request and displays the result.
                We send our first and last name and the food we want to order.
                After we fill out the form
                (for example, you entered - Ilyas Zhuanyshev and selected Manty - 900 KZT),
            </p>
            <form action="/task_1_4" method="get">
                <label class ='mb-3'>NAME: </label>
                <input type ='text' name = 'studentName' class='form-control w-50 mb-3' />
                <label class ='mb-3'>SURNAME: </label>
                <input type ='text' name ='studentSurname' class='form-control w-50 mb-3' />
                <label class ='mb-3'>FOOD: </label>
                <select name='studentFood'>
                    <option value="Manty - 900 KZT">Manty - 900 KZT</option>
                    <option value="Samsa - 100 KZT">Burger - 100 KZT</option>
                    <option value="Hotdog - 120 KZT">Hotdog - 120 KZT</option>
                    <option value="Shawarma - 300 KZT">Shawarma - 300 KZT</option>
                    <option value="Popcorn - 700 KZT">Popcorn - 700 KZT</option>
                    <option value="Lagman - 350 KZT">Lagman - 350 KZT</option>
                    <option value="Kebab - 1000 KZT">Kebab - 1000 KZT</option>
                    <option value="Pilaf - 500 KZT">Pilaf - 500 KZT</option>
                    <option value="Hamburger - 1250 KZT">Hamburger - 1250 KZT</option>
                </select>
                <button>Order</button>
            </form>
            <h3>Task 5</h3>
            <p>
                Create a WEB application using servlets. We must be able to enter data (full name, age and gender).

                When you run the form, the result should work conditionally based on your age and gender.
            </p>
            <form action="/task_1_5" method="get">
                <fieldset>
                    <legend>FULL NAME: </legend>
                    <input class="input-fieldset" type ='text' name = 'fullName' />
                </fieldset>
                <fieldset>
                    <legend>AGE: </legend>
                    <input class="input-fieldset" type ='number' name ='age' />
                </fieldset>
                <fieldset>
                    <legend>GENDER: </legend>
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female">Female</label><br>
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male">Male</label>
                </fieldset>
                <button>SEND</button>
            </form>
            <h3>Task 6</h3>
            <p>
                Create your first WEB application using  servlets .
                Your project will be related to managing a list of football players.
                You can use ArrayList  as a database  inside a special class  DBManager.java .
            </p>
            <form action="/task_1_6" method="get">
                <fieldset>
                    <legend>FULL NAME: </legend>
                    <input class="input-fieldset" type ='text' name = 'fullName' />
                </fieldset>
                <fieldset>
                    <legend>EXAM POINTS: </legend>
                    <input class="input-fieldset" type ='number' name ='points' />
                </fieldset>
                <button>SUBMIT EXAM</button>
            </form>
            <h3>Task 7</h3>
            <p>
                Create a servlet that processes the request and displays the result.
                We send our first and last name and the food we want to order.
                After we fill out the form
                (for example, you entered - Ilyas Zhuanyshev and selected Manty - 900 KZT),
            </p>
            <form action="/task_1_7" method="post">
                <label class ='mb-3'>NAME: </label>
                <input type ='text' name = 'playerName' class='form-control w-50 mb-3' />
                <label class ='mb-3'>SURNAME: </label>
                <input type ='text' name ='playerSurname' class='form-control w-50 mb-3' />
                <label class ='mb-3'>CLUB: </label>
                <select name='playerClub'>
                    <option value="Real Madrid">Real Madrid</option>
                    <option value="Atalanta">Atalanta</option>
                    <option value="Real Sociedad">Real Sociedad</option>
                    <option value="Barcelona">Barcelona</option>
                </select>
                <label class ='mb-3'>SALARY: </label>
                <input type ='text' name = 'playerSalary' class='form-control w-50 mb-3' />
                <label class ='mb-3'>TRANSFER PRICE: </label>
                <input type ='text' name = 'playerTransferPrice' class='form-control w-50 mb-3' />
                <button>ADD FOOTBALLER</button>
            </form>
        </main>
    </body>
</html>