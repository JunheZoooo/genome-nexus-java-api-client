/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Homozygotes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class Homozygotes {
  @SerializedName("hom")
  private Integer hom = null;

  @SerializedName("hom_afr")
  private Integer homAfr = null;

  @SerializedName("hom_amr")
  private Integer homAmr = null;

  @SerializedName("hom_asj")
  private Integer homAsj = null;

  @SerializedName("hom_eas")
  private Integer homEas = null;

  @SerializedName("hom_fin")
  private Integer homFin = null;

  @SerializedName("hom_nfe")
  private Integer homNfe = null;

  @SerializedName("hom_oth")
  private Integer homOth = null;

  @SerializedName("hom_sas")
  private Integer homSas = null;

  public Homozygotes hom(Integer hom) {
    this.hom = hom;
    return this;
  }

   /**
   * Get hom
   * @return hom
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHom() {
    return hom;
  }

  public void setHom(Integer hom) {
    this.hom = hom;
  }

  public Homozygotes homAfr(Integer homAfr) {
    this.homAfr = homAfr;
    return this;
  }

   /**
   * Get homAfr
   * @return homAfr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomAfr() {
    return homAfr;
  }

  public void setHomAfr(Integer homAfr) {
    this.homAfr = homAfr;
  }

  public Homozygotes homAmr(Integer homAmr) {
    this.homAmr = homAmr;
    return this;
  }

   /**
   * Get homAmr
   * @return homAmr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomAmr() {
    return homAmr;
  }

  public void setHomAmr(Integer homAmr) {
    this.homAmr = homAmr;
  }

  public Homozygotes homAsj(Integer homAsj) {
    this.homAsj = homAsj;
    return this;
  }

   /**
   * Get homAsj
   * @return homAsj
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomAsj() {
    return homAsj;
  }

  public void setHomAsj(Integer homAsj) {
    this.homAsj = homAsj;
  }

  public Homozygotes homEas(Integer homEas) {
    this.homEas = homEas;
    return this;
  }

   /**
   * Get homEas
   * @return homEas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomEas() {
    return homEas;
  }

  public void setHomEas(Integer homEas) {
    this.homEas = homEas;
  }

  public Homozygotes homFin(Integer homFin) {
    this.homFin = homFin;
    return this;
  }

   /**
   * Get homFin
   * @return homFin
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomFin() {
    return homFin;
  }

  public void setHomFin(Integer homFin) {
    this.homFin = homFin;
  }

  public Homozygotes homNfe(Integer homNfe) {
    this.homNfe = homNfe;
    return this;
  }

   /**
   * Get homNfe
   * @return homNfe
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomNfe() {
    return homNfe;
  }

  public void setHomNfe(Integer homNfe) {
    this.homNfe = homNfe;
  }

  public Homozygotes homOth(Integer homOth) {
    this.homOth = homOth;
    return this;
  }

   /**
   * Get homOth
   * @return homOth
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomOth() {
    return homOth;
  }

  public void setHomOth(Integer homOth) {
    this.homOth = homOth;
  }

  public Homozygotes homSas(Integer homSas) {
    this.homSas = homSas;
    return this;
  }

   /**
   * Get homSas
   * @return homSas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getHomSas() {
    return homSas;
  }

  public void setHomSas(Integer homSas) {
    this.homSas = homSas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Homozygotes homozygotes = (Homozygotes) o;
    return Objects.equals(this.hom, homozygotes.hom) &&
        Objects.equals(this.homAfr, homozygotes.homAfr) &&
        Objects.equals(this.homAmr, homozygotes.homAmr) &&
        Objects.equals(this.homAsj, homozygotes.homAsj) &&
        Objects.equals(this.homEas, homozygotes.homEas) &&
        Objects.equals(this.homFin, homozygotes.homFin) &&
        Objects.equals(this.homNfe, homozygotes.homNfe) &&
        Objects.equals(this.homOth, homozygotes.homOth) &&
        Objects.equals(this.homSas, homozygotes.homSas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hom, homAfr, homAmr, homAsj, homEas, homFin, homNfe, homOth, homSas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Homozygotes {\n");
    
    sb.append("    hom: ").append(toIndentedString(hom)).append("\n");
    sb.append("    homAfr: ").append(toIndentedString(homAfr)).append("\n");
    sb.append("    homAmr: ").append(toIndentedString(homAmr)).append("\n");
    sb.append("    homAsj: ").append(toIndentedString(homAsj)).append("\n");
    sb.append("    homEas: ").append(toIndentedString(homEas)).append("\n");
    sb.append("    homFin: ").append(toIndentedString(homFin)).append("\n");
    sb.append("    homNfe: ").append(toIndentedString(homNfe)).append("\n");
    sb.append("    homOth: ").append(toIndentedString(homOth)).append("\n");
    sb.append("    homSas: ").append(toIndentedString(homSas)).append("\n");
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

