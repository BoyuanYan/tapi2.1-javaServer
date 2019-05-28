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
import io.swagger.model.TapiOamOamServiceEndPoint;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamserviceendpointOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamUpdateoamserviceendpointOutput   {
  @JsonProperty("end-point")
  private TapiOamOamServiceEndPoint endPoint = null;

  public TapiOamUpdateoamserviceendpointOutput endPoint(TapiOamOamServiceEndPoint endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  /**
   * none
   * @return endPoint
   **/
  @JsonProperty("end-point")
  @ApiModelProperty(value = "none")
  public TapiOamOamServiceEndPoint getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(TapiOamOamServiceEndPoint endPoint) {
    this.endPoint = endPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamUpdateoamserviceendpointOutput tapiOamUpdateoamserviceendpointOutput = (TapiOamUpdateoamserviceendpointOutput) o;
    return Objects.equals(this.endPoint, tapiOamUpdateoamserviceendpointOutput.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamserviceendpointOutput {\n");
    
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
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

