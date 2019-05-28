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
import io.swagger.model.TapiEthEthMepCommon;
import io.swagger.model.TapiEthEthMepSink;
import io.swagger.model.TapiEthEthMepSource;
import javax.validation.constraints.*;

/**
 * TapiEthEthMepSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthMepSpec   {
  @JsonProperty("eth-mep-common")
  private TapiEthEthMepCommon ethMepCommon = null;

  @JsonProperty("eth-mep-sink")
  private TapiEthEthMepSink ethMepSink = null;

  @JsonProperty("eth-mep-source-pac")
  private TapiEthEthMepSource ethMepSourcePac = null;

  public TapiEthEthMepSpec ethMepCommon(TapiEthEthMepCommon ethMepCommon) {
    this.ethMepCommon = ethMepCommon;
    return this;
  }

  /**
   * none
   * @return ethMepCommon
   **/
  @JsonProperty("eth-mep-common")
  @ApiModelProperty(value = "none")
  public TapiEthEthMepCommon getEthMepCommon() {
    return ethMepCommon;
  }

  public void setEthMepCommon(TapiEthEthMepCommon ethMepCommon) {
    this.ethMepCommon = ethMepCommon;
  }

  public TapiEthEthMepSpec ethMepSink(TapiEthEthMepSink ethMepSink) {
    this.ethMepSink = ethMepSink;
    return this;
  }

  /**
   * none
   * @return ethMepSink
   **/
  @JsonProperty("eth-mep-sink")
  @ApiModelProperty(value = "none")
  public TapiEthEthMepSink getEthMepSink() {
    return ethMepSink;
  }

  public void setEthMepSink(TapiEthEthMepSink ethMepSink) {
    this.ethMepSink = ethMepSink;
  }

  public TapiEthEthMepSpec ethMepSourcePac(TapiEthEthMepSource ethMepSourcePac) {
    this.ethMepSourcePac = ethMepSourcePac;
    return this;
  }

  /**
   * none
   * @return ethMepSourcePac
   **/
  @JsonProperty("eth-mep-source-pac")
  @ApiModelProperty(value = "none")
  public TapiEthEthMepSource getEthMepSourcePac() {
    return ethMepSourcePac;
  }

  public void setEthMepSourcePac(TapiEthEthMepSource ethMepSourcePac) {
    this.ethMepSourcePac = ethMepSourcePac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepSpec tapiEthEthMepSpec = (TapiEthEthMepSpec) o;
    return Objects.equals(this.ethMepCommon, tapiEthEthMepSpec.ethMepCommon) &&
        Objects.equals(this.ethMepSink, tapiEthEthMepSpec.ethMepSink) &&
        Objects.equals(this.ethMepSourcePac, tapiEthEthMepSpec.ethMepSourcePac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMepCommon, ethMepSink, ethMepSourcePac);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepSpec {\n");
    
    sb.append("    ethMepCommon: ").append(toIndentedString(ethMepCommon)).append("\n");
    sb.append("    ethMepSink: ").append(toIndentedString(ethMepSink)).append("\n");
    sb.append("    ethMepSourcePac: ").append(toIndentedString(ethMepSourcePac)).append("\n");
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

