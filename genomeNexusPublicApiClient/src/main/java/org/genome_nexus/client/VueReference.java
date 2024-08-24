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
 * VueReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-22T13:41:58.865-04:00")
public class VueReference {
  @SerializedName("pubmedId")
  private Integer pubmedId = null;

  @SerializedName("referenceText")
  private String referenceText = null;

  public VueReference pubmedId(Integer pubmedId) {
    this.pubmedId = pubmedId;
    return this;
  }

   /**
   * Get pubmedId
   * @return pubmedId
  **/
  @ApiModelProperty(value = "")
  public Integer getPubmedId() {
    return pubmedId;
  }

  public void setPubmedId(Integer pubmedId) {
    this.pubmedId = pubmedId;
  }

  public VueReference referenceText(String referenceText) {
    this.referenceText = referenceText;
    return this;
  }

   /**
   * Get referenceText
   * @return referenceText
  **/
  @ApiModelProperty(value = "")
  public String getReferenceText() {
    return referenceText;
  }

  public void setReferenceText(String referenceText) {
    this.referenceText = referenceText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VueReference vueReference = (VueReference) o;
    return Objects.equals(this.pubmedId, vueReference.pubmedId) &&
        Objects.equals(this.referenceText, vueReference.referenceText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubmedId, referenceText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VueReference {\n");
    
    sb.append("    pubmedId: ").append(toIndentedString(pubmedId)).append("\n");
    sb.append("    referenceText: ").append(toIndentedString(referenceText)).append("\n");
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

