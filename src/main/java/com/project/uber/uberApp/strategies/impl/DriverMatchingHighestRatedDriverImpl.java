package com.project.uber.uberApp.strategies.impl;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.RideRequest;
import com.project.uber.uberApp.repositories.DriverRepository;
import com.project.uber.uberApp.strategies.DriverMatching;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverImpl implements DriverMatching {
    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {

        return driverRepository.findTenNearByTopRatedDriver(rideRequest.getPickupLocation());
    }
}
