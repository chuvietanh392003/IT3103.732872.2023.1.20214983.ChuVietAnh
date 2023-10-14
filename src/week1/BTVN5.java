package week1;

import java.util.Scanner;

//ChuVietAnh20214983


public class BTVN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so phan tu cua mang:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("So phan tu cua mang khong hop le!");
        } else {
            double[] arr = new double[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                try {
                    arr[i] = sc.nextDouble();
                    sum += arr[i];
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Loi!");
                    return;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        double tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

            System.out.println("Mang sau khi sap xep la: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nTong cac so trong mang la: " + sum);
            System.out.println("Trung binh cac so la: " + (double)sum / n);
        }
    }
}

