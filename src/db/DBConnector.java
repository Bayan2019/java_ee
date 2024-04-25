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
}
