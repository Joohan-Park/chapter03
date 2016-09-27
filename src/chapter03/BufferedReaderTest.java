package chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			// 기반스트림
			FileReader fr = new FileReader("./src/chapter03/BufferedReaderTest.java");
			// 보조스트림
			br = new BufferedReader(fr);

			int i=1;
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(  i++ + "\t:\t" + line );
			}

		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
