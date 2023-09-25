package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader를 통하여 out.txt파일을 map에 저장하고, 합계와 총 인원 수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String형태로 읽어옴
		 * 계산을 위해서는 int자료형으로 변환 필요
		 * Integer.parseInt(값) : String => int로 형변환*/
		
	      HashMap<String,Integer> map=new HashMap<>();
	      BufferedReader br=new BufferedReader(new FileReader("out.txt"));
	            
	      while(true) {
	         String line=br.readLine(); //홍길동 89
	         if(line==null) {
	        	 break;
	         }
	         //substring(처음은 포함, 마지막은 미포함)
	         String name = line.substring(0,line.indexOf(" "));
	         int score=Integer.parseInt(line.substring(line.indexOf(" ")+1)); //String이므로 형변환 필요
	         map.put(name, score);
	         //map.put(line.substring(0,line.indexOf(" ")),Integer.parseInt(line.substring(line.indexOf(" ")+1))); 
	      }
	      br.close();
	      int sum=0;
	      for(String key : map.keySet()) {
	    	  System.out.println(key+":"+map.get(key));
	    	  sum+=map.get(key);
	      }
//	      for(Integer tmp : map.values()) {
//	     	 sum=sum+tmp;
//	      }
	      System.out.println("합계 : "+sum);
	      System.out.println("총 인원 수 : "+map.size());
	   }

	}
