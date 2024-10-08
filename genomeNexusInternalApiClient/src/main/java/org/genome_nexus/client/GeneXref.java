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
 * GeneXref
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:01.463-04:00")
public class GeneXref {
  @SerializedName("db_display_name")
  private String dbDisplayName = null;

  @SerializedName("dbname")
  private String dbname = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_id")
  private String displayId = null;

  @SerializedName("ensemblGeneId")
  private String ensemblGeneId = null;

  @SerializedName("info_text")
  private String infoText = null;

  @SerializedName("info_types")
  private String infoTypes = null;

  @SerializedName("primary_id")
  private String primaryId = null;

  @SerializedName("synonyms")
  private List<String> synonyms = null;

  @SerializedName("version")
  private String version = null;

  public GeneXref dbDisplayName(String dbDisplayName) {
    this.dbDisplayName = dbDisplayName;
    return this;
  }

   /**
   * Database display name
   * @return dbDisplayName
  **/
  @ApiModelProperty(required = true, value = "Database display name")
  public String getDbDisplayName() {
    return dbDisplayName;
  }

  public void setDbDisplayName(String dbDisplayName) {
    this.dbDisplayName = dbDisplayName;
  }

  public GeneXref dbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

   /**
   * Database name
   * @return dbname
  **/
  @ApiModelProperty(required = true, value = "Database name")
  public String getDbname() {
    return dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }

  public GeneXref description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeneXref displayId(String displayId) {
    this.displayId = displayId;
    return this;
  }

   /**
   * Display id
   * @return displayId
  **/
  @ApiModelProperty(required = true, value = "Display id")
  public String getDisplayId() {
    return displayId;
  }

  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }

  public GeneXref ensemblGeneId(String ensemblGeneId) {
    this.ensemblGeneId = ensemblGeneId;
    return this;
  }

   /**
   * Get ensemblGeneId
   * @return ensemblGeneId
  **/
  @ApiModelProperty(value = "")
  public String getEnsemblGeneId() {
    return ensemblGeneId;
  }

  public void setEnsemblGeneId(String ensemblGeneId) {
    this.ensemblGeneId = ensemblGeneId;
  }

  public GeneXref infoText(String infoText) {
    this.infoText = infoText;
    return this;
  }

   /**
   * Database info text
   * @return infoText
  **/
  @ApiModelProperty(value = "Database info text")
  public String getInfoText() {
    return infoText;
  }

  public void setInfoText(String infoText) {
    this.infoText = infoText;
  }

  public GeneXref infoTypes(String infoTypes) {
    this.infoTypes = infoTypes;
    return this;
  }

   /**
   * Database info type
   * @return infoTypes
  **/
  @ApiModelProperty(value = "Database info type")
  public String getInfoTypes() {
    return infoTypes;
  }

  public void setInfoTypes(String infoTypes) {
    this.infoTypes = infoTypes;
  }

  public GeneXref primaryId(String primaryId) {
    this.primaryId = primaryId;
    return this;
  }

   /**
   * Primary id
   * @return primaryId
  **/
  @ApiModelProperty(required = true, value = "Primary id")
  public String getPrimaryId() {
    return primaryId;
  }

  public void setPrimaryId(String primaryId) {
    this.primaryId = primaryId;
  }

  public GeneXref synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public GeneXref addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Synonyms
   * @return synonyms
  **/
  @ApiModelProperty(value = "Synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public GeneXref version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneXref geneXref = (GeneXref) o;
    return Objects.equals(this.dbDisplayName, geneXref.dbDisplayName) &&
        Objects.equals(this.dbname, geneXref.dbname) &&
        Objects.equals(this.description, geneXref.description) &&
        Objects.equals(this.displayId, geneXref.displayId) &&
        Objects.equals(this.ensemblGeneId, geneXref.ensemblGeneId) &&
        Objects.equals(this.infoText, geneXref.infoText) &&
        Objects.equals(this.infoTypes, geneXref.infoTypes) &&
        Objects.equals(this.primaryId, geneXref.primaryId) &&
        Objects.equals(this.synonyms, geneXref.synonyms) &&
        Objects.equals(this.version, geneXref.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbDisplayName, dbname, description, displayId, ensemblGeneId, infoText, infoTypes, primaryId, synonyms, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneXref {\n");
    
    sb.append("    dbDisplayName: ").append(toIndentedString(dbDisplayName)).append("\n");
    sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    ensemblGeneId: ").append(toIndentedString(ensemblGeneId)).append("\n");
    sb.append("    infoText: ").append(toIndentedString(infoText)).append("\n");
    sb.append("    infoTypes: ").append(toIndentedString(infoTypes)).append("\n");
    sb.append("    primaryId: ").append(toIndentedString(primaryId)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

