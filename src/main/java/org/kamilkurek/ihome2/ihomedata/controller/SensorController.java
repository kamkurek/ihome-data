package org.kamilkurek.ihome2.ihomedata.controller;


import org.kamilkurek.ihome2.ihomedata.dao.SensorDataRepository;
import org.kamilkurek.ihome2.ihomedata.dto.SensorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {

  private final Logger logger = LoggerFactory.getLogger(SensorController.class);
  private final SensorDataRepository sensorDataRepository;

  @Autowired
  public SensorController(SensorDataRepository sensorDataRepository) {
    this.sensorDataRepository = sensorDataRepository;
  }

  @PostMapping("/sensor/{sensorId}")
  public void sensorPost(@PathVariable String sensorId, @RequestParam String value) {
    logger.debug("POST, sensorId {}, value {}", sensorId, value);
    sensorDataRepository.save(new SensorData(sensorId, value));
  }

  @GetMapping("/sensor/{sensorId}")
  public SensorData sensorGet(@PathVariable String sensorId) {
    logger.debug("GET, sensorId {}", sensorId);
    return sensorDataRepository.findTopBySensorIdOrderByDateDesc(sensorId);
  }

}
