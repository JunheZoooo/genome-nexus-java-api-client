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
 * ProteinLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:01.463-04:00")
public class ProteinLocation {
  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("mutationType")
  private String mutationType = null;

  public ProteinLocation transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl Transcript ID
   * @return transcriptId
  **/
  @ApiModelProperty(required = true, value = "Ensembl Transcript ID")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public ProteinLocation start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Start Position Residue
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Start Position Residue")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ProteinLocation end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * End Position Residue
   * @return end
  **/
  @ApiModelProperty(required = true, value = "End Position Residue")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public ProteinLocation mutationType(String mutationType) {
    this.mutationType = mutationType;
    return this;
  }

   /**
   * Mutation Type e.g. Missense_Mutation
   * @return mutationType
  **/
  @ApiModelProperty(required = true, value = "Mutation Type e.g. Missense_Mutation")
  public String getMutationType() {
    return mutationType;
  }

  public void setMutationType(String mutationType) {
    this.mutationType = mutationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProteinLocation proteinLocation = (ProteinLocation) o;
    return Objects.equals(this.transcriptId, proteinLocation.transcriptId) &&
        Objects.equals(this.start, proteinLocation.start) &&
        Objects.equals(this.end, proteinLocation.end) &&
        Objects.equals(this.mutationType, proteinLocation.mutationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcriptId, start, end, mutationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProteinLocation {\n");
    
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    mutationType: ").append(toIndentedString(mutationType)).append("\n");
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

