package com.leonardgarden.greenhouse.equipmentservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Equipment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-15T16:33:30.590-05:00")

public class Equipment   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("controller_id")
  private Integer controllerId = null;

  @JsonProperty("pin_location")
  private String pinLocation = null;

  public Equipment id(Integer id) {
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

  public Equipment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Equipment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Equipment controllerId(Integer controllerId) {
    this.controllerId = controllerId;
    return this;
  }

  /**
   * Get controllerId
   * @return controllerId
  **/
  @ApiModelProperty(value = "")


  public Integer getControllerId() {
    return controllerId;
  }

  public void setControllerId(Integer controllerId) {
    this.controllerId = controllerId;
  }

  public Equipment pinLocation(String pinLocation) {
    this.pinLocation = pinLocation;
    return this;
  }

  /**
   * Get pinLocation
   * @return pinLocation
  **/
  @ApiModelProperty(value = "")


  public String getPinLocation() {
    return pinLocation;
  }

  public void setPinLocation(String pinLocation) {
    this.pinLocation = pinLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Equipment equipment = (Equipment) o;
    return Objects.equals(this.id, equipment.id) &&
        Objects.equals(this.name, equipment.name) &&
        Objects.equals(this.description, equipment.description) &&
        Objects.equals(this.controllerId, equipment.controllerId) &&
        Objects.equals(this.pinLocation, equipment.pinLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, controllerId, pinLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Equipment {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    pinLocation: ").append(toIndentedString(pinLocation)).append("\n");
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

