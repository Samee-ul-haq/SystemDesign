package parkinglot.strategy.fee;

import parkinglot.vehicle.VehicleSize;
import parkinglot.entities.ParkingTicket;

import java.util.Map;

public class VehicleBasedFeeStructure implements FeeStrategy{
    private static final Map<VehicleSize,Double>HOURLY_RATES = Map.of(
        VehicleSize.SMALL, 10.0,
        VehicleSize.MEDIUM, 20.0,
        VehicleSize.LARGE, 30.0
    );

    @Override
    public double calculateFee(ParkingTicket parkingTicket){
        long duration = parkingTicket.getExitTimestamp() - parkingTicket.getEntryTimestamp();
        VehicleSize size = parkingTicket.getVehicle().getSize();

        long hours = duration/(1000*60*60)+1;

        return HOURLY_RATES.get(size)*hours;
    }
}