package file;

import java.io.Serializable;
import java.util.ArrayList;

public class Quiz02_Object implements Serializable {

	private String name, stNum;
	private int kor,eng,math;
	private double avg;
	private char grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public boolean checkStNum(ArrayList<Quiz02_Object> arr) {
		for (Quiz02_Object qo : arr) {
			if(qo.getStNum().equals(this.stNum)==true) {
				return true;
			}
		}
		return false;
	}

//	public boolean searchSt(ArrayList<Quiz02_Object> arr, String stNum) {
//		for (Quiz02_Object qo : arr) {
//			if (m.getStNum().equals(stNum) == true) {
//				setStNum(stNum);
//				setStName(m.getStName());
//				setKor(m.getKor());
//				setEng(m.getEng());
//				setMath(m.getMath());
//				setStJumsu(m.getStJumsu());
//				return true;
//			}
//		}
//		return false;
//	}
}
