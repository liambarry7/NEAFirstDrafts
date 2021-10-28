package objects;

import java.time.LocalDate;


public class event {
   
    private int eventID;
    private String eventName;
    private String eventTime;
    private LocalDate eventDate;
    private int eventCapacity;
    private String eventDescription;
    private int remainingTickets;
    private String eventType;

    public event(int eventID, String eventName, String eventTime, LocalDate eventDate, int eventCapacity, String eventDescription, int remainingTickets, String eventType) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventCapacity = eventCapacity;
        this.eventDescription = eventDescription;
        this.remainingTickets = remainingTickets;
        this.eventType = eventType;
    }
    
    public String toString() {
        return eventID + " " + eventName + " " + eventTime + " " + eventDate + " " + eventCapacity + " " + eventDescription + " " + remainingTickets + " " + eventType;
    }

    public int getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public int getEventCapacity() {
        return eventCapacity;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public int getRemainingTickets() {
        return remainingTickets;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventCapacity(int eventCapacity) {
        this.eventCapacity = eventCapacity;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setRemainingTickets(int remainingTickets) {
        this.remainingTickets = remainingTickets;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    
    
}
