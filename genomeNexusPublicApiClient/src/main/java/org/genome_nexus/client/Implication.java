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
import org.genome_nexus.client.ArticleAbstract;
import org.genome_nexus.client.TumorType;

/**
 * Implication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class Implication {
  @SerializedName("abstracts")
  private List<ArticleAbstract> abstracts = null;

  @SerializedName("alterations")
  private List<String> alterations = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets levelOfEvidence
   */
  @JsonAdapter(LevelOfEvidenceEnum.Adapter.class)
  public enum LevelOfEvidenceEnum {
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    LEVEL_FDA1("LEVEL_Fda1"),
    
    LEVEL_FDA2("LEVEL_Fda2"),
    
    LEVEL_FDA3("LEVEL_Fda3"),
    
    NO("NO");

    private String value;

    LevelOfEvidenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelOfEvidenceEnum fromValue(String text) {
      for (LevelOfEvidenceEnum b : LevelOfEvidenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LevelOfEvidenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelOfEvidenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelOfEvidenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelOfEvidenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("levelOfEvidence")
  private LevelOfEvidenceEnum levelOfEvidence = null;

  @SerializedName("pmids")
  private List<String> pmids = null;

  @SerializedName("tumorType")
  private TumorType tumorType = null;

  public Implication abstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
    return this;
  }

  public Implication addAbstractsItem(ArticleAbstract abstractsItem) {
    if (this.abstracts == null) {
      this.abstracts = new ArrayList<ArticleAbstract>();
    }
    this.abstracts.add(abstractsItem);
    return this;
  }

   /**
   * Get abstracts
   * @return abstracts
  **/
  @ApiModelProperty(value = "")
  public List<ArticleAbstract> getAbstracts() {
    return abstracts;
  }

  public void setAbstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
  }

  public Implication alterations(List<String> alterations) {
    this.alterations = alterations;
    return this;
  }

  public Implication addAlterationsItem(String alterationsItem) {
    if (this.alterations == null) {
      this.alterations = new ArrayList<String>();
    }
    this.alterations.add(alterationsItem);
    return this;
  }

   /**
   * Get alterations
   * @return alterations
  **/
  @ApiModelProperty(value = "")
  public List<String> getAlterations() {
    return alterations;
  }

  public void setAlterations(List<String> alterations) {
    this.alterations = alterations;
  }

  public Implication description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Implication levelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    this.levelOfEvidence = levelOfEvidence;
    return this;
  }

   /**
   * Get levelOfEvidence
   * @return levelOfEvidence
  **/
  @ApiModelProperty(value = "")
  public LevelOfEvidenceEnum getLevelOfEvidence() {
    return levelOfEvidence;
  }

  public void setLevelOfEvidence(LevelOfEvidenceEnum levelOfEvidence) {
    this.levelOfEvidence = levelOfEvidence;
  }

  public Implication pmids(List<String> pmids) {
    this.pmids = pmids;
    return this;
  }

  public Implication addPmidsItem(String pmidsItem) {
    if (this.pmids == null) {
      this.pmids = new ArrayList<String>();
    }
    this.pmids.add(pmidsItem);
    return this;
  }

   /**
   * Get pmids
   * @return pmids
  **/
  @ApiModelProperty(value = "")
  public List<String> getPmids() {
    return pmids;
  }

  public void setPmids(List<String> pmids) {
    this.pmids = pmids;
  }

  public Implication tumorType(TumorType tumorType) {
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Get tumorType
   * @return tumorType
  **/
  @ApiModelProperty(value = "")
  public TumorType getTumorType() {
    return tumorType;
  }

  public void setTumorType(TumorType tumorType) {
    this.tumorType = tumorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Implication implication = (Implication) o;
    return Objects.equals(this.abstracts, implication.abstracts) &&
        Objects.equals(this.alterations, implication.alterations) &&
        Objects.equals(this.description, implication.description) &&
        Objects.equals(this.levelOfEvidence, implication.levelOfEvidence) &&
        Objects.equals(this.pmids, implication.pmids) &&
        Objects.equals(this.tumorType, implication.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, alterations, description, levelOfEvidence, pmids, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Implication {\n");
    
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    levelOfEvidence: ").append(toIndentedString(levelOfEvidence)).append("\n");
    sb.append("    pmids: ").append(toIndentedString(pmids)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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

