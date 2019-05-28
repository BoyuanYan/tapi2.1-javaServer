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
import io.swagger.model.TapiPathComputationOptimizep2ppathInput;
import javax.validation.constraints.*;

/**
 * TapiPathComputationOptimizep2ppathInputBodyparam
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPathComputationOptimizep2ppathInputBodyparam   {
  @JsonProperty("input")
  private TapiPathComputationOptimizep2ppathInput input = null;

  public TapiPathComputationOptimizep2ppathInputBodyparam input(TapiPathComputationOptimizep2ppathInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   **/
  @JsonProperty("input")
  @ApiModelProperty(value = "")
  public TapiPathComputationOptimizep2ppathInput getInput() {
    return input;
  }

  public void setInput(TapiPathComputationOptimizep2ppathInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationOptimizep2ppathInputBodyparam tapiPathComputationOptimizep2ppathInputBodyparam = (TapiPathComputationOptimizep2ppathInputBodyparam) o;
    return Objects.equals(this.input, tapiPathComputationOptimizep2ppathInputBodyparam.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationOptimizep2ppathInputBodyparam {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

