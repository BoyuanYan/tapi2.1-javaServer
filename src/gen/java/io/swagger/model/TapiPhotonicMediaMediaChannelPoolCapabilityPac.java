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
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelPoolCapabilityPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaMediaChannelPoolCapabilityPac   {
  @JsonProperty("available-spectrum")
  private List<TapiPhotonicMediaSpectrumBand> availableSpectrum = null;

  @JsonProperty("supportable-spectrum")
  private List<TapiPhotonicMediaSpectrumBand> supportableSpectrum = null;

  @JsonProperty("occupied-spectrum")
  private List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum = null;

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac availableSpectrum(List<TapiPhotonicMediaSpectrumBand> availableSpectrum) {
    this.availableSpectrum = availableSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addAvailableSpectrumItem(TapiPhotonicMediaSpectrumBand availableSpectrumItem) {
    if (this.availableSpectrum == null) {
      this.availableSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.availableSpectrum.add(availableSpectrumItem);
    return this;
  }

  /**
   * none
   * @return availableSpectrum
   **/
  @JsonProperty("available-spectrum")
  @ApiModelProperty(value = "none")
  public List<TapiPhotonicMediaSpectrumBand> getAvailableSpectrum() {
    return availableSpectrum;
  }

  public void setAvailableSpectrum(List<TapiPhotonicMediaSpectrumBand> availableSpectrum) {
    this.availableSpectrum = availableSpectrum;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac supportableSpectrum(List<TapiPhotonicMediaSpectrumBand> supportableSpectrum) {
    this.supportableSpectrum = supportableSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addSupportableSpectrumItem(TapiPhotonicMediaSpectrumBand supportableSpectrumItem) {
    if (this.supportableSpectrum == null) {
      this.supportableSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.supportableSpectrum.add(supportableSpectrumItem);
    return this;
  }

  /**
   * none
   * @return supportableSpectrum
   **/
  @JsonProperty("supportable-spectrum")
  @ApiModelProperty(value = "none")
  public List<TapiPhotonicMediaSpectrumBand> getSupportableSpectrum() {
    return supportableSpectrum;
  }

  public void setSupportableSpectrum(List<TapiPhotonicMediaSpectrumBand> supportableSpectrum) {
    this.supportableSpectrum = supportableSpectrum;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac occupiedSpectrum(List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addOccupiedSpectrumItem(TapiPhotonicMediaSpectrumBand occupiedSpectrumItem) {
    if (this.occupiedSpectrum == null) {
      this.occupiedSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.occupiedSpectrum.add(occupiedSpectrumItem);
    return this;
  }

  /**
   * none
   * @return occupiedSpectrum
   **/
  @JsonProperty("occupied-spectrum")
  @ApiModelProperty(value = "none")
  public List<TapiPhotonicMediaSpectrumBand> getOccupiedSpectrum() {
    return occupiedSpectrum;
  }

  public void setOccupiedSpectrum(List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelPoolCapabilityPac tapiPhotonicMediaMediaChannelPoolCapabilityPac = (TapiPhotonicMediaMediaChannelPoolCapabilityPac) o;
    return Objects.equals(this.availableSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.availableSpectrum) &&
        Objects.equals(this.supportableSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.supportableSpectrum) &&
        Objects.equals(this.occupiedSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.occupiedSpectrum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableSpectrum, supportableSpectrum, occupiedSpectrum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelPoolCapabilityPac {\n");
    
    sb.append("    availableSpectrum: ").append(toIndentedString(availableSpectrum)).append("\n");
    sb.append("    supportableSpectrum: ").append(toIndentedString(supportableSpectrum)).append("\n");
    sb.append("    occupiedSpectrum: ").append(toIndentedString(occupiedSpectrum)).append("\n");
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

