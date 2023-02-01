public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int stat() {
        int max = 0;
        int min = sales[0];
        int soum = 0;
        int stats;

        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        for (int i = 0; i  < sales.length; i++) {
            int p = sales[i];
            soum += p;
        }

        stats = (soum - min - max) / (sales.length - 2);

        return stats;
    }
}