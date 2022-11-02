package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br=null;
		
		try{
			File file = new File("phone.txt");
	
			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}
	
			System.out.println("=========파일정보===========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
	
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			String date = sdf.format(new Date(file.lastModified()));
//	
//			System.out.println(new Date(file.lastModified()));
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
			
			System.out.println("=========전화번호===========");
	
			//1.기반 스트임
			FileInputStream fs = new FileInputStream(file);
			
			//2.보조스트림1(byte|byte|byte=>Char)
			InputStreamReader isr=new InputStreamReader(fs,"utf-8");
		
			//3.보조스트림2(char1|char2|char3|/n=>"char1char2char3")
			br=new BufferedReader(isr);
			
			//4.처리
			String line =null;
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line,"\t");
			
				int index=0;
				while (st.hasMoreElements());
					String token=st.nextToken();
					if(index==0) {
						System.out.println(token+":");
					}else if(index==1) {
						System.out.println(token+"-");
					}else if(index==2) {
						System.out.println(token+"-");
					}else {
						System.out.println(token);
					}
					index++;
			}
					
		}catch(IOException ex){
			System.out.println("Error:"+ex);			
		}finally
	
		{
			try {
			if(br!=null){	
				br.close();
			}
			}catch(IOException e){
				e.printStackTrace();	
				}

		}
	}
}
