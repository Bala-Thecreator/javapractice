package com.marlabs.bala.logics;

import java.io.*;

public class FileStreamTest {
	public static void main(String args[]) {
		try {
			byte bWrite[] = { 1, 2, 3, 4, 5 };
			OutputStream os = new FileOutputStream("D:\\bala.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]);
			}
			os.close();
			InputStream is = new FileInputStream("D:\\bala.txt");
			int size = is.available();
			for (int i = 0; i < size; i++) {
				System.out.print((char) is.read() + " ");
			}
			is.close();
		} 
		catch (IOException e) {
			System.out.print("Exception");
		}
	}

}
