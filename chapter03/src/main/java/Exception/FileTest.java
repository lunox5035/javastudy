package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("hello.txt");
			
			int data=fis.read();
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			System.out.println("REEOE: " + e);
		} catch (IOException e) {
			System.out.println("REEOE: " + e);
		}finally {
			try {
				if(fis !=null) {
					fis.close();
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


/*
FileInputStream fis= new FileInputStream("hello.txt");
int data=fis.read();


*/