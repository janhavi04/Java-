import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class DateDemo{
    public static void main(String [] args){
        //System.out.println(System.currentTimeMillis());//Returns current time in milliseconds
       // System.out.println(Long.MAX_VALUE);
        /**********************Date Class******************* */
       //Object of date class
     //  Date d = new Date();
      // System.out.println(d.getYear()+1900);

      /*******************Calendar Class******************* */
        //Object of Gregorian Calendar

        GregorianCalendar gc = new GregorianCalendar();

        //System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        /**************************TIME ZONE******************* */
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getDisplayName());
     }
}