package lottoprogram;

import java.util.Scanner;

public interface LottoProgram {
	
	void createLotto(Scanner scan);//수동로또번호 입력
	void createLottoAuto();
	void insertLottoAuto();//당첨번호
	void checkLotto(); //가장 최신회차 당첨번호와 사용자 번호를 체크 , 등수체크
	void printLotto();//당첨번호 리스트 출력
	
	

}
