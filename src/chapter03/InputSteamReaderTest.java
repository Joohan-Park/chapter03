package chapter03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSteamReaderTest {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		try{
			//기반스트림(Byte 단위 기반 스트림)
			FileInputStream fis = new FileInputStream("ms949.txt");
			
			//보조스트림(ms949->utf8
			isr = new InputStreamReader(fis,"MS949");
			
			//BufferedReader br = new BufferedReader(isr);
			
			int data = -1;
			while((data = isr.read())!=-1){
				System.out.print((char)data);
			}
			
		}catch(IOException e){
			System.out.print("errer:"+e);
		}finally{
			try{
				if(isr != null)
					isr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}


	}

}
