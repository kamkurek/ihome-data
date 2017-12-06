package org.kamilkurek.ihome2.ihomedata.dto;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class SensorData {

  @Id
  private String id;
  private String sensorId;
  private Date date;
  private String value;

  public SensorData() {}

  public SensorData(String sensorId, Date date, String value) {
    this.sensorId = sensorId;
    this.date = date;
    this.value = value;
  }

  public SensorData(String sensorId, String value) {
    this.sensorId = sensorId;
    this.value = value;
    this.date = new Date();
  }

  public String getId() {
    return id;
  }

  public String getSensorId() {
    return sensorId;
  }

  public Date getDate() {
    return date;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "SensorData{" +
      "id='" + id + '\'' +
      ", sensorId='" + sensorId + '\'' +
      ", date=" + date +
      ", value='" + value + '\'' +
      '}';
  }
}
