package pack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Questão1 {

	public static void main(String[] args) {
	    GregorianCalendar gc = new GregorianCalendar();	
	     
        DateFormat data = DateFormat.getDateInstance(DateFormat.FULL);
		Date data1= new Date();
		
    	System.out.println("Hoje é " + data.format(data1) + " e agora são " + gc.get(Calendar.HOUR) + " horas e " + gc.get(Calendar.MINUTE) + " minutos");

	}

}
