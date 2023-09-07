package day16;

public class 사용자지정Exception {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없음(throw처리)
		 * - 비밀번호의 길이는 5자이상
		 * - 비밀번호는 문자로만 이루어지면 안 됨(문자+숫자+특수문자)
		 * 
		 * */
		
		String password="agdddd";
		
		PasswordTest pt=new PasswordTest();
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if(password.length()<5) {
			throw new PasswordException("비밀번호의 길이는 5자리 이상이어야 합니다.");
		} else if(password.matches("[a-zA-Z0-9]+")) {
			throw new PasswordException("비밀번호는 문자,숫자,특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}
	
	
}
