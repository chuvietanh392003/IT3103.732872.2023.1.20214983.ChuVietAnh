package Media;

import java.util.List;

public class Book extends Media {
    private List<String> authors;

    public Book() {
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public boolean addAuthor(String authorname) {
        if (authors.contains(authorname)) {
            System.out.println("Author already exists!");
            return false;
        } else {
            authors.add(authorname);
            System.out.println("Added successfully");
            return true;
        }
    }

    public boolean removeAuthor(String authorname) {
        if (authors.contains(authorname)) {
            authors.remove(authorname);
            return true;
        } else {
            System.out.println("Author does not exist!");
            return false;
        }
    }

    @Override
    public void printDetail() {
        System.out.println("Book details: " + getTitle() + " - " + getCost() + " - Authors: " + authors);
    }
}
