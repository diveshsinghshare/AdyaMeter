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
@Entity
@Table(name = "metermodels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeterModel {

    @Id
    @Column(name = "meter_model_id")
    private Long id;

    private Integer isactive;
    private Integer isdeleted;
    private Integer isdlmsmeter;
    private String currentrating;
    private String metertype;
    private String modelname;

    @ManyToOne
    @JoinColumn(name = "manufacturerid")
    private ManufacturerDetails manufacturer;
}
