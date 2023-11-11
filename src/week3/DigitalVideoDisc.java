/**
 * @author Chu Việt Anh 
 */
package week3;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
	private int id;
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
	public int getId() {
		return id;
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
	public DigitalVideoDisc(String director, String category, String title, float cost){
		super();
		this.title = title;
		this.director = director;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc (String title, String director, String category, int length, float cost) {
		super();
		this.director = director;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.length = length;
	}
	
	
	/***
	 * Phuong thuc so sanh hai doi tuong
	 * 
	 * @param disc
	 * @return
	 */
	public boolean equals(DigitalVideoDisc disc) {
		return this.getTitle() == disc.getTitle();
	}
}
