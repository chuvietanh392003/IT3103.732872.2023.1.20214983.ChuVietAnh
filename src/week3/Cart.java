/**
 * Author: Chu Việt Anh
 */
package week3;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int numberOfItems;
    private static int nextId = 1; // Khai báo nextId ở đây để nó có thể được sử dụng trong class

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

        disc.setId(nextId++);
        itemsOrdered[numberOfItems] = disc;
        numberOfItems++;
        System.out.println("Thêm thành công: " + disc.getTitle() + " (ID: " + disc.getId() + ")");
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

        dvd1.setId(nextId++);
        dvd2.setId(nextId++);

        itemsOrdered[numberOfItems] = dvd1;
        itemsOrdered[numberOfItems + 1] = dvd2;
        numberOfItems += 2;
        System.out.println("Thêm thành công: " + dvd1.getTitle() + " (ID: " + dvd1.getId() + ") và " +
                dvd2.getTitle() + " (ID: " + dvd2.getId() + ")");
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

    public void printCart() {
        System.out.println("***********************CART***********************");

        if (numberOfItems != 0) {
            for (int i = 0; i < numberOfItems; ++i) {
                System.out.println((i + 1) + ". DVD " + itemsOrdered[i].toString());
            }
        } else {
            System.out.println("Cart is empty! Please add DVD to Cart!");
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchCart(int id){
    	int check = 0; // kiem tra xem dvd co trong cart hay ko
    	for(int i = 0; i < numberOfItems; i++) {
    		if(itemsOrdered[i].isMatch(id)) {
    			check = 1;
    			System.out.println(itemsOrdered[i].toString());
    			break;
    		}
    	}
    	if(check == 0) {
    		System.out.println("khong tim thay!");
    	}
    }
    public void searchCart(String title){
    	int check = 0; // kiem tra xem dvd co trong cart hay ko
    	for(int i = 0; i < numberOfItems; i++) {
    		if(itemsOrdered[i].isMatch(title)) {
    			check = 1;
    			System.out.println(itemsOrdered[i].toString());
    			break;
    		}
    	}
    	if(check == 0) {
    		System.out.println("khong tim thay!");
    	}
    }
    
}
