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
import java.util.ArrayList;
import java.util.List;

/**
 * EnsemblGene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-16T15:36:31.946-04:00")
public class EnsemblGene {
  @SerializedName("geneId")
  private String geneId = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("synonyms")
  private List<String> synonyms = null;

  @SerializedName("previousSymbols")
  private List<String> previousSymbols = null;

  public EnsemblGene geneId(String geneId) {
    this.geneId = geneId;
    return this;
  }

   /**
   * Ensembl gene id
   * @return geneId
  **/
  @ApiModelProperty(required = true, value = "Ensembl gene id")
  public String getGeneId() {
    return geneId;
  }

  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }

  public EnsemblGene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Approved Hugo symbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(required = true, value = "Approved Hugo symbol")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public EnsemblGene synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public EnsemblGene addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Hugo symbol synonyms
   * @return synonyms
  **/
  @ApiModelProperty(value = "Hugo symbol synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public EnsemblGene previousSymbols(List<String> previousSymbols) {
    this.previousSymbols = previousSymbols;
    return this;
  }

  public EnsemblGene addPreviousSymbolsItem(String previousSymbolsItem) {
    if (this.previousSymbols == null) {
      this.previousSymbols = new ArrayList<String>();
    }
    this.previousSymbols.add(previousSymbolsItem);
    return this;
  }

   /**
   * Previous Hugo symbols
   * @return previousSymbols
  **/
  @ApiModelProperty(value = "Previous Hugo symbols")
  public List<String> getPreviousSymbols() {
    return previousSymbols;
  }

  public void setPreviousSymbols(List<String> previousSymbols) {
    this.previousSymbols = previousSymbols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnsemblGene ensemblGene = (EnsemblGene) o;
    return Objects.equals(this.geneId, ensemblGene.geneId) &&
        Objects.equals(this.hugoSymbol, ensemblGene.hugoSymbol) &&
        Objects.equals(this.synonyms, ensemblGene.synonyms) &&
        Objects.equals(this.previousSymbols, ensemblGene.previousSymbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geneId, hugoSymbol, synonyms, previousSymbols);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnsemblGene {\n");
    
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    previousSymbols: ").append(toIndentedString(previousSymbols)).append("\n");
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

