package org.hasanceliktr.sesasis.service;

import org.hasanceliktr.sesasis.entity.Area;
import org.hasanceliktr.sesasis.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    public Area saveArea(Area area) {
        return areaRepository.save(area);
    }

    public List<Area> getAllArea() {
        return areaRepository.findAll();
    }

    public Area getAreaById(Long id) {
        return areaRepository.findById(id).orElse(null);
    }

    public void deleteArea(Long id) {
        areaRepository.deleteById(id);
    }

    public Area getAreaWithTrafoCenters(Long id) {
        return areaRepository.findAreaTrafoCenter(id);
    }

    public int countTrafoCentersByArea(Long areaId) {
        return areaRepository.countTrafoCentersByArea(areaId);
    }
}