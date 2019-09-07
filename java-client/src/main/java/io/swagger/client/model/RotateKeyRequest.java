/*
 * Qualpay Platform API
 * This document describes the Qualpay Platform API.
 *
 * OpenAPI spec version: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RotateKeyRequest
 */

public class RotateKeyRequest {
  @SerializedName("minutes")
  private Integer minutes = null;

  public RotateKeyRequest minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

   /**
   * The number of minutes the previous key will be valid. 
   * @return minutes
  **/
  @ApiModelProperty(example = "2880", value = "The number of minutes the previous key will be valid. ")
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateKeyRequest rotateKeyRequest = (RotateKeyRequest) o;
    return Objects.equals(this.minutes, rotateKeyRequest.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateKeyRequest {\n");
    
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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

