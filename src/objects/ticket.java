package objects;


public class ticket {
    private int ticketID;
    private int accountID;
    private int eventId;
    private String stand;
    private String seat;

    public ticket(int ticketID, int accountID, int eventId, String stand, String seat) {
        this.ticketID = ticketID;
        this.accountID = accountID;
        this.eventId = eventId;
        this.stand = stand;
        this.seat = seat;
    }


    
    public String toString() {
        return ticketID + " " + accountID + " " + eventId + " " + stand + " " + seat;
    }

    public int getTicketID() {
        return ticketID;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getEventId() {
        return eventId;
    }

    public String getStand() {
        return stand;
    }

    public String getSeat() {
        return seat;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

 
    
    
}
