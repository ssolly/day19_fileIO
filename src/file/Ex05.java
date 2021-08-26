package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		ObjectOutputStream oos = new ObjectOutputStream(bos); //객체를 저장할 때 필요한 보조 스트림
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = input.next();
		
		Test05 t = new Test05();
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
	}
}
