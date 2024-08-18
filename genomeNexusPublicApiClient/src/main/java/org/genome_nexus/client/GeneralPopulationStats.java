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
import org.genome_nexus.client.SignalPopulationStats;

/**
 * GeneralPopulationStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class GeneralPopulationStats {
  @SerializedName("counts")
  private SignalPopulationStats counts = null;

  @SerializedName("frequencies")
  private SignalPopulationStats frequencies = null;

  public GeneralPopulationStats counts(SignalPopulationStats counts) {
    this.counts = counts;
    return this;
  }

   /**
   * Counts
   * @return counts
  **/
  @ApiModelProperty(value = "Counts")
  public SignalPopulationStats getCounts() {
    return counts;
  }

  public void setCounts(SignalPopulationStats counts) {
    this.counts = counts;
  }

  public GeneralPopulationStats frequencies(SignalPopulationStats frequencies) {
    this.frequencies = frequencies;
    return this;
  }

   /**
   * Frequencies
   * @return frequencies
  **/
  @ApiModelProperty(value = "Frequencies")
  public SignalPopulationStats getFrequencies() {
    return frequencies;
  }

  public void setFrequencies(SignalPopulationStats frequencies) {
    this.frequencies = frequencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralPopulationStats generalPopulationStats = (GeneralPopulationStats) o;
    return Objects.equals(this.counts, generalPopulationStats.counts) &&
        Objects.equals(this.frequencies, generalPopulationStats.frequencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, frequencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralPopulationStats {\n");
    
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    frequencies: ").append(toIndentedString(frequencies)).append("\n");
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

