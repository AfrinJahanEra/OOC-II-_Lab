
public class NumWordPrinter {
    private boolean toUpper;

    public NumWordPrinter(boolean toUpper) {
        this.toUpper = toUpper;
    }

    public String printWord(int n) {
        String result;

        if (n % 2 == 0 && n % 11 == 0 && n % 13 == 0) {
            result = "EvenPrimeLucky";
        } else if (n % 2 == 0 && n % 11 == 0) {
            result = "EvenPrimeEleven";
        } else if (n % 13 == 0) {
            result = "LuckyThirteen";
        } else if (n % 11 == 0) {
            result = "PrimeEleven";
        } else if (n % 2 == 0) {
            result = "Even";
        } else {
            result = "OddOneOut";
        }

        if (toUpper) {
            result = result.toUpperCase();
        }

        return result;
    }
}

