package ISP_Singleton.src;

import java.io.*;
import java.util.*;

public class UserManager {
    private static final String USER_CSV_FILE = "user.csv";
    private static final String ADMIN_CSV_FILE = "admin.csv";

    private List<User> users = new ArrayList<>();
    private static UserManager instance;

    private UserManager() {
        loadUsers();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void loadUsers() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(USER_CSV_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) continue;  

                UserType userType = UserType.valueOf(data[4].toUpperCase());
                User user = new User(data[1], data[2], data[3], userType);
                users.add(user);

                if (userType == UserType.ADMIN) {
                    saveToAdminFile(user);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
    }

    public void saveToAdminFile(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ADMIN_CSV_FILE, true))) {
            writer.write(user.toCSV());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving admin user: " + e.getMessage());
        }
    }

    public void saveUser(User adminUser) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_CSV_FILE, true))) {
            writer.write(adminUser.toCSV());
            writer.newLine();
            if (adminUser.getUserType() == UserType.ADMIN) {
                saveToAdminFile(adminUser);
            }
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    public List<User> getUsers() {
        return users;
    }


    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
