/*
 * Klimb API
 * The API used by Klimb.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: bradleytenuta@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bradleytenuta.klimb.core.domain;

import java.util.Objects;
import java.util.Arrays;
import com.bradleytenuta.klimb.core.domain.Node;
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
 * GeneratedMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-01T12:31:18.421290300+01:00[Europe/London]")
public class GeneratedMap {
  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Long seed;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<Node> nodes = new ArrayList<Node>();

  public GeneratedMap() { 
  }

  public GeneratedMap seed(Long seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * Get seed
   * minimum: 0
   * @return seed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSeed() {
    return seed;
  }


  public void setSeed(Long seed) {
    this.seed = seed;
  }


  public GeneratedMap nodes(List<Node> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public GeneratedMap addNodesItem(Node nodesItem) {
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Node> getNodes() {
    return nodes;
  }


  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratedMap generatedMap = (GeneratedMap) o;
    return Objects.equals(this.seed, generatedMap.seed) &&
        Objects.equals(this.nodes, generatedMap.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seed, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratedMap {\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
