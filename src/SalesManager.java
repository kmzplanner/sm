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
        return (long) max;
    }

    public double avgExcludingMinMax() {
        long max = sales[0];
        long min = sales[0];
        long sum = 0;
        for(int i = 0; i < sales.length; i++){
            sum = sum + sales[i];
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        return ((double) (sum - max - min)) / (sales.length - 2);
    }

}
