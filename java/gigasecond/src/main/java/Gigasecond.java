import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime gigaDateTime;
    private static long GIGA_SECONDS = (long)Math.pow(10, 9);

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.gigaDateTime = moment.plusSeconds(GIGA_SECONDS);
    }

    public LocalDateTime getDateTime() {
        return gigaDateTime;
    }
}
