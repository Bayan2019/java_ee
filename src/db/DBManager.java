package db;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Footballer> players = new ArrayList<>();
    public static ArrayList<Task> tasks = new ArrayList<>();

    static {
        students.add(new Student("Yedil", "Bakenov", 8.0));
        students.add(new Student("Serik", "Serikov", 7.0));
        students.add(new Student("Berik", "Berikov", 6.0));
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    static {
        employees.add(new Employee("Ilyas", "Zhuanyshev", "IT", 550000));
        employees.add(new Employee("Aybek", "Bagit", "Management", 650000));
        employees.add(new Employee("Alibek", "Serikov", "HR", 350000));
        employees.add(new Employee("Serzhan", "Berikov", "IT", 450000));
        employees.add(new Employee("Madina", "Assetova", "PR", 350000));
        employees.add(new Employee("Anel", "Mukhamejanova", "Management", 350000));
    }

    public static void addFootballer(Footballer player) {
        players.add(player);
    }

    public static ArrayList<Footballer> getAllFootballers() {
        return players;
    }

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static ArrayList<Task> getAllTaks() {
        return tasks;
    }
    public static Task getTask(Long id) {
        for (Task t: getAllTaks()) {
            if (t.id==id) {
                return t;
            }
        }
        return null;
    }
}
