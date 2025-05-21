package com.project.uber.uberApp.strategies;


import com.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculation {
    double RIDE_FARE_MULTIPLIER = 10;

    Double calculateFare(RideRequest rideRequest);


}
