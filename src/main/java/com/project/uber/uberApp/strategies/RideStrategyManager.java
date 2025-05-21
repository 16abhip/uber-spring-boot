package com.project.uber.uberApp.strategies;

import com.project.uber.uberApp.strategies.impl.DriverMatchingHighestRatedDriverImpl;
import com.project.uber.uberApp.strategies.impl.DriverMatchingNearestDriverImpl;
import com.project.uber.uberApp.strategies.impl.RideFareDefaultFareCalculationImpl;
import com.project.uber.uberApp.strategies.impl.RideFareSurgePricingCalculationImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {

    private final RideFareDefaultFareCalculationImpl rideFareDefaultFareCalculation;
    private final RideFareSurgePricingCalculationImpl rideFareSurgePricingCalculation;
    private final DriverMatchingHighestRatedDriverImpl driverMatchingHighestRatedDriver;
    private final DriverMatchingNearestDriverImpl driverMatchingNearestDriver;

    public DriverMatching driverMatching(Double riderRating){

        if(riderRating >= 4.8){
            return driverMatchingHighestRatedDriver;
        }
        return driverMatchingNearestDriver;
    }
    public RideFareCalculation rideFareCalculation(){
        // peak hour == 6pm to 9pm
        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime currTime = LocalTime.now();

        if(currTime.isAfter(surgeStartTime) && currTime.isBefore(surgeEndTime)) return rideFareSurgePricingCalculation;
        return rideFareDefaultFareCalculation;
    }
}
