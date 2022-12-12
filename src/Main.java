public class Main {
    public static void main(String[] args) {
    printLeapOrNorLeapYear(2029);
    }
    public static boolean isLeapYear(int year) {
        return year % 4==0 && year%100 !=0 || year%400==0;
    }
    public static void leapOrNorLeapYear (int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год високосный");
            return;
        }
        System.out.println(year + " год невисокосный");
    }
}