package Quiz02_teacher_ex;

import java.io.Serializable;

public class StudentClass  implements Serializable {

	/*
	 학생 정보를 저장하는 변수 및 setter/getter 생성
	 */
	
	private String stNum;
	private String name;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
