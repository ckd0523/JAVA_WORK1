package ch20.mysql.sec11;

import lombok.Data;

@Data // Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class User {
// select문의 결과 한줄을 담기 객체 생성
	
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
	
}
