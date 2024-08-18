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
 * OncoTree Cancer Type
 */
@ApiModel(description = "OncoTree Cancer Type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-29T11:52:00.564-04:00")
public class MainType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets tumorForm
   */
  @JsonAdapter(TumorFormEnum.Adapter.class)
  public enum TumorFormEnum {
    SOLID("SOLID"),
    
    LIQUID("LIQUID"),
    
    MIXED("MIXED");

    private String value;

    TumorFormEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TumorFormEnum fromValue(String text) {
      for (TumorFormEnum b : TumorFormEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TumorFormEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TumorFormEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TumorFormEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TumorFormEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tumorForm")
  private TumorFormEnum tumorForm = null;

  public MainType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MainType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MainType tumorForm(TumorFormEnum tumorForm) {
    this.tumorForm = tumorForm;
    return this;
  }

   /**
   * Get tumorForm
   * @return tumorForm
  **/
  @ApiModelProperty(value = "")
  public TumorFormEnum getTumorForm() {
    return tumorForm;
  }

  public void setTumorForm(TumorFormEnum tumorForm) {
    this.tumorForm = tumorForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainType mainType = (MainType) o;
    return Objects.equals(this.id, mainType.id) &&
        Objects.equals(this.name, mainType.name) &&
        Objects.equals(this.tumorForm, mainType.tumorForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tumorForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tumorForm: ").append(toIndentedString(tumorForm)).append("\n");
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

