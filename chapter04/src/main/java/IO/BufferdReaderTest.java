package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) {
		
		
		BufferedReader br=null;
		try {
			//기반스트림
			FileReader fr=new FileReader("./src/main/java/IO/BufferdReaderTest.java");

			//보조스트림/
			br = new BufferedReader(fr);
			
			String line=null;
			while((line = br.readLine()) != null) { 
				
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("Can't open:"+e);
		}catch (IOException e) {
			System.out.println("error:"+e);
		}finally {
			
			try {
				if(br!=null) {
				br.close();
				}
			} catch (IOException e) {
				System.out.println("error:"+e);
			}
		}

	}

}
