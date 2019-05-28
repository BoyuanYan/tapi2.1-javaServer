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
import io.swagger.model.TapiEthBandwidthReport;
import io.swagger.model.TapiEthOamPeriod;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiEthEthMepSink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthMepSink   {
  @JsonProperty("dm-1-priority")
  private List<Integer> dm1Priority = null;

  @JsonProperty("lm-m")
  private Integer lmM = 10;

  @JsonProperty("is-csf-reported")
  private Boolean isCsfReported = true;

  @JsonProperty("lm-deg-thr")
  private Integer lmDegThr = 30;

  @JsonProperty("bandwidth-report")
  private TapiEthBandwidthReport bandwidthReport = null;

  @JsonProperty("lm-degm")
  private Integer lmDegm = 10;

  @JsonProperty("is-csf-rdi-fdi-enabled")
  private Boolean isCsfRdiFdiEnabled = true;

  @JsonProperty("ais-period")
  private TapiEthOamPeriod aisPeriod = null;

  @JsonProperty("ais-priority")
  private Integer aisPriority = 7;

  @JsonProperty("lm-tf-min")
  private Integer lmTfMin = null;

  public TapiEthEthMepSink dm1Priority(List<Integer> dm1Priority) {
    this.dm1Priority = dm1Priority;
    return this;
  }

  public TapiEthEthMepSink addDm1PriorityItem(Integer dm1PriorityItem) {
    if (this.dm1Priority == null) {
      this.dm1Priority = new ArrayList<Integer>();
    }
    this.dm1Priority.add(dm1PriorityItem);
    return this;
  }

  /**
   * This attribute indicates the list of 1DM priorities for the MepSink.
   * @return dm1Priority
   **/
  @JsonProperty("dm-1-priority")
  @ApiModelProperty(value = "This attribute indicates the list of 1DM priorities for the MepSink.")
  public List<Integer> getDm1Priority() {
    return dm1Priority;
  }

  public void setDm1Priority(List<Integer> dm1Priority) {
    this.dm1Priority = dm1Priority;
  }

  public TapiEthEthMepSink lmM(Integer lmM) {
    this.lmM = lmM;
    return this;
  }

  /**
   * This attribute defines the number of consecutive good seconds necessary for the clearing of &#39;degraded&#39;. See also section &#39;Degraded signal defect (dDEG)&#39; in G.8021.
   * @return lmM
   **/
  @JsonProperty("lm-m")
  @ApiModelProperty(value = "This attribute defines the number of consecutive good seconds necessary for the clearing of 'degraded'. See also section 'Degraded signal defect (dDEG)' in G.8021.")
  public Integer getLmM() {
    return lmM;
  }

  public void setLmM(Integer lmM) {
    this.lmM = lmM;
  }

  public TapiEthEthMepSink isCsfReported(Boolean isCsfReported) {
    this.isCsfReported = isCsfReported;
    return this;
  }

  /**
   * This attribute models the MI_CSF_Reported signal defined in G.8021 and configured as specified in G8051. It configures whether the secondary failure CSF should be reported or not.
   * @return isCsfReported
   **/
  @JsonProperty("is-csf-reported")
  @ApiModelProperty(value = "This attribute models the MI_CSF_Reported signal defined in G.8021 and configured as specified in G8051. It configures whether the secondary failure CSF should be reported or not.")
  public Boolean isIsCsfReported() {
    return isCsfReported;
  }

  public void setIsCsfReported(Boolean isCsfReported) {
    this.isCsfReported = isCsfReported;
  }

  public TapiEthEthMepSink lmDegThr(Integer lmDegThr) {
    this.lmDegThr = lmDegThr;
    return this;
  }

  /**
   * This attribute defines the threshold for declaring a &#39;bad second&#39;. See also section &#39;Degraded signal defect (dDEG)&#39; in G.8021.
   * @return lmDegThr
   **/
  @JsonProperty("lm-deg-thr")
  @ApiModelProperty(value = "This attribute defines the threshold for declaring a 'bad second'. See also section 'Degraded signal defect (dDEG)' in G.8021.")
  public Integer getLmDegThr() {
    return lmDegThr;
  }

  public void setLmDegThr(Integer lmDegThr) {
    this.lmDegThr = lmDegThr;
  }

  public TapiEthEthMepSink bandwidthReport(TapiEthBandwidthReport bandwidthReport) {
    this.bandwidthReport = bandwidthReport;
    return this;
  }

  /**
   * This attribute models the content of the bandwidth report received by the MEP Sink from the peer MEP Source.
   * @return bandwidthReport
   **/
  @JsonProperty("bandwidth-report")
  @ApiModelProperty(value = "This attribute models the content of the bandwidth report received by the MEP Sink from the peer MEP Source.")
  public TapiEthBandwidthReport getBandwidthReport() {
    return bandwidthReport;
  }

  public void setBandwidthReport(TapiEthBandwidthReport bandwidthReport) {
    this.bandwidthReport = bandwidthReport;
  }

  public TapiEthEthMepSink lmDegm(Integer lmDegm) {
    this.lmDegm = lmDegm;
    return this;
  }

  /**
   * This attribute defines the number of consecutive bad seconds necessary for the &#39;degraded&#39; detection. See also section &#39;Degraded signal defect (dDEG)&#39; in G.8021.
   * @return lmDegm
   **/
  @JsonProperty("lm-degm")
  @ApiModelProperty(value = "This attribute defines the number of consecutive bad seconds necessary for the 'degraded' detection. See also section 'Degraded signal defect (dDEG)' in G.8021.")
  public Integer getLmDegm() {
    return lmDegm;
  }

  public void setLmDegm(Integer lmDegm) {
    this.lmDegm = lmDegm;
  }

  public TapiEthEthMepSink isCsfRdiFdiEnabled(Boolean isCsfRdiFdiEnabled) {
    this.isCsfRdiFdiEnabled = isCsfRdiFdiEnabled;
    return this;
  }

  /**
   * This attribute models the MI_CSFrdifdiEnable signal defined in G.8021 and configured as specified in G8051.
   * @return isCsfRdiFdiEnabled
   **/
  @JsonProperty("is-csf-rdi-fdi-enabled")
  @ApiModelProperty(value = "This attribute models the MI_CSFrdifdiEnable signal defined in G.8021 and configured as specified in G8051.")
  public Boolean isIsCsfRdiFdiEnabled() {
    return isCsfRdiFdiEnabled;
  }

  public void setIsCsfRdiFdiEnabled(Boolean isCsfRdiFdiEnabled) {
    this.isCsfRdiFdiEnabled = isCsfRdiFdiEnabled;
  }

  public TapiEthEthMepSink aisPeriod(TapiEthOamPeriod aisPeriod) {
    this.aisPeriod = aisPeriod;
    return this;
  }

  /**
   * This attribute models the MI_AIS_Period signal defined in G.8021 and configured as specified in G8051. It is the frequency at which the AIS messages should be sent.                      range of type : 1s, 1min
   * @return aisPeriod
   **/
  @JsonProperty("ais-period")
  @ApiModelProperty(value = "This attribute models the MI_AIS_Period signal defined in G.8021 and configured as specified in G8051. It is the frequency at which the AIS messages should be sent.                      range of type : 1s, 1min")
  public TapiEthOamPeriod getAisPeriod() {
    return aisPeriod;
  }

  public void setAisPeriod(TapiEthOamPeriod aisPeriod) {
    this.aisPeriod = aisPeriod;
  }

  public TapiEthEthMepSink aisPriority(Integer aisPriority) {
    this.aisPriority = aisPriority;
    return this;
  }

  /**
   * This attribute models the MI_AIS_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the AIS messages should be sent.
   * @return aisPriority
   **/
  @JsonProperty("ais-priority")
  @ApiModelProperty(value = "This attribute models the MI_AIS_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the AIS messages should be sent.")
  public Integer getAisPriority() {
    return aisPriority;
  }

  public void setAisPriority(Integer aisPriority) {
    this.aisPriority = aisPriority;
  }

  public TapiEthEthMepSink lmTfMin(Integer lmTfMin) {
    this.lmTfMin = lmTfMin;
    return this;
  }

  /**
   * This attribute defines the necessary number of transmitted frames to enable the detection of &#39;bad seconds&#39;. See also section &#39;Degraded signal defect (dDEG)&#39; in G.8021.
   * @return lmTfMin
   **/
  @JsonProperty("lm-tf-min")
  @ApiModelProperty(value = "This attribute defines the necessary number of transmitted frames to enable the detection of 'bad seconds'. See also section 'Degraded signal defect (dDEG)' in G.8021.")
  public Integer getLmTfMin() {
    return lmTfMin;
  }

  public void setLmTfMin(Integer lmTfMin) {
    this.lmTfMin = lmTfMin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepSink tapiEthEthMepSink = (TapiEthEthMepSink) o;
    return Objects.equals(this.dm1Priority, tapiEthEthMepSink.dm1Priority) &&
        Objects.equals(this.lmM, tapiEthEthMepSink.lmM) &&
        Objects.equals(this.isCsfReported, tapiEthEthMepSink.isCsfReported) &&
        Objects.equals(this.lmDegThr, tapiEthEthMepSink.lmDegThr) &&
        Objects.equals(this.bandwidthReport, tapiEthEthMepSink.bandwidthReport) &&
        Objects.equals(this.lmDegm, tapiEthEthMepSink.lmDegm) &&
        Objects.equals(this.isCsfRdiFdiEnabled, tapiEthEthMepSink.isCsfRdiFdiEnabled) &&
        Objects.equals(this.aisPeriod, tapiEthEthMepSink.aisPeriod) &&
        Objects.equals(this.aisPriority, tapiEthEthMepSink.aisPriority) &&
        Objects.equals(this.lmTfMin, tapiEthEthMepSink.lmTfMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dm1Priority, lmM, isCsfReported, lmDegThr, bandwidthReport, lmDegm, isCsfRdiFdiEnabled, aisPeriod, aisPriority, lmTfMin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepSink {\n");
    
    sb.append("    dm1Priority: ").append(toIndentedString(dm1Priority)).append("\n");
    sb.append("    lmM: ").append(toIndentedString(lmM)).append("\n");
    sb.append("    isCsfReported: ").append(toIndentedString(isCsfReported)).append("\n");
    sb.append("    lmDegThr: ").append(toIndentedString(lmDegThr)).append("\n");
    sb.append("    bandwidthReport: ").append(toIndentedString(bandwidthReport)).append("\n");
    sb.append("    lmDegm: ").append(toIndentedString(lmDegm)).append("\n");
    sb.append("    isCsfRdiFdiEnabled: ").append(toIndentedString(isCsfRdiFdiEnabled)).append("\n");
    sb.append("    aisPeriod: ").append(toIndentedString(aisPeriod)).append("\n");
    sb.append("    aisPriority: ").append(toIndentedString(aisPriority)).append("\n");
    sb.append("    lmTfMin: ").append(toIndentedString(lmTfMin)).append("\n");
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

