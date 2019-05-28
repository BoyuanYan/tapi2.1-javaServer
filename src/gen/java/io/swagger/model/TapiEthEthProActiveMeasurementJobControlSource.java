/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthOamPeriod;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveMeasurementJobControlSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthProActiveMeasurementJobControlSource   {
  @JsonProperty("data-tlv-length")
  private Integer dataTlvLength = null;

  @JsonProperty("period")
  private TapiEthOamPeriod period = null;

  @JsonProperty("test-identifier")
  private Integer testIdentifier = null;

  @JsonProperty("destination-address")
  private String destinationAddress = null;

  @JsonProperty("priority")
  private Integer priority = 7;

  @JsonProperty("controller-mep-id")
  private String controllerMepId = null;

  @JsonProperty("is-enabled")
  private Boolean isEnabled = true;

  public TapiEthEthProActiveMeasurementJobControlSource dataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
    return this;
  }

  /**
   * This parameter provides the size of the optional data TLV.                      Non-negative integer represents the number of bytes for the length of the padding TLV.                      Notes:                      When configuring this parameter one should be aware of the maximum allowed total frame size limitation.                      The attribute is not used in case of 2-way loss measurement.                      range of type : Depends on the allowed MTU size.
   * @return dataTlvLength
   **/
  @JsonProperty("data-tlv-length")
  @ApiModelProperty(value = "This parameter provides the size of the optional data TLV.                      Non-negative integer represents the number of bytes for the length of the padding TLV.                      Notes:                      When configuring this parameter one should be aware of the maximum allowed total frame size limitation.                      The attribute is not used in case of 2-way loss measurement.                      range of type : Depends on the allowed MTU size.")
  public Integer getDataTlvLength() {
    return dataTlvLength;
  }

  public void setDataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
  }

  public TapiEthEthProActiveMeasurementJobControlSource period(TapiEthOamPeriod period) {
    this.period = period;
    return this;
  }

  /**
   * This attribute indicates the period (frequency) of the measurement frame transmission.                      range of type : 100ms, 1s, 10s
   * @return period
   **/
  @JsonProperty("period")
  @ApiModelProperty(value = "This attribute indicates the period (frequency) of the measurement frame transmission.                      range of type : 100ms, 1s, 10s")
  public TapiEthOamPeriod getPeriod() {
    return period;
  }

  public void setPeriod(TapiEthOamPeriod period) {
    this.period = period;
  }

  public TapiEthEthProActiveMeasurementJobControlSource testIdentifier(Integer testIdentifier) {
    this.testIdentifier = testIdentifier;
    return this;
  }

  /**
   * This attribute is used to distinguish each measurement session if multiple measurement sessions are simultaneously activated towards a peer MEP including concurrent on-demand and proactive tests. It must be unique at least within the context of any measurement type for the MEG and initiating MEP.                      Note: The attribute is not used in case of 2-way loss measurement.                       range of type : 0..(2^32) - 1
   * @return testIdentifier
   **/
  @JsonProperty("test-identifier")
  @ApiModelProperty(value = "This attribute is used to distinguish each measurement session if multiple measurement sessions are simultaneously activated towards a peer MEP including concurrent on-demand and proactive tests. It must be unique at least within the context of any measurement type for the MEG and initiating MEP.                      Note: The attribute is not used in case of 2-way loss measurement.                       range of type : 0..(2^32) - 1")
  public Integer getTestIdentifier() {
    return testIdentifier;
  }

  public void setTestIdentifier(Integer testIdentifier) {
    this.testIdentifier = testIdentifier;
  }

  public TapiEthEthProActiveMeasurementJobControlSource destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * This attribute provides the Unicast MAC address of the intented destination.
   * @return destinationAddress
   **/
  @JsonProperty("destination-address")
  @ApiModelProperty(value = "This attribute provides the Unicast MAC address of the intented destination.")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public TapiEthEthProActiveMeasurementJobControlSource priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * This attribute contains the priority value on which the MEP performs the measurement. When the measurement is enabled, the MEP should use this value to encode the priority of generated measurement frames. The EMF usese this value to assign the P parameter of the measurement operation.
   * @return priority
   **/
  @JsonProperty("priority")
  @ApiModelProperty(value = "This attribute contains the priority value on which the MEP performs the measurement. When the measurement is enabled, the MEP should use this value to encode the priority of generated measurement frames. The EMF usese this value to assign the P parameter of the measurement operation.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TapiEthEthProActiveMeasurementJobControlSource controllerMepId(String controllerMepId) {
    this.controllerMepId = controllerMepId;
    return this;
  }

  /**
   * none
   * @return controllerMepId
   **/
  @JsonProperty("controller-mep-id")
  @ApiModelProperty(value = "none")
  public String getControllerMepId() {
    return controllerMepId;
  }

  public void setControllerMepId(String controllerMepId) {
    this.controllerMepId = controllerMepId;
  }

  public TapiEthEthProActiveMeasurementJobControlSource isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.
   * @return isEnabled
   **/
  @JsonProperty("is-enabled")
  @ApiModelProperty(value = "This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveMeasurementJobControlSource tapiEthEthProActiveMeasurementJobControlSource = (TapiEthEthProActiveMeasurementJobControlSource) o;
    return Objects.equals(this.dataTlvLength, tapiEthEthProActiveMeasurementJobControlSource.dataTlvLength) &&
        Objects.equals(this.period, tapiEthEthProActiveMeasurementJobControlSource.period) &&
        Objects.equals(this.testIdentifier, tapiEthEthProActiveMeasurementJobControlSource.testIdentifier) &&
        Objects.equals(this.destinationAddress, tapiEthEthProActiveMeasurementJobControlSource.destinationAddress) &&
        Objects.equals(this.priority, tapiEthEthProActiveMeasurementJobControlSource.priority) &&
        Objects.equals(this.controllerMepId, tapiEthEthProActiveMeasurementJobControlSource.controllerMepId) &&
        Objects.equals(this.isEnabled, tapiEthEthProActiveMeasurementJobControlSource.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTlvLength, period, testIdentifier, destinationAddress, priority, controllerMepId, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveMeasurementJobControlSource {\n");
    
    sb.append("    dataTlvLength: ").append(toIndentedString(dataTlvLength)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    testIdentifier: ").append(toIndentedString(testIdentifier)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    controllerMepId: ").append(toIndentedString(controllerMepId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

