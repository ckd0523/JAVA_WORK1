package ch12.sec03.exam01;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {	//타입 비교 : obj가 Member타입
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}
