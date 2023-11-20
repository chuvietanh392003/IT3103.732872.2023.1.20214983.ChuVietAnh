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

    public Disc(int id, String title, String category, double cost, String director) {
        super();
        this.director = director;
    }

    public Disc(int id, String title, String category, double cost, String director, int length) {
        this(id, title, category, cost, director);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

}

