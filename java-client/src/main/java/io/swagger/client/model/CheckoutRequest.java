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
import io.swagger.client.model.CheckoutPreferences;
import java.io.IOException;

/**
 * CheckoutRequest
 */

public class CheckoutRequest {
  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("purchase_id")
  private String purchaseId = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("merch_ref_num")
  private String merchRefNum = null;

  @SerializedName("customer_first_name")
  private String customerFirstName = null;

  @SerializedName("customer_last_name")
  private String customerLastName = null;

  @SerializedName("customer_firm_name")
  private String customerFirmName = null;

  @SerializedName("customer_email")
  private String customerEmail = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("customer_phone")
  private String customerPhone = null;

  @SerializedName("billing_addr1")
  private String billingAddr1 = null;

  @SerializedName("billing_state")
  private String billingState = null;

  @SerializedName("billing_city")
  private String billingCity = null;

  @SerializedName("billing_zip")
  private String billingZip = null;

  @SerializedName("moto_ecomm_ind")
  private String motoEcommInd = null;

  @SerializedName("preferences")
  private CheckoutPreferences preferences = null;

  @SerializedName("checkout_profile_id")
  private Long checkoutProfileId = null;

  public CheckoutRequest amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The total amount of the transaction including sales tax (if applicable).
   * @return amtTran
  **/
  @ApiModelProperty(example = "4.56", required = true, value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>The total amount of the transaction including sales tax (if applicable).")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public CheckoutRequest tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. If the profile_id field is provided, this field will be overridden by the profile’s tran_currency.
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric currency code of the transaction. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes. If the profile_id field is provided, this field will be overridden by the profile’s tran_currency.")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public CheckoutRequest purchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The purchase identifier (also referred to as the invoice number) generated by the merchant.
   * @return purchaseId
  **/
  @ApiModelProperty(example = "PID#2345", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>The purchase identifier (also referred to as the invoice number) generated by the merchant.")
  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }

  public CheckoutRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique profile ID to be used in payment gateway requests. Specify this field if there are multiple profiles for the same currency or if the request should be processed using specific profile_id. By default, if provided, the profile_id decides the tran_currency field.  When profile_id is used, the tran_currency is not required.
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Variable length, up to 20 AN<br><strong>Description: </strong>The unique profile ID to be used in payment gateway requests. Specify this field if there are multiple profiles for the same currency or if the request should be processed using specific profile_id. By default, if provided, the profile_id decides the tran_currency field.  When profile_id is used, the tran_currency is not required.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public CheckoutRequest merchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchant provided reference value that will be stored with the transaction and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.
   * @return merchRefNum
  **/
  @ApiModelProperty(example = "REF#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Merchant provided reference value that will be stored with the transaction and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.")
  public String getMerchRefNum() {
    return merchRefNum;
  }

  public void setMerchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
  }

  public CheckoutRequest customerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer first name. If this field value is longer than the maximum allowed length, the name will be truncated to maximum allowed length.
   * @return customerFirstName
  **/
  @ApiModelProperty(example = "John", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The customer first name. If this field value is longer than the maximum allowed length, the name will be truncated to maximum allowed length.")
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public CheckoutRequest customerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer last name. If this field value is longer than the maximum allowed length, the name will be truncated. to maximum allowed length.
   * @return customerLastName
  **/
  @ApiModelProperty(example = "Doe", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The customer last name. If this field value is longer than the maximum allowed length, the name will be truncated. to maximum allowed length.")
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public CheckoutRequest customerFirmName(String customerFirmName) {
    this.customerFirmName = customerFirmName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s business name, if applicable. 
   * @return customerFirmName
  **/
  @ApiModelProperty(example = "Qualpay", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Customer's business name, if applicable. ")
  public String getCustomerFirmName() {
    return customerFirmName;
  }

  public void setCustomerFirmName(String customerFirmName) {
    this.customerFirmName = customerFirmName;
  }

  public CheckoutRequest customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The email address of the customer.
   * @return customerEmail
  **/
  @ApiModelProperty(example = "jdoe@qualpay.com", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>The email address of the customer.")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public CheckoutRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; A unique id to identify the customer in Qualpay. If this is an existing customer, the checkout transaction will be linked to the customer. If this is a new customer, a new customer record is created in Qualpay. The customer_first_name and customer_last_name fields are required for new customers. This field is applicable only for merchant ids that are configured to use Qualpay Customer Vault.
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong> A unique id to identify the customer in Qualpay. If this is an existing customer, the checkout transaction will be linked to the customer. If this is a new customer, a new customer record is created in Qualpay. The customer_first_name and customer_last_name fields are required for new customers. This field is applicable only for merchant ids that are configured to use Qualpay Customer Vault.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CheckoutRequest customerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer phone number.
   * @return customerPhone
  **/
  @ApiModelProperty(example = "999-999-9999", value = "<strong>Format: </strong>Variable length, up to 10 AN<br><strong>Description: </strong>The customer phone number.")
  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public CheckoutRequest billingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing street address of the cardholder.
   * @return billingAddr1
  **/
  @ApiModelProperty(example = "123 Main Street", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>The billing street address of the cardholder.")
  public String getBillingAddr1() {
    return billingAddr1;
  }

  public void setBillingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
  }

  public CheckoutRequest billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing state of the cardholder.
   * @return billingState
  **/
  @ApiModelProperty(example = "CA", value = "<strong>Format: </strong>Variable length, up to 3 AN<br><strong>Description: </strong>The billing state of the cardholder.")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public CheckoutRequest billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing city of the cardholder.
   * @return billingCity
  **/
  @ApiModelProperty(example = "San Mateo", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>The billing city of the cardholder.")
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public CheckoutRequest billingZip(String billingZip) {
    this.billingZip = billingZip;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing zip code of the cardholder.
   * @return billingZip
  **/
  @ApiModelProperty(example = "94538", value = "<strong>Format: </strong>Variable length, up to 10 AN<br><strong>Description: </strong>The billing zip code of the cardholder.")
  public String getBillingZip() {
    return billingZip;
  }

  public void setBillingZip(String billingZip) {
    this.billingZip = billingZip;
  }

  public CheckoutRequest motoEcommInd(String motoEcommInd) {
    this.motoEcommInd = motoEcommInd;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 N&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;7&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Indicates type of MOTO transaction: &lt;ul&gt;&lt;li&gt;0 &#x3D; Card Present (not MOTO/e-Commerce)&lt;/li&gt;&lt;li&gt;1 &#x3D; One Time MOTO transaction&lt;/li&gt;&lt;li&gt;2 &#x3D; Recurring &lt;/li&gt;&lt;li&gt;3 &#x3D; Installment &lt;/li&gt;&lt;li&gt;7 &#x3D; e-Commerce Channel Encrypted (SSL)&lt;/li&gt;&lt;/ul&gt;
   * @return motoEcommInd
  **/
  @ApiModelProperty(example = "1", value = "<strong>Format: </strong>Fixed length, 1 N<br><strong>Default: </strong>7<br><strong>Description: </strong>Indicates type of MOTO transaction: <ul><li>0 = Card Present (not MOTO/e-Commerce)</li><li>1 = One Time MOTO transaction</li><li>2 = Recurring </li><li>3 = Installment </li><li>7 = e-Commerce Channel Encrypted (SSL)</li></ul>")
  public String getMotoEcommInd() {
    return motoEcommInd;
  }

  public void setMotoEcommInd(String motoEcommInd) {
    this.motoEcommInd = motoEcommInd;
  }

  public CheckoutRequest preferences(CheckoutPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Overrides the preferences set through Qualpay Manager Checkout settings.
   * @return preferences
  **/
  @ApiModelProperty(value = "Overrides the preferences set through Qualpay Manager Checkout settings.")
  public CheckoutPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(CheckoutPreferences preferences) {
    this.preferences = preferences;
  }

  public CheckoutRequest checkoutProfileId(Long checkoutProfileId) {
    this.checkoutProfileId = checkoutProfileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique id associated with the checout profile. This id can be retrieved from the Checkout tab in the Settings page. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;This field is required if you have multiple active checkout profiles. This field is not required if your account has only one active checkout profile. 
   * @return checkoutProfileId
  **/
  @ApiModelProperty(example = "1005", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>The unique id associated with the checout profile. This id can be retrieved from the Checkout tab in the Settings page. <br><strong>Conditional Requirement: </strong>This field is required if you have multiple active checkout profiles. This field is not required if your account has only one active checkout profile. ")
  public Long getCheckoutProfileId() {
    return checkoutProfileId;
  }

  public void setCheckoutProfileId(Long checkoutProfileId) {
    this.checkoutProfileId = checkoutProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutRequest checkoutRequest = (CheckoutRequest) o;
    return Objects.equals(this.amtTran, checkoutRequest.amtTran) &&
        Objects.equals(this.tranCurrency, checkoutRequest.tranCurrency) &&
        Objects.equals(this.purchaseId, checkoutRequest.purchaseId) &&
        Objects.equals(this.profileId, checkoutRequest.profileId) &&
        Objects.equals(this.merchRefNum, checkoutRequest.merchRefNum) &&
        Objects.equals(this.customerFirstName, checkoutRequest.customerFirstName) &&
        Objects.equals(this.customerLastName, checkoutRequest.customerLastName) &&
        Objects.equals(this.customerFirmName, checkoutRequest.customerFirmName) &&
        Objects.equals(this.customerEmail, checkoutRequest.customerEmail) &&
        Objects.equals(this.customerId, checkoutRequest.customerId) &&
        Objects.equals(this.customerPhone, checkoutRequest.customerPhone) &&
        Objects.equals(this.billingAddr1, checkoutRequest.billingAddr1) &&
        Objects.equals(this.billingState, checkoutRequest.billingState) &&
        Objects.equals(this.billingCity, checkoutRequest.billingCity) &&
        Objects.equals(this.billingZip, checkoutRequest.billingZip) &&
        Objects.equals(this.motoEcommInd, checkoutRequest.motoEcommInd) &&
        Objects.equals(this.preferences, checkoutRequest.preferences) &&
        Objects.equals(this.checkoutProfileId, checkoutRequest.checkoutProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amtTran, tranCurrency, purchaseId, profileId, merchRefNum, customerFirstName, customerLastName, customerFirmName, customerEmail, customerId, customerPhone, billingAddr1, billingState, billingCity, billingZip, motoEcommInd, preferences, checkoutProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutRequest {\n");
    
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    merchRefNum: ").append(toIndentedString(merchRefNum)).append("\n");
    sb.append("    customerFirstName: ").append(toIndentedString(customerFirstName)).append("\n");
    sb.append("    customerLastName: ").append(toIndentedString(customerLastName)).append("\n");
    sb.append("    customerFirmName: ").append(toIndentedString(customerFirmName)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    billingAddr1: ").append(toIndentedString(billingAddr1)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingZip: ").append(toIndentedString(billingZip)).append("\n");
    sb.append("    motoEcommInd: ").append(toIndentedString(motoEcommInd)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    checkoutProfileId: ").append(toIndentedString(checkoutProfileId)).append("\n");
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

