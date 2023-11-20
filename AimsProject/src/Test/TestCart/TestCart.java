/**
 * Author: Chu Việt Anh
 */
package TestCart;

import Cart.Cart;
import Media.DigitalVideoDisc;
import Media.Media;

public class TestCart {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new Media objects and add them to the cart
        // Create an array to store Media information
        Media[] mediaList = new Media[4];

        // Create Media
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, "John Director", 87);
        Media media2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, "Alice Director", 97);
        Media media3 = new DigitalVideoDisc("My Destiny", "Love", 24.85f, "Bob Director", 97);
        Media media4 = new DigitalVideoDisc("Aladin", "Animation", 18.95f, "Charlie Director", 92);

        // Add Media to the array
        mediaList[0] = media1;
        mediaList[1] = media2;
        mediaList[2] = media3;
        mediaList[3] = media4;
        
        

        anOrder.addMedia(mediaList);
        for(Media m : mediaList) {
        	System.out.println(m.toString());
        }
//        anOrder.printCart();
//
//        anOrder.searchCart("M");
//        anOrder.searchCart(1);
    }
}
