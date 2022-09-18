package src;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

public class DateCalc {
    public static Calendar addBankingDays(Calendar dueDate,  int amount) {

        Calendar returnDate = (Calendar) dueDate.clone();


        if (amount != 0) {
            int b = 1;
            if (amount < 0) {
                b = -1;
            }
            int i = Math.abs(amount);
            while (i > 0) {
                returnDate.add(Calendar.DAY_OF_YEAR, b);
                i--;
               
            }
        }


        return returnDate;
    }
    public static Calendar appendClosingTime(Calendar inputDate, boolean x)
    {

        //Strip the time component and set it to closing time;
        inputDate.clear(Calendar.MINUTE);
        inputDate.clear(Calendar.SECOND);
        inputDate.clear(Calendar.MILLISECOND);
       inputDate.clear(Calendar.HOUR_OF_DAY);
        inputDate.clear(Calendar.HOUR);
        System.out.println("AFTER CLEAR "+ inputDate.getTime());
        String closeTime = "07:00";

        String [] closeTimeParts = closeTime.split(":");
        Integer hourPart = Integer.parseInt(closeTimeParts[0]);
        Integer minutePart = Integer.parseInt(closeTimeParts[1]);

        //Now get the time zone of the funding account
        TimeZone timeZone = TimeZone.getTimeZone("US/Pacific");
        
        ZoneId z = ZoneId.of(timeZone.getID());
        System.out.println("Time in PST Now = "+ZonedDateTime.now(z));
        //Calendar is 0 based month [0 is Jan] while ZonedDateTime is 1 based [1 is Jan]
        
        ZonedDateTime dateinFundingAccountTZ =  ZonedDateTime.of(inputDate.get(Calendar.YEAR), inputDate.get(Calendar.MONTH)+1, inputDate.get(Calendar.DAY_OF_MONTH), hourPart, minutePart, 0, 0, z);
        Calendar xyz = GregorianCalendar.from(dateinFundingAccountTZ);
        System.out.println("dateinFundingAccountTZ = "+dateinFundingAccountTZ);
        ZonedDateTime utcDate = dateinFundingAccountTZ.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println(inputDate.getTime() +" "+utcDate.getHour());
        inputDate.set(Calendar.HOUR_OF_DAY, utcDate.getHour());
        inputDate.set(Calendar.MINUTE, utcDate.getMinute());
        System.out.println("After Append Time "+ inputDate.getTime());
        if(x)
       return GregorianCalendar.from(utcDate);
        else
        return inputDate;

    }
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current CST Time "+c.getTime());
        Calendar c2 = addBankingDays(c,1);
        Calendar result1 = appendClosingTime(c2, true);
        System.out.println(" *** ");
        Calendar result2 = appendClosingTime(result1, false);

        System.out.println(result2.getTime()+" ");
        System.out.println(" *** ");
    }
}
