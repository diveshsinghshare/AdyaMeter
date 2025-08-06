package com.smart.meter.dashboard.adya.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "nicdetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NICDetails {

    @Id
    @Column(name = "nic_id")
    private Long id;

    private Date manufacturedate;
    private Date warrantydate;
    private String rnode;
    private String rftype;
    private String rfpan;
    private String linenumber;
    private String macaddress;
    private String nicfwversion;
    private String nichwversion;
    private String nicserialno;
    private String nicmodelno;
    private String simid;
    private String simipaddress;
    private String status;

    @ManyToOne
    @JoinColumn(name = "gatewayid")
    private GateWayDetails gateway;

    @ManyToOne
    @JoinColumn(name = "manufacturerid")
    private ManufacturerDetails manufacturer;
}
