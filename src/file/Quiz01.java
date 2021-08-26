package file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:/Users/최소영/Desktop/KGITBANK"
				+ "/springcloud/java/day19_fileIO_test/abcd1234/test.txt");
		FileOutputStream fos = new FileOutputStream(filepath,true);
		
		Scanner sc = new Scanner(System.in);
		String name,age,addr;
		
		System.out.print("이름 입력 : ");
		name=sc.next()+"\n";
		fos.write(name.getBytes());
		System.out.print("나이 입력 : ");
		age = sc.next()+"\n";
		fos.write(age.getBytes());
		System.out.print("주소 입력 : ");
		addr = sc.next()+"\n";
		fos.write(addr.getBytes());
	}
	
}
