package airlineapp.Tickets;

import airlineapp.StartWindowGUI;
import airlineapp.iWindows;

public class Tickets implements iWindows {
    private String id, date, source,
            destination, depTime, arrTime, fClass, passengers, owner;

    public Tickets(String id, String date, String source, String destination, 
            String depTime, String arrTime, String fClass, String passengers, String owner) {
        this.id = id;
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.fClass = fClass;
        this.passengers = passengers;
        this.owner = owner;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getfClass() {
        return fClass;
    }

    public void setfClass(String fClass) {
        this.fClass = fClass;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    @Override
    public void goBack() {
        new StartWindowGUI().setVisible(true);
    }
}
