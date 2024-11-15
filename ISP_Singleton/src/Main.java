package ISP_Singleton.src;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        UserManager userManager = UserManager.getInstance();

        User regularUser = new User("Rafiq", "rafiq@example.com", "password123", UserType.REGULAR);
        User powerUser = new User("Mita", "mita@example.com", "password456", UserType.POWER);
        User adminUser = new User("Shahin", "shahin@example.com", "admin123", UserType.ADMIN);

        userManager.saveUser(regularUser);
        userManager.saveUser(powerUser);
        userManager.saveUser(adminUser);


        IUser loggedInUser = loginService.login("Admin", "admin123");

        if (loggedInUser != null) {
            loggedInUser.accessFile("user.csv");
            loggedInUser.modifyFile("user.csv");
        }
    }
}
