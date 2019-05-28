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
import io.swagger.model.TapiEthEth1LmThresholdData;
import javax.validation.constraints.*;

/**
 * TapiEthPmThresholdDataAugmentation4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthPmThresholdDataAugmentation4   {
  @JsonProperty("eth-1-lm-threshold-data")
  private TapiEthEth1LmThresholdData eth1LmThresholdData = null;

  public TapiEthPmThresholdDataAugmentation4 eth1LmThresholdData(TapiEthEth1LmThresholdData eth1LmThresholdData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthPmThresholdDataAugmentation4 tapiEthPmThresholdDataAugmentation4 = (TapiEthPmThresholdDataAugmentation4) o;
    return Objects.equals(this.eth1LmThresholdData, tapiEthPmThresholdDataAugmentation4.eth1LmThresholdData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eth1LmThresholdData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthPmThresholdDataAugmentation4 {\n");
    
    sb.append("    eth1LmThresholdData: ").append(toIndentedString(eth1LmThresholdData)).append("\n");
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

