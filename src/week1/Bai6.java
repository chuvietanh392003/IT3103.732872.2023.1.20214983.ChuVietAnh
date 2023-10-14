package week1;
//ChuVietAnh20214983

import javax.swing.JOptionPane;

public class Bai6 {

    public static void main(String[] args) {
    	// lua chon pt can giai
        String[] options = {"Phuong trinh bac nhat ","He phuong trinh bac nhat ","Phuong trinh bac hai "};
        int choice = JOptionPane.showOptionDialog(null,"Chon loai phuong trinh :","Lua chon",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,options,options[0]);

        switch (choice) {
            case 0:
                giaiPtBacNhat();
                break;
            case 1:
                giaiHePt();
                break;
            case 2:
                giaiPtBacHai();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lua chon khong hop le.");
        }
    }
    // ham giai pt bac nhat
    public static void giaiPtBacNhat() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri cua a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri cua b: "));

        if (a != 0) {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiem: x = " + x);
        } else if (b == 0) {
            JOptionPane.showMessageDialog(null, "Vo so nghiem");
        } else {
            JOptionPane.showMessageDialog(null, "Vo nghiem");
        }
    }
    
    // ham giai he pt
    public static void giaiHePt() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri a11: "));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri a12: "));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri b1: "));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri a21: "));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri a22: "));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri b2: "));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Nghiem: x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "Vo so nghiem");
        } else {
            JOptionPane.showMessageDialog(null, "Vo nghiem");
        }
    }
    
    //ham giai pt bac hai
    public static void giaiPtBacHai() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri cua a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri cua b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap gia tri cua c: "));

        double delta = b * b - 4 * a * c;

        if (a != 0) {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Hai nghiem thuc: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "Nghiem kep: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "Khong co nghiem thuc");
            }
        } else if (b != 0) {
            double x = -c / b;
            JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem : x = " + x);
        } else if (c == 0) {
            JOptionPane.showMessageDialog(null, "Vo so nghiem");
        } else {
            JOptionPane.showMessageDialog(null, "Vo nghiem");
        }
    }
}
