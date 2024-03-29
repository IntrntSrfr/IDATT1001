public class Event {

    private int eventId;
    private final long date;
    private final String name;
    private final String location;
    private final String arranger;
    private final String type;

    public Event(long timestamp, String name, String location, String arranger, String type) throws IllegalArgumentException{
        if(timestamp < 100000000000L || timestamp > 999999999999L){
            throw new IllegalArgumentException("Invalid timestamp");
        }
        if(name.isBlank() || location.isBlank() || arranger.isBlank() || type.isBlank()){
            throw new IllegalArgumentException("Fields cannot be blank.");
        }

        this.eventId = 0;
        this.date = timestamp;
        this.name = name;
        this.location = location;
        this.arranger = arranger;
        this.type = type;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public long getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getArranger() {
        return arranger;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", arranger='" + arranger + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
