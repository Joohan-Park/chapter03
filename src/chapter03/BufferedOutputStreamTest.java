package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		BufferedOutputStream bos = null;
		try {
			// 기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("01234.txt");
			// 보조스트림
			bos = new BufferedOutputStream(fos, 5);

			for (int i = 48; i <= 57; i++) {
				// for (int i = '0'; i<='9';i++){
				bos.write(i);
				//bos.flush(); //내부 버퍼를 비움(파일에 쓴후에 비움)(버퍼가 안차더라도 파일에 쓰고 비움)
			}

		} catch (FileNotFoundException e) {
			System.out.println("error" + e);
		} catch (IOException e){
			System.out.println("error" + e);
		} finally {
			try{
				if(bos != null){
					bos.close();  //보조스트림만 닫으면 기반스트림도 자동으로 닫힘.
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

	}

}
