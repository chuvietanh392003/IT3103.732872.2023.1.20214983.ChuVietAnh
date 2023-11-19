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
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", 87, 19.95f);
        Media media2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 97, 24.95f);
        Media media3 = new DigitalVideoDisc("My Destiny", "Love", 97, 24.85f);
        Media media4 = new DigitalVideoDisc("Aladin", "Animation", 92, 18.95f);

        // Add Media to the array
        mediaList[0] = media1;
        mediaList[1] = media2;
        mediaList[2] = media3;
        mediaList[3] = media4;

        anOrder.addMedia(mediaList);
        anOrder.printCart();

        anOrder.searchCart("M");
        anOrder.searchCart(1);
    }
}
