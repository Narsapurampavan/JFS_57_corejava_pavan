package codegananDSA;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Dateandtime {

	public static void main(String[] args) {
     LocalDate date=LocalDate.now();
     System.out.println(date);
     
     LocalDate tmrw= date.plusDays(1);
     System.out.println(tmrw);
     
     LocalDate tmr1=date.plusDays(2);
     System.out.println(tmr1);
     
     LocalDate nweek=date.plusWeeks(1);
     System.out.println(nweek);
     
    //zone
     ZonedDateTime india=ZonedDateTime.now();
     System.out.println(india);
	}

}
