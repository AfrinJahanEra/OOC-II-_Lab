import java.util.*;

class OrderManager {
    private List<Product> productList;

    public OrderManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }



    

    public void sortProducts() {
        int n = productList.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                Product p1 = productList.get(j);
                Product p2 = productList.get(j + 1);

             
                if (p1.calculateTotalPrice() > p2.calculateTotalPrice()) {
                
                    productList.set(j, p2);
                    productList.set(j + 1, p1);
                    swapped = true;
                } 
              
                else if (p1.calculateTotalPrice() == p2.calculateTotalPrice()) {
                    if (p1.getName().compareTo(p2.getName()) > 0) {
                   
                        productList.set(j, p2);
                        productList.set(j + 1, p1);
                        swapped = true;
                    } 
            
                    else if (p1.getName().equals(p2.getName()) && p1.getStockQuantity() > p2.getStockQuantity()) {
                     
                        productList.set(j, p2);
                        productList.set(j + 1, p1);
                        swapped = true;
                    }
                }
            }

        
            if (!swapped) break;
        }
    }

 



    public void displayProducts() {

        for (Product product : productList) {
            System.out.println("Product: " + product.getName() +", Total Price: " + product.calculateTotalPrice() + ", Quantity: " + product.getStockQuantity());
        }

    }


}