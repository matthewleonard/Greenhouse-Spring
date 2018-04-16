package com.leonardgarden.greenhouse.equipmentservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * EquipmentHistoryInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-15T16:33:30.590-05:00")

public class EquipmentHistoryInner   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("equipment_id")
  private Integer equipmentId = null;

  @JsonProperty("value")
  private String value = null;

  public EquipmentHistoryInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EquipmentHistoryInner timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public EquipmentHistoryInner equipmentId(Integer equipmentId) {
    this.equipmentId = equipmentId;
    return this;
  }

  /**
   * Get equipmentId
   * @return equipmentId
  **/
  @ApiModelProperty(value = "")


  public Integer getEquipmentId() {
    return equipmentId;
  }

  public void setEquipmentId(Integer equipmentId) {
    this.equipmentId = equipmentId;
  }

  public EquipmentHistoryInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentHistoryInner equipmentHistoryInner = (EquipmentHistoryInner) o;
    return Objects.equals(this.id, equipmentHistoryInner.id) &&
        Objects.equals(this.timestamp, equipmentHistoryInner.timestamp) &&
        Objects.equals(this.equipmentId, equipmentHistoryInner.equipmentId) &&
        Objects.equals(this.value, equipmentHistoryInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, equipmentId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentHistoryInner {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    equipmentId: ").append(toIndentedString(equipmentId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

