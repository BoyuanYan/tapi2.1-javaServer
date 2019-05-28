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
import io.swagger.model.TapiOamOamService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamservicelistOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamGetoamservicelistOutput   {
  @JsonProperty("service")
  private List<TapiOamOamService> service = null;

  public TapiOamGetoamservicelistOutput service(List<TapiOamOamService> service) {
    this.service = service;
    return this;
  }

  public TapiOamGetoamservicelistOutput addServiceItem(TapiOamOamService serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<TapiOamOamService>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * none
   * @return service
   **/
  @JsonProperty("service")
  @ApiModelProperty(value = "none")
  public List<TapiOamOamService> getService() {
    return service;
  }

  public void setService(List<TapiOamOamService> service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetoamservicelistOutput tapiOamGetoamservicelistOutput = (TapiOamGetoamservicelistOutput) o;
    return Objects.equals(this.service, tapiOamGetoamservicelistOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamservicelistOutput {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

