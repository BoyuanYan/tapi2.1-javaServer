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
import io.swagger.model.TapiEthEthOnDemand1LmPerformanceData;
import javax.validation.constraints.*;

/**
 * TapiEthPmHistoryDataAugmentation2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthPmHistoryDataAugmentation2   {
  @JsonProperty("eth-on-demand-1-lm-performance-data")
  private TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData = null;

  public TapiEthPmHistoryDataAugmentation2 ethOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
    return this;
  }

  /**
   * none
   * @return ethOnDemand1LmPerformanceData
   **/
  @JsonProperty("eth-on-demand-1-lm-performance-data")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemand1LmPerformanceData getEthOnDemand1LmPerformanceData() {
    return ethOnDemand1LmPerformanceData;
  }

  public void setEthOnDemand1LmPerformanceData(TapiEthEthOnDemand1LmPerformanceData ethOnDemand1LmPerformanceData) {
    this.ethOnDemand1LmPerformanceData = ethOnDemand1LmPerformanceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthPmHistoryDataAugmentation2 tapiEthPmHistoryDataAugmentation2 = (TapiEthPmHistoryDataAugmentation2) o;
    return Objects.equals(this.ethOnDemand1LmPerformanceData, tapiEthPmHistoryDataAugmentation2.ethOnDemand1LmPerformanceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand1LmPerformanceData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthPmHistoryDataAugmentation2 {\n");
    
    sb.append("    ethOnDemand1LmPerformanceData: ").append(toIndentedString(ethOnDemand1LmPerformanceData)).append("\n");
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

