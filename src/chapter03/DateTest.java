package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
			
		System.out.println(date);
		printDate(date);
		printDate2(date);
		
		
		//년 = 1900+a  월(0~11), 일
		Date d1 = new Date(116,4,23);//deprecated -> 없어질 예정
		System.out.println(d1);
		printDate(d1);
		
		//년, 월, 일, 시간, 분
		Date d2 = new Date(116,8,1,12,30);//deprecated -> 없어질 예정
		System.out.println(d2);
		printDate(d2);
		
		//년, 월 , 일 , 시간, 분, 초
		Date d3 = new Date(116,8,1,12,30,20);//deprecated -> 없어질 예정
		System.out.println(d3);
		printDate(d3);
		
		//1970년 1월 1일 00:00:00 부터 밀리세컨드 값	
		Date d4 = new Date(365L*1000*60*60*24*47);
		System.out.println(d4);
		printDate(d4);
		printDate2(d4);
	}

	private static void printDate(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
		System.out.println(sdf.format(d));
	}
	
	private static void printDate2(Date d){
		int year = d.getYear();
		int month = d.getMonth();
		int date = d.getDate();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
		System.out.println((year+1900)+"년 "+(month+1)+"월 "+date+"일 "+hours+":"+minutes+":"+seconds);
	}
}
