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
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimePeriod;
import io.swagger.model.TapiEthEth1DmThresholdData;
import io.swagger.model.TapiEthEth1LmThresholdData;
import io.swagger.model.TapiEthEthDmThresholdData;
import io.swagger.model.TapiEthEthLmThresholdData;
import io.swagger.model.TapiEthPmThresholdDataAugmentation1;
import io.swagger.model.TapiEthPmThresholdDataAugmentation2;
import io.swagger.model.TapiEthPmThresholdDataAugmentation3;
import io.swagger.model.TapiEthPmThresholdDataAugmentation4;
import io.swagger.model.TapiOamPmThresholdData;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamOamprofilePmThresholdData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamOamprofilePmThresholdData   {
  @JsonProperty("eth-dm-threshold-data")
  private TapiEthEthDmThresholdData ethDmThresholdData = null;

  @JsonProperty("eth-lm-threshold-data")
  private TapiEthEthLmThresholdData ethLmThresholdData = null;

  @JsonProperty("eth-1-dm-threshold-data")
  private TapiEthEth1DmThresholdData eth1DmThresholdData = null;

  @JsonProperty("eth-1-lm-threshold-data")
  private TapiEthEth1LmThresholdData eth1LmThresholdData = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("is-transient")
  private Boolean isTransient = false;

  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  public TapiOamOamprofilePmThresholdData ethDmThresholdData(TapiEthEthDmThresholdData ethDmThresholdData) {
    this.ethDmThresholdData = ethDmThresholdData;
    return this;
  }

  /**
   * none
   * @return ethDmThresholdData
   **/
  @JsonProperty("eth-dm-threshold-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthDmThresholdData getEthDmThresholdData() {
    return ethDmThresholdData;
  }

  public void setEthDmThresholdData(TapiEthEthDmThresholdData ethDmThresholdData) {
    this.ethDmThresholdData = ethDmThresholdData;
  }

  public TapiOamOamprofilePmThresholdData ethLmThresholdData(TapiEthEthLmThresholdData ethLmThresholdData) {
    this.ethLmThresholdData = ethLmThresholdData;
    return this;
  }

  /**
   * none
   * @return ethLmThresholdData
   **/
  @JsonProperty("eth-lm-threshold-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthLmThresholdData getEthLmThresholdData() {
    return ethLmThresholdData;
  }

  public void setEthLmThresholdData(TapiEthEthLmThresholdData ethLmThresholdData) {
    this.ethLmThresholdData = ethLmThresholdData;
  }

  public TapiOamOamprofilePmThresholdData eth1DmThresholdData(TapiEthEth1DmThresholdData eth1DmThresholdData) {
    this.eth1DmThresholdData = eth1DmThresholdData;
    return this;
  }

  /**
   * none
   * @return eth1DmThresholdData
   **/
  @JsonProperty("eth-1-dm-threshold-data")
  @ApiModelProperty(value = "none")
  public TapiEthEth1DmThresholdData getEth1DmThresholdData() {
    return eth1DmThresholdData;
  }

  public void setEth1DmThresholdData(TapiEthEth1DmThresholdData eth1DmThresholdData) {
    this.eth1DmThresholdData = eth1DmThresholdData;
  }

  public TapiOamOamprofilePmThresholdData eth1LmThresholdData(TapiEthEth1LmThresholdData eth1LmThresholdData) {
    this.eth1LmThresholdData = eth1LmThresholdData;
    return this;
  }

  /**
   * none
   * @return eth1LmThresholdData
   **/
  @JsonProperty("eth-1-lm-threshold-data")
  @ApiModelProperty(value = "none")
  public TapiEthEth1LmThresholdData getEth1LmThresholdData() {
    return eth1LmThresholdData;
  }

  public void setEth1LmThresholdData(TapiEthEth1LmThresholdData eth1LmThresholdData) {
    this.eth1LmThresholdData = eth1LmThresholdData;
  }

  public TapiOamOamprofilePmThresholdData name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamOamprofilePmThresholdData addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiOamOamprofilePmThresholdData localId(String localId) {
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

  public TapiOamOamprofilePmThresholdData isTransient(Boolean isTransient) {
    this.isTransient = isTransient;
    return this;
  }

  /**
   * none
   * @return isTransient
   **/
  @JsonProperty("is-transient")
  @ApiModelProperty(value = "none")
  public Boolean isIsTransient() {
    return isTransient;
  }

  public void setIsTransient(Boolean isTransient) {
    this.isTransient = isTransient;
  }

  public TapiOamOamprofilePmThresholdData granularityPeriod(TapiCommonTimePeriod granularityPeriod) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamprofilePmThresholdData tapiOamOamprofilePmThresholdData = (TapiOamOamprofilePmThresholdData) o;
    return Objects.equals(this.ethDmThresholdData, tapiOamOamprofilePmThresholdData.ethDmThresholdData) &&
        Objects.equals(this.ethLmThresholdData, tapiOamOamprofilePmThresholdData.ethLmThresholdData) &&
        Objects.equals(this.eth1DmThresholdData, tapiOamOamprofilePmThresholdData.eth1DmThresholdData) &&
        Objects.equals(this.eth1LmThresholdData, tapiOamOamprofilePmThresholdData.eth1LmThresholdData) &&
        Objects.equals(this.name, tapiOamOamprofilePmThresholdData.name) &&
        Objects.equals(this.localId, tapiOamOamprofilePmThresholdData.localId) &&
        Objects.equals(this.isTransient, tapiOamOamprofilePmThresholdData.isTransient) &&
        Objects.equals(this.granularityPeriod, tapiOamOamprofilePmThresholdData.granularityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethDmThresholdData, ethLmThresholdData, eth1DmThresholdData, eth1LmThresholdData, name, localId, isTransient, granularityPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamprofilePmThresholdData {\n");
    
    sb.append("    ethDmThresholdData: ").append(toIndentedString(ethDmThresholdData)).append("\n");
    sb.append("    ethLmThresholdData: ").append(toIndentedString(ethLmThresholdData)).append("\n");
    sb.append("    eth1DmThresholdData: ").append(toIndentedString(eth1DmThresholdData)).append("\n");
    sb.append("    eth1LmThresholdData: ").append(toIndentedString(eth1LmThresholdData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    isTransient: ").append(toIndentedString(isTransient)).append("\n");
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
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

