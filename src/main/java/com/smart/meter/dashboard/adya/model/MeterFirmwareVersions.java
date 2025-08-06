package com.smart.meter.dashboard.adya.model;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "meterfirmwareversions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeterFirmwareVersions {

    @Id
    @Column(name = "fw_version_id")
    private Long fwVersionId;

    private String fwversion;

    @ManyToOne
    @JoinColumn(name = "metermodelid")
    private MeterModel meterModel;
}
