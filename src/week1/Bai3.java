package week1;
//ChuVietAnh20214983

import javax.swing.JOptionPane;

public class Bai3 {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog(null,"Enter you name:\n");
		JOptionPane.showMessageDialog(null, "Hello " + result);
	}
}
