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
 * CheckoutCustomer
 */

public class CheckoutCustomer {
  @SerializedName("customer_first_name")
  private String customerFirstName = null;

  @SerializedName("customer_last_name")
  private String customerLastName = null;

  @SerializedName("customer_email")
  private String customerEmail = null;

  @SerializedName("billing_addr1")
  private String billingAddr1 = null;

  @SerializedName("billing_city")
  private String billingCity = null;

  @SerializedName("billing_state")
  private String billingState = null;

  @SerializedName("billing_zip")
  private String billingZip = null;

  public CheckoutCustomer customerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s first name.
   * @return customerFirstName
  **/
  @ApiModelProperty(example = "John", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Customer's first name.")
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public CheckoutCustomer customerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s last name.
   * @return customerLastName
  **/
  @ApiModelProperty(example = "Doe", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Customer's last name.")
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public CheckoutCustomer customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s email address.
   * @return customerEmail
  **/
  @ApiModelProperty(example = "jdoe@qualpay.com", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Customer's email address.")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public CheckoutCustomer billingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing street address. This address will also used for AVS verification if AVS verification is enabled. 
   * @return billingAddr1
  **/
  @ApiModelProperty(example = "123 Main Avenue", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Billing street address. This address will also used for AVS verification if AVS verification is enabled. ")
  public String getBillingAddr1() {
    return billingAddr1;
  }

  public void setBillingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
  }

  public CheckoutCustomer billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing city.
   * @return billingCity
  **/
  @ApiModelProperty(example = "San Mateo", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Billing city.")
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public CheckoutCustomer billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing state.
   * @return billingState
  **/
  @ApiModelProperty(example = "CA", value = "<strong>Format: </strong>Variable length, up to 3 AN<br><strong>Description: </strong>Billing state.")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public CheckoutCustomer billingZip(String billingZip) {
    this.billingZip = billingZip;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip.This zip code will be used for AVS verification if AVS verification is enabled.
   * @return billingZip
  **/
  @ApiModelProperty(example = "99099", required = true, value = "<strong>Format: </strong>Variable length, up to 10 AN<br><strong>Description: </strong>Billing zip.This zip code will be used for AVS verification if AVS verification is enabled.")
  public String getBillingZip() {
    return billingZip;
  }

  public void setBillingZip(String billingZip) {
    this.billingZip = billingZip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutCustomer checkoutCustomer = (CheckoutCustomer) o;
    return Objects.equals(this.customerFirstName, checkoutCustomer.customerFirstName) &&
        Objects.equals(this.customerLastName, checkoutCustomer.customerLastName) &&
        Objects.equals(this.customerEmail, checkoutCustomer.customerEmail) &&
        Objects.equals(this.billingAddr1, checkoutCustomer.billingAddr1) &&
        Objects.equals(this.billingCity, checkoutCustomer.billingCity) &&
        Objects.equals(this.billingState, checkoutCustomer.billingState) &&
        Objects.equals(this.billingZip, checkoutCustomer.billingZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFirstName, customerLastName, customerEmail, billingAddr1, billingCity, billingState, billingZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutCustomer {\n");
    
    sb.append("    customerFirstName: ").append(toIndentedString(customerFirstName)).append("\n");
    sb.append("    customerLastName: ").append(toIndentedString(customerLastName)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    billingAddr1: ").append(toIndentedString(billingAddr1)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingZip: ").append(toIndentedString(billingZip)).append("\n");
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

