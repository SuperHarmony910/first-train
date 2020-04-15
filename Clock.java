import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Clock {
   public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("DD MMMMMMMMMM YYYY HH:mm:ss");
    System.out.print("Today's date = ");
    System.out.println( sdf.format(cal.getTime()) );  
