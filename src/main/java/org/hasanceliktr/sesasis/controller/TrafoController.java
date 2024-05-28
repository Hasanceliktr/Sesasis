package org.hasanceliktr.sesasis.controller;

import org.hasanceliktr.sesasis.entity.TrafoCenter;
import org.hasanceliktr.sesasis.service.TrafoCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trafos")
public class TrafoController {

    @Autowired
    private TrafoCenterService trafoCenterService;

    @PostMapping
    public TrafoCenter createTrafoCenter(@RequestBody TrafoCenter trafoCenter) {
        return trafoCenterService.saveTrafoCenter(trafoCenter);
    }

    @GetMapping
    public List<TrafoCenter> getAllTrafoCenters() {
        return trafoCenterService.getAllTrafoCenters();
    }

    @GetMapping("/{id}")
    public TrafoCenter getTrafoCenterById(@PathVariable Long id) {
        return trafoCenterService.getTrafoCenterById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTrafoCenter(@PathVariable Long id) {
        trafoCenterService.deleteTrafoCenter(id);
    }

}

