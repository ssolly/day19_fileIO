package Quiz02_teacher_copy;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentClass implements Serializable {

	private String stNum, name, score;
	private int kor, eng, math;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public boolean checkNum(ArrayList<StudentClass> arr) {
		for(StudentClass sc : arr) {
			if (sc.getStNum().equals(this.stNum)==true) {
				return true;
			}
		}
		return false;
	}
	
	public boolean searchSt(ArrayList<StudentClass> arr, String stNum) {
		for(StudentClass sc : arr) {
			if(sc.getStNum().equals(stNum) == true) {
				setStNum(stNum);
				setName(sc.getName());
				setKor(sc.getKor());
				setEng(sc.getEng());
				setMath(sc.getMath());
				setScore(sc.getScore());
				return true;
			}
		}
		return false;
	}
}
