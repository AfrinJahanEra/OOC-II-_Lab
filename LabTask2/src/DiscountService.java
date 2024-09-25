package src;

public class DiscountService {

    public static double applyEarlyReturnDiscount(double fine, int daysOverdue) {
        if (daysOverdue <= 3) {
            return fine * 0.8; 
        }
        return fine;
    }
}