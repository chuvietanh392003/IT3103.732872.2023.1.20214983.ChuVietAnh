/**
 * Author: Chu Việt Anh
 */
package week3;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        // Create an array to store DVD information
        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[4];

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 97, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("My Destiny", "Love", "Home Seckia", 97, 24.85f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin", "Animation", "Piaka", 92, 18.95f);

        // Add DVDs to the array
        dvdList[0] = dvd1;
        dvdList[1] = dvd2;
        dvdList[2] = dvd3;
        dvdList[3] = dvd4;

        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.printCart();
    }
}
