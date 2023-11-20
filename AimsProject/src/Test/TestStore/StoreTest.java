/**
 * Author: Chu Việt Anh
 */
package TestStore;

import Media.Media;
import Media.DigitalVideoDisc;
import Store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create some media to add to the store
        Media media1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f, "Christopher Nolan", 148);
        Media media2 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", 15.99f, "Frank Darabont", 142);
        Media media3 = new DigitalVideoDisc("The Dark Knight", "Action", 22.99f, "Christopher Nolan", 152);
    
        // Add media to the store
        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);

        // Display the current state of the store
        store.displayStore();

        // Remove media from the store
        store.removeMedia(media2);

        // Display the updated store
        store.displayStore();
     
    }
}
