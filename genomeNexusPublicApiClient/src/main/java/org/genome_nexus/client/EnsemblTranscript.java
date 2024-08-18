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
import org.genome_nexus.client.Exon;
import org.genome_nexus.client.PfamDomainRange;
import org.genome_nexus.client.UntranslatedRegion;

/**
 * EnsemblTranscript
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class EnsemblTranscript {
  @SerializedName("uniprotId")
  private String uniprotId = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("geneId")
  private String geneId = null;

  @SerializedName("proteinId")
  private String proteinId = null;

  @SerializedName("proteinLength")
  private Integer proteinLength = null;

  @SerializedName("pfamDomains")
  private List<PfamDomainRange> pfamDomains = null;

  @SerializedName("hugoSymbols")
  private List<String> hugoSymbols = null;

  @SerializedName("refseqMrnaId")
  private String refseqMrnaId = null;

  @SerializedName("ccdsId")
  private String ccdsId = null;

  @SerializedName("exons")
  private List<Exon> exons = null;

  @SerializedName("utrs")
  private List<UntranslatedRegion> utrs = null;

  public EnsemblTranscript uniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
    return this;
  }

   /**
   * Get uniprotId
   * @return uniprotId
  **/
  @ApiModelProperty(value = "")
  public String getUniprotId() {
    return uniprotId;
  }

  public void setUniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
  }

  public EnsemblTranscript transcriptId(String transcriptId) {
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

  public EnsemblTranscript geneId(String geneId) {
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

  public EnsemblTranscript proteinId(String proteinId) {
    this.proteinId = proteinId;
    return this;
  }

   /**
   * Ensembl protein id
   * @return proteinId
  **/
  @ApiModelProperty(required = true, value = "Ensembl protein id")
  public String getProteinId() {
    return proteinId;
  }

  public void setProteinId(String proteinId) {
    this.proteinId = proteinId;
  }

  public EnsemblTranscript proteinLength(Integer proteinLength) {
    this.proteinLength = proteinLength;
    return this;
  }

   /**
   * Length of protein
   * @return proteinLength
  **/
  @ApiModelProperty(value = "Length of protein")
  public Integer getProteinLength() {
    return proteinLength;
  }

  public void setProteinLength(Integer proteinLength) {
    this.proteinLength = proteinLength;
  }

  public EnsemblTranscript pfamDomains(List<PfamDomainRange> pfamDomains) {
    this.pfamDomains = pfamDomains;
    return this;
  }

  public EnsemblTranscript addPfamDomainsItem(PfamDomainRange pfamDomainsItem) {
    if (this.pfamDomains == null) {
      this.pfamDomains = new ArrayList<PfamDomainRange>();
    }
    this.pfamDomains.add(pfamDomainsItem);
    return this;
  }

   /**
   * Pfam domains
   * @return pfamDomains
  **/
  @ApiModelProperty(value = "Pfam domains")
  public List<PfamDomainRange> getPfamDomains() {
    return pfamDomains;
  }

  public void setPfamDomains(List<PfamDomainRange> pfamDomains) {
    this.pfamDomains = pfamDomains;
  }

  public EnsemblTranscript hugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
    return this;
  }

  public EnsemblTranscript addHugoSymbolsItem(String hugoSymbolsItem) {
    if (this.hugoSymbols == null) {
      this.hugoSymbols = new ArrayList<String>();
    }
    this.hugoSymbols.add(hugoSymbolsItem);
    return this;
  }

   /**
   * Hugo symbols
   * @return hugoSymbols
  **/
  @ApiModelProperty(value = "Hugo symbols")
  public List<String> getHugoSymbols() {
    return hugoSymbols;
  }

  public void setHugoSymbols(List<String> hugoSymbols) {
    this.hugoSymbols = hugoSymbols;
  }

  public EnsemblTranscript refseqMrnaId(String refseqMrnaId) {
    this.refseqMrnaId = refseqMrnaId;
    return this;
  }

   /**
   * RefSeq mRNA ID
   * @return refseqMrnaId
  **/
  @ApiModelProperty(value = "RefSeq mRNA ID")
  public String getRefseqMrnaId() {
    return refseqMrnaId;
  }

  public void setRefseqMrnaId(String refseqMrnaId) {
    this.refseqMrnaId = refseqMrnaId;
  }

  public EnsemblTranscript ccdsId(String ccdsId) {
    this.ccdsId = ccdsId;
    return this;
  }

   /**
   * Consensus CDS (CCDS) ID
   * @return ccdsId
  **/
  @ApiModelProperty(value = "Consensus CDS (CCDS) ID")
  public String getCcdsId() {
    return ccdsId;
  }

  public void setCcdsId(String ccdsId) {
    this.ccdsId = ccdsId;
  }

  public EnsemblTranscript exons(List<Exon> exons) {
    this.exons = exons;
    return this;
  }

  public EnsemblTranscript addExonsItem(Exon exonsItem) {
    if (this.exons == null) {
      this.exons = new ArrayList<Exon>();
    }
    this.exons.add(exonsItem);
    return this;
  }

   /**
   * Exon information
   * @return exons
  **/
  @ApiModelProperty(value = "Exon information")
  public List<Exon> getExons() {
    return exons;
  }

  public void setExons(List<Exon> exons) {
    this.exons = exons;
  }

  public EnsemblTranscript utrs(List<UntranslatedRegion> utrs) {
    this.utrs = utrs;
    return this;
  }

  public EnsemblTranscript addUtrsItem(UntranslatedRegion utrsItem) {
    if (this.utrs == null) {
      this.utrs = new ArrayList<UntranslatedRegion>();
    }
    this.utrs.add(utrsItem);
    return this;
  }

   /**
   * UTR information
   * @return utrs
  **/
  @ApiModelProperty(value = "UTR information")
  public List<UntranslatedRegion> getUtrs() {
    return utrs;
  }

  public void setUtrs(List<UntranslatedRegion> utrs) {
    this.utrs = utrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnsemblTranscript ensemblTranscript = (EnsemblTranscript) o;
    return Objects.equals(this.uniprotId, ensemblTranscript.uniprotId) &&
        Objects.equals(this.transcriptId, ensemblTranscript.transcriptId) &&
        Objects.equals(this.geneId, ensemblTranscript.geneId) &&
        Objects.equals(this.proteinId, ensemblTranscript.proteinId) &&
        Objects.equals(this.proteinLength, ensemblTranscript.proteinLength) &&
        Objects.equals(this.pfamDomains, ensemblTranscript.pfamDomains) &&
        Objects.equals(this.hugoSymbols, ensemblTranscript.hugoSymbols) &&
        Objects.equals(this.refseqMrnaId, ensemblTranscript.refseqMrnaId) &&
        Objects.equals(this.ccdsId, ensemblTranscript.ccdsId) &&
        Objects.equals(this.exons, ensemblTranscript.exons) &&
        Objects.equals(this.utrs, ensemblTranscript.utrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniprotId, transcriptId, geneId, proteinId, proteinLength, pfamDomains, hugoSymbols, refseqMrnaId, ccdsId, exons, utrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnsemblTranscript {\n");
    
    sb.append("    uniprotId: ").append(toIndentedString(uniprotId)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    proteinId: ").append(toIndentedString(proteinId)).append("\n");
    sb.append("    proteinLength: ").append(toIndentedString(proteinLength)).append("\n");
    sb.append("    pfamDomains: ").append(toIndentedString(pfamDomains)).append("\n");
    sb.append("    hugoSymbols: ").append(toIndentedString(hugoSymbols)).append("\n");
    sb.append("    refseqMrnaId: ").append(toIndentedString(refseqMrnaId)).append("\n");
    sb.append("    ccdsId: ").append(toIndentedString(ccdsId)).append("\n");
    sb.append("    exons: ").append(toIndentedString(exons)).append("\n");
    sb.append("    utrs: ").append(toIndentedString(utrs)).append("\n");
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

