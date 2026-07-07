package parkinglot;

import java.util.*;

import parkinglot.entities.ParkingFloor;

public class ParkingLot{
    private static ParkingLot instance;
    private final List<ParkingFloor>floors = new ArrayList<>();
}