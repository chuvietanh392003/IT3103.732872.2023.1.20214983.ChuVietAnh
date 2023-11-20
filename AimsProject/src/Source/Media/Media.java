/**
 * Author: Chu Việt Anh
 */
package Media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {

    }
   

    /**
     * Phương thức kiểm tra 
     *
     * @param media
     * @return
     */
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Media))
            return false;
        return this.id == ((Media) obj).id;
    }	

	public boolean isMatch(int id) {
        return this.id == id;
    }

    public boolean isMatch(String title) {
        String[] tmp = title.split(" ", 0);
        for (String x : tmp) {
            if (getTitle().toLowerCase().contains(x.toLowerCase()))
                return true;
        }
        return false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
