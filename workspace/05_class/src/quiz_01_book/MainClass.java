package quiz_01_book;

import java.sql.Date;
import java.util.Calendar;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book hi = new Book();
		hi.isBest = true;
		hi.author = "hans";
		Calendar date = Calendar.getInstance();
		date.set(2020, 2, 10);
		long timestamp = date.getTimeInMillis();
		hi.date = new Date(timestamp);
		hi.name = "hi";
		hi.price = 250000;
		hi.product = 135;
		System.out.println(hi.date);
		
		

	}

}
