package com.smart.meter.dashboard.adya.repository;

import com.smart.meter.dashboard.adya.Projection.MeterTypeCountProjection;
import com.smart.meter.dashboard.adya.model.MeterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeterDetailsRepository extends JpaRepository<MeterDetails, String> {

    @Query("""
    SELECT m.metertype AS meterType, COUNT(md) AS count
    FROM MeterDetails md
    JOIN md.firmwareVersion mfv
    JOIN mfv.meterModel m
    WHERE m.manufacturer.manufacturername = :manufacturerName
    GROUP BY m.metertype
""")
    List<MeterTypeCountProjection> countMetersByMeterTypeForManufacturer(@Param("manufacturerName") String manufacturerName);

}

