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
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationState;
import javax.validation.constraints.*;

/**
 * TapiCommonTerminationPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonTerminationPac   {
  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  public TapiCommonTerminationPac terminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
    return this;
  }

  /**
   * The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows
   * @return terminationDirection
   **/
  @JsonProperty("termination-direction")
  @ApiModelProperty(value = "The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows")
  public TapiCommonTerminationDirection getTerminationDirection() {
    return terminationDirection;
  }

  public void setTerminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
  }

  public TapiCommonTerminationPac terminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
    return this;
  }

  /**
   * Indicates whether the layer is terminated and if so how.
   * @return terminationState
   **/
  @JsonProperty("termination-state")
  @ApiModelProperty(value = "Indicates whether the layer is terminated and if so how.")
  public TapiCommonTerminationState getTerminationState() {
    return terminationState;
  }

  public void setTerminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonTerminationPac tapiCommonTerminationPac = (TapiCommonTerminationPac) o;
    return Objects.equals(this.terminationDirection, tapiCommonTerminationPac.terminationDirection) &&
        Objects.equals(this.terminationState, tapiCommonTerminationPac.terminationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminationDirection, terminationState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonTerminationPac {\n");
    
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
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

