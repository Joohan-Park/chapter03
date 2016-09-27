package chapter03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않음");
				return;
			}

			System.out.println("\n" + "*****************파일정보******************");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");
			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			System.out.println(sdf.format(date));

			System.out.println("\n" + "***************전화번호리스트****************");
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String name = scanner.next(); // 탭이 있던 스페이스가 있던 엔터가 있던 문자 리턴
												// tap,enter,space
				String phone01 = scanner.next(); // int를 써도 parseInteger자동 변환
				String phone02 = scanner.next();
				String phone03 = scanner.next();

				System.out.println(name + ":" + phone01 + "-" + phone02 + "-" + phone03);
			}

		} catch (IOException e) {
			System.out.println("error" + e);
		} finally {
			scanner.close();
		}

	}

}
