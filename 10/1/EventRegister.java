import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EventRegister {

    private final ArrayList<Event> events;
    private int eventID;

    public EventRegister() {
        this.events = new ArrayList<>();
        eventID = 0;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public boolean registerEvent(Event e) {
        e.setEventId(eventID);
        eventID++;
        return events.add(e);
    }

    public void removeEvent(int ID){
        events.removeIf(t -> t.getEventId() == eventID);
    }

    public List<Event> getEventsByLocation(String location) {
        return events.stream()
                .filter(t -> t.getLocation().toLowerCase().equals(location.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Event> getEventsBetweenDates(long startDate, long endDate) {
        return events.stream()
                .filter(t -> startDate <= t.getDate()/10000 && t.getDate()/10000 <= endDate)
                .collect(Collectors.toList());
    }

    public List<Event> getEventsByDate(long date) {
        return events.stream()
                .filter(t -> t.getDate()/10000 == date)
                //.filter(t -> Long.toString(t.getDate()).startsWith(Long.toString(date)))
                //.sorted((t1, t2) -> (int) (t1.getDate() - t2.getDate()))
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());
    }

    public List<Event> getEventsSortedByLocation() {
        return events.stream().sorted(Comparator.comparing(Event::getLocation)).collect(Collectors.toList());
    }

    public List<Event> getEventsSortedByType() {
        return events.stream().sorted(Comparator.comparing(Event::getType)).collect(Collectors.toList());
    }

    public List<Event> getEventsSortedByDate() {
        return events.stream().sorted(Comparator.comparing(Event::getDate)).collect(Collectors.toList());
    }

    public List<Event> getEventsById(int id) {
        return events.stream().filter(t -> t.getEventId() == id).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Event e : events) {
            sb.append(e.toString());
        }
        return sb.toString();
    }
}
