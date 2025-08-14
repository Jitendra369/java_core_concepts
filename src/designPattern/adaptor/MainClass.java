package designPattern.adaptor;

import designPattern.adaptor.adaptors.PhonePayAdaptor;
import designPattern.adaptor.adaptors.RozerPayAdaptor;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class MainClass {
    public static void main(String[] args) {
        // Original UTC Date
        // 1. Original UTC date
        Instant utcInstant = Instant.parse("2025-06-27T01:00:00Z");
        Date utcDate = Date.from(utcInstant);

        // Step 2: Interpret it as UTC
        ZonedDateTime utcZoned = utcDate.toInstant().atZone(ZoneId.of("UTC"));

        // Step 3: Take wall-clock time from UTC date
        LocalDateTime wallTime = utcZoned.toLocalDateTime(); // 2025-06-27 01:00

        // Step 4: Apply that wall-clock time in Pacific/Pago_Pago timezone
        ZonedDateTime pagoPagoZoned = wallTime.atZone(ZoneId.of("Pacific/Pago_Pago"));

        // Step 5: Convert to Date
        Date pagoPagoDate = Date.from(pagoPagoZoned.toInstant());

        // 🔍 Debug Print
        System.out.println("✅ UTC Input Date:       " + utcDate);

        SimpleDateFormat sdfPagoPago = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdfPagoPago.setTimeZone(TimeZone.getTimeZone("Pacific/Pago_Pago"));
        System.out.println("✅ Pago Pago Clock Time: " + sdfPagoPago.format(pagoPagoDate));

        SimpleDateFormat sdfLocal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdfLocal.setTimeZone(TimeZone.getDefault()); // Your system time zone
        System.out.println("✅ Final Date (local):   " + sdfLocal.format(pagoPagoDate));
    }
}
