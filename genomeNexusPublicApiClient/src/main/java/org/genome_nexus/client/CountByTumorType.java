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
 * CountByTumorType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class CountByTumorType {
  @SerializedName("tumorType")
  private String tumorType = null;

  @SerializedName("tumorTypeCount")
  private Integer tumorTypeCount = null;

  @SerializedName("variantCount")
  private Integer variantCount = null;

  public CountByTumorType tumorType(String tumorType) {
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Tumor Type
   * @return tumorType
  **/
  @ApiModelProperty(value = "Tumor Type")
  public String getTumorType() {
    return tumorType;
  }

  public void setTumorType(String tumorType) {
    this.tumorType = tumorType;
  }

  public CountByTumorType tumorTypeCount(Integer tumorTypeCount) {
    this.tumorTypeCount = tumorTypeCount;
    return this;
  }

   /**
   * Sample count for Tumor Type
   * @return tumorTypeCount
  **/
  @ApiModelProperty(value = "Sample count for Tumor Type")
  public Integer getTumorTypeCount() {
    return tumorTypeCount;
  }

  public void setTumorTypeCount(Integer tumorTypeCount) {
    this.tumorTypeCount = tumorTypeCount;
  }

  public CountByTumorType variantCount(Integer variantCount) {
    this.variantCount = variantCount;
    return this;
  }

   /**
   * Variant count for Tumor Type
   * @return variantCount
  **/
  @ApiModelProperty(value = "Variant count for Tumor Type")
  public Integer getVariantCount() {
    return variantCount;
  }

  public void setVariantCount(Integer variantCount) {
    this.variantCount = variantCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountByTumorType countByTumorType = (CountByTumorType) o;
    return Objects.equals(this.tumorType, countByTumorType.tumorType) &&
        Objects.equals(this.tumorTypeCount, countByTumorType.tumorTypeCount) &&
        Objects.equals(this.variantCount, countByTumorType.variantCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tumorType, tumorTypeCount, variantCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountByTumorType {\n");
    
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
    sb.append("    tumorTypeCount: ").append(toIndentedString(tumorTypeCount)).append("\n");
    sb.append("    variantCount: ").append(toIndentedString(variantCount)).append("\n");
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

