package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);  //보조스트림
		DataOutputStream dos = new DataOutputStream(bos); //보조스트림의 보조스트림
		
		dos.writeUTF("홍길동");	//문자열 바로 전송
		dos.writeInt(800);
		dos.close();
		
		FileInputStream fis = new FileInputStream(filepath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String str = dis.readUTF();
		int num = dis.readInt();
		System.out.println("str : " + str);
		System.out.println("num : " + num);
	}
}
