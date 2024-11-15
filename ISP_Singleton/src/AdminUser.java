package ISP_Singleton.src;

class AdminUser implements IUser {
    @Override
    public void accessFile(String fileName) {
        System.out.println("Admin User: Reading from " + fileName);
        FileHandler.getInstance().readFile(fileName);
    }

    @Override
    public void modifyFile(String fileName) {
        System.out.println("Admin User: Modifying file " + fileName);
        FileHandler.getInstance().modifyFile(fileName, "Admin modified data.");
    }
}