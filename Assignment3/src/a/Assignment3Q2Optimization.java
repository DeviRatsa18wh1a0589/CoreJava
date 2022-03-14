package a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment3Q2Optimization {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		// byte
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fr= new FileInputStream("C:\\Users\\DEVI\\OneDrive\\Pictures\\opera4.jpg");
			@SuppressWarnings({ "unused", "resource" })
			FileOutputStream fw = 
					new FileOutputStream("C:\\Users\\DEVI\\OneDrive\\Pictures\\opera4.jpg");
			
			@SuppressWarnings("resource")
			BufferedInputStream fr1 = new 
					BufferedInputStream(new FileInputStream("C:\\Users\\DEVI\\OneDrive\\Pictures\\opera4.jpg"));
			BufferedOutputStream fw1 = new BufferedOutputStream(
					new FileOutputStream("C:\\Users\\DEVI\\OneDrive\\Pictures\\opera4.jpg"));
			int i = 0;
			while ((i = fr1.read()) != -1) {
				fw1.write(i);
			}
			fw1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");
		
//		
		System.out.println("file is written");
	}
}
