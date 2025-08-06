package com.smart.meter.dashboard.adya.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.Timestamp;

@Entity
@Table(name = "LatestMeterData")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LatestMeterData {

    @Id
    @Column(name = "latest_data_id")
    private Long id;

    private Timestamp metertimestamp;

    @Column(columnDefinition = "json")
    private String latestmetadata;

    @ManyToOne
    @JoinColumn(name = "meterid")
    private MeterDetails meter;
}
