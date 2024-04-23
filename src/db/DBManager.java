package db;

import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Footballer> players = new ArrayList<>();
    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Task> tasks = new ArrayList<>();

    static {
        employees.add(new Employee("Ilyas", "Zhuanyshev", "IT", 550000));
        employees.add(new Employee("Aybek", "Bagit", "Management", 650000));
        employees.add(new Employee("Alibek", "Serikov", "HR", 350000));
        employees.add(new Employee("Serzhan", "Berikov", "IT", 450000));
        employees.add(new Employee("Madina", "Assetova", "PR", 350000));
        employees.add(new Employee("Anel", "Mukhamejanova", "Management", 350000));
    }
    static {
        items.add(new Item(1, "Iphone 13 Pro Max", 450000, 10));
        items.add(new Item(2, "XIAOMI REDMI NOTE 8", 82000, 20));
        items.add(new Item(3, "Oppo 3 Model X", 350000, 15));
        items.add(new Item(4, "Mackbook Pro M1 13", 750000, 15));
        items.add(new Item(5, "ASUS TUF Gaming", 340000, 7));
    }

    static {
        tasks.add(new Task(1L, "Create API on JAVA EE", "", "2021-10-23", true));
        tasks.add(new Task(2L, "Clean house and buy products", "", "2021-10-25", true));
        tasks.add(new Task(3L, "Finish all homeworks", "", "2021-10-28", false));
        tasks.add(new Task(4L, "Make an appointment", "", "2021-12-12", false));
        tasks.add(new Task(5L, "Learn Italian", "", "2021-01-05", false));
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void addFootballer(Footballer player) {
        players.add(player);
    }

    public static ArrayList<Footballer> getAllFootballers() {
        return players;
    }
    public static void addItem(Item item) { items.add(item); }
    public static ArrayList<Item> getAllItems() {
        return items;
    }
    public static Item getItem(int id) {
        return items.stream().filter(item -> item.getId()==id).findFirst().orElse(null);
    }

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static ArrayList<Task> getAllTaks() {
        return tasks;
    }
    public static Task getTask(Long id) {
        return tasks.stream().filter(task -> task.getId()==id).findFirst().orElse(null);
    }
    public static int getTaskIndex(Long id) {
        for (int i=0; i<getAllTaks().size(); i++) {
            if (getAllTaks().get(i).getId()==id) {
                return i;
            }
        }
        return -1;
    }

    public static void updateTasks(int i, Task task) {
        tasks.set(i, task);
    }
    public static void deleteTask(Long id) {
        Task task = getTask(id);
        tasks.remove(task);
    }
}
