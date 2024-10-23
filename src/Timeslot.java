import java.time.LocalDate;
import java.time.LocalTime;

public class Timeslot {
    private LocalTime startTime;
    private LocalTime endTime;

    public Timeslot(LocalTime endTime, LocalTime startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public boolean lapping(Timeslot other){
        return startTime.isBefore(other.endTime)&&endTime.isAfter(other.startTime);
    }
}

