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
import io.swagger.model.TapiEthEthOnDemand2wayMeasurementJob;
import javax.validation.constraints.*;

/**
 * TapiEthOamJobAugmentation5
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthOamJobAugmentation5   {
  @JsonProperty("eth-on-demand-2way-measurement-job")
  private TapiEthEthOnDemand2wayMeasurementJob ethOnDemand2wayMeasurementJob = null;

  public TapiEthOamJobAugmentation5 ethOnDemand2wayMeasurementJob(TapiEthEthOnDemand2wayMeasurementJob ethOnDemand2wayMeasurementJob) {
    this.ethOnDemand2wayMeasurementJob = ethOnDemand2wayMeasurementJob;
    return this;
  }

  /**
   * none
   * @return ethOnDemand2wayMeasurementJob
   **/
  @JsonProperty("eth-on-demand-2way-measurement-job")
  @ApiModelProperty(value = "none")
  public TapiEthEthOnDemand2wayMeasurementJob getEthOnDemand2wayMeasurementJob() {
    return ethOnDemand2wayMeasurementJob;
  }

  public void setEthOnDemand2wayMeasurementJob(TapiEthEthOnDemand2wayMeasurementJob ethOnDemand2wayMeasurementJob) {
    this.ethOnDemand2wayMeasurementJob = ethOnDemand2wayMeasurementJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamJobAugmentation5 tapiEthOamJobAugmentation5 = (TapiEthOamJobAugmentation5) o;
    return Objects.equals(this.ethOnDemand2wayMeasurementJob, tapiEthOamJobAugmentation5.ethOnDemand2wayMeasurementJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOnDemand2wayMeasurementJob);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamJobAugmentation5 {\n");
    
    sb.append("    ethOnDemand2wayMeasurementJob: ").append(toIndentedString(ethOnDemand2wayMeasurementJob)).append("\n");
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

