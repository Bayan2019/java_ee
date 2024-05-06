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
                student.setCity(DBConnector.getCity(resultSet.getLong("city_id")));

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
                    "students (name, surname, birthdate, city_id) " +
                    "VALUES (?, ?, ?, ?);");
            statement.setString(1,student.getName());
            statement.setString(2, student.getSurname());
            statement.setDate(3, Date.valueOf(student.getBirthdate().toString()));
            statement.setLong(4, student.getCity().getId());

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
                student.setCity(DBConnector.getCity(resultSet.getLong("city_id")));
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
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM items " +
                    "ORDER BY id ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Item item = new Item();

                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));
                item.setBrand(DBConnector.getBrand(resultSet.getLong("brand_id")));

                items.add(item);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return items;
    }
    public static void addItem(Item item) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "items (name, description, price, brand_id) " +
                    "VALUES (?, ?, ?, ?);");
            statement.setString(1,item.getName());
            statement.setString(2, item.getDescription());
            statement.setDouble(3, item.getPrice());
            statement.setLong(4, item.getBrand().getId());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Item getItem(Long id) {
        Item item = new Item();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM items WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));
                item.setBrand(DBConnector.getBrand(resultSet.getLong("brand_id")));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return item;
    }
    public static void updateItem(Long id, String name, String description, Double price, Long brand_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE items " +
                    "SET name=?, description=?, price=?, brand_id=? " +
                    "WHERE id=?;");
            statement.setString(1, name);
            statement.setString(2, description);
            statement.setDouble(3, price);
            statement.setLong(4, brand_id);
            statement.setLong(5, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteItem(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM items WHERE id=?;");

            statement.setLong(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                user.setRole_id(resultSet.getInt("role_id"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
    public static User getUser(Long id) {
        User user = new User();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                user.setId(id);
                user.setEmail(resultSet.getString("email"));
                user.setFullName(resultSet.getString("fullName"));
                user.setRole_id(resultSet.getInt("role_id"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
    public static void addUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "users (email, password, fullName) " +
                    "VALUES (?, ?, ?);");
            statement.setString(1,user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullName());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<String> getUserEmails() {
        ArrayList<String> emails = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT email FROM users;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                emails.add(resultSet.getString("email"));
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return emails;
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

    // Brand ///////////// Brand ///////////// Brand ////////////////
    public static ArrayList<Brand> getAllBrands() {
        ArrayList<Brand> brands = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM brands ORDER BY name ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Brand brand = new Brand();

                brand.setId(resultSet.getLong("id"));
                brand.setName(resultSet.getString("name"));
                brand.setCountry(resultSet.getString("country"));

                brands.add(brand);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return brands;
    }
    public static Brand getBrand(Long id) {
        Brand brand = new Brand();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM brands WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                brand.setId(resultSet.getLong("id"));
                brand.setName(resultSet.getString("name"));
                brand.setCountry(resultSet.getString("country"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return brand;
    }
    public static void addBrand(Brand brand) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "brands (name, country) " +
                    "VALUES (?, ?);");
            statement.setString(1,brand.getName());
            statement.setString(2, brand.getCountry());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateBrand(Long id, String name, String country) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE brands " +
                    "SET name=?, country=? " +
                    "WHERE id=?;");
            statement.setString(1, name);
            statement.setString(2, country);
            statement.setLong(3, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteBrand(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM brands WHERE id=?;");

            statement.setLong(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Country ///////////// Country ///////////// Country ////////////////
    public static ArrayList<Country> getAllCountries() {
        ArrayList<Country> countries = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM countries ORDER BY name ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Country country = new Country();

                country.setName(resultSet.getString("name"));
                country.setCode(resultSet.getString("code"));

                countries.add(country);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return countries;
    }

    // Category ///////////// Category ///////////// Category ////////////////
    public static Category getCategory(int id) {
        Category category = new Category();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM categories " +
                    "WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return category;
    }
    public static ArrayList<Category> getAllCategories() {
        ArrayList<Category> categories = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM categories " +
                    "ORDER BY name ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Category category = new Category();

                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));

                categories.add(category);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return categories;
    }

    // Language ///////////// Language ///////////// Language ////////////////
    public static Language getLanguage(int id) {
        Language language = new Language();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM languages WHERE id=?;");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                language.setId(resultSet.getInt("id"));
                language.setName(resultSet.getString("name"));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return language;
    }
    public static ArrayList<Language> getAllLanguages() {
        ArrayList<Language> languages = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM languages " +
                    "ORDER BY name ASC;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Language language = new Language();

                language.setId(resultSet.getInt("id"));
                language.setName(resultSet.getString("name"));
                language.setAlpha2(resultSet.getString("alpha2"));

                languages.add(language);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return languages;
    }

    // News ///////////// News ///////////// News ////////////////
    public static ArrayList<News> getNewsByLanguage(int language_id) {
        ArrayList<News> news = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news " +
                    "WHERE language_id=?" +
                    "ORDER BY post_date DESC;");
            statement.setInt(1, language_id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                News n = new News();

                n.setId(resultSet.getLong("id"));
                n.setTitle(resultSet.getString("title"));
                n.setContent(resultSet.getString("content"));
                n.setAuthor(getUser(resultSet.getLong("author_id")));
                n.setCategory(DBConnector.getCategory(resultSet.getInt("category_id")));
                n.setPost_date(resultSet.getDate("post_date").toLocalDate());

                news.add(n);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return news;
    }
    public static ArrayList<News> getNewsByCategory(int category_id, int language_id) {
        ArrayList<News> news = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news " +
                    "WHERE language_id=? AND category_id=?" +
                    "ORDER BY post_date DESC;");
            statement.setInt(1, language_id);
            statement.setInt(2, category_id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                News n = new News();

                n.setId(resultSet.getLong("id"));
                n.setTitle(resultSet.getString("title"));
                n.setContent(resultSet.getString("content"));
                n.setAuthor(getUser(resultSet.getLong("author_id")));
                n.setCategory(DBConnector.getCategory(resultSet.getInt("category_id")));
                n.setPost_date(resultSet.getDate("post_date").toLocalDate());

                news.add(n);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return news;
    }
    public static ArrayList<News> getNewsBySearch(String search, int language_id) {
        ArrayList<News> news = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news " +
                    "WHERE (language_id=?) AND " +
                    "((LOWER(title) LIKE ?) OR" +
                    "(LOWER(content) LIKE ?) OR" +
                    "(author_id IN (SELECT id FROM users " +
                    "WHERE LOWER(fullName) LIKE ?))) " +
                    "ORDER BY post_date DESC;");
            statement.setInt(1, language_id);
            statement.setString(2, "%"+search.toLowerCase()+"%");
            statement.setString(3, "%"+search.toLowerCase()+"%");
            statement.setString(4, "%"+search.toLowerCase()+"%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                News n = new News();

                n.setId(resultSet.getLong("id"));
                n.setTitle(resultSet.getString("title"));
                n.setContent(resultSet.getString("content"));
                n.setAuthor(getUser(resultSet.getLong("author_id")));
                n.setCategory(DBConnector.getCategory(resultSet.getInt("category_id")));
                n.setPost_date(resultSet.getDate("post_date").toLocalDate());

                news.add(n);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return news;
    }
    public static News getNews(Long id) {
        News news = new News();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM news WHERE id=?;");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                news.setId(resultSet.getLong("id"));
                news.setTitle(resultSet.getString("title"));
                news.setCategory(DBConnector.getCategory(resultSet.getInt("category_id")));
                news.setLanguage(DBConnector.getLanguage(resultSet.getInt("language_id")));
                news.setContent(resultSet.getString("content"));
                news.setPost_date(resultSet.getDate("post_date").toLocalDate());
                news.setAuthor(DBConnector.getUser(resultSet.getLong("author_id")));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return news;
    }
    public static void addNews(String title, String content, int category_id, int language_id, Long author_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "news (title, content, category_id, language_id, author_id) " +
                    "VALUES (?, ?, ?, ?, ?);");
            statement.setString(1, title);
            statement.setString(2, content);
            statement.setInt(3, category_id);
            statement.setInt(4, language_id);
            statement.setLong(5, author_id);

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteNews(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM news WHERE id=?;");

            statement.setLong(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateNews(Long id, String title, String content,
                                  int category_id, int language_id, Long author_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE news " +
                    "SET title=?, content=?, category_id=?, language_id=?, author_id=? " +
                    "WHERE id=?;");
            statement.setString(1, title);
            statement.setString(2, content);
            statement.setInt(3, category_id);
            statement.setInt(4, language_id);
            statement.setLong(5, author_id);
            statement.setLong(6, id);

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Comment ///////////// Comment ///////////// Comment ////////////////
    public static ArrayList<Comment> getAllCommentsNews(Long news_id) {
        ArrayList<Comment> comments = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM comments " +
                    "WHERE news_id=? " +
                    "ORDER BY post_date DESC;");
            statement.setLong(1, news_id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Comment c = new Comment();

                c.setId(resultSet.getLong("id"));
                c.setComment(resultSet.getString("comment"));
                c.setPost_date(resultSet.getDate("post_date").toLocalDate());
                c.setAuthor(getUser(resultSet.getLong("author_id")));
                c.setNews(DBConnector.getNews(resultSet.getLong("news_id")));

                comments.add(c);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return comments;
    }
    public static void addComment(String comment, Long author_id, Long news_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +
                    "comments (comment, author_id, news_id) " +
                    "VALUES (?, ?, ?);");
            statement.setString(1, comment);
            statement.setLong(2, author_id);
            statement.setLong(3, news_id);

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
