package lottoprogram;

import java.util.Scanner;

public class LottoManager implements LottoProgram{
	/* LottoManager : 1~6까지 메뉴의 메서드 처리
	 * 1. 로또 번호 생성(수동) : 사용자가 직접 입력
		=>createLotto(scan)
	   2. 로또 번호 생성(자동) : random(6자리)
		=>createLottoAuto()
	   3. 당첨번호 생성(자동) :  random(7자리) => 배열에 저장
		=>insertLottoAuto()
	   4. 당첨번호 내역 확인 : 1개만 확인 => 등수 체크
		- 현재 회차 당첨번호가 가장 마지막으로 출력(상단에)
		=> checkLotto()
 	   5. 당첨번호 리스트 확인 : 전부(마지막 당첨번호가 가장 위에 출력)
		=>printLotto()
	   6. 종료 */
	
	//멤버변수 선언
	LottoE lotto[]=new LottoE[5]; //당첨번호 배열 리스트
	Lotto user=new Lotto();//사용자 번호
	int cnt=0; //당첨 배열의 index 역할
	
	
	public void printMenu() {
		System.out.println("로또 프로그램");
		System.out.println("1.로또번호생성(수동)");
		System.out.println("2.로또번호생성(자동)");
		System.out.println("3.당첨번호생성(자동)");
		System.out.println("4.당첨확인(마지막회차번호)");
		System.out.println("5.당첨번호확인(전체 회차)");
		System.out.println("6.종료");
		System.out.println("menu>");
		
	}

	@Override
	public void createLotto(Scanner scan) {
		// 로또 수동입력 메뉴
		System.out.println("로또 번호를 입력해주세요.(중복x, 숫자 1~45까지 6개)");
		int []tmp =new int[6]; //입력받을 임시배열변수
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=scan.nextInt();
		}
		//중복체크 후 
		if(isDuplicated(tmp)) {
			System.out.println("오류발생");
		} else {
			user.insertNumber(tmp);
			printLotto("로또번호 : "+user);
			//System.out.println(user);//메서드와 같은 효과
		}
		
	}
	
	public void printLotto(String str) {
		System.out.println("------------------");
		System.out.println(str);
	}
	
	
	//수동으로 입력한 배열안에 같은 수가 포함되어 있는지 체크
	public boolean isDuplicated(int []arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		//범위 체크
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0||arr[i]>45) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void createLottoAuto() {
		// 자동번호 생성
		user.randomLotto();
		printLotto("로또번호 : "+user);		
	}
	
	public void insertLotto(Scanner scan) {
		//당첨번호 수동 입력
		System.out.println("로또 번호를 입력해주세요.(중복x, 숫자 1~45까지 7개, 보너스 번호는 가장 마지막에 입력)");
		int tmp[]=new int[7];
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=scan.nextInt();
		}
		//중복 범위 이탈 케이스 발생
		if(isDuplicated(tmp)) {
			System.out.println("오류발생");
		}else {
			LottoE tmpLotto=new LottoE();
			tmpLotto.insertNumber(tmp);
			
			lotto[cnt]=tmpLotto;
			cnt++;
			System.out.println("당첨번호 : "+tmpLotto);
		}
	}

	@Override
	public void insertLottoAuto() {
		// 당첨번호 자동입력
		if(lotto.length==cnt) {
			LottoE[] arr=new LottoE[lotto.length+5];
			System.arraycopy(lotto, 0, arr, 0, lotto.length);
			lotto=arr;
		}
		LottoE tmp=new LottoE();
		tmp.randomLotto();
		lotto[cnt]=tmp;
		cnt++;
		printLotto("당첨번호 : "+tmp);
	}

	@Override
	public void checkLotto() {
		// 당첨확인 메서드
		if(user.isContain(0)) { //로또번호를 생성하지 않은 경우
			System.out.println("로또 사용자 번호를 입력해주세요.");
			return;			
		} 
		//로또 당첨 번호가 없을 경우
		if(cnt==0) {
			System.out.println("당첨번호가 없습니다.");
			return;
		}
		
		//1. 일치하는 개수 count 변수 선언
		int count=0;
		
		
		//2. 마지막에 저장된 당첨번호 객체 가져오기
		LottoE tmp=lotto[cnt-1];
		
		//3. for문으로 일치 개수 확인
		for(int i=0; i<user.getNumbers().length; i++) {
			//최신 당첨번호의 i번지 1개의 값을 num로 저장
			int num=tmp.getNumbers()[i]; //당첨번호 첫 번째 값
			//user배열에 num이 있는지 확인
			if(user.isContain(num)) {
				count++;
			}				
		}
		//4. rank확인 => 출력
		int rank=-1;
		switch(count) {
		case 6 : rank=1; break;
		case 5 :
			if(user.isContain(tmp.getBonus())) {
				rank=2;
			} else {
				rank=3;
			}
			break;
		case 4 : rank=4; break;
		case 3 : rank=5; break;
		default : break;
		}
		if(rank!=-1) {
			System.out.println(count+"개수 일치");
			System.out.println(rank+"등 당첨~~~~~~~~~~!");
		}else {
			System.out.println(count+"개수 일치");
			System.out.println("꽝");
		}
	}

	@Override
	public void printLotto() {
		// 전체 당첨 리스트
		//for문이용하여 로또 배열 출력
		System.out.println("************");
		System.out.println("역대 당첨번호 리스트");
		//for(int i=cnt-1; i>=0; i++) { //역순으로 찍기
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"회차 당첨번호 : "+lotto[i]);
		}
		
	}
	
}
