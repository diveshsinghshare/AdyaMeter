package com.smart.meter.dashboard.adya.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "LatestMeterData")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



public class GateWayDetails {

    @Id
    @Column(name = "gateway_id")
    private Long id;

    private Date manufacturedate;
    private Date warrantydate;
    private String rspan;
    private String uniqueid;
    private String fwversion;
    private String gatewayserialno;
    private String hwversion;
    private String macaddress;
    private String ipaddress;

    @ManyToOne
    @JoinColumn(name = "manufacturerid")
    private ManufacturerDetails manufacturer;
}
