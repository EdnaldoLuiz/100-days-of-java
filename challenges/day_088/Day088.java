package challenges.day_088;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Day088 {

    public static void main(String[] args) {
        ZonedDateTime dataHoraAtualUTC = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime dataHoraBrasil = dataHoraAtualUTC.minusHours(3);
        System.out.println("Data e hora atual no Brasil: " + dataHoraBrasil);
    }
}
