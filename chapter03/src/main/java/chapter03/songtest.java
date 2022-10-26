package chapter03;

public class songtest {
	public static void main(String[] args) {
		song song = new song();
		song.setTitle("좋은날 ");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수 ");
		song.setYear(2010);
		song.setTrack(3);
		
		
		song.show();
		
		song song2=new song("좋은날","아이유","Real","이민수",2010,3);
		
		song2.show();
		
		song song3=new song("사건의 지평선","윤하");
		
		song3.show();
		
	}
	
	
	
}
