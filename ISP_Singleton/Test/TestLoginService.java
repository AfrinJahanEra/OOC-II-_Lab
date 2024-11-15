package ISP_Singleton.Test;

import org.junit.jupiter.api.Test;

import ISP_Singleton.src.IUser;
import ISP_Singleton.src.LoginService;
import ISP_Singleton.src.UserManager;

import static org.junit.jupiter.api.Assertions.*;

class TestLoginService {

    @Test
    void testLoginValidAdmin() {
        LoginService loginService = new LoginService();
        UserManager userManager = UserManager.getInstance();
        User adminUser = new User("Shahin", "shahin@example.com", "admin123", UserType.ADMIN);
        userManager.saveUser(adminUser);

        IUser loggedInUser = loginService.login("Shahin", "admin123");
        assertNotNull(loggedInUser, "Login should succeed for valid admin credentials.");
        assertTrue(loggedInUser instanceof AdminUser, "Logged-in user should be of Admin type.");
    }

    @Test
    void testLoginInvalidPassword() {
        LoginService loginService = new LoginService();
        UserManager userManager = UserManager.getInstance();
        User adminUser = new User("Shahin", "shahin@example.com", "admin123", UserType.ADMIN);
        userManager.saveUser(adminUser);

        IUser loggedInUser = loginService.login("Shahin", "wrongPassword");
        assertNull(loggedInUser, "Login should fail for invalid password.");
    }
}
