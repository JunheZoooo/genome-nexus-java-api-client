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
 * Clinvar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class Clinvar {
  @SerializedName("alternateAllele")
  private String alternateAllele = null;

  @SerializedName("chromosome")
  private String chromosome = null;

  @SerializedName("clinicalSignificance")
  private String clinicalSignificance = null;

  @SerializedName("clinvarId")
  private Integer clinvarId = null;

  @SerializedName("conflictingClinicalSignificance")
  private String conflictingClinicalSignificance = null;

  @SerializedName("endPosition")
  private Integer endPosition = null;

  @SerializedName("referenceAllele")
  private String referenceAllele = null;

  @SerializedName("startPosition")
  private Integer startPosition = null;

  public Clinvar alternateAllele(String alternateAllele) {
    this.alternateAllele = alternateAllele;
    return this;
  }

   /**
   * Get alternateAllele
   * @return alternateAllele
  **/
  @ApiModelProperty(value = "")
  public String getAlternateAllele() {
    return alternateAllele;
  }

  public void setAlternateAllele(String alternateAllele) {
    this.alternateAllele = alternateAllele;
  }

  public Clinvar chromosome(String chromosome) {
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Get chromosome
   * @return chromosome
  **/
  @ApiModelProperty(value = "")
  public String getChromosome() {
    return chromosome;
  }

  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }

  public Clinvar clinicalSignificance(String clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
    return this;
  }

   /**
   * Get clinicalSignificance
   * @return clinicalSignificance
  **/
  @ApiModelProperty(value = "")
  public String getClinicalSignificance() {
    return clinicalSignificance;
  }

  public void setClinicalSignificance(String clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
  }

  public Clinvar clinvarId(Integer clinvarId) {
    this.clinvarId = clinvarId;
    return this;
  }

   /**
   * Get clinvarId
   * @return clinvarId
  **/
  @ApiModelProperty(value = "")
  public Integer getClinvarId() {
    return clinvarId;
  }

  public void setClinvarId(Integer clinvarId) {
    this.clinvarId = clinvarId;
  }

  public Clinvar conflictingClinicalSignificance(String conflictingClinicalSignificance) {
    this.conflictingClinicalSignificance = conflictingClinicalSignificance;
    return this;
  }

   /**
   * Get conflictingClinicalSignificance
   * @return conflictingClinicalSignificance
  **/
  @ApiModelProperty(value = "")
  public String getConflictingClinicalSignificance() {
    return conflictingClinicalSignificance;
  }

  public void setConflictingClinicalSignificance(String conflictingClinicalSignificance) {
    this.conflictingClinicalSignificance = conflictingClinicalSignificance;
  }

  public Clinvar endPosition(Integer endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * Get endPosition
   * @return endPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(Integer endPosition) {
    this.endPosition = endPosition;
  }

  public Clinvar referenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
    return this;
  }

   /**
   * Get referenceAllele
   * @return referenceAllele
  **/
  @ApiModelProperty(value = "")
  public String getReferenceAllele() {
    return referenceAllele;
  }

  public void setReferenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
  }

  public Clinvar startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Get startPosition
   * @return startPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clinvar clinvar = (Clinvar) o;
    return Objects.equals(this.alternateAllele, clinvar.alternateAllele) &&
        Objects.equals(this.chromosome, clinvar.chromosome) &&
        Objects.equals(this.clinicalSignificance, clinvar.clinicalSignificance) &&
        Objects.equals(this.clinvarId, clinvar.clinvarId) &&
        Objects.equals(this.conflictingClinicalSignificance, clinvar.conflictingClinicalSignificance) &&
        Objects.equals(this.endPosition, clinvar.endPosition) &&
        Objects.equals(this.referenceAllele, clinvar.referenceAllele) &&
        Objects.equals(this.startPosition, clinvar.startPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateAllele, chromosome, clinicalSignificance, clinvarId, conflictingClinicalSignificance, endPosition, referenceAllele, startPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clinvar {\n");
    
    sb.append("    alternateAllele: ").append(toIndentedString(alternateAllele)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    clinicalSignificance: ").append(toIndentedString(clinicalSignificance)).append("\n");
    sb.append("    clinvarId: ").append(toIndentedString(clinvarId)).append("\n");
    sb.append("    conflictingClinicalSignificance: ").append(toIndentedString(conflictingClinicalSignificance)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    referenceAllele: ").append(toIndentedString(referenceAllele)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
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

