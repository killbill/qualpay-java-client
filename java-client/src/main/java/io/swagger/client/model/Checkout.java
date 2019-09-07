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
import io.swagger.client.model.GatewayResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Checkout
 */

public class Checkout {
  @SerializedName("checkout_id")
  private String checkoutId = null;

  @SerializedName("checkout_link")
  private String checkoutLink = null;

  @SerializedName("db_timestamp")
  private String dbTimestamp = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("expiry_time")
  private String expiryTime = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("amt_balance")
  private Double amtBalance = null;

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

  @SerializedName("customer_email")
  private String customerEmail = null;

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

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("preferences")
  private CheckoutPreferences preferences = null;

  @SerializedName("transactions")
  private List<GatewayResponse> transactions = null;

  public Checkout checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique identifier that identifies a checkout.
   * @return checkoutId
  **/
  @ApiModelProperty(example = "a393941797c811e6825102a019999999", value = "<strong>Format: </strong>Fixed length, 32 AN<br><strong>Description: </strong>A unique identifier that identifies a checkout.")
  public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Checkout checkoutLink(String checkoutLink) {
    this.checkoutLink = checkoutLink;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A redirect link that will direct a customer to the Qualpay payment page. This link is unique for each checkout.
   * @return checkoutLink
  **/
  @ApiModelProperty(example = "https://app.qualpay.com/checkout/a393941797c811e6825102a019999999", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>A redirect link that will direct a customer to the Qualpay payment page. This link is unique for each checkout.")
  public String getCheckoutLink() {
    return checkoutLink;
  }

  public void setCheckoutLink(String checkoutLink) {
    this.checkoutLink = checkoutLink;
  }

  public Checkout dbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The checkout resource creation timestamp. 
   * @return dbTimestamp
  **/
  @ApiModelProperty(example = "2016-02-21T12:57:47.000-0700", value = "<strong>Format: </strong>Variable length AN<br><strong>Description: </strong>The checkout resource creation timestamp. ")
  public String getDbTimestamp() {
    return dbTimestamp;
  }

  public void setDbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
  }

  public Checkout merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Unique ID assigned by Qualpay to a merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public Checkout expiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The expiration timestamp for the checkout_link. Once expired, the link cannot be used to make a payment.  
   * @return expiryTime
  **/
  @ApiModelProperty(example = "2016-02-21T13:07:47.000-0700", value = "<strong>Format: </strong>Variable length AN<br><strong>Description: </strong>The expiration timestamp for the checkout_link. Once expired, the link cannot be used to make a payment.  ")
  public String getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  public Checkout amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The total amount of the transaction including sales tax (if applicable).
   * @return amtTran
  **/
  @ApiModelProperty(example = "4.56", required = true, value = "<strong>Format: </strong>Variable length, up to 12,2 AN<br><strong>Description: </strong>The total amount of the transaction including sales tax (if applicable).")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public Checkout amtBalance(Double amtBalance) {
    this.amtBalance = amtBalance;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Amount pending. Valid only for partial payments. If amount is paid in full, the amt_balance will be 0.
   * @return amtBalance
  **/
  @ApiModelProperty(example = "1.1", value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>Amount pending. Valid only for partial payments. If amount is paid in full, the amt_balance will be 0.")
  public Double getAmtBalance() {
    return amtBalance;
  }

  public void setAmtBalance(Double amtBalance) {
    this.amtBalance = amtBalance;
  }

  public Checkout tranCurrency(String tranCurrency) {
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

  public Checkout purchaseId(String purchaseId) {
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

  public Checkout profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique profile ID that will be used during a payment gateway request. 
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Variable length, up to 20 AN<br><strong>Description: </strong>The unique profile ID that will be used during a payment gateway request. ")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Checkout merchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchant provided reference value that will be stored with the transaction data and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.
   * @return merchRefNum
  **/
  @ApiModelProperty(example = "REF#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Merchant provided reference value that will be stored with the transaction data and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.")
  public String getMerchRefNum() {
    return merchRefNum;
  }

  public void setMerchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
  }

  public Checkout customerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer&#39;s first name. 
   * @return customerFirstName
  **/
  @ApiModelProperty(example = "John", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The customer's first name. ")
  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public Checkout customerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer&#39;s last name.
   * @return customerLastName
  **/
  @ApiModelProperty(example = "Doe", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The customer's last name.")
  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public Checkout customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer&#39;s email address.
   * @return customerEmail
  **/
  @ApiModelProperty(example = "jdoe@qualpay.com", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>The customer's email address.")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public Checkout customerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer&#39;s phone number.
   * @return customerPhone
  **/
  @ApiModelProperty(example = "999-999-9999", value = "<strong>Format: </strong>Variable length, up to 10 AN<br><strong>Description: </strong>The customer's phone number.")
  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public Checkout billingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing address of the cardholder.
   * @return billingAddr1
  **/
  @ApiModelProperty(example = "123 Main Street", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>The billing address of the cardholder.")
  public String getBillingAddr1() {
    return billingAddr1;
  }

  public void setBillingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
  }

  public Checkout billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The billing state of the cardholder.
   * @return billingState
  **/
  @ApiModelProperty(example = "CA", value = "<strong>Format: </strong>Variable length, up to 2 AN<br><strong>Description: </strong>The billing state of the cardholder.")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public Checkout billingCity(String billingCity) {
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

  public Checkout billingZip(String billingZip) {
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

  public Checkout customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Qualpay customer id associated with this transaction. 
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The Qualpay customer id associated with this transaction. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Checkout preferences(CheckoutPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Preferences included in the request.
   * @return preferences
  **/
  @ApiModelProperty(value = "Preferences included in the request.")
  public CheckoutPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(CheckoutPreferences preferences) {
    this.preferences = preferences;
  }

  public Checkout transactions(List<GatewayResponse> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Checkout addTransactionsItem(GatewayResponse transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<GatewayResponse>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of responses from payment gateway. Each element of the array represents a transaction for this checkout. In addition, if a notification_url is configured in preferences, the transaction object is also posted to the URL after a checkout payment is made.
   * @return transactions
  **/
  @ApiModelProperty(value = "An array of responses from payment gateway. Each element of the array represents a transaction for this checkout. In addition, if a notification_url is configured in preferences, the transaction object is also posted to the URL after a checkout payment is made.")
  public List<GatewayResponse> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<GatewayResponse> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkout checkout = (Checkout) o;
    return Objects.equals(this.checkoutId, checkout.checkoutId) &&
        Objects.equals(this.checkoutLink, checkout.checkoutLink) &&
        Objects.equals(this.dbTimestamp, checkout.dbTimestamp) &&
        Objects.equals(this.merchantId, checkout.merchantId) &&
        Objects.equals(this.expiryTime, checkout.expiryTime) &&
        Objects.equals(this.amtTran, checkout.amtTran) &&
        Objects.equals(this.amtBalance, checkout.amtBalance) &&
        Objects.equals(this.tranCurrency, checkout.tranCurrency) &&
        Objects.equals(this.purchaseId, checkout.purchaseId) &&
        Objects.equals(this.profileId, checkout.profileId) &&
        Objects.equals(this.merchRefNum, checkout.merchRefNum) &&
        Objects.equals(this.customerFirstName, checkout.customerFirstName) &&
        Objects.equals(this.customerLastName, checkout.customerLastName) &&
        Objects.equals(this.customerEmail, checkout.customerEmail) &&
        Objects.equals(this.customerPhone, checkout.customerPhone) &&
        Objects.equals(this.billingAddr1, checkout.billingAddr1) &&
        Objects.equals(this.billingState, checkout.billingState) &&
        Objects.equals(this.billingCity, checkout.billingCity) &&
        Objects.equals(this.billingZip, checkout.billingZip) &&
        Objects.equals(this.customerId, checkout.customerId) &&
        Objects.equals(this.preferences, checkout.preferences) &&
        Objects.equals(this.transactions, checkout.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutId, checkoutLink, dbTimestamp, merchantId, expiryTime, amtTran, amtBalance, tranCurrency, purchaseId, profileId, merchRefNum, customerFirstName, customerLastName, customerEmail, customerPhone, billingAddr1, billingState, billingCity, billingZip, customerId, preferences, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkout {\n");
    
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    checkoutLink: ").append(toIndentedString(checkoutLink)).append("\n");
    sb.append("    dbTimestamp: ").append(toIndentedString(dbTimestamp)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    amtBalance: ").append(toIndentedString(amtBalance)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    merchRefNum: ").append(toIndentedString(merchRefNum)).append("\n");
    sb.append("    customerFirstName: ").append(toIndentedString(customerFirstName)).append("\n");
    sb.append("    customerLastName: ").append(toIndentedString(customerLastName)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    billingAddr1: ").append(toIndentedString(billingAddr1)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingZip: ").append(toIndentedString(billingZip)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
