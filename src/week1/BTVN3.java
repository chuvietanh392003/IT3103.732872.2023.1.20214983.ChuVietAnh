package week1;
//ChuVietAnh20214983

import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Tham so khong hop le");
        } else {
            int m = n - 1;
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * n - 1) - 2 * m; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= m; j++) {
                    System.out.print(" ");
                }
                m--;
                System.out.print("\n");
            }
        }
    }
}
