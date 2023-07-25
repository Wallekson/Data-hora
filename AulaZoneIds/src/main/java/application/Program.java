package application;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

//        for (String x : ZoneId.getAvailableZoneIds()){
//            System.out.println(x);
//        }
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia: " + d04.getDayOfMonth());
        System.out.println("d04 mes: " + d04.getMonthValue());
        System.out.println("d04 ano: " + d04.getYear());

        System.out.println("d05 hora: " + d05.getHour());
        System.out.println("d05 hora: " + d05.getMinute());

        System.out.println("----AULA CÁLCULOS DATA-HORA----");

        LocalDate pastweekLocalDate = d04.minusDays(7);
        LocalDate nextweekLocalDate = d04.plusDays(7);

        System.out.println("pastweekLocalDate = " + pastweekLocalDate);
        System.out.println("nextweekLocalDate = "+ nextweekLocalDate);

        LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextweekLocalDateTime = d05.plusDays(7);

        System.out.println("pastweekLocalDateTime = " + pastweekLocalDateTime);
        System.out.println("nextweekLocalDateTime = "+ nextweekLocalDateTime);

        Instant pastweekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextweekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastweekInstant = " + pastweekInstant);
        System.out.println("nextweekInstant = " + nextweekInstant);

        Duration t1 = Duration.between(pastweekLocalDate.atStartOfDay(), d04.atStartOfDay());
        //não é possivel calcular o periodo de tempo entre dois LocalDate, temos que converter para LocalDateTime.
        Duration t2 = Duration.between(pastweekLocalDateTime, d05);
        Duration t3 = Duration.between(pastweekInstant, d06);
        Duration t4 = Duration.between(d06, pastweekInstant); // calcula a data maior primeiro e a menor como segundo argumento


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());





    }
}
