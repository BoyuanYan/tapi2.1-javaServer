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
import io.swagger.model.TapiEthFrameType;
import io.swagger.model.TapiEthPcpCoding;
import io.swagger.model.TapiEthPriorityMapping;
import io.swagger.model.TapiEthVlanType;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiEthEthTerminationPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthTerminationPac   {
  @JsonProperty("filter-config-1")
  private List<String> filterConfig1 = null;

  @JsonProperty("ether-type")
  private TapiEthVlanType etherType = null;

  @JsonProperty("priority-code-point-config")
  private TapiEthPcpCoding priorityCodePointConfig = null;

  @JsonProperty("frametype-config")
  private TapiEthFrameType frametypeConfig = null;

  @JsonProperty("port-vid")
  private String portVid = "1";

  @JsonProperty("priority-regenerate")
  private TapiEthPriorityMapping priorityRegenerate = null;

  public TapiEthEthTerminationPac filterConfig1(List<String> filterConfig1) {
    this.filterConfig1 = filterConfig1;
    return this;
  }

  public TapiEthEthTerminationPac addFilterConfig1Item(String filterConfig1Item) {
    if (this.filterConfig1 == null) {
      this.filterConfig1 = new ArrayList<String>();
    }
    this.filterConfig1.add(filterConfig1Item);
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m_A_Sk_MI_Filter_Config information defined in G.8021.                      It indicates the configured filter action for each of the 33 group MAC addresses for control frames.                      The 33 MAC addresses are:                      01-80-C2-00-00-10,                       01-80-C2-00-00-00 to 01-80-C2-00-00-0F, and                       01-80-C2-00-00-20 to 01-80-C2-00-00-2F.                      The filter action is Pass or Block.                       If the destination address of the incoming ETH_CI_D matches one of the above addresses, the filter process shall perform the corresponding configured filter action.                       If none of the above addresses match, the ETH_CI_D is passed.                      range of type : MacAddress:                       01-80-C2-00-00-10,                       01-80-C2-00-00-00 to                       01-80-C2-00-00-0F, and                       01-80-C2-00-00-20 to                       01-80-C2-00-00-2F;                      ActionEnum:                      PASS, BLOCK
   * @return filterConfig1
   **/
  @JsonProperty("filter-config-1")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m_A_Sk_MI_Filter_Config information defined in G.8021.                      It indicates the configured filter action for each of the 33 group MAC addresses for control frames.                      The 33 MAC addresses are:                      01-80-C2-00-00-10,                       01-80-C2-00-00-00 to 01-80-C2-00-00-0F, and                       01-80-C2-00-00-20 to 01-80-C2-00-00-2F.                      The filter action is Pass or Block.                       If the destination address of the incoming ETH_CI_D matches one of the above addresses, the filter process shall perform the corresponding configured filter action.                       If none of the above addresses match, the ETH_CI_D is passed.                      range of type : MacAddress:                       01-80-C2-00-00-10,                       01-80-C2-00-00-00 to                       01-80-C2-00-00-0F, and                       01-80-C2-00-00-20 to                       01-80-C2-00-00-2F;                      ActionEnum:                      PASS, BLOCK")
  public List<String> getFilterConfig1() {
    return filterConfig1;
  }

  public void setFilterConfig1(List<String> filterConfig1) {
    this.filterConfig1 = filterConfig1;
  }

  public TapiEthEthTerminationPac etherType(TapiEthVlanType etherType) {
    this.etherType = etherType;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m _A_Sk_MI_Etype information defined in G.8021.
   * @return etherType
   **/
  @JsonProperty("ether-type")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m _A_Sk_MI_Etype information defined in G.8021.")
  public TapiEthVlanType getEtherType() {
    return etherType;
  }

  public void setEtherType(TapiEthVlanType etherType) {
    this.etherType = etherType;
  }

  public TapiEthEthTerminationPac priorityCodePointConfig(TapiEthPcpCoding priorityCodePointConfig) {
    this.priorityCodePointConfig = priorityCodePointConfig;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m _A_Sk_MI_PCP_Config information defined in G.8021.                      range of type : see Enumeration
   * @return priorityCodePointConfig
   **/
  @JsonProperty("priority-code-point-config")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m _A_Sk_MI_PCP_Config information defined in G.8021.                      range of type : see Enumeration")
  public TapiEthPcpCoding getPriorityCodePointConfig() {
    return priorityCodePointConfig;
  }

  public void setPriorityCodePointConfig(TapiEthPcpCoding priorityCodePointConfig) {
    this.priorityCodePointConfig = priorityCodePointConfig;
  }

  public TapiEthEthTerminationPac frametypeConfig(TapiEthFrameType frametypeConfig) {
    this.frametypeConfig = frametypeConfig;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m_A_Sk_MI_Frametype_Config information defined in G.8021.                      range of type : see Enumeration
   * @return frametypeConfig
   **/
  @JsonProperty("frametype-config")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m_A_Sk_MI_Frametype_Config information defined in G.8021.                      range of type : see Enumeration")
  public TapiEthFrameType getFrametypeConfig() {
    return frametypeConfig;
  }

  public void setFrametypeConfig(TapiEthFrameType frametypeConfig) {
    this.frametypeConfig = frametypeConfig;
  }

  public TapiEthEthTerminationPac portVid(String portVid) {
    this.portVid = portVid;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m _A_Sk_MI_PVID information defined in G.8021.
   * @return portVid
   **/
  @JsonProperty("port-vid")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m _A_Sk_MI_PVID information defined in G.8021.")
  public String getPortVid() {
    return portVid;
  }

  public void setPortVid(String portVid) {
    this.portVid = portVid;
  }

  public TapiEthEthTerminationPac priorityRegenerate(TapiEthPriorityMapping priorityRegenerate) {
    this.priorityRegenerate = priorityRegenerate;
    return this;
  }

  /**
   * This attribute models the ETHx/ETH-m _A_Sk_MI_P_Regenerate information defined in G.8021.
   * @return priorityRegenerate
   **/
  @JsonProperty("priority-regenerate")
  @ApiModelProperty(value = "This attribute models the ETHx/ETH-m _A_Sk_MI_P_Regenerate information defined in G.8021.")
  public TapiEthPriorityMapping getPriorityRegenerate() {
    return priorityRegenerate;
  }

  public void setPriorityRegenerate(TapiEthPriorityMapping priorityRegenerate) {
    this.priorityRegenerate = priorityRegenerate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthTerminationPac tapiEthEthTerminationPac = (TapiEthEthTerminationPac) o;
    return Objects.equals(this.filterConfig1, tapiEthEthTerminationPac.filterConfig1) &&
        Objects.equals(this.etherType, tapiEthEthTerminationPac.etherType) &&
        Objects.equals(this.priorityCodePointConfig, tapiEthEthTerminationPac.priorityCodePointConfig) &&
        Objects.equals(this.frametypeConfig, tapiEthEthTerminationPac.frametypeConfig) &&
        Objects.equals(this.portVid, tapiEthEthTerminationPac.portVid) &&
        Objects.equals(this.priorityRegenerate, tapiEthEthTerminationPac.priorityRegenerate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterConfig1, etherType, priorityCodePointConfig, frametypeConfig, portVid, priorityRegenerate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthTerminationPac {\n");
    
    sb.append("    filterConfig1: ").append(toIndentedString(filterConfig1)).append("\n");
    sb.append("    etherType: ").append(toIndentedString(etherType)).append("\n");
    sb.append("    priorityCodePointConfig: ").append(toIndentedString(priorityCodePointConfig)).append("\n");
    sb.append("    frametypeConfig: ").append(toIndentedString(frametypeConfig)).append("\n");
    sb.append("    portVid: ").append(toIndentedString(portVid)).append("\n");
    sb.append("    priorityRegenerate: ").append(toIndentedString(priorityRegenerate)).append("\n");
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

