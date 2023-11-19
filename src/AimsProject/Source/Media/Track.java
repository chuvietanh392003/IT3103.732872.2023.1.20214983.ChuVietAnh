/**
 * Author: Chu Việt Anh
 */
package Media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
	public boolean equals(Object obj) {
        if (!(obj instanceof Track))
            return false;
        return this.title.equalsIgnoreCase(((Track) obj).title) && this.length == ((Track) obj).length;
    }
	
}

