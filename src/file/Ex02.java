package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/aaa.txt");
		FileInputStream fis = new FileInputStream(filepath);
		
		while(true) {
			//res : 파일의 끝 값을 의미하는 eof(-1)
			int res = fis.read();
					//read는 int값으로 가져올 수 있다
			if(res<0) {
				System.out.println("res : " + res);
				break;
			}
			System.out.println((char)res);
		}
	}
}
