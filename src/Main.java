public class Main {
    public static void main(String[] args) {
        int[] arey1 = {-5,-8,-3,-3,-5,-6,-7,-8,-9};
        int[] arey2 = {1,8,3,10,5,6,7,8,9};
        SalesManager a1 = new SalesManager(arey1);
        System.out.println(a1.max());
        SalesManager a2 = new SalesManager(arey2);
        System.out.println(a2.max());
        System.out.println(a1.avgExcludingMinMax());
        System.out.println(a2.avgExcludingMinMax());
    }
}
