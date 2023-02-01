public class Main {
    public static void main(String[] args) {
        long[] b = {100, 5, 26, 58, 50};

        SalesManager manager = new SalesManager(b);

        System.out.println(manager.max());
    }
}