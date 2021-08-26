package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {	//보조스트림
			
	public static void main(String[] args) throws Exception {
		
		File filepath = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		
		//보조스트림 Buffer, 버퍼를 이용해서 보조 스트림을 만든다
		BufferedOutputStream bos = new BufferedOutputStream(fos);
	
		 for(char i='1';i<'9';i++) {
			Thread.sleep(1000);
			//fos.write(i); //보조스트림 없이 사용
			bos.write(i);   //buffer 보조스트림 사용 : buffer 저장소에 저장
		}
		//bos.flush();		//buffer 저장소 비우는 명령어 : buffer->파일로 이동
		bos.close();		//닫아버리면 연결 통로가 끝나서 다시 write 작업 불가
	}
}
