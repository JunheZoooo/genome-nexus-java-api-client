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
import org.genome_nexus.client.ClinvarAnnotation;
import org.genome_nexus.client.ColocatedVariant;
import org.genome_nexus.client.HotspotAnnotation;
import org.genome_nexus.client.IntergenicConsequences;
import org.genome_nexus.client.MutationAssessorAnnotation;
import org.genome_nexus.client.MyVariantInfoAnnotation;
import org.genome_nexus.client.NucleotideContextAnnotation;
import org.genome_nexus.client.OncokbAnnotation;
import org.genome_nexus.client.PtmAnnotation;
import org.genome_nexus.client.SignalAnnotation;
import org.genome_nexus.client.TranscriptConsequence;
import org.genome_nexus.client.VariantAnnotationSummary;

/**
 * VariantAnnotation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class VariantAnnotation {
  @SerializedName("allele_string")
  private String alleleString = null;

  @SerializedName("annotationJSON")
  private String annotationJSON = null;

  @SerializedName("annotation_summary")
  private VariantAnnotationSummary annotationSummary = null;

  @SerializedName("assembly_name")
  private String assemblyName = null;

  @SerializedName("clinvar")
  private ClinvarAnnotation clinvar = null;

  @SerializedName("colocatedVariants")
  private List<ColocatedVariant> colocatedVariants = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("genomicLocationExplanation")
  private String genomicLocationExplanation = null;

  @SerializedName("hgvsg")
  private String hgvsg = null;

  @SerializedName("hotspots")
  private HotspotAnnotation hotspots = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("intergenic_consequences")
  private List<IntergenicConsequences> intergenicConsequences = new ArrayList<IntergenicConsequences>();

  @SerializedName("most_severe_consequence")
  private String mostSevereConsequence = null;

  @SerializedName("mutation_assessor")
  private MutationAssessorAnnotation mutationAssessor = null;

  @SerializedName("my_variant_info")
  private MyVariantInfoAnnotation myVariantInfo = null;

  @SerializedName("nucleotide_context")
  private NucleotideContextAnnotation nucleotideContext = null;

  @SerializedName("oncokb")
  private OncokbAnnotation oncokb = null;

  @SerializedName("originalVariantQuery")
  private String originalVariantQuery = null;

  @SerializedName("ptms")
  private PtmAnnotation ptms = null;

  @SerializedName("seq_region_name")
  private String seqRegionName = null;

  @SerializedName("signalAnnotation")
  private SignalAnnotation signalAnnotation = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("strand")
  private Integer strand = null;

  @SerializedName("successfully_annotated")
  private Boolean successfullyAnnotated = null;

  @SerializedName("transcript_consequences")
  private List<TranscriptConsequence> transcriptConsequences = null;

  @SerializedName("variant")
  private String variant = null;

  public VariantAnnotation alleleString(String alleleString) {
    this.alleleString = alleleString;
    return this;
  }

   /**
   * Allele string (e.g: A/T)
   * @return alleleString
  **/
  @ApiModelProperty(value = "Allele string (e.g: A/T)")
  public String getAlleleString() {
    return alleleString;
  }

  public void setAlleleString(String alleleString) {
    this.alleleString = alleleString;
  }

  public VariantAnnotation annotationJSON(String annotationJSON) {
    this.annotationJSON = annotationJSON;
    return this;
  }

   /**
   * Annotation data as JSON string
   * @return annotationJSON
  **/
  @ApiModelProperty(value = "Annotation data as JSON string")
  public String getAnnotationJSON() {
    return annotationJSON;
  }

  public void setAnnotationJSON(String annotationJSON) {
    this.annotationJSON = annotationJSON;
  }

  public VariantAnnotation annotationSummary(VariantAnnotationSummary annotationSummary) {
    this.annotationSummary = annotationSummary;
    return this;
  }

   /**
   * Variant Annotation Summary
   * @return annotationSummary
  **/
  @ApiModelProperty(value = "Variant Annotation Summary")
  public VariantAnnotationSummary getAnnotationSummary() {
    return annotationSummary;
  }

  public void setAnnotationSummary(VariantAnnotationSummary annotationSummary) {
    this.annotationSummary = annotationSummary;
  }

  public VariantAnnotation assemblyName(String assemblyName) {
    this.assemblyName = assemblyName;
    return this;
  }

   /**
   * NCBI build number
   * @return assemblyName
  **/
  @ApiModelProperty(value = "NCBI build number")
  public String getAssemblyName() {
    return assemblyName;
  }

  public void setAssemblyName(String assemblyName) {
    this.assemblyName = assemblyName;
  }

  public VariantAnnotation clinvar(ClinvarAnnotation clinvar) {
    this.clinvar = clinvar;
    return this;
  }

   /**
   * MyVariantInfoClinVar
   * @return clinvar
  **/
  @ApiModelProperty(value = "MyVariantInfoClinVar")
  public ClinvarAnnotation getClinvar() {
    return clinvar;
  }

  public void setClinvar(ClinvarAnnotation clinvar) {
    this.clinvar = clinvar;
  }

  public VariantAnnotation colocatedVariants(List<ColocatedVariant> colocatedVariants) {
    this.colocatedVariants = colocatedVariants;
    return this;
  }

  public VariantAnnotation addColocatedVariantsItem(ColocatedVariant colocatedVariantsItem) {
    if (this.colocatedVariants == null) {
      this.colocatedVariants = new ArrayList<ColocatedVariant>();
    }
    this.colocatedVariants.add(colocatedVariantsItem);
    return this;
  }

   /**
   * Get colocatedVariants
   * @return colocatedVariants
  **/
  @ApiModelProperty(value = "")
  public List<ColocatedVariant> getColocatedVariants() {
    return colocatedVariants;
  }

  public void setColocatedVariants(List<ColocatedVariant> colocatedVariants) {
    this.colocatedVariants = colocatedVariants;
  }

  public VariantAnnotation end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * End position
   * @return end
  **/
  @ApiModelProperty(value = "End position")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public VariantAnnotation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public VariantAnnotation genomicLocationExplanation(String genomicLocationExplanation) {
    this.genomicLocationExplanation = genomicLocationExplanation;
    return this;
  }

   /**
   * Get genomicLocationExplanation
   * @return genomicLocationExplanation
  **/
  @ApiModelProperty(value = "")
  public String getGenomicLocationExplanation() {
    return genomicLocationExplanation;
  }

  public void setGenomicLocationExplanation(String genomicLocationExplanation) {
    this.genomicLocationExplanation = genomicLocationExplanation;
  }

  public VariantAnnotation hgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
    return this;
  }

   /**
   * Get hgvsg
   * @return hgvsg
  **/
  @ApiModelProperty(value = "")
  public String getHgvsg() {
    return hgvsg;
  }

  public void setHgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
  }

  public VariantAnnotation hotspots(HotspotAnnotation hotspots) {
    this.hotspots = hotspots;
    return this;
  }

   /**
   * Hotspot Annotation
   * @return hotspots
  **/
  @ApiModelProperty(value = "Hotspot Annotation")
  public HotspotAnnotation getHotspots() {
    return hotspots;
  }

  public void setHotspots(HotspotAnnotation hotspots) {
    this.hotspots = hotspots;
  }

  public VariantAnnotation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Variant id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Variant id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VariantAnnotation intergenicConsequences(List<IntergenicConsequences> intergenicConsequences) {
    this.intergenicConsequences = intergenicConsequences;
    return this;
  }

  public VariantAnnotation addIntergenicConsequencesItem(IntergenicConsequences intergenicConsequencesItem) {
    this.intergenicConsequences.add(intergenicConsequencesItem);
    return this;
  }

   /**
   * intergenicConsequences
   * @return intergenicConsequences
  **/
  @ApiModelProperty(required = true, value = "intergenicConsequences")
  public List<IntergenicConsequences> getIntergenicConsequences() {
    return intergenicConsequences;
  }

  public void setIntergenicConsequences(List<IntergenicConsequences> intergenicConsequences) {
    this.intergenicConsequences = intergenicConsequences;
  }

  public VariantAnnotation mostSevereConsequence(String mostSevereConsequence) {
    this.mostSevereConsequence = mostSevereConsequence;
    return this;
  }

   /**
   * Most severe consequence
   * @return mostSevereConsequence
  **/
  @ApiModelProperty(value = "Most severe consequence")
  public String getMostSevereConsequence() {
    return mostSevereConsequence;
  }

  public void setMostSevereConsequence(String mostSevereConsequence) {
    this.mostSevereConsequence = mostSevereConsequence;
  }

  public VariantAnnotation mutationAssessor(MutationAssessorAnnotation mutationAssessor) {
    this.mutationAssessor = mutationAssessor;
    return this;
  }

   /**
   * Mutation Assessor Annotation
   * @return mutationAssessor
  **/
  @ApiModelProperty(value = "Mutation Assessor Annotation")
  public MutationAssessorAnnotation getMutationAssessor() {
    return mutationAssessor;
  }

  public void setMutationAssessor(MutationAssessorAnnotation mutationAssessor) {
    this.mutationAssessor = mutationAssessor;
  }

  public VariantAnnotation myVariantInfo(MyVariantInfoAnnotation myVariantInfo) {
    this.myVariantInfo = myVariantInfo;
    return this;
  }

   /**
   * My Variant Info Annotation
   * @return myVariantInfo
  **/
  @ApiModelProperty(value = "My Variant Info Annotation")
  public MyVariantInfoAnnotation getMyVariantInfo() {
    return myVariantInfo;
  }

  public void setMyVariantInfo(MyVariantInfoAnnotation myVariantInfo) {
    this.myVariantInfo = myVariantInfo;
  }

  public VariantAnnotation nucleotideContext(NucleotideContextAnnotation nucleotideContext) {
    this.nucleotideContext = nucleotideContext;
    return this;
  }

   /**
   * Nucleotide Context Annotation
   * @return nucleotideContext
  **/
  @ApiModelProperty(value = "Nucleotide Context Annotation")
  public NucleotideContextAnnotation getNucleotideContext() {
    return nucleotideContext;
  }

  public void setNucleotideContext(NucleotideContextAnnotation nucleotideContext) {
    this.nucleotideContext = nucleotideContext;
  }

  public VariantAnnotation oncokb(OncokbAnnotation oncokb) {
    this.oncokb = oncokb;
    return this;
  }

   /**
   * Oncokb
   * @return oncokb
  **/
  @ApiModelProperty(value = "Oncokb")
  public OncokbAnnotation getOncokb() {
    return oncokb;
  }

  public void setOncokb(OncokbAnnotation oncokb) {
    this.oncokb = oncokb;
  }

  public VariantAnnotation originalVariantQuery(String originalVariantQuery) {
    this.originalVariantQuery = originalVariantQuery;
    return this;
  }

   /**
   * Original variant query
   * @return originalVariantQuery
  **/
  @ApiModelProperty(required = true, value = "Original variant query")
  public String getOriginalVariantQuery() {
    return originalVariantQuery;
  }

  public void setOriginalVariantQuery(String originalVariantQuery) {
    this.originalVariantQuery = originalVariantQuery;
  }

  public VariantAnnotation ptms(PtmAnnotation ptms) {
    this.ptms = ptms;
    return this;
  }

   /**
   * Post Translational Modifications
   * @return ptms
  **/
  @ApiModelProperty(value = "Post Translational Modifications")
  public PtmAnnotation getPtms() {
    return ptms;
  }

  public void setPtms(PtmAnnotation ptms) {
    this.ptms = ptms;
  }

  public VariantAnnotation seqRegionName(String seqRegionName) {
    this.seqRegionName = seqRegionName;
    return this;
  }

   /**
   * Chromosome
   * @return seqRegionName
  **/
  @ApiModelProperty(value = "Chromosome")
  public String getSeqRegionName() {
    return seqRegionName;
  }

  public void setSeqRegionName(String seqRegionName) {
    this.seqRegionName = seqRegionName;
  }

  public VariantAnnotation signalAnnotation(SignalAnnotation signalAnnotation) {
    this.signalAnnotation = signalAnnotation;
    return this;
  }

   /**
   * Get signalAnnotation
   * @return signalAnnotation
  **/
  @ApiModelProperty(value = "")
  public SignalAnnotation getSignalAnnotation() {
    return signalAnnotation;
  }

  public void setSignalAnnotation(SignalAnnotation signalAnnotation) {
    this.signalAnnotation = signalAnnotation;
  }

  public VariantAnnotation start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Start position
   * @return start
  **/
  @ApiModelProperty(value = "Start position")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public VariantAnnotation strand(Integer strand) {
    this.strand = strand;
    return this;
  }

   /**
   * Strand (negative or positive)
   * @return strand
  **/
  @ApiModelProperty(value = "Strand (negative or positive)")
  public Integer getStrand() {
    return strand;
  }

  public void setStrand(Integer strand) {
    this.strand = strand;
  }

  public VariantAnnotation successfullyAnnotated(Boolean successfullyAnnotated) {
    this.successfullyAnnotated = successfullyAnnotated;
    return this;
  }

   /**
   * Status flag indicating whether variant was succesfully annotated
   * @return successfullyAnnotated
  **/
  @ApiModelProperty(example = "false", value = "Status flag indicating whether variant was succesfully annotated")
  public Boolean isSuccessfullyAnnotated() {
    return successfullyAnnotated;
  }

  public void setSuccessfullyAnnotated(Boolean successfullyAnnotated) {
    this.successfullyAnnotated = successfullyAnnotated;
  }

  public VariantAnnotation transcriptConsequences(List<TranscriptConsequence> transcriptConsequences) {
    this.transcriptConsequences = transcriptConsequences;
    return this;
  }

  public VariantAnnotation addTranscriptConsequencesItem(TranscriptConsequence transcriptConsequencesItem) {
    if (this.transcriptConsequences == null) {
      this.transcriptConsequences = new ArrayList<TranscriptConsequence>();
    }
    this.transcriptConsequences.add(transcriptConsequencesItem);
    return this;
  }

   /**
   * List of transcripts
   * @return transcriptConsequences
  **/
  @ApiModelProperty(value = "List of transcripts")
  public List<TranscriptConsequence> getTranscriptConsequences() {
    return transcriptConsequences;
  }

  public void setTranscriptConsequences(List<TranscriptConsequence> transcriptConsequences) {
    this.transcriptConsequences = transcriptConsequences;
  }

  public VariantAnnotation variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Variant key
   * @return variant
  **/
  @ApiModelProperty(required = true, value = "Variant key")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantAnnotation variantAnnotation = (VariantAnnotation) o;
    return Objects.equals(this.alleleString, variantAnnotation.alleleString) &&
        Objects.equals(this.annotationJSON, variantAnnotation.annotationJSON) &&
        Objects.equals(this.annotationSummary, variantAnnotation.annotationSummary) &&
        Objects.equals(this.assemblyName, variantAnnotation.assemblyName) &&
        Objects.equals(this.clinvar, variantAnnotation.clinvar) &&
        Objects.equals(this.colocatedVariants, variantAnnotation.colocatedVariants) &&
        Objects.equals(this.end, variantAnnotation.end) &&
        Objects.equals(this.errorMessage, variantAnnotation.errorMessage) &&
        Objects.equals(this.genomicLocationExplanation, variantAnnotation.genomicLocationExplanation) &&
        Objects.equals(this.hgvsg, variantAnnotation.hgvsg) &&
        Objects.equals(this.hotspots, variantAnnotation.hotspots) &&
        Objects.equals(this.id, variantAnnotation.id) &&
        Objects.equals(this.intergenicConsequences, variantAnnotation.intergenicConsequences) &&
        Objects.equals(this.mostSevereConsequence, variantAnnotation.mostSevereConsequence) &&
        Objects.equals(this.mutationAssessor, variantAnnotation.mutationAssessor) &&
        Objects.equals(this.myVariantInfo, variantAnnotation.myVariantInfo) &&
        Objects.equals(this.nucleotideContext, variantAnnotation.nucleotideContext) &&
        Objects.equals(this.oncokb, variantAnnotation.oncokb) &&
        Objects.equals(this.originalVariantQuery, variantAnnotation.originalVariantQuery) &&
        Objects.equals(this.ptms, variantAnnotation.ptms) &&
        Objects.equals(this.seqRegionName, variantAnnotation.seqRegionName) &&
        Objects.equals(this.signalAnnotation, variantAnnotation.signalAnnotation) &&
        Objects.equals(this.start, variantAnnotation.start) &&
        Objects.equals(this.strand, variantAnnotation.strand) &&
        Objects.equals(this.successfullyAnnotated, variantAnnotation.successfullyAnnotated) &&
        Objects.equals(this.transcriptConsequences, variantAnnotation.transcriptConsequences) &&
        Objects.equals(this.variant, variantAnnotation.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alleleString, annotationJSON, annotationSummary, assemblyName, clinvar, colocatedVariants, end, errorMessage, genomicLocationExplanation, hgvsg, hotspots, id, intergenicConsequences, mostSevereConsequence, mutationAssessor, myVariantInfo, nucleotideContext, oncokb, originalVariantQuery, ptms, seqRegionName, signalAnnotation, start, strand, successfullyAnnotated, transcriptConsequences, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantAnnotation {\n");
    
    sb.append("    alleleString: ").append(toIndentedString(alleleString)).append("\n");
    sb.append("    annotationJSON: ").append(toIndentedString(annotationJSON)).append("\n");
    sb.append("    annotationSummary: ").append(toIndentedString(annotationSummary)).append("\n");
    sb.append("    assemblyName: ").append(toIndentedString(assemblyName)).append("\n");
    sb.append("    clinvar: ").append(toIndentedString(clinvar)).append("\n");
    sb.append("    colocatedVariants: ").append(toIndentedString(colocatedVariants)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    genomicLocationExplanation: ").append(toIndentedString(genomicLocationExplanation)).append("\n");
    sb.append("    hgvsg: ").append(toIndentedString(hgvsg)).append("\n");
    sb.append("    hotspots: ").append(toIndentedString(hotspots)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intergenicConsequences: ").append(toIndentedString(intergenicConsequences)).append("\n");
    sb.append("    mostSevereConsequence: ").append(toIndentedString(mostSevereConsequence)).append("\n");
    sb.append("    mutationAssessor: ").append(toIndentedString(mutationAssessor)).append("\n");
    sb.append("    myVariantInfo: ").append(toIndentedString(myVariantInfo)).append("\n");
    sb.append("    nucleotideContext: ").append(toIndentedString(nucleotideContext)).append("\n");
    sb.append("    oncokb: ").append(toIndentedString(oncokb)).append("\n");
    sb.append("    originalVariantQuery: ").append(toIndentedString(originalVariantQuery)).append("\n");
    sb.append("    ptms: ").append(toIndentedString(ptms)).append("\n");
    sb.append("    seqRegionName: ").append(toIndentedString(seqRegionName)).append("\n");
    sb.append("    signalAnnotation: ").append(toIndentedString(signalAnnotation)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    successfullyAnnotated: ").append(toIndentedString(successfullyAnnotated)).append("\n");
    sb.append("    transcriptConsequences: ").append(toIndentedString(transcriptConsequences)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

