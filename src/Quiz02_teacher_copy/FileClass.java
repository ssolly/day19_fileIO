package Quiz02_teacher_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileClass {

	public void fileOut(StudentClass sc) throws Exception {
		File file1 = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/quiz02_teacher_copy/");
		File file2 = new File(file1,sc.getStNum()+".txt");
		
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject((Object)sc);
		oos.close();
	}
	
	public StudentClass fileRead(String stNum) throws Exception {
		StudentClass sc = null;
		File file1 = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/quiz02_teacher_copy/");
		File file2 = new File(file1,stNum+".txt");
		
		try {
			FileInputStream fis = new FileInputStream(file2);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			sc = (StudentClass)ois.readObject();
			ois.close();
		} catch (Exception e) {
			return null;
		}
		return sc;
	}
	
	public boolean checkFile(String stNum) throws Exception {
		File file1 = new File("C:/Users/최소영/Desktop/KGITBANK/"
				+ "springcloud/java/day19_fileIO_test/quiz02_teacher_copy/");
		File file2 = new File(file1,stNum+".txt");
		
		if(file2.createNewFile()) {
			return false;
		} 
		return true;
	}
}
