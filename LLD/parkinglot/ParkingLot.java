package parkinglot;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import parkinglot.entities.ParkingFloor;
import parkinglot.strategy.fee.FeeStrategy;
import parkinglot.entities.ParkingTicket;

public class ParkingLot{
    private static ParkingLot instance;
    private final List<ParkingFloor>floors = new ArrayList<>();
    private final Map<String, ParkingTicket> activeTokens;
    private FeeStrategy feeStrategy;
    
}