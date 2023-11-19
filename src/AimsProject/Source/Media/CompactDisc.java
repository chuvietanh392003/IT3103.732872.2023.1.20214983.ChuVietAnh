/**
 * Author: Chu Việt Anh
 */
package Media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(String artist, List<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}

	public boolean addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track already exist!");
			return false;
		}
		else {
			tracks.add(track);
			return true;
		}
	}
	
	public boolean removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			return true;
		}
		else {
			System.out.println("Track doesn't exist!");
			return false;
		}
	}
	
	public int getLength() {
        int length = 0;
        for (Track track : tracks)
            length += track.getLength();
        return length;
	}
	
	public String getArtist() {
		return artist;
	}

	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());	
		for (Track track : tracks)
            track.play();
		
	}
}
