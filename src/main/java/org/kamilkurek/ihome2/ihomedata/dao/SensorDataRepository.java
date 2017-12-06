package org.kamilkurek.ihome2.ihomedata.dao;

import org.kamilkurek.ihome2.ihomedata.dto.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorDataRepository extends MongoRepository<SensorData, String> {

  SensorData findTopBySensorIdOrderByDateDesc(String sensorId);

}
