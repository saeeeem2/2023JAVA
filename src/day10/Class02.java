package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : name, year, color, power, speed
		 * 메서드 : 전원(시동on/시동off), 스피드 up, 스피드 down
		 * 
		 * 
		 * 
		 * */
		Car c=new Car();
		c.input("포르쉐",6060,"블랙");
		c.carPrint();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		
		

	}

}
class Car{
	private int speed;
	private String power;
	private String carName;
	private int carNum;
	private String color;
	

	public Car() {}
	public Car(int speed, String button, String carName, int carNum, String color) {
		this.speed=speed;
		this.power=power;
		this.carName=carName;
		this.carNum=carNum;
		this.color=color;
	}
	public void input(String carName, int carNum, String color) {
		this.carName=carName;
		this.carNum=carNum;
		this.color=color;
	}
	public void carPrint() {
		System.out.println("차종 : "+carName+" 자동차 번호 : "+carNum+" 색상 : "+color);
	}
	
	public int speedUp() {
			speed++;
			System.out.println("현재속도 : "+speed);
		return speed;
	}
	public int speedDown() {
			speed--;
			System.out.println("현재속도 : "+speed);
		return speed;
	}		
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getpower() {
		return power;
	}
	public void setButton(String power) {
		this.power = power;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
	

