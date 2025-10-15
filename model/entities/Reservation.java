package model.entities;

import java.util.Date;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date getCheckOut;

    public Reservation(Integer roomNumber, Date checkIn, Date getCheckOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.getCheckOut = getCheckOut;
    }
}
