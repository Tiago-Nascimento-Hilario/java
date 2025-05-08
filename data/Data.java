package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
        Calendar data = Calendar.getInstance();
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH);
        int ano = data.get(Calendar.YEAR);

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2025-06-05"), LocalDate.now());

//        Simulator de parcelas
        Date dataIncial = new SimpleDateFormat("dd/MM/yyy").parse("08/05/2025");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataIncial);

        for (int parcela = 1; parcela <= 12; parcela++) {
            calendar.add(Calendar.MONTH, 1);
            System.out.printf("Parcela: " + parcela + "vencimento " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()) + "%n");
        }
    }
}
