package org.shpet.sensor.services;

import org.shpet.sensor.models.Sensor;
import org.shpet.sensor.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class SensorService {
    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Optional<Sensor> findByName (String name) {
        return sensorRepository.findByName(name);
    }

    @Transactional
    public void register(Sensor sensor) {
        sensorRepository.save(sensor);
    }


}
