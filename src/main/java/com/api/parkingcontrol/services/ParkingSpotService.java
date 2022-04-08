package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkinSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final
    ParkinSpotRepository parkinSpotRepository;

    public ParkingSpotService(ParkinSpotRepository parkinSpotRepository) {
        this.parkinSpotRepository = parkinSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkinSpotRepository.save(parkingSpotModel);
    }

//    public boolean existsByLicensePlateCar(String licensePlateCar) {
//    }
}
