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
import io.swagger.client.model.CheckoutCustomer;
import java.io.IOException;

/**
 * GatewayResponse
 */

public class GatewayResponse {
  @SerializedName("pg_id")
  private String pgId = null;

  @SerializedName("rcode")
  private String rcode = null;

  @SerializedName("rmsg")
  private String rmsg = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of the gateway transaction.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("Approved"),
    
    DECLINED("Declined");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("auth_code")
  private String authCode = null;

  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("tran_time")
  private String tranTime = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("purchase_id")
  private String purchaseId = null;

  @SerializedName("cvv2_result")
  private String cvv2Result = null;

  @SerializedName("avs_result")
  private String avsResult = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("http_status")
  private Integer httpStatus = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("merch_ref_num")
  private String merchRefNum = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("dba_name")
  private String dbaName = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("customer")
  private CheckoutCustomer customer = null;

  public GatewayResponse pgId(String pgId) {
    this.pgId = pgId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated payment gateway ID for the transaction
   * @return pgId
  **/
  @ApiModelProperty(example = "c0a3bead4a5911e6807e0a728c0d49c0", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Qualpay generated payment gateway ID for the transaction")
  public String getPgId() {
    return pgId;
  }

  public void setPgId(String pgId) {
    this.pgId = pgId;
  }

  public GatewayResponse rcode(String rcode) {
    this.rcode = rcode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Gateway Response Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for possible values.
   * @return rcode
  **/
  @ApiModelProperty(example = "000", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Gateway Response Code. Refer to <a href=\"/developer/api/reference#gateway-response-codes\"target=\"_blank\">Payment Gateway Response Codes</a> for possible values.")
  public String getRcode() {
    return rcode;
  }

  public void setRcode(String rcode) {
    this.rcode = rcode;
  }

  public GatewayResponse rmsg(String rmsg) {
    this.rmsg = rmsg;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the response code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for response code descriptions.
   * @return rmsg
  **/
  @ApiModelProperty(example = "Success", value = "<strong>Format: </strong>Variable length AN<br><strong>Description: </strong>A short description of the response code. Refer to <a href=\"/developer/api/reference#gateway-response-codes\"target=\"_blank\">Payment Gateway Response Codes</a> for response code descriptions.")
  public String getRmsg() {
    return rmsg;
  }

  public void setRmsg(String rmsg) {
    this.rmsg = rmsg;
  }

  public GatewayResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of the gateway transaction.
   * @return status
  **/
  @ApiModelProperty(example = "Approved", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Status of the gateway transaction.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GatewayResponse authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 6 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Authorization code from issuer.
   * @return authCode
  **/
  @ApiModelProperty(example = "T12345", value = "<strong>Format: </strong>Variable length, up to 6 AN<br><strong>Description: </strong>Authorization code from issuer.")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public GatewayResponse cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The card_id generated by the system if customer chooses to save card. Applicable only for Qualpay Checkout transactions with a customer id.
   * @return cardId
  **/
  @ApiModelProperty(value = "<br><strong>Description: </strong>The card_id generated by the system if customer chooses to save card. Applicable only for Qualpay Checkout transactions with a customer id.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public GatewayResponse cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Masked card number used in transaction. 
   * @return cardNumber
  **/
  @ApiModelProperty(example = "488888xxxxxx8887", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Masked card number used in transaction. ")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public GatewayResponse tranTime(String tranTime) {
    this.tranTime = tranTime;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, in YYYY-MM-DD HH:MM:ss format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction time. All times are pacific. 
   * @return tranTime
  **/
  @ApiModelProperty(example = "2016-07-01 00:00:03", value = "<strong>Format: </strong>Variable length, in YYYY-MM-DD HH:MM:ss format<br><strong>Description: </strong>Transaction time. All times are pacific. ")
  public String getTranTime() {
    return tranTime;
  }

  public void setTranTime(String tranTime) {
    this.tranTime = tranTime;
  }

  public GatewayResponse amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction amount.
   * @return amtTran
  **/
  @ApiModelProperty(example = "10.99", value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>Transaction amount.")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public GatewayResponse purchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Purchase ID of the transaction.
   * @return purchaseId
  **/
  @ApiModelProperty(example = "QP12345", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>Purchase ID of the transaction.")
  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }

  public GatewayResponse cvv2Result(String cvv2Result) {
    this.cvv2Result = cvv2Result;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If CVV is sent, then the result from the card issuer will be returned in this field. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#cvv2-result-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Result Codes for CVV2&lt;/a&gt; for valid CVV2 result codes.
   * @return cvv2Result
  **/
  @ApiModelProperty(example = "M", value = "<strong>Format: </strong>Fixed length, 1 AN<br><strong>Description: </strong>If CVV is sent, then the result from the card issuer will be returned in this field. Refer to <a href=\"/developer/api/reference#cvv2-result-codes\"target=\"_blank\">Payment Result Codes for CVV2</a> for valid CVV2 result codes.")
  public String getCvv2Result() {
    return cvv2Result;
  }

  public void setCvv2Result(String cvv2Result) {
    this.cvv2Result = cvv2Result;
  }

  public GatewayResponse avsResult(String avsResult) {
    this.avsResult = avsResult;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If the billing_zip (and optionally the billing_street_addr1) is sent, then the result from the card issuer will be returned in this field. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#avs-result-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Result Codes for AVS&lt;/a&gt; for
   * @return avsResult
  **/
  @ApiModelProperty(example = "Y", value = "<strong>Format: </strong>Fixed length, 1 AN<br><strong>Description: </strong>If the billing_zip (and optionally the billing_street_addr1) is sent, then the result from the card issuer will be returned in this field. Refer to <a href=\"/developer/api/reference#avs-result-codes\"target=\"_blank\">Payment Result Codes for AVS</a> for")
  public String getAvsResult() {
    return avsResult;
  }

  public void setAvsResult(String avsResult) {
    this.avsResult = avsResult;
  }

  public GatewayResponse duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Duration of Gateway request in ms.
   * @return duration
  **/
  @ApiModelProperty(example = "10", value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>Duration of Gateway request in ms.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GatewayResponse httpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;HTTP status of the payment gateway request.
   * @return httpStatus
  **/
  @ApiModelProperty(example = "200", value = "<strong>Format: </strong>Variable length AN<br><strong>Description: </strong>HTTP status of the payment gateway request.")
  public Integer getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }

  public GatewayResponse merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to a merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public GatewayResponse profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique profile ID used in the payment gateway requests.
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Variable length, up to 20 AN<br><strong>Description: </strong>The unique profile ID used in the payment gateway requests.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public GatewayResponse merchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field contains a merchant provided reference value that will be stored with the transaction data and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.
   * @return merchRefNum
  **/
  @ApiModelProperty(example = "REF#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>This field contains a merchant provided reference value that will be stored with the transaction data and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur.")
  public String getMerchRefNum() {
    return merchRefNum;
  }

  public void setMerchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
  }

  public GatewayResponse tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes.
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric currency code of the transaction. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes.")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public GatewayResponse dbaName(String dbaName) {
    this.dbaName = dbaName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;DBA name associated with the profile.
   * @return dbaName
  **/
  @ApiModelProperty(example = "TEST DBA", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>DBA name associated with the profile.")
  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }

  public GatewayResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. Customer ID is included in the response if it is sent in the request. 
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Unique ID established by merchant to identify a customer. Customer ID is included in the response if it is sent in the request. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public GatewayResponse customer(CheckoutCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer data input by the user for this transaction in the checkout page.  Applicable only for Qualpay Checkout transactions.
   * @return customer
  **/
  @ApiModelProperty(value = "<br><strong>Description: </strong>The customer data input by the user for this transaction in the checkout page.  Applicable only for Qualpay Checkout transactions.")
  public CheckoutCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(CheckoutCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayResponse gatewayResponse = (GatewayResponse) o;
    return Objects.equals(this.pgId, gatewayResponse.pgId) &&
        Objects.equals(this.rcode, gatewayResponse.rcode) &&
        Objects.equals(this.rmsg, gatewayResponse.rmsg) &&
        Objects.equals(this.status, gatewayResponse.status) &&
        Objects.equals(this.authCode, gatewayResponse.authCode) &&
        Objects.equals(this.cardId, gatewayResponse.cardId) &&
        Objects.equals(this.cardNumber, gatewayResponse.cardNumber) &&
        Objects.equals(this.tranTime, gatewayResponse.tranTime) &&
        Objects.equals(this.amtTran, gatewayResponse.amtTran) &&
        Objects.equals(this.purchaseId, gatewayResponse.purchaseId) &&
        Objects.equals(this.cvv2Result, gatewayResponse.cvv2Result) &&
        Objects.equals(this.avsResult, gatewayResponse.avsResult) &&
        Objects.equals(this.duration, gatewayResponse.duration) &&
        Objects.equals(this.httpStatus, gatewayResponse.httpStatus) &&
        Objects.equals(this.merchantId, gatewayResponse.merchantId) &&
        Objects.equals(this.profileId, gatewayResponse.profileId) &&
        Objects.equals(this.merchRefNum, gatewayResponse.merchRefNum) &&
        Objects.equals(this.tranCurrency, gatewayResponse.tranCurrency) &&
        Objects.equals(this.dbaName, gatewayResponse.dbaName) &&
        Objects.equals(this.customerId, gatewayResponse.customerId) &&
        Objects.equals(this.customer, gatewayResponse.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pgId, rcode, rmsg, status, authCode, cardId, cardNumber, tranTime, amtTran, purchaseId, cvv2Result, avsResult, duration, httpStatus, merchantId, profileId, merchRefNum, tranCurrency, dbaName, customerId, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayResponse {\n");
    
    sb.append("    pgId: ").append(toIndentedString(pgId)).append("\n");
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("    rmsg: ").append(toIndentedString(rmsg)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    tranTime: ").append(toIndentedString(tranTime)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    cvv2Result: ").append(toIndentedString(cvv2Result)).append("\n");
    sb.append("    avsResult: ").append(toIndentedString(avsResult)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    merchRefNum: ").append(toIndentedString(merchRefNum)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

