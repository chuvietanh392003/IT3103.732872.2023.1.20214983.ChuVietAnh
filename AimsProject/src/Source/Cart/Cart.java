/**
 * Author: Chu Việt Anh
 */
package Cart;

import java.util.ArrayList;

import Media.Media;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nextId = 1; // nextId -> id media

    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBER_ORDERED) {
            System.out.println("Không thể thêm nữa, giỏ hàng đã đầy!");
            return;
        }

        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.contains(media)) {
                System.out.println("Không thể thêm vì " + media.getTitle() + " đã có trong giỏ hàng!");
                return;
            }
        }

        media.setId(nextId++);
        itemsOrdered.add(media);
        System.out.println("Thêm thành công: " + media.getTitle() + " (ID: " + media.getId() + ")");
    }

    public void addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Giỏ hàng trống!");
            return;
        }

        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không thể xóa vì media không có trong giỏ hàng");
        }
    }

    public float totalCost() {
        float totalCost = 0f;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");

        if (!itemsOrdered.isEmpty()) {
            for (int i = 0; i < itemsOrdered.size(); ++i) {
                System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
            }
        } else {
            System.out.println("Cart is empty! Please add media to Cart!");
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchCart(int id) {
        int check = 0; // kiem tra xem media co trong cart hay ko
        for (Media media : itemsOrdered) {
            if (media.isMatch(id)) {
                check = 1;
                System.out.println(media.toString());
                break;
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy!");
        }
    }

    public void searchCart(String title) {
        int check = 0; // kiem tra xem media co trong cart hay ko
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                check = 1;
                System.out.println(media.toString());
                break;
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy!");
        }
    }
}
