package ISP_Singleton.src;

import java.util.UUID;

class User {
    private String userName;
    private String email;
    private String password;
    private UserType userType;
    private String userId;

    public User(String userName, String email, String password, UserType userType) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.userId = UUID.randomUUID().toString();  
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getUserId() {
        return userId;
    }

    public String toCSV() {
        return userId + "," + userName + "," + email + "," + password + "," + userType;
    }
}