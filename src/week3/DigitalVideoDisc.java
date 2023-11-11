/**
 * Author: Chu Việt Anh
 */
package week3;

public class DigitalVideoDisc {
	private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

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

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
    	super();
		
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
    	super();
        this.title = title;
        this.director = director;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
    	super();
        this.director = director;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.length = length;
    }

    /**
     * Phương thức so sánh hai đối tượng
     *
     * @param disc
     * @return
     */
    public boolean equals(DigitalVideoDisc disc) {
        return this.getTitle().equals(disc.getTitle());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }
	
}
