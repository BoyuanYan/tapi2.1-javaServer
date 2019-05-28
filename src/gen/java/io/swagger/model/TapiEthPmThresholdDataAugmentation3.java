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
import io.swagger.model.TapiEthEth1DmThresholdData;
import javax.validation.constraints.*;

/**
 * TapiEthPmThresholdDataAugmentation3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthPmThresholdDataAugmentation3   {
  @JsonProperty("eth-1-dm-threshold-data")
  private TapiEthEth1DmThresholdData eth1DmThresholdData = null;

  public TapiEthPmThresholdDataAugmentation3 eth1DmThresholdData(TapiEthEth1DmThresholdData eth1DmThresholdData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthPmThresholdDataAugmentation3 tapiEthPmThresholdDataAugmentation3 = (TapiEthPmThresholdDataAugmentation3) o;
    return Objects.equals(this.eth1DmThresholdData, tapiEthPmThresholdDataAugmentation3.eth1DmThresholdData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eth1DmThresholdData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthPmThresholdDataAugmentation3 {\n");
    
    sb.append("    eth1DmThresholdData: ").append(toIndentedString(eth1DmThresholdData)).append("\n");
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

