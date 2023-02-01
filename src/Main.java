public class Main {
    public static void main(String[] args) {
        long[] a = {100, 5, 26, 58, 50};

        SalesManager manager = new SalesManager(a);

        System.out.println(manager.max());
    }
}