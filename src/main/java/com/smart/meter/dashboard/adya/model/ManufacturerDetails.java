package com.smart.meter.dashboard.adya.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "manufacturerdetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDetails {

    @Id
    @Column(name = "manufacturer_id")
    private Long id;

    private Integer isactive;
    private Integer isdeleted;
    private String flagcode;
    private String contactnumber;
    private String designation;
    private String contactperson;
    private String emailid;
    private String manufacturername;
    private String address;
}
