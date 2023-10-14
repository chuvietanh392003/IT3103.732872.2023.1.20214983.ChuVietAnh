package week1;
import java.util.Scanner;

public class BTVN6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số hàng (m): ");
        int m = sc.nextInt();
        
        System.out.print("Nhập số cột (n): ");
        int n = sc.nextInt();
        
        double[][] arr = new double[m][n];
        double[][] arr1 = new double[m][n];
        double[][] sumMatrix = new double[m][n];

        // Nhập giá trị cho ma trận arr
        System.out.println("Nhập giá trị cho ma trận arr:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        
        // Nhập giá trị cho ma trận arr1
        System.out.println("Nhập giá trị cho ma trận arr1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextDouble();
            }
        }

        // Tính tổng của hai ma trận
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        // In kết quả
        System.out.println("Tổng của hai ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
