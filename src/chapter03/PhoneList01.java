package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않음");
				return;
			}

			System.out.println("\n"+"*****************파일정보******************");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");
			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			System.out.println(sdf.format(date));

			System.out.println("\n"+"***************전화번호리스트****************");
			// 기반스트림(byte기반)
			FileInputStream fis = new FileInputStream(file);

			// 보조스트림(byte->char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

			// 보조스트림
			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				//String tokens[] = line.split("\t");
				
				StringTokenizer st = new StringTokenizer(line, "\t ");//tab과 space로 분리 (분리해줄 문자를 다 써주면된다.)
				int index = 0;
				while(st.hasMoreTokens()){
					String token = st.nextToken();
					if(index == 0){
						System.out.print(token+"\t:\t");
					}
					else if(index == 3){
						System.out.print(token);
					}else{
						System.out.print(token+" - ");
					}
					index++;
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("error" + e);
		} finally{
			try {
				if(br != null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
