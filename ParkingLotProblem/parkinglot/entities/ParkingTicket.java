package parkinglot.entities;

import parkinglot.vehicle.Vehicle;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket{
    private final String ticketID;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final long entryTimeStamp;
    private final long exitTimeStamp;


    public ParkingTicket(Vehicle vehicle,ParkingSpot spot){
        this.ticketID=UUID.randomUUID().toString();
        this.vehicle=vehicle;
        this.spot=spot;
        this.entryTimeStamp = new Date().getTime();
    }

    public String getTicketID(){
        return ticketID;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public ParkingSpot getSpot(){
        return spot;
    }
    public long getEntryTimestamp(){
        return entryTimeStamp;
    }
    public long getExitTimestamp(){
        return exitTimeStamp;
    }
    public void setExitTimestamp(){
        this.exitTimeStamp = new Date().getTime();
    }
}   
