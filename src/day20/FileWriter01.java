package day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		// FileWriter : 문자 기반 스트림
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i=1; i<=10; i++) {
				String data=i+". test입니다.\r\n"; // \r\n줄바꿈
				fw.write(data);
			}
			fw.close();
			
			//파일 추가 모드
			FileWriter fw2=new FileWriter("test.txt",true);
			for(int i=11; i<=20; i++) {
				String data=i+". test입니다.\r\n"; // \r\n줄바꿈
				fw2.write(data);
			}
			fw2.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
