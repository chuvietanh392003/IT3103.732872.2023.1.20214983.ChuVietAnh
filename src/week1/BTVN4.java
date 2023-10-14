package week1;
//ChuVietAnh20214983
import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam: ");
        int year = scanner.nextInt();
        System.out.println("Nhap vao thang: ");
        int month = scanner.nextInt();
        
        int daysInMonth;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            daysInMonth = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            daysInMonth = 30;
        else if (month == 2 && checkLeapYear(year) == 1)
            daysInMonth = 29;
        else
            daysInMonth = 28;

        System.out.println("Co " + daysInMonth + " ngay");
    }

    public static int checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
