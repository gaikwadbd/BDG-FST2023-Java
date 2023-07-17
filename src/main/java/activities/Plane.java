package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> lstPassengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.lstPassengers = new ArrayList<>();
    }

    public void passengerOnBoard(String passenger) {

        this.lstPassengers.add(passenger);
    }

    public Date planeTakeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void planLand() {
        this.lastTimeLanded = new Date();
        this.lstPassengers.clear();
    }

    public Date getLastTimeLanded() {

        return lastTimeLanded;
    }

    public List<String> getPassengers() {

        return lstPassengers;
    }
}

