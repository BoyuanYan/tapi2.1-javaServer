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
import io.swagger.model.TapiEthEthConnectionEndPointSpec;
import javax.validation.constraints.*;

/**
 * TapiEthConnectionEndPointAugmentation2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthConnectionEndPointAugmentation2   {
  @JsonProperty("eth-connection-end-point-spec")
  private TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec = null;

  public TapiEthConnectionEndPointAugmentation2 ethConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
    return this;
  }

  /**
   * Augments the base LayerProtocol information in ConnectionEndPoint with ETH-specific information
   * @return ethConnectionEndPointSpec
   **/
  @JsonProperty("eth-connection-end-point-spec")
  @ApiModelProperty(value = "Augments the base LayerProtocol information in ConnectionEndPoint with ETH-specific information")
  public TapiEthEthConnectionEndPointSpec getEthConnectionEndPointSpec() {
    return ethConnectionEndPointSpec;
  }

  public void setEthConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthConnectionEndPointAugmentation2 tapiEthConnectionEndPointAugmentation2 = (TapiEthConnectionEndPointAugmentation2) o;
    return Objects.equals(this.ethConnectionEndPointSpec, tapiEthConnectionEndPointAugmentation2.ethConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethConnectionEndPointSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthConnectionEndPointAugmentation2 {\n");
    
    sb.append("    ethConnectionEndPointSpec: ").append(toIndentedString(ethConnectionEndPointSpec)).append("\n");
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

