package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Quiz02_Method {

	/*
	 * 변수 : 파일 입 출력 관련 변수 생성 생성자 : 위의 각 변수들 초기화 메소드 : 파일 출력 기능, 파일에서 얻어오는 기능
	 */

	public File filepath;
	public FileOutputStream fos;
	public BufferedOutputStream bos;
	public ObjectOutputStream oos;
	public FileInputStream fis;
	public BufferedInputStream bis;
	public ObjectInputStream ois;
	public Quiz02_Object qo;

	public void makeFilepath(String stNum) {

		filepath = new File(
				"C:/Users/최소영/Desktop/KGITBANK/" + 
		"springcloud/java/day19_fileIO_test/quiz02/" + stNum + ".txt");

	}

	public void outputFile() throws Exception {

		fos = new FileOutputStream(filepath);
		bos = new BufferedOutputStream(fos);
		oos = new ObjectOutputStream(bos);

	}

	public void outputFileEnd(Quiz02_Object obj) throws Exception {
		oos.writeObject(obj);
		oos.close();
	}

	public Quiz02_Object inputFile(String stNum) throws Exception {

		qo = null;
		makeFilepath(stNum);

		try {
		fis = new FileInputStream(filepath);
		bis = new BufferedInputStream(fis);
		ois = new ObjectInputStream(bis);

		qo = (Quiz02_Object)ois.readObject();
		// viewInfo(stNum);
		ois.close(); 
		} catch (Exception e) {
			return null;
		}
		return qo;

	}

	public void registerInfo(String stNum, String name, int kor, int eng, int math) throws Exception {

		qo = new Quiz02_Object();

		qo.setStNum(stNum);
		qo.setName(name);
		qo.setKor(kor);
		qo.setEng(eng);
		qo.setMath(math);
		double avg = (kor + eng + math) / 3.0;
		qo.setAvg(avg);

		char grade;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		qo.setGrade(grade);

	}

	void viewInfo(String stNum) {

		System.out.println("학번 : " + stNum);
		System.out.println("이름 : " + qo.getName());
		System.out.println("국어 점수 : " + qo.getKor());
		System.out.println("영어 점수 : " + qo.getEng());
		System.out.println("수학 점수 : " + qo.getMath());
		System.out.println("평균 : " + qo.getAvg());
		System.out.println("점수 총합 평균 등급 : " + qo.getGrade());
	}

}
