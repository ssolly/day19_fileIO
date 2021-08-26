package Quiz02_teacher_ex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
	/* 
	 기본 틀을 만드는 기능
	  1. 등록 2.검색...
	  1번 선택 시 studentClass 객체 생성 후 객체에 각각의 정보 저장
	   - fileClass의 파일로 저장하는 기능을 호출하여 입력받은 SutdentClass 객체를 저장
	  2번 선택 시 fileClass의 파일에서 얻어오는 기능을 통해 객체를 받아와서 출력하는 기능
	 */
		FileClass fc = new FileClass();
		Scanner input = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("== 학생관리 프로그램 ==");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 프로그램 종료");
			System.out.print(">> ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1 :
				StudentClass sc = new StudentClass();
				System.out.print("학번 입력 : ");
				sc.setStNum(input.next());
				System.out.print("이름 입력 : ");
				sc.setName(input.next());
				fc.outFile(sc);
				break;
			case 2 :
				break;
			case 3 :
				return;
			}
		}
	}
}
