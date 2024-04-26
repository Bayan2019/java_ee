package db;

import org.postgresql.Driver;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DBConnector {
    private static Connection connection;
    private static String url = "jdbc:postgresql://localhost:5432/g124";
    private static String login = "postgres";
    private static String password = "postgres";

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Student ///////////// Student ///////////// Student ////////////////
    public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM students ORDER BY id ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getLong("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
                student.setCity(resultSet.getString("city"));

                students.add(student);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }

    public static void addStudent(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "students (name, surname, birthdate, city) " +
                    "VALUES (?, ?, ?, ?);");
            statement.setString(1,student.getName());
            statement.setString(2, student.getSurname());
            statement.setDate(3, Date.valueOf(student.getBirthdate().toString()));
            statement.setString(4, student.getCity());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Student getStudent(Long id) {
        Student student = new Student();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM students WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                student.setId(resultSet.getLong("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
                student.setCity(resultSet.getString("city"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }

    public static void updateStudent(Long id, String name, String surname, String birthdate, Long city_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE students " +
                    "SET name=?, surname=?, birthdate=?, city=?, city_id=? " +
                    "WHERE id=?;");
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setDate(3, Date.valueOf(LocalDate.parse(birthdate)));
            statement.setString(4, getCity(city_id).getName());
            statement.setLong(5, city_id);
            statement.setLong(6, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM students WHERE id=?;");

            statement.setLong(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Item ///////////// Item ///////////// Item ////////////////
    public static ArrayList<Item> getAllItems() {
        ArrayList<Item> items = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM items ORDER BY id ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Item item = new Item();

                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));

                items.add(item);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return items;
    }

    // User ///////////// User ///////////// User ////////////////
    public static User getUserByEmailPassword(String email, String password) {
        User user = new User();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users" +
                    " WHERE email=? AND password=?;");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFullName(resultSet.getString("fullName"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    // City ///////////// City ///////////// City ////////////////
    public static ArrayList<City> getAllCities() {
        ArrayList<City> cities = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cities ORDER BY name ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                City city = new City();

                city.setId(resultSet.getLong("id"));
                city.setName(resultSet.getString("name"));
                city.setCode(resultSet.getString("code"));

                cities.add(city);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cities;
    }

    public static void addCity(City city) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "cities (name, code) " +
                    "VALUES (?, ?);");
            statement.setString(1,city.getName());
            statement.setString(2, city.getCode());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static City getCity(Long id) {
        City city = new City();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cities WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                city.setId(resultSet.getLong("id"));
                city.setName(resultSet.getString("name"));
                city.setCode(resultSet.getString("code"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return city;
    }

    public static void updateCity(Long id, String name, String code) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE cities " +
                    "SET name=?, code=? " +
                    "WHERE id=?;");
            statement.setString(1, name);
            statement.setString(2, code);
            statement.setLong(3, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteCity(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM cities WHERE id=?;");

            statement.setLong(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
