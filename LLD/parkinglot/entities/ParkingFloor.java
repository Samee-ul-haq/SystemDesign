package parkinglot.entities;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<String,ParkingSpot>spots;


    public ParkingFloor(int floorNumber){
        this.floorNumber=floorNumber;
        this.spots=new ConcurrentHashMap<>();
    }
}
