package com.smart.meter.dashboard.adya.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.Timestamp;
import java.util.Date;

@Entity
@Table(name = "meterdetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeterDetails {

    @Id
    @Column(name = "meter_id")
    private Long id;

    private Date manufacturedate;
    private Integer multiplicationfactor;
    private Integer minterval;
    private Date warrantydate;
    private Long authenticationkey;
    private Timestamp commissioningdate;
    private Timestamp recorddate;
    private Integer isdeleted;
    private String meterserialno;

    @ManyToOne
    @JoinColumn(name = "manufacturerid")
    private ManufacturerDetails manufacturer;

    @ManyToOne
    @JoinColumn(name = "fwversionid")
    private MeterFirmwareVersions firmwareVersion;
}
