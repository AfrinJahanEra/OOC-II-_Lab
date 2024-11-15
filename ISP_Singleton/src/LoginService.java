package ISP_Singleton.src;

public class LoginService {
    private UserManager userManager = UserManager.getInstance();

    public IUser login(String userName, String password) {
        for (User user : userManager.getUsers()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                switch (user.getUserType()) {
                    case REGULAR:
                        return new RegularUser();
                    case POWER:
                        return new PowerUser();
                    case ADMIN:
                        return new AdminUser();
                    default:
                        return null;
                }
            }
        }
        System.out.println("Invalid login credentials.");
        return null;
    }
}
