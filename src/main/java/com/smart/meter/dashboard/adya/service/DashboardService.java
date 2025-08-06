package com.smart.meter.dashboard.adya.service;

import com.smart.meter.dashboard.adya.Projection.MeterTypeCountProjection;
import com.smart.meter.dashboard.adya.dto.ManufacturerWithStatsDto;
import com.smart.meter.dashboard.adya.repository.ManufacturerRepository;
import com.smart.meter.dashboard.adya.repository.MeterDetailsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DashboardService {

    private final ManufacturerRepository manufacturerRepo;

    private final MeterDetailsRepository meterDetailsRepository;


    public DashboardService(ManufacturerRepository manufacturerRepo, MeterDetailsRepository meterRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.meterDetailsRepository = meterRepo;

    }

    public List<String> getAllManufacturers() {
        return manufacturerRepo.findAllManufacturerNames();
        }
    public ManufacturerWithStatsDto getManufacturerWithStats(String name) {

        long singlePhaseCount = 0;
        long threePhaseCount = 0;

        List<MeterTypeCountProjection> results = meterDetailsRepository.countMetersByMeterTypeForManufacturer(name);

        for (MeterTypeCountProjection result : results) {
            String meterType = result.getMeterType();
            Long count = result.getCount();

            if ("Single Phase".equalsIgnoreCase(meterType)) {
                singlePhaseCount = count;
            } else if ("Three Phase".equalsIgnoreCase(meterType)) {
                threePhaseCount = count;
            }
        }

        long total = singlePhaseCount + threePhaseCount;

        return new ManufacturerWithStatsDto(total, singlePhaseCount, threePhaseCount);
    }


}