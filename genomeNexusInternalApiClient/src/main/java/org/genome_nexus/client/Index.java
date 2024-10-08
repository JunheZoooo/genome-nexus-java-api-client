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
import java.util.ArrayList;
import java.util.List;

/**
 * Index
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:01.463-04:00")
public class Index {
  @SerializedName("cdna")
  private List<String> cdna = null;

  @SerializedName("hgvsc")
  private List<String> hgvsc = null;

  @SerializedName("hgvsp")
  private List<String> hgvsp = null;

  @SerializedName("hgvspShort")
  private List<String> hgvspShort = null;

  @SerializedName("hugoSymbol")
  private List<String> hugoSymbol = null;

  @SerializedName("rsid")
  private List<String> rsid = null;

  @SerializedName("variant")
  private String variant = null;

  public Index cdna(List<String> cdna) {
    this.cdna = cdna;
    return this;
  }

  public Index addCdnaItem(String cdnaItem) {
    if (this.cdna == null) {
      this.cdna = new ArrayList<String>();
    }
    this.cdna.add(cdnaItem);
    return this;
  }

   /**
   * Get cdna
   * @return cdna
  **/
  @ApiModelProperty(value = "")
  public List<String> getCdna() {
    return cdna;
  }

  public void setCdna(List<String> cdna) {
    this.cdna = cdna;
  }

  public Index hgvsc(List<String> hgvsc) {
    this.hgvsc = hgvsc;
    return this;
  }

  public Index addHgvscItem(String hgvscItem) {
    if (this.hgvsc == null) {
      this.hgvsc = new ArrayList<String>();
    }
    this.hgvsc.add(hgvscItem);
    return this;
  }

   /**
   * Get hgvsc
   * @return hgvsc
  **/
  @ApiModelProperty(value = "")
  public List<String> getHgvsc() {
    return hgvsc;
  }

  public void setHgvsc(List<String> hgvsc) {
    this.hgvsc = hgvsc;
  }

  public Index hgvsp(List<String> hgvsp) {
    this.hgvsp = hgvsp;
    return this;
  }

  public Index addHgvspItem(String hgvspItem) {
    if (this.hgvsp == null) {
      this.hgvsp = new ArrayList<String>();
    }
    this.hgvsp.add(hgvspItem);
    return this;
  }

   /**
   * Get hgvsp
   * @return hgvsp
  **/
  @ApiModelProperty(value = "")
  public List<String> getHgvsp() {
    return hgvsp;
  }

  public void setHgvsp(List<String> hgvsp) {
    this.hgvsp = hgvsp;
  }

  public Index hgvspShort(List<String> hgvspShort) {
    this.hgvspShort = hgvspShort;
    return this;
  }

  public Index addHgvspShortItem(String hgvspShortItem) {
    if (this.hgvspShort == null) {
      this.hgvspShort = new ArrayList<String>();
    }
    this.hgvspShort.add(hgvspShortItem);
    return this;
  }

   /**
   * Get hgvspShort
   * @return hgvspShort
  **/
  @ApiModelProperty(value = "")
  public List<String> getHgvspShort() {
    return hgvspShort;
  }

  public void setHgvspShort(List<String> hgvspShort) {
    this.hgvspShort = hgvspShort;
  }

  public Index hugoSymbol(List<String> hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

  public Index addHugoSymbolItem(String hugoSymbolItem) {
    if (this.hugoSymbol == null) {
      this.hugoSymbol = new ArrayList<String>();
    }
    this.hugoSymbol.add(hugoSymbolItem);
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public List<String> getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(List<String> hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public Index rsid(List<String> rsid) {
    this.rsid = rsid;
    return this;
  }

  public Index addRsidItem(String rsidItem) {
    if (this.rsid == null) {
      this.rsid = new ArrayList<String>();
    }
    this.rsid.add(rsidItem);
    return this;
  }

   /**
   * Get rsid
   * @return rsid
  **/
  @ApiModelProperty(value = "")
  public List<String> getRsid() {
    return rsid;
  }

  public void setRsid(List<String> rsid) {
    this.rsid = rsid;
  }

  public Index variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @ApiModelProperty(value = "")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Index index = (Index) o;
    return Objects.equals(this.cdna, index.cdna) &&
        Objects.equals(this.hgvsc, index.hgvsc) &&
        Objects.equals(this.hgvsp, index.hgvsp) &&
        Objects.equals(this.hgvspShort, index.hgvspShort) &&
        Objects.equals(this.hugoSymbol, index.hugoSymbol) &&
        Objects.equals(this.rsid, index.rsid) &&
        Objects.equals(this.variant, index.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdna, hgvsc, hgvsp, hgvspShort, hugoSymbol, rsid, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Index {\n");
    
    sb.append("    cdna: ").append(toIndentedString(cdna)).append("\n");
    sb.append("    hgvsc: ").append(toIndentedString(hgvsc)).append("\n");
    sb.append("    hgvsp: ").append(toIndentedString(hgvsp)).append("\n");
    sb.append("    hgvspShort: ").append(toIndentedString(hgvspShort)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    rsid: ").append(toIndentedString(rsid)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

