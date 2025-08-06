package com.smart.meter.dashboard.adya.repository;

import com.smart.meter.dashboard.adya.model.ManufacturerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<ManufacturerDetails, Long> {

    @Query("SELECT DISTINCT m.manufacturername FROM ManufacturerDetails m")
    List<String> findAllManufacturerNames();

}

