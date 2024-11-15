package ISP_Singleton.Test;

import org.junit.jupiter.api.Test;

import ISP_Singleton.src.UserManager;

import static org.junit.jupiter.api.Assertions.*;

class TestUserManager {

    @Test
    void testSaveUser() {
        UserManager userManager = UserManager.getInstance();
        User newUser = new User("Rakib", "rakib@example.com", "password789", UserType.REGULAR);
        userManager.saveUser(newUser);
        
        User savedUser = userManager.getUserById(newUser.getUserId());
        assertNotNull(savedUser);
        assertEquals("Rakib", savedUser.getUserName());
        assertEquals("rakib@example.com", savedUser.getEmail());
        assertEquals(UserType.REGULAR, savedUser.getUserType());
    }

    @Test
    void testLoadUsers() {
        UserManager userManager = UserManager.getInstance();
        userManager.loadUsers();

        assertTrue(userManager.getUsers().size() > 0, "Users should be loaded from the CSV file.");
    }
}
