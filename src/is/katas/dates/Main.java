package is.katas.dates;

import java.time.*;

public class Main {
    public static void main (String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        // 2016-11-08T13:10:13.694Z
        ZonedDateTime x = instant.atZone(ZoneId.of("Poland"));
        System.out.println(x);
        // 2016-11-08T14:10:13.694+01:00[Poland]
        LocalDateTime y = LocalDateTime.now();
        System.out.println(y);
        // 2016-11-08T13:10:13.789
        LocalDate date = LocalDate.now();
        System.out.println(date);
        // 2016-11-08
        date.atStartOfDay(ZoneId.of("Atlantic/Canary")).toInstant();
    }
}
