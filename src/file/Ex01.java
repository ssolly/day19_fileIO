package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
											//FileOutputStream 예외처리
		
		// input : 자바로 들어오는 인풋, output : 자바에서 나가는 아웃풋
		
		File filePath = new File("C:/Users/최소영/Desktop/KGITBANK/springcloud/java/day19_fileIO_test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath,true); 
		//설정한 경로에 파일이 존재하지않으면 파일을 만든다
		//만약 존재하는 파일이 있다면 파괴하고 파일을 새로 만든다
		//true : append기능, 존재하는 파일의 내용을 유지 시킨 후 새로운 내용이 추가되게끔 설정
		
		//콘솔에 출력하는 것이 아닌, 자바에서 만든 파일 안에 내용을 출력
		fos.write(97);	//아스키코드 97='a'
		fos.write('A');
		
		String name = "honggildong";
		fos.write(name.getBytes());	//byte형태만 받아주기 때문에 변환해줘야 한다
		
	}
}
