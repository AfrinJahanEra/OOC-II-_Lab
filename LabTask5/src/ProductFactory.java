class ProductFactory {
    
    public static Product createProduct(String productType, String name, int quantity, double unitPrice) {
        switch (productType.toLowerCase()) {
            case "electronics":
                return new Electronics(name, quantity, unitPrice);
            case "clothing":
                return new Clothing(name, quantity, unitPrice);
            case "furniture":
                return new Furniture(name, quantity, unitPrice);
            default:
                throw new IllegalArgumentException("Invalid product type: " + productType);
        }
    }
}