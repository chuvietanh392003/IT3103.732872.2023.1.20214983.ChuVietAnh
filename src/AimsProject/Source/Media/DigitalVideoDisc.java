/**
 * Author: Chu Việt Anh
 */
package Media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
    }
    
    public DigitalVideoDisc(String title, String category, int length, float cost) {
        super();
        this.setCategory(category);
        this.setTitle(title);
        this.setLength(length);
        this.setCost(cost);
    }
    
    public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
        super();
        this.setDirector(director);
        this.setCategory(category);
        this.setTitle(title);
        this.setLength(length);
        this.setCost(cost);
    }
    
    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}
