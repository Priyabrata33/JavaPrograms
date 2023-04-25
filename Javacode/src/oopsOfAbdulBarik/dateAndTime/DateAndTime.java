package oopsOfAbdulBarik.dateAndTime;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dd = new Date();  //it show the time zone date and year 
		System.out.println(dd);
		
		LocalDate dt = LocalDate.now();   //showing date only in yyyy-mm-dd
		
		System.out.println(dt);
		
		LocalDate d = LocalDate.now(ZoneId.of("America/Los_Angels"));
		System.out.println(d);

	}   

}
