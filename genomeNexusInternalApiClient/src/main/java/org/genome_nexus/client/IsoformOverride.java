/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
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
 * IsoformOverride
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T15:36:33.210-04:00")
public class IsoformOverride {
  @SerializedName("ccdsId")
  private String ccdsId = null;

  @SerializedName("geneSymbol")
  private String geneSymbol = null;

  @SerializedName("refseqId")
  private String refseqId = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  public IsoformOverride ccdsId(String ccdsId) {
    this.ccdsId = ccdsId;
    return this;
  }

   /**
   * CCDS ID
   * @return ccdsId
  **/
  @ApiModelProperty(value = "CCDS ID")
  public String getCcdsId() {
    return ccdsId;
  }

  public void setCcdsId(String ccdsId) {
    this.ccdsId = ccdsId;
  }

  public IsoformOverride geneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return geneSymbol
  **/
  @ApiModelProperty(value = "Hugo gene symbol")
  public String getGeneSymbol() {
    return geneSymbol;
  }

  public void setGeneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
  }

  public IsoformOverride refseqId(String refseqId) {
    this.refseqId = refseqId;
    return this;
  }

   /**
   * RefSeq ID
   * @return refseqId
  **/
  @ApiModelProperty(value = "RefSeq ID")
  public String getRefseqId() {
    return refseqId;
  }

  public void setRefseqId(String refseqId) {
    this.refseqId = refseqId;
  }

  public IsoformOverride transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl transcript id
   * @return transcriptId
  **/
  @ApiModelProperty(required = true, value = "Ensembl transcript id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsoformOverride isoformOverride = (IsoformOverride) o;
    return Objects.equals(this.ccdsId, isoformOverride.ccdsId) &&
        Objects.equals(this.geneSymbol, isoformOverride.geneSymbol) &&
        Objects.equals(this.refseqId, isoformOverride.refseqId) &&
        Objects.equals(this.transcriptId, isoformOverride.transcriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccdsId, geneSymbol, refseqId, transcriptId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsoformOverride {\n");
    
    sb.append("    ccdsId: ").append(toIndentedString(ccdsId)).append("\n");
    sb.append("    geneSymbol: ").append(toIndentedString(geneSymbol)).append("\n");
    sb.append("    refseqId: ").append(toIndentedString(refseqId)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
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

