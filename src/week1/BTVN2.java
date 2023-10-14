package week1;
//ChuVietAnh20214983

import java.util.Scanner;

public class BTVN2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name? ");
		String strName = sc.nextLine();
		System.out.println("How old are you? ");
		int iAge = sc.nextInt();
		System.out.println("How tall are you? ");
		double height = sc.nextDouble();
		
		System.out.println("Mr/Mrs "+ strName +"\n"
		+ iAge + " years old \n" + "Your height is " + height);
		
	}
}
