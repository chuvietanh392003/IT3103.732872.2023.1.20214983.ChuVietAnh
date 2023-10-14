package week1;
//ChuVietAnh20214983
import javax.swing.JOptionPane;

public class Bai5 {
	 public static void main(String[] args) {
		    // input Num1,Num2
		    String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		    String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		    double num1 = Double.parseDouble(strNum1);
		    double num2 = Double.parseDouble(strNum2);   
		    String cmd = JOptionPane.showInputDialog(null, "1: Sum\n2: Differant\n3: Product\n4: Quotient\n", "Select cmd", JOptionPane.WARNING_MESSAGE);
		    double phepTinh = Double.parseDouble(cmd);
		    // nhap phep tinh
		    switch ((int)phepTinh) {
		        case 1:
		            sum(num1,num2);
		            break;
		        case 2:
		            difference(num1, num2);
		            break;
		        case 3:
		            product(num1, num2);
		            break;
		        case 4:
		            quotient(num1, num2);
		            break;
		    
		        default:
		        	JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
		            break;
		    }
		 }
	 //ham tinh tong
	 static void sum(double num1, double num2){
	    double sum = num1 + num2 ;
	    JOptionPane.showMessageDialog(null,"Sum of two numbers is: " + sum , "Result", JOptionPane.INFORMATION_MESSAGE);
	 }
	 // ham tinh hieu
	 static void difference(double num1, double num2){
	    double difference = num1 - num2;
	    JOptionPane.showMessageDialog(null,"Difference of two numbers is: " + difference , "Result", JOptionPane.INFORMATION_MESSAGE);
	 }
	 // ham tinh phep nhan
	 static void product(double num1, double num2){
	    double product = num1 * num2;
	    JOptionPane.showMessageDialog(null,"Product of two numbers is: " + product , "Result", JOptionPane.INFORMATION_MESSAGE);
	 }
	 // ham tinh phep chia
	 static void quotient(double num1, double num2){
	    if(num2 == 0) {
	        JOptionPane.showMessageDialog(null, "Divisor can't be 0", "Error", JOptionPane.ERROR_MESSAGE);
	        System.exit(0);
	    }
	    double quotient = num1 / num2;
	    JOptionPane.showMessageDialog(null, "Quotient of two numbers is: " + quotient, "Result", JOptionPane.INFORMATION_MESSAGE);
	}   
}

