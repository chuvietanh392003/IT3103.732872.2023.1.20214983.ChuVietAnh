/**
 * Author: Chu Việt Anh
 */
package Store;

import Disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[];
    private int numberOfItems;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        numberOfItems = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfItems < itemsInStore.length) {
            itemsInStore[numberOfItems] = dvd;
            numberOfItems++;
            System.out.println("Thêm thành công: " + dvd.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean check = false; // biến check để kiểm tra DVD có trong store hay k
        for (int i = 0; i < numberOfItems; i++) {
            if (itemsInStore[i].equals(dvd)) {
                check = true;
                for (int j = i; j < numberOfItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                numberOfItems--;
                System.out.println("DVD removed from the store: " + dvd.getTitle());
                break;
            }
        }

        if (!check) {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }

    public void displayStore() {
        System.out.println("********** STORE **********");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***************************");
    }
}
