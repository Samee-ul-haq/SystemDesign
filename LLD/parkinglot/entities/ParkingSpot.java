package parkinglot.entities;

import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleSize;

public class ParkingSpot {
    private final String spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private final VehicleSize spotSize;


    public ParkingSpot(String spotId,VehicleSize spotSize){
        this.spotId=spotId;
        this.isOccupied=false;
        this.spotSize=spotSize;
        this.parkedVehicle=null;
    }
    String getSpotId(){
        return spotId;
    }

    VehicleSize getSpotSize(){
        return spotSize;
    }

    public synchronized boolean isOccupied(){
        return !isOccupied;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

}
