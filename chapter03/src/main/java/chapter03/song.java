package chapter03;

public class song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public song() {
		
	}
	
	public song(String title,String artist) {
//		this.title = title;
//		this.artist=artist;
//		this.album="";
//		this.composer="";
//		this.year=0;
//		this.track=0;
		//코드 중복 제거
		this(title,artist,"","",0,0);
	}
	
	
	public song(String title,String artist,String album,String composer,int year,int track) {
		this.title = title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;			
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
				artist + " " + title+ "(" + album + "," + year + "," + track + "번 트랙 " + composer + " 작곡" + ")");

	}
	
	
	
	
	
}
