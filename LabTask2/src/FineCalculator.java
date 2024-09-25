package src;

public class FineCalculator {

    public static double calculateFictionFine(int daysOverdue) {
        double fine = 0;
        if (daysOverdue > 0 && daysOverdue <= 10) {
            fine = 1.0 * daysOverdue;
        } else if (daysOverdue > 10) {
            fine = ( 1.0 * 10 ) + 1.5 * (daysOverdue - 10); 
        }
        return fine;
    }

    public static double calculateNonFictionFine(int daysOverdue) {
        double fine = 0;
        if (daysOverdue > 0 && daysOverdue <= 10) {
            fine = 1.5 * daysOverdue;
        } else if (daysOverdue > 10) {
            fine = ( 1.5 * 10 ) + 2.5 * (daysOverdue - 10);  
        }
        return fine ; 
    }

    public static double calculateChildrenFine(int daysOverdue) {
        double fine = 0;
        if (daysOverdue > 0 && daysOverdue <= 10) {
            fine = 0.5 * daysOverdue;
        } else if (daysOverdue > 10) {
            fine = ( 0.5 * 10 ) + 0.75 * (daysOverdue - 10);  
        }
        return fine;
    }
}
