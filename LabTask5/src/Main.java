public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        orderManager.addProduct(ProductFactory.createProduct("electronics", "Laptop", 2, 1000));
        orderManager.addProduct(ProductFactory.createProduct("electronics", "Laptop", 3, 1000));
        orderManager.addProduct(ProductFactory.createProduct("electronics", "Laptop", 5, 1000));
        orderManager.addProduct(ProductFactory.createProduct("clothing", "T-shirt", 5, 20));
        orderManager.addProduct(ProductFactory.createProduct("furniture", "Chair", 10, 50));
        orderManager.addProduct(ProductFactory.createProduct("electronics", "Phone", 1, 800));

        orderManager.sortProducts();
        orderManager.displayProducts();
    }
}