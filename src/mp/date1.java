/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/**
 *
 * @author Lenovo
 */
public class date1 {
   public static void main(String args[]) {
      
        Date d=new Date();
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String issuedate = simpleDateFormat.format(d);
      Calendar cal=new GregorianCalendar();
      cal.setTime(d);
      cal.add(Calendar.DATE, 31);
      Date d1=cal.getTime();
      String returndate=simpleDateFormat.format(d1);
      System.out.println(issuedate);
      System.out.println(returndate);
      
    } 
}
