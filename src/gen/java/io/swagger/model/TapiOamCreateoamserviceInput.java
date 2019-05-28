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
import io.swagger.model.TapiOamOamConstraint;
import io.swagger.model.TapiOamOamServiceEndPoint;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamserviceInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamCreateoamserviceInput   {
  @JsonProperty("oam-constraint")
  private TapiOamOamConstraint oamConstraint = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("end-point")
  private List<TapiOamOamServiceEndPoint> endPoint = null;

  public TapiOamCreateoamserviceInput oamConstraint(TapiOamOamConstraint oamConstraint) {
    this.oamConstraint = oamConstraint;
    return this;
  }

  /**
   * none
   * @return oamConstraint
   **/
  @JsonProperty("oam-constraint")
  @ApiModelProperty(value = "none")
  public TapiOamOamConstraint getOamConstraint() {
    return oamConstraint;
  }

  public void setOamConstraint(TapiOamOamConstraint oamConstraint) {
    this.oamConstraint = oamConstraint;
  }

  public TapiOamCreateoamserviceInput state(String state) {
    this.state = state;
    return this;
  }

  /**
   * none
   * @return state
   **/
  @JsonProperty("state")
  @ApiModelProperty(value = "none")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TapiOamCreateoamserviceInput endPoint(List<TapiOamOamServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiOamCreateoamserviceInput addEndPointItem(TapiOamOamServiceEndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<TapiOamOamServiceEndPoint>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * none
   * @return endPoint
   **/
  @JsonProperty("end-point")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamServiceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiOamOamServiceEndPoint> endPoint) {
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
    TapiOamCreateoamserviceInput tapiOamCreateoamserviceInput = (TapiOamCreateoamserviceInput) o;
    return Objects.equals(this.oamConstraint, tapiOamCreateoamserviceInput.oamConstraint) &&
        Objects.equals(this.state, tapiOamCreateoamserviceInput.state) &&
        Objects.equals(this.endPoint, tapiOamCreateoamserviceInput.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamConstraint, state, endPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamserviceInput {\n");
    
    sb.append("    oamConstraint: ").append(toIndentedString(oamConstraint)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

