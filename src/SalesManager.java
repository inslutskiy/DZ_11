public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long stat() {
        long max = 0;
        long min = sales[0];
        long soum = 0;
        long stats;

        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        for (int i = 0; i  < sales.length; i++) {
            long p = sales[i];
            soum += p;
        }

        stats = (soum - min - max) / (sales.length - 2);

        return stats;
    }
}