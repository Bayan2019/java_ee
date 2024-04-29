package db;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DBManager {

    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Footballer> players = new ArrayList<>();
    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<News> allNews = new ArrayList<>();
    public static ArrayList<News> someNews = new ArrayList<>();
    public static ArrayList<Task> tasks = new ArrayList<>();
    public static ArrayList<Category> categories = new ArrayList<>();

    static {
        employees.add(new Employee("Ilyas", "Zhuanyshev", "IT", 550000));
        employees.add(new Employee("Aybek", "Bagit", "Management", 650000));
        employees.add(new Employee("Alibek", "Serikov", "HR", 350000));
        employees.add(new Employee("Serzhan", "Berikov", "IT", 450000));
        employees.add(new Employee("Madina", "Assetova", "PR", 350000));
        employees.add(new Employee("Anel", "Mukhamejanova", "Management", 350000));
    }
    static {
        items.add(new Item(1L, "Iphone 13 Pro Max", 450000, 10));
        items.add(new Item(2L, "XIAOMI REDMI NOTE 8", 82000, 20));
        items.add(new Item(3L, "Oppo 3 Model X", 350000, 15));
        items.add(new Item(4L, "Mackbook Pro M1 13", 750000, 15));
        items.add(new Item(5L, "ASUS TUF Gaming", 340000, 7));
    }
    static {
        categories.add(new Category(1, "culture"));
        categories.add(new Category(2, "sport"));
        categories.add(new Category(3, "cinema"));
    }
    static {
        allNews.add(new News(1L,
                "Comedian Arj Barker asks breastfeeding mother to leave show " +
                        "after baby talked during his set",
                "Barker said he made \"a very tough call\" " +
                        "on behalf of \"the other 700 or so audience members " +
                        "who deserved to see the show they had paid for, uninterrupted.",
                "Mirna Alsharif and Austin Mullen", new Category(1, "culture")));
        allNews.add(new News(2L,
                "Is Bandle the new Wordle? Song-guessing game builds buzz online",
                "Some creators on TikTok and Twitch have been " +
                        "posting videos of themselves playing the game.",
                "Kalhan Rosenblatt",new Category(1, "culture")));
        allNews.add(new News(3L,
                "Cheech Marin draws on the discrimination " +
                        "his WWII veteran dad faced for his new movie role",
                "Marin spoke about his role in \"The Long Game,\" " +
                        "about an underdog Mexican American high school golf team and " +
                        "the Latino war veterans denied entry to " +
                        "a whites-only Texas golf club.",
                "Arturo Conde",new Category(1, "culture")));
        allNews.add(new News(4L,
                "TikTok Live is helping some indie games find a larger audience",
                "In recent months, games like Fruit Mountain, " +
                        "That’s Not My Neighbor and Content Warning " +
                        "become wildly popular among streamers on TikTok.",
                "Kalhan Rosenblatt",new Category(1, "culture")));
        allNews.add(new News(5L, "Hundreds of athletes urge " +
                "the NCAA not to ban trans athletes from women’s sports",
                "Soccer icon Megan Rapinoe and " +
                        "former WNBA star Sue Bird " +
                        "were among over 400 elite athletes who signed " +
                        "a letter urging the NCAA to allow trans women to compete.",
                "Matt Lavietes",new Category(2, "sport")));
        allNews.add(new News(6L, "LeBron James rants at NBA's replay center " +
                "for calls, Lakers lose on buzzer-beater, trail Denver 2-0",
                "\"I don’t understand what’s going on in " +
                        "the replay center, to be honest,\" said James, " +
                        "whose team heads back to Los Angeles for Game 3 on Thursday.",
                "The Associated Press",new Category(2, "sport")));
        allNews.add(new News(7L,
                "Milwaukee Brewers' Jakob Junis taken to hospital after " +
                        "being hit in neck by line drive in practice",
                "Junis remained down for about 20 minutes " +
                        "while being treated by medical teams. " +
                        "He was alert while being loaded onto " +
                        "an ambulance and taken from PNC Park.",
                "The Associated Press",new Category(2, "sport")));
        allNews.add(new News(8L, "U.S. surfer accompanied by dolphins " +
                "as she wins world championship event in Australia",
                "Gabriela Bryan of Hawaii took " +
                        "a commanding lead with a 7.83 for two powerful turns " +
                        "on her forehand as a handful of dolphins swooped around her.",
                "Reuters",new Category(2, "sport")));
        allNews.add(new News(9L,
                "Why has Quentin Tarantino scrapped his " +
                        "final film 'The Movie Critic'?",
                "Quentin Tarantino is no longer planning to make 'The Movie Critic', " +
                        "which he had earlier said would be his final film as a director. " +
                        "Why and what could be on the cards for cinema's enfant terrible?",
                "David Mouriquand",new Category(3, "cinema")));
        allNews.add(new News(10L,
                "Studio Ghibli to receive Honorary Palme d’Or in Cannes first",
                "The legendary Japanese animation studio will be " +
                        "feted with the Honorary Palme d’Or - " +
                        "the first given to a collective.",
                "David Mouriquand",new Category(3, "cinema")));
        allNews.add(new News(11L,
                "Not another teen movie: Six-part Brigitte Macron TV series confirmed",
                "A French production company is working on a TV series " +
                        "on the life of France's first lady, Brigitte Macron. " +
                        "We suggest the ways they might want to dramatise her story.",
                "Jonny Walfisz",new Category(3, "cinema")));
        allNews.add(new News(12L,
                "And the LUX Audience Award goes to... 'The Teachers' Lounge'",
                "German director Ilker Çatak was awarded the 2024 LUX European Audience Film " +
                        "during a ceremony at the EU Parliament.",
                "Euronews",new Category(3, "cinema")));
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

    public static ArrayList<News> getAllNews() {return  allNews;}
    public static ArrayList<News> getSomeNews() {return someNews;}
    public static void setSomeNews(ArrayList<News> news) {
        someNews=news;
    }
    public static ArrayList<News> getCategoryNews(int category_id) {
        return getAllNews().stream().filter(n -> (n.getCategory().getId()==category_id))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<News> getSearchNews(String search) {
        return getAllNews().stream()
                .filter(n -> (n.getTitle().toLowerCase().contains(search.toLowerCase()) ||
                        n.getContent().toLowerCase().contains(search.toLowerCase())))
                .collect(Collectors.toCollection(ArrayList::new));
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
