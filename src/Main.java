import java.time.LocalDate;

public class Main {
    public final static int CURRENTYear = LocalDate.now().getYear();
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
    public static boolean IsNowYear (int year) {
        return year==CURRENTYear;
    }
    public static String getVersionOS (int versionOS) {
        if (versionOS == 0) {
            return "IOS";
        }
            return "Andriod";
        }
    public static void printVersionOS (int year, int versionOS) {
        if (IsNowYear(year)) {
            System.out.println(" Установите полную версию для вашего "+getVersionOS (versionOS));
        } else {
            System.out.println(" Установите облегченную версию для вашего "+getVersionOS (versionOS));
        }
    }
}