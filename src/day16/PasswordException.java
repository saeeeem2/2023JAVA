package day16;

public class PasswordException extends IllegalArgumentException { //exception생성시 IllegalArgumentException를 상속받아야함
	
	public PasswordException(String message) {
		super(message);
	}

}
