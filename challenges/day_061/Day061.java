package challenges.day_061;

import java.util.EnumMap;

public class Day061 {

      public static void main(String[] args) {
            EnumMap<Day, String> dayMap = new EnumMap<>(Day.class);

            dayMap.put(Day.MONDAY, "Dia de trabalho");
            dayMap.put(Day.TUESDAY, "Dia de trabalho");
            dayMap.put(Day.WEDNESDAY, "Dia de trabalho");
            dayMap.put(Day.THURSDAY, "Dia de trabalho");
            dayMap.put(Day.FRIDAY, "Dia de trabalho");
            dayMap.put(Day.SATURDAY, "Fim de semana");
            dayMap.put(Day.SUNDAY, "Fim de semana");

            for (Day day : Day.values()) {
                  System.out.println(day + ": " + dayMap.get(day));
            }
      }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}