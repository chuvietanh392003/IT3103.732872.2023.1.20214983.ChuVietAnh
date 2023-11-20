/**
 * Author: Chu Việt Anh
 */
package Cart;

import java.util.ArrayList;
import java.util.Collections;

import Media.Media;
import Media.MediaComparatorByCostTitle;
import Media.MediaComparatorByTitleCost;



public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private static int nextId = 1; // nextId -> id media

    public boolean addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBER_ORDERED) {
            System.out.println("Không thể thêm nữa, giỏ hàng đã đầy!");
            return false;
        }

        if (itemsOrdered.contains(media)) {
            System.out.println("Không thể thêm vì " + media.getTitle() + " đã có trong giỏ hàng!");
            return false;
        }

        media.setId(nextId++);
        itemsOrdered.add(media);
        System.out.println("Thêm thành công: " + media.getTitle() + " (ID: " + media.getId() + ")");
        return true;
    }

    public boolean addMedia(Media... mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
        return true;
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
    
    public void displayCart() {
		if(itemsOrdered.size()!=0) {
			int i = 0;
			for(Media x: itemsOrdered) {
				System.out.printf("%d. ", ++i);
				x.printDetail();
			}
		}
		else {
			System.out.println("Cart is empty!");
		}
		
		System.out.println("Total cost: " + totalCost() + "\n\n");
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

    public Media searchCart(int id) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(id)) {
                return media;
            }
        }
        System.out.println("Không tìm thấy!");
        return null; // Trả về null nếu không tìm thấy
    }

    public Media searchCart(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Không tìm thấy!");
        return null; // Trả về null nếu không tìm thấy
    }
    public void sortCartByTitle() {
        Collections.sort(itemsOrdered, new MediaComparatorByTitleCost());
        System.out.println("Giỏ hàng đã được sắp xếp theo tiêu đề.");
    }

    public void sortCartByCost() {
        Collections.sort(itemsOrdered, new MediaComparatorByCostTitle());
        System.out.println("Giỏ hàng đã được sắp xếp theo giá.");
    }

    
    
}
