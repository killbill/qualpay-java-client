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
 * PaymentProfile
 */

public class PaymentProfile {
  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("auto_close_time")
  private Integer autoCloseTime = null;

  public PaymentProfile profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The id of the payment profile.
   * @return profileId
  **/
  @ApiModelProperty(example = "21200001000100000840", value = "The id of the payment profile.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public PaymentProfile currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency code of the payment profile.
   * @return currency
  **/
  @ApiModelProperty(example = "840", value = "The currency code of the payment profile.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentProfile autoCloseTime(Integer autoCloseTime) {
    this.autoCloseTime = autoCloseTime;
    return this;
  }

   /**
   * The auto close time for the batch in Pacific Time.
   * @return autoCloseTime
  **/
  @ApiModelProperty(example = "2100", value = "The auto close time for the batch in Pacific Time.")
  public Integer getAutoCloseTime() {
    return autoCloseTime;
  }

  public void setAutoCloseTime(Integer autoCloseTime) {
    this.autoCloseTime = autoCloseTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProfile paymentProfile = (PaymentProfile) o;
    return Objects.equals(this.profileId, paymentProfile.profileId) &&
        Objects.equals(this.currency, paymentProfile.currency) &&
        Objects.equals(this.autoCloseTime, paymentProfile.autoCloseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, currency, autoCloseTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProfile {\n");
    
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    autoCloseTime: ").append(toIndentedString(autoCloseTime)).append("\n");
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

