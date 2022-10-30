public class ChackLeapYear {
    public static void main(String[] args) {
        int Year = 2020;
        if ((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap year");
        }
    }

}
