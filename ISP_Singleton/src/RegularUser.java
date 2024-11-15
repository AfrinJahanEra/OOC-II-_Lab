package ISP_Singleton.src;

class RegularUser implements IUser {
    @Override
    public void accessFile(String fileName) {
        System.out.println("Regular User: Reading from " + fileName);
        FileHandler.getInstance().readFile(fileName);
    }

    @Override
    public void modifyFile(String fileName) {
        System.out.println("Regular User cannot modify the file.");
    }
}