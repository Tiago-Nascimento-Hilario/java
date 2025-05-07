package data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    public static void main(String[] args) {
        Calendar data =  Calendar.getInstance();
         int dia = data.get(Calendar.DAY_OF_MONTH);
         int mes = data.get(Calendar.MONTH);
         int ano = data.get(Calendar.YEAR);
    }
}
