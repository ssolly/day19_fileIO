package Quiz02_teacher_copy;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		FileClass fc = new FileClass();
		ArrayList<StudentClass> arr = new ArrayList<StudentClass>();
		Scanner input = new Scanner(System.in);
		
		String stNum, name, score;
		int kor, eng, math; 
		double avg;
		int choice;
		boolean bl;
		
		while(true) {
			System.out.println("=== 학생 관리 프로그램 ===");
			System.out.println(" 1. 학생 검색");
			System.out.println(" 2. 학생 등록");
			System.out.println(" 3. 프로그램 종료");
			System.out.print(">> ");
			choice = input.nextInt();
			
			StudentClass sc = new StudentClass();
			
			switch(choice) {
			case 1 :
				System.out.print("학생 학번 입력 : ");
				stNum = input.next();
				bl = sc.searchSt(arr, stNum);
				sc = fc.fileRead(stNum);
				if(bl==true || sc!=null) {
					System.out.println("학번 : " + sc.getStNum());
					System.out.println("이름 : " + sc.getName());
					System.out.println("국어 : " + sc.getKor());
					System.out.println("영어 : " + sc.getEng());
					System.out.println("수학 : " + sc.getMath());
					System.out.println("등급 : " + sc.getScore());
				} else {
					System.out.println("존재하는 학번이 아닙니다");
				}
				break;
			case 2 :
				bl = true;
				while(bl) {
					System.out.print("학생 학번 입력 : ");
					stNum = input.next();
					sc.setStNum(stNum);
					bl = sc.checkNum(arr);
					bl = fc.checkFile(stNum);
					if (bl == true) {
						System.out.println("존재하는 학번입니다. \n 다시 입력해주세요");
					}
				}
				System.out.print("이름 입력 : ");
				name = input.next();
				System.out.print("국어 점수 입력 : ");
				kor = input.nextInt();
				System.out.print("영어 점수 입력 : ");
				eng = input.nextInt();
				System.out.print("수학 점수 입력 : ");
				math = input.nextInt();
				
				sc.setName(name);
				sc.setKor(kor);
				sc.setEng(eng);
				sc.setMath(math);
				
				avg = (kor+eng+math)/3.0;
				if (avg >= 90) {
					sc.setScore("A");
				} else if (avg >= 80) {
					sc.setScore("B");
				} else if (avg >= 70) {
					sc.setScore("C");
				} else if (avg>=60) {
					sc.setScore("D");
				} else {
					sc.setScore("F");
				}
				arr.add(sc);
				fc.fileOut(sc);
				System.out.println("학생 등록 완료!");
				break;
			case 3 :
				return;
			}
		}
	}
}
