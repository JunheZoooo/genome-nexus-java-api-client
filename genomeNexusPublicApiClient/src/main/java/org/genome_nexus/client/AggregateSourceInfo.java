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
import org.genome_nexus.client.GenomeNexusInfo;
import org.genome_nexus.client.SourceVersionInfo;
import org.genome_nexus.client.VEPInfo;

/**
 * AggregateSourceInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class AggregateSourceInfo {
  @SerializedName("annotationSourcesInfo")
  private List<SourceVersionInfo> annotationSourcesInfo = null;

  @SerializedName("genomeNexus")
  private GenomeNexusInfo genomeNexus = null;

  @SerializedName("vep")
  private VEPInfo vep = null;

  public AggregateSourceInfo annotationSourcesInfo(List<SourceVersionInfo> annotationSourcesInfo) {
    this.annotationSourcesInfo = annotationSourcesInfo;
    return this;
  }

  public AggregateSourceInfo addAnnotationSourcesInfoItem(SourceVersionInfo annotationSourcesInfoItem) {
    if (this.annotationSourcesInfo == null) {
      this.annotationSourcesInfo = new ArrayList<SourceVersionInfo>();
    }
    this.annotationSourcesInfo.add(annotationSourcesInfoItem);
    return this;
  }

   /**
   * Get annotationSourcesInfo
   * @return annotationSourcesInfo
  **/
  @ApiModelProperty(value = "")
  public List<SourceVersionInfo> getAnnotationSourcesInfo() {
    return annotationSourcesInfo;
  }

  public void setAnnotationSourcesInfo(List<SourceVersionInfo> annotationSourcesInfo) {
    this.annotationSourcesInfo = annotationSourcesInfo;
  }

  public AggregateSourceInfo genomeNexus(GenomeNexusInfo genomeNexus) {
    this.genomeNexus = genomeNexus;
    return this;
  }

   /**
   * Get genomeNexus
   * @return genomeNexus
  **/
  @ApiModelProperty(value = "")
  public GenomeNexusInfo getGenomeNexus() {
    return genomeNexus;
  }

  public void setGenomeNexus(GenomeNexusInfo genomeNexus) {
    this.genomeNexus = genomeNexus;
  }

  public AggregateSourceInfo vep(VEPInfo vep) {
    this.vep = vep;
    return this;
  }

   /**
   * Get vep
   * @return vep
  **/
  @ApiModelProperty(value = "")
  public VEPInfo getVep() {
    return vep;
  }

  public void setVep(VEPInfo vep) {
    this.vep = vep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateSourceInfo aggregateSourceInfo = (AggregateSourceInfo) o;
    return Objects.equals(this.annotationSourcesInfo, aggregateSourceInfo.annotationSourcesInfo) &&
        Objects.equals(this.genomeNexus, aggregateSourceInfo.genomeNexus) &&
        Objects.equals(this.vep, aggregateSourceInfo.vep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationSourcesInfo, genomeNexus, vep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateSourceInfo {\n");
    
    sb.append("    annotationSourcesInfo: ").append(toIndentedString(annotationSourcesInfo)).append("\n");
    sb.append("    genomeNexus: ").append(toIndentedString(genomeNexus)).append("\n");
    sb.append("    vep: ").append(toIndentedString(vep)).append("\n");
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

