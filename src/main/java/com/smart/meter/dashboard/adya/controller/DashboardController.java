package com.smart.meter.dashboard.adya.controller;
import com.smart.meter.dashboard.adya.service.DashboardService;
import org.springframework.web.bind.annotation.*;
import com.smart.meter.dashboard.adya.dto.ManufacturerWithStatsDto;
import java.util.List;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @GetMapping("/manufacturers")
    public List<String> getManufacturers() {
        return service.getAllManufacturers();
    }
    @GetMapping("/manufacturer/stats")
    public ResponseEntity<ManufacturerWithStatsDto> getStats(@RequestParam String manufacturerName) {
        ManufacturerWithStatsDto dto = service.getManufacturerWithStats(manufacturerName);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
}






