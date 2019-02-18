package com.rajat.parkinglot;

/**
 * Created by rajat on 12/9/17.
 */
public class ParkingLotFactory {

    public static IParkingLot createParkingLot()
    {
        return new ParkingLotImpl();
    }
}
