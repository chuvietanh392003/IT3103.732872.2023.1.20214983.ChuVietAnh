/**
 * Author: Chu Việt Anh
 */
package Media;

public class Disc extends Media {

    private int length;
    private String director;

    public Disc() {
        super(); 
    }
    
    public Disc(String title) {
    	super(title);
    }
    
    public Disc(String title, String category, float cost, String director) {
        super(title,category,cost);
        this.director = director;
    }
    
    public Disc(int id, String title, String category, float cost, String director) {
        super(id,title,category,cost);
        this.director = director;
    }

    public Disc(int id, String title, String category, float cost, String director, int length) {
	    this(id, title, category, cost, director);
    	this.length = length;
    }
  
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}
    
    

}

