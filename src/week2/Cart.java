/**
 * @author Chu Việt Anh 
 */
package week2;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int numberOfItems;

    // Phương thức trả về số lượng đĩa DVD trong giỏ hàng
    public int numberOfItems() {
        return numberOfItems;
    }

    // Phương thức thêm một đĩa DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.numberOfItems == 0) {
            this.itemsOrdered[0] = disc;
            this.numberOfItems++;
            System.out.println("Them thanh cong");
        } else if (this.numberOfItems >= MAX_NUMBER_ORDERED) {
            System.out.println("Khong the them nua, gio hang da day!");
        } else {
            for (int i = 0; i < this.numberOfItems; i++) {
                if (this.itemsOrdered[i].equals(disc)) {
                    System.out.println("Khong the them vi dia da co trong gio hang!");
                    break;
                }
                if (i == this.numberOfItems - 1) {
                    this.itemsOrdered[this.numberOfItems] = disc;
                    this.numberOfItems++;
                    System.out.println("Them thanh cong");
                    break;
                }
            }
        }
    }

    // Phương thức xóa một đĩa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.numberOfItems == 0) {
            System.out.println("Gio hang trong!");
        } else {
            for (int i = 0; i < this.numberOfItems; i++) {
                if (this.itemsOrdered[i].equals(disc)) {
                    for (int j = i; j < this.numberOfItems - 1; j++) {
                        this.itemsOrdered[j] = this.itemsOrdered[j + 1];
                    }
                    this.numberOfItems--;
                    System.out.println("Xoa thanh cong");
                    return; // Khi xoa xong, thoat khoi vong lap
                }
            }
            System.out.println("Khong the xoa vi dia khong co trong gio hang");
        }
    }

    // Phương thức tính tổng giá trị của giỏ hàng
    public float totalCost() {
        float totalCost = 0f;
        for (int i = 0; i < this.numberOfItems; i++) {
            totalCost += this.itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
