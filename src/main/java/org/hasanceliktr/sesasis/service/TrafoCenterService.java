package org.hasanceliktr.sesasis.service;

import org.hasanceliktr.sesasis.entity.TrafoCenter;
import org.hasanceliktr.sesasis.repository.TrafoCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafoCenterService {
    @Autowired
    private TrafoCenterRepository trafoCenterRepository;

    public TrafoCenter saveTrafoCenter(TrafoCenter trafoCenter) {
        return trafoCenterRepository.save(trafoCenter);
    }

    public List<TrafoCenter> getAllTrafoCenters() {
        return trafoCenterRepository.findAll();
    }

    public TrafoCenter getTrafoCenterById(Long id) {
        return trafoCenterRepository.findById(id).orElse(null);
    }

    public void deleteTrafoCenter(Long id) {
        trafoCenterRepository.deleteById(id);
    }
}
