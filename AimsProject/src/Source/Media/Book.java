/**
 * Author: Chu Việt Anh
 */
package Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
     
    public boolean addAuthor(String authorname) {
    	if(authors.contains(authorname)){
    		System.out.println("author 've already exist!");
    		return false;
    	}
    	else {
    		authors.add(authorname);
    		System.out.println("them thanh cong");
    		return true;
    	}
    }
    
    public boolean reMoveAuthor(String authorname) {
    	if(authors.contains(authorname)) {
    		authors.remove(authorname);
    		return true;
    	}
    	else {
    		System.out.println("author haven't exist!");
    		return false;
    	}
    }
}   

	