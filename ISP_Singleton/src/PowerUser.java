package ISP_Singleton.src;

class PowerUser implements IUser {
    @Override
    public void accessFile(String fileName) {
        System.out.println("Power User: Reading from " + fileName);
        FileHandler.getInstance().readFile(fileName);
    }

    @Override
    public void modifyFile(String fileName) {
        System.out.println("Power User: Appending data to " + fileName);
        FileHandler.getInstance().appendToFile(fileName, "Power User appended data.");
    }
}