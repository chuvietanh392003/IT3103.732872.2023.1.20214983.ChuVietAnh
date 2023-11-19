/**
 * Author: Chu Việt Anh
 */
package Store;

import Media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;
    private int maxSize = 2 ; //số lượng tối đa của cửa hàng 

    public Store() {
        itemsInStore = new ArrayList<>(maxSize);
    }

    public void addMedia(Media media) {
        if (itemsInStore.size() < maxSize) {
            itemsInStore.add(media);
            System.out.println("Thêm thành công: " + media.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeMedia(Media media) {
        boolean check = false; // biến check để kiểm tra Media có trong store hay không
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).equals(media)) {
                check = true;
                itemsInStore.remove(i);
                System.out.println("Media removed from the store: " + media.getTitle());
                break;
            }
        }

        if (!check) {
            System.out.println("Media not found in the store: " + media.getTitle());
        }
    }

    public void displayStore() {
        System.out.println("********** STORE **********");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************");
    }
}
