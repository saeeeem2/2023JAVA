package lottoprogram;


public class LottoE extends Lotto {
	/*LottoE 클래스 : 기존 로또 클래스를 상속받아 처리
       =>당첨번호를 저장하는 배열(기존 배열 6자리) int bonus만 처리 */
	
	//당첨번호를 생성하는 클래스 Lotto를 상속받아서 보너스 번호만을 처리
	
	//멤버변수 
	private int bonus; //보너스 번호

	
	//메서드
	//오버라이딩 메서드 : randomLotto(), init()에서 보너스 번호도 초기화, toString, insertNumbers
	@Override
	protected void randomLotto() {
		// TODO Auto-generated method stub
		super.randomLotto(); //기존의 메서드 numbers의 배열은 이미 채워진 상황
		while(true) {
			int r=random();
			if(!isContain(r)) {
				bonus=r;
				break;
			}
		}
	}
	
	@Override
	protected void init() {
		// numbers배열재생성
		super.init();
		bonus=0; //보너스 번호 초기화
		
	}
	
	@Override
	public String toString() {
		// 보너스 번호 추가
		return super.toString()+"["+bonus+"]";
	}
	
	@Override
	protected void insertNumber(int[] arr) { 
		// 수동으로 7자리의 배열이 들어온다면
		super.insertNumber(arr); //6자리 배열 생성은 이미 완료
		//현재는 보너스 번호 마지막 한자리가 남아있는 상황
		//남아있는 자리에 보너스 번호 추가
		bonus=arr[arr.length-1];
	}
	
	public void insertNumbers(int[] arr,int bonus) {
		super.insertNumber(arr);
		//보너스 번호만 추가
		this.bonus=bonus;
	}

	//getter
	public int getBonus() {
		return bonus;
	}
		
}
