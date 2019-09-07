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
import java.util.ArrayList;
import java.util.List;

/**
 * ResendInvoiceRequest
 */

public class ResendInvoiceRequest {
  @SerializedName("email_address")
  private List<String> emailAddress = null;

  public ResendInvoiceRequest emailAddress(List<String> emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  public ResendInvoiceRequest addEmailAddressItem(String emailAddressItem) {
    if (this.emailAddress == null) {
      this.emailAddress = new ArrayList<String>();
    }
    this.emailAddress.add(emailAddressItem);
    return this;
  }

   /**
   * An array of email addresses to which the invoice will be sent. By default, the system will send the invoice to the customer&#39;s email address (business_contact.email_address). 
   * @return emailAddress
  **/
  @ApiModelProperty(example = "\"[john.doe@qualpay.com, jdoe@qualpay.com]\"", value = "An array of email addresses to which the invoice will be sent. By default, the system will send the invoice to the customer's email address (business_contact.email_address). ")
  public List<String> getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(List<String> emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResendInvoiceRequest resendInvoiceRequest = (ResendInvoiceRequest) o;
    return Objects.equals(this.emailAddress, resendInvoiceRequest.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResendInvoiceRequest {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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
