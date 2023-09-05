package day05;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String 클랙스 = 문자열을 다루는 클랙스
		 * String str=new String();
		 * String str="가나다"; //일반자료형 처럼 이용이 가능
		 * index번지는 0부터 시작
		 * */
		String str="hello world";
		System.out.println(str);
		
		//charAt(index) : index 번지에 있는 한 글자를 변환
		System.out.println("--charAt--");
		System.out.println(str.charAt(1));
		
		//length : 문자열의 전체 길이(공백을 포함한 길이)
		System.out.println("--length--");
		System.out.println(str.length());
		
		//compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("--campareTo--");
		System.out.println("b". compareTo("a"));
		
		//concat(str) : 이어붙이기(+연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분함)
		// == 주소가 같은지 확인 / equals 내용이 같은지 확인
		
		System.out.println("--equals--");
		System.out.println("abc".equals("abc"));
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능/ 찾는 문자가 없으면 -1리턴
		
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("f"));
		String email="sdlfkjsldfj@naver.co.kr";
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf(".")); //가장 처음 .을 찾아줌 : 값을 앞에서부터 찾음
		System.out.println(email.lastIndexOf(".")); //가장 마지막 .을 찾아줌 : 값을 뒤에서부터 찾음
		
		//substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0,5));
		//시작번지는 포함, 끝번지는 포함하지 않음
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		//trim : 불필요한 공백 제거
		System.out.println("--tirm--");
		System.out.println("hello             ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("hello world".replace("world","java"));
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1="dog,cat,tiger";
		String[] str2=str1.split(",");
		for(String s : str2) {
			System.out.println(s);
		}
		
		
		// paraseInt : 문자를 숫자로 변환
		String num1="1";
		String num2="2";
		System.out.println(num1+num2);
		
		int num3=Integer.parseInt(num1);
		int num4=Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		



		
				
	}

}
