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
import javax.validation.constraints.*;

/**
 * TapiEthEthOamOperationCommonPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthOamOperationCommonPac   {
  @JsonProperty("priority")
  private Integer priority = 7;

  @JsonProperty("destination-address")
  private String destinationAddress = null;

  public TapiEthEthOamOperationCommonPac priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * G.8052: This parameter provides the priority to be used in the LBM frame.
   * @return priority
   **/
  @JsonProperty("priority")
  @ApiModelProperty(value = "G.8052: This parameter provides the priority to be used in the LBM frame.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TapiEthEthOamOperationCommonPac destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * G.8052: This parameter provides the destination address, i.e., the MAC Address of the target MEP or MIP.
   * @return destinationAddress
   **/
  @JsonProperty("destination-address")
  @ApiModelProperty(value = "G.8052: This parameter provides the destination address, i.e., the MAC Address of the target MEP or MIP.")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOamOperationCommonPac tapiEthEthOamOperationCommonPac = (TapiEthEthOamOperationCommonPac) o;
    return Objects.equals(this.priority, tapiEthEthOamOperationCommonPac.priority) &&
        Objects.equals(this.destinationAddress, tapiEthEthOamOperationCommonPac.destinationAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, destinationAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOamOperationCommonPac {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
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

