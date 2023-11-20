/**
 * Author: Chu Việt Anh
 */
package Media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc() {
    }
    
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
       this(title, category, cost, director);
       this.setLength(length);
    }
    
    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}
