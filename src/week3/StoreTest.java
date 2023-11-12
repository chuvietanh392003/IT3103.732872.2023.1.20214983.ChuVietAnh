/**
 * Author: Chu Việt Anh
 */
package week3;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store with a maximum capacity of 10 DVDs
        Store store = new Store(10);

        // Create some DVDs to add to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 22.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the current state of the store
        store.displayStore();

        // Remove a DVD from the store
        store.removeDVD(dvd2);

        // Display the updated store
        store.displayStore();
    }
}
