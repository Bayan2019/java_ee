package db;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                student.setBirthdate(resultSet.getDate("birthdate"));
                student.setCity(resultSet.getString("city"));

                students.add(student);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}
