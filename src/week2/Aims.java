/**
 * @author Chu Việt Anh 
 */
package week2;

public class Aims {
	public static void main(String[] args) {
		// create a new cart
		Cart anOrder = new Cart();
		
		// create new dvd oj and add them to the cart
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation","roger allers",87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("star wars", "science fiction","george lucas", 97, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("aladin", "animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("tong so tien phai thanh toan la: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("gia dvd3 la 18.99f");
		System.out.println("tong so tien phai thanh toan la: ");
		System.out.println(anOrder.totalCost());
		
	}
}
