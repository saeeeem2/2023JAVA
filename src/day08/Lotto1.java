package day08;

public class Lotto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 로또번호 랜덤 생성(1~45까지 랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 (배열의 갯수가 6개) => 사용자 번호
		 * 당첨번호 => 1~45까지 7개 (배열의 갯수가 7개) => 기본 6자리 + 보너스 번호 1자리
		 * 로또번호 (6자리)      1 2 3 4 5 6
		 * 당첨번호 (6자리+1자리) 1 2 3 4 5 6 [7] => 보너스 번호는 []표시
		 * 로또 등수 확인
		 * 1등 : 6자리 일치
		 * 2등 : 5자리 일치+보너스번호 일치
		 * 3등 : 5자리 일치
		 * 4등 : 4자리 일치
		 * 5등 : 3자리 일치
		 * 낙첨
		 * 로또번호와 당첨번호는 랜덤생성하되 중복 값이 제거되어야 함
		 * */
		
		int lotto[]=new int[7]; //당첨번호
		int user[]=new int[6];
		randomArray(user);
		randomArray(lotto);
		System.out.println("사용자 번호>>>");
		printArray(user);
		System.out.println("당첨 번호>>>");
		printArray(lotto);
		System.out.println("=================");
		int rank=lottoRank(lotto, user);
		if(rank==-1) {
			System.out.println("낙첨입니다!");
		} else {
			System.out.println("축하합니다!"+rank+"등 입니다!!");
		}
		

		
		
				

	}
	/* 1. 번호를 랜덤으로 생성(랜덤번호를 1개만 생성 후 리턴)
	 * 	  1~45까지 랜덤번호를 생성한 후 리턴
	 * */
	
	public static int random() {
		return (int)(Math.random()*45)+1;
	}
	/* 2. 1번의 랜덤번호를 배열에 저장하는 기능
	 * 배열을 완성 => 리턴x(void)
	 * 매개변수 => 배열(로또배열, 유저배열)*/
	
	public static void randomArray(int arr[]) {
		//중복 상관없이 채우기
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=random();
//		}
		//중복없이 채우기
//		for(int i=0; i<arr.length; i++) {
//			int r=random();
//			for(int j=0; j<=i; j++) {
//			if(arr[j]!=r) {
//				arr[i]=r;
//			} else { //이미 배열에 해당 값이 있다면
//				i--;
//			}
//		}
//	}
	int i=0;
	while(i<arr.length) {
		int r = random();
		if(!isContain(arr,r)) {
			arr[i]=r;
			i++;
		}
	}
	
		
	}
	/* 3. 배열 출력 메서드
	 * 배열을 주고, 출력*/
	public static void printArray(int arr[]) {
		if(arr.length==7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");
		}
		System.out.print("["+arr[arr.length-1]+"]");
		System.out.println();
		} else {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	/* 4. 중복체크 메서드
	 * 중복이면 true, 중복이 아니면 false
	 * 리턴타입 : boolean
	 * 매개변수 : int arr[], random값
	 * 메서드명 : isContain
	 * */
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp==random) {
				return true;
			}
		}
		return false;
	}
	/* 5. 등수를 체크하는 기능
	 * 리턴타입 : 등수 int => 등수에 해당하지 않는 경우는 -1을 리턴
	 * 매개변수 : 로또번호, 유저번호
	 * 메서드명 : lottoRank()*/
	
	public static int lottoRank(int lotto[], int user[]) {
		//lotto배열과 user배열의 개수가 다르므로 순서가 같아야 함
		if(lotto.length<=user.length) {
			return -1;
		}
		int cnt = 0; //당첨 개수 카운트
		for(int i=0; i<user.length; i++) { //lotto.length는 7번까지이므로 user.length까지만 비교해야함
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6 : return 1; //리턴을 포함한 스위치 문은 브레이크를 할 필요가 없다
		case 5 : 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3; //isContain(user, lotto[lotto.length-1])? 2:3; 삼항연산자 사용해도 됨
			}
		case 4 : return 4;
		case 3 : return 5;
			default : return -1;
		}
		
	}
	
	

}
