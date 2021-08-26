package file;

import java.io.Serializable;

public class Test05 implements Serializable {
	//데이터를 직렬화 해주기 위해서 꼭 필요한 상속

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("name : " + name);
	}
}
