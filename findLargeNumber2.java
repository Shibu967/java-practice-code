public class findLargeNumber2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is large number");
        } else if (b > a && b > c) {
            System.out.println(b + " is large number");
        } else {
            System.out.println(c + " is large number");
        }
    }

}
