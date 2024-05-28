package org.hasanceliktr.sesasis.controller;

import org.hasanceliktr.sesasis.entity.Area;
import org.hasanceliktr.sesasis.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @PostMapping
    public Area createArea(@RequestBody Area area) {
        return areaService.saveArea(area);
    }

    @GetMapping
    public List<Area> getAllArea() {
        return areaService.getAllArea();
    }

    @GetMapping("/{id}")
    public Area getAreaById(@PathVariable Long id) {
        return areaService.getAreaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteArea(@PathVariable Long id) {
        areaService.deleteArea(id);
    }

    @GetMapping("/{id}/trafoCenters")
    public Area getAreaWithTrafoCenters(@PathVariable Long id) {
        return areaService.getAreaWithTrafoCenters(id);
    }

    @GetMapping("/{id}/trafoCenters/count")
    public int countTrafoCentersByArea(@PathVariable Long id) {
        return areaService.countTrafoCentersByArea(id);
    }
}

