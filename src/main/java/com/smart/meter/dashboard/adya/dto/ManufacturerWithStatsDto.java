package com.smart.meter.dashboard.adya.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class ManufacturerWithStatsDto {
    final private long totalMeters;
    final private long singlePhase;
    final private long threePhase;

    public ManufacturerWithStatsDto(long totalMeters, long singlePhase, long threePhase) {
        this.totalMeters = totalMeters;
        this.singlePhase = singlePhase;
        this.threePhase = threePhase;
    }
}