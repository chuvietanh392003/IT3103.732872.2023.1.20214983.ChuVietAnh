/**
 * Author: Chu Việt Anh
 */
package week3;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int numberOfItems;

    public int numberOfItems() {
        return numberOfItems;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (numberOfItems >= MAX_NUMBER_ORDERED) {
            System.out.println("Không thể thêm nữa, giỏ hàng đã đầy!");
            return;
        }

        for (int i = 0; i < numberOfItems; i++) {
            if (itemsOrdered[i].equals(disc)) {
                System.out.println("Không thể thêm vì " + disc.getTitle() + " đã có trong giỏ hàng!");
                return;
            }
        }

        itemsOrdered[numberOfItems] = disc;
        numberOfItems++;
        System.out.println("Thêm thành công: " + disc.getTitle());
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (dvd1.getTitle().equals(dvd2.getTitle())) {
            System.out.println("Không thể thêm 2 đĩa giống nhau.");
            return;
        }

        if (numberOfItems + 2 > MAX_NUMBER_ORDERED) {
            System.out.println("Giỏ hàng đã đầy, không thể thêm.");
            return;
        }

        for (int i = 0; i < numberOfItems; i++) {
            if (itemsOrdered[i].equals(dvd1) || itemsOrdered[i].equals(dvd2)) {
                System.out.println("Không thể thêm vì đĩa đã có trong giỏ hàng!");
                return;
            }
        }

        itemsOrdered[numberOfItems] = dvd1;
        itemsOrdered[numberOfItems + 1] = dvd2;
        numberOfItems += 2;
        System.out.println("Thêm thành công: " + dvd1.getTitle() + " và " + dvd2.getTitle());
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (numberOfItems == 0) {
            System.out.println("Giỏ hàng trống!");
            return;
        }

        int indexToRemove = -1;

        for (int i = 0; i < numberOfItems; i++) {
            if (itemsOrdered[i].equals(disc)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < numberOfItems - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            numberOfItems--;
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không thể xóa vì đĩa không có trong giỏ hàng");
        }
    }

    public float totalCost() {
        float totalCost = 0f;
        for (int i = 0; i < numberOfItems; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
