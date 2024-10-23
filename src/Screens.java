import java.time.LocalTime;
import java.util.List;

public class Screens {
    private  int screenNumber;
    List<Timeslot> availableslots;

    public Screens() {
        this.availableslots = availableslots;
    }
    public void addTimeslot(Timeslot slot){
        availableslots.add(slot);
    }

    public boolean canScheduleMovie(Movie movie, LocalTime showStartTime){
        LocalTime showEndTime=showStartTime.plusMinutes(movie.getDurationMinutes());
        LocalTime cleanEndtime=showEndTime.plusMinutes(30);

        Timeslot newSlot=new Timeslot(showStartTime,cleanEndtime);

        for(Timeslot slot:availableslots){
            if(slot.lapping(newSlot)){
                return false;
            }
        }
        return true;
    }

    public void scheduleMovie(Movie movie,LocalTime showStartTime){
        LocalTime showEndTime=showStartTime.plusMinutes(movie.getDurationMinutes());
        LocalTime cleanTime=showEndTime.plusMinutes(30);

        Timeslot slots=new Timeslot(showStartTime,cleanTime);
        availableslots.add(slots);
    }

}
