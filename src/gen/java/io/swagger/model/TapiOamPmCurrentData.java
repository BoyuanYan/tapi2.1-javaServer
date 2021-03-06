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
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimeInterval;
import io.swagger.model.TapiCommonTimePeriod;
import io.swagger.model.TapiOamPmHistoryData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamPmCurrentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamPmCurrentData   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("elapsed-time")
  private TapiCommonTimeInterval elapsedTime = null;

  @JsonProperty("pm-history-data")
  private List<TapiOamPmHistoryData> pmHistoryData = null;

  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  @JsonProperty("suspect-interval-flag")
  private Boolean suspectIntervalFlag = false;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public TapiOamPmCurrentData name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamPmCurrentData addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiOamPmCurrentData localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
   **/
  @JsonProperty("local-id")
  @ApiModelProperty(value = "none")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public TapiOamPmCurrentData elapsedTime(TapiCommonTimeInterval elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * none
   * @return elapsedTime
   **/
  @JsonProperty("elapsed-time")
  @ApiModelProperty(value = "none")
  public TapiCommonTimeInterval getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(TapiCommonTimeInterval elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public TapiOamPmCurrentData pmHistoryData(List<TapiOamPmHistoryData> pmHistoryData) {
    this.pmHistoryData = pmHistoryData;
    return this;
  }

  public TapiOamPmCurrentData addPmHistoryDataItem(TapiOamPmHistoryData pmHistoryDataItem) {
    if (this.pmHistoryData == null) {
      this.pmHistoryData = new ArrayList<TapiOamPmHistoryData>();
    }
    this.pmHistoryData.add(pmHistoryDataItem);
    return this;
  }

  /**
   * in case of 24hr Current Data, at least 1 History Data.                      In case of 15min Current Data, at least 16 History Data.                      In case of &lt;15min, the number of History Data shall be able to cover a span of 4 hours.
   * @return pmHistoryData
   **/
  @JsonProperty("pm-history-data")
  @ApiModelProperty(value = "in case of 24hr Current Data, at least 1 History Data.                      In case of 15min Current Data, at least 16 History Data.                      In case of <15min, the number of History Data shall be able to cover a span of 4 hours.")
  public List<TapiOamPmHistoryData> getPmHistoryData() {
    return pmHistoryData;
  }

  public void setPmHistoryData(List<TapiOamPmHistoryData> pmHistoryData) {
    this.pmHistoryData = pmHistoryData;
  }

  public TapiOamPmCurrentData granularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
    return this;
  }

  /**
   * none
   * @return granularityPeriod
   **/
  @JsonProperty("granularity-period")
  @ApiModelProperty(value = "none")
  public TapiCommonTimePeriod getGranularityPeriod() {
    return granularityPeriod;
  }

  public void setGranularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
  }

  public TapiOamPmCurrentData suspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
    return this;
  }

  /**
   * This attribute is used to indicate that the performance data for the current period may not be reliable. Some reasons for this to occur are:                      – Suspect data were detected by the actual resource doing data collection.                      – Transition of the administrativeState attribute to/from the &#39;lock&#39; state.                      – Transition of the operationalState to/from the &#39;disabled&#39; state.                      – Scheduler setting that inhibits the collection function.                      – The performance counters were reset during the interval.                      – The currentData (or subclass) object instance was created during the monitoring period.
   * @return suspectIntervalFlag
   **/
  @JsonProperty("suspect-interval-flag")
  @ApiModelProperty(value = "This attribute is used to indicate that the performance data for the current period may not be reliable. Some reasons for this to occur are:                      – Suspect data were detected by the actual resource doing data collection.                      – Transition of the administrativeState attribute to/from the 'lock' state.                      – Transition of the operationalState to/from the 'disabled' state.                      – Scheduler setting that inhibits the collection function.                      – The performance counters were reset during the interval.                      – The currentData (or subclass) object instance was created during the monitoring period.")
  public Boolean isSuspectIntervalFlag() {
    return suspectIntervalFlag;
  }

  public void setSuspectIntervalFlag(Boolean suspectIntervalFlag) {
    this.suspectIntervalFlag = suspectIntervalFlag;
  }

  public TapiOamPmCurrentData timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * This attribute indicates the start of the current monitoring interval.                      The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.
   * @return timestamp
   **/
  @JsonProperty("timestamp")
  @ApiModelProperty(value = "This attribute indicates the start of the current monitoring interval.                      The value is bound to the quarter of an hour in case of a 15 minute interval and bound to the hour in case of a 24 hour interval.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmCurrentData tapiOamPmCurrentData = (TapiOamPmCurrentData) o;
    return Objects.equals(this.name, tapiOamPmCurrentData.name) &&
        Objects.equals(this.localId, tapiOamPmCurrentData.localId) &&
        Objects.equals(this.elapsedTime, tapiOamPmCurrentData.elapsedTime) &&
        Objects.equals(this.pmHistoryData, tapiOamPmCurrentData.pmHistoryData) &&
        Objects.equals(this.granularityPeriod, tapiOamPmCurrentData.granularityPeriod) &&
        Objects.equals(this.suspectIntervalFlag, tapiOamPmCurrentData.suspectIntervalFlag) &&
        Objects.equals(this.timestamp, tapiOamPmCurrentData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, localId, elapsedTime, pmHistoryData, granularityPeriod, suspectIntervalFlag, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmCurrentData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    pmHistoryData: ").append(toIndentedString(pmHistoryData)).append("\n");
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
    sb.append("    suspectIntervalFlag: ").append(toIndentedString(suspectIntervalFlag)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

