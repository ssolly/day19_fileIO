package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Quiz02_Main {

	public static void main(String[] args) throws Exception {
		
		Quiz02_Method qm = new Quiz02_Method();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("== 학생관리 프로그램 ==");
			System.out.println("1. 학생 검색");
			System.out.println("2. 학생 등록");
			System.out.println("3. 프로그램 종료");
			System.out.print(">> ");
			int choice = sc.nextInt();

			String stNum,name;
			int kor,eng,math;
			
			switch(choice) {
			case 1 :
				System.out.println("-- 학생 검색 --");
				System.out.print("학번 입력 : ");
				stNum = sc.next();
				
				qm.inputFile(stNum);
				
				break;
			case 2 :
				System.out.println("-- 학생 등록 --");
				System.out.print("학번 입력 : ");
				stNum=sc.next();
				
				qm.makeFilepath(stNum);
				qm.outputFile();
				
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("국어 점수 입력 : ");
				kor = sc.nextInt();
				System.out.print("영어 점수 입력 : ");		
				eng = sc.nextInt();
				System.out.print("수학 점수 입력 : ");
				math = sc.nextInt();
					
				qm.registerInfo(stNum, name, kor, eng, math);
				qm.outputFileEnd(qm.qo);
				break;
				
			case 3 :
				return;
			}
		}
		
	}
	
	
}


	
	