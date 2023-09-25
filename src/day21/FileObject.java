package day21;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		/* 파일이 가지고 있는 정보 출력
		 * */
		File f =new File("D:\\saemi\\java_workspace\\java_project\\out.txt");
		System.out.println(f.getName()); //경로를 제외한 이름
		System.out.println(f.getPath()); //경로+이름
		System.out.println(f.getParent()); //경로
		System.out.println(File.separator); //파일 구분자(파일 구분자를 확인하기 위해 많이 사용함)
		
		//파일 명과 경로가 String 형태로 들어온다면 구분해줘야함
		String fstr=f.toString();
		System.out.println(fstr);
		//fstr에서 드라이브만 추출
		System.out.println(fstr.substring(0,fstr.indexOf(File.separator)));
		//파일명만 추출
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1));
		//파일경로만 추출
		System.out.println(fstr.substring(fstr.indexOf(File.separator),fstr.lastIndexOf(File.separator)+1));
		
		

	}

}
