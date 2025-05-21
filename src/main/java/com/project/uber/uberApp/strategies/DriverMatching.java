package com.project.uber.uberApp.strategies;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatching {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
