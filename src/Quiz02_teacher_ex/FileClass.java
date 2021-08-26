package Quiz02_teacher_ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileClass {

	/*
	변수 : 파일 입 출력 관련 변수 생성
	생성자 : 위의 각 변수들 초기화
	메소드 : 파일 출력 기능, 파일에서 얻어오는 기능
	*/
	
	public File filePath;
	public FileOutputStream fos;
	public BufferedOutputStream bos;
	public ObjectOutputStream oos;
	public FileInputStream fis;
	public BufferedInputStream bis;
	public ObjectInputStream ois;
	
	public FileClass() {
		filePath = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/teacher/");
	}
	
	public void outFile(StudentClass sc) {
		try {
			fos = new FileOutputStream(filePath+sc.getStNum()+".txt");
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(sc);
			System.out.println(filePath.isFile());
			System.out.println("저장완료");
			
		} catch (Exception e) {
			
		}
	}
}
