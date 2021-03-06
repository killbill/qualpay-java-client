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
 * Transaction
 */

public class Transaction {
  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("tran_time")
  private String tranTime = null;

  @SerializedName("tran_date")
  private String tranDate = null;

  @SerializedName("tran_status")
  private String tranStatus = null;

  @SerializedName("auth_code")
  private String authCode = null;

  @SerializedName("rcode")
  private String rcode = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card type of the billing card used for the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for possible values. 
   */
  @JsonAdapter(CardTypeEnum.Adapter.class)
  public enum CardTypeEnum {
    VS("VS"),
    
    MC("MC"),
    
    AM("AM"),
    
    DS("DS"),
    
    JC("JC"),
    
    PP("PP"),
    
    AP("AP");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("card_type")
  private CardTypeEnum cardType = null;

  @SerializedName("purchase_id")
  private String purchaseId = null;

  @SerializedName("pg_id")
  private String pgId = null;

  @SerializedName("cardholder_first_name")
  private String cardholderFirstName = null;

  @SerializedName("cardholder_last_name")
  private String cardholderLastName = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("dispute_flag")
  private Boolean disputeFlag = null;

  @SerializedName("amt_refunded")
  private Double amtRefunded = null;

  @SerializedName("batch_number")
  private Long batchNumber = null;

  @SerializedName("dba_name")
  private String dbaName = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("subscription_id")
  private String subscriptionId = null;

  @SerializedName("merch_ref_num")
  private String merchRefNum = null;

  @SerializedName("batch_id")
  private Long batchId = null;

  @SerializedName("batch_date")
  private String batchDate = null;

  @SerializedName("settle_date")
  private String settleDate = null;

  @SerializedName("amt_funded")
  private Double amtFunded = null;

  @SerializedName("funded_currency")
  private String fundedCurrency = null;

  public Transaction merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to which this transaction belongs.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Identifies the merchant to which this transaction belongs.")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public Transaction tranTime(String tranTime) {
    this.tranTime = tranTime;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length,  in YYYY-MM-DD HH:MM:ss format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction time. All times are Pacific time. 
   * @return tranTime
  **/
  @ApiModelProperty(example = "2016-07-01 00:00:03", value = "<strong>Format: </strong>Variable length,  in YYYY-MM-DD HH:MM:ss format<br><strong>Description: </strong>Transaction time. All times are Pacific time. ")
  public String getTranTime() {
    return tranTime;
  }

  public void setTranTime(String tranTime) {
    this.tranTime = tranTime;
  }

  public Transaction tranDate(String tranDate) {
    this.tranDate = tranDate;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the transaction was captured by the merchant.
   * @return tranDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "<strong>Format: </strong>Fixed length, 10 AN, YYYY-MM-DD format<br><strong>Description: </strong>The date the transaction was captured by the merchant.")
  public String getTranDate() {
    return tranDate;
  }

  public void setTranDate(String tranDate) {
    this.tranDate = tranDate;
  }

  public Transaction tranStatus(String tranStatus) {
    this.tranStatus = tranStatus;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction status.&lt;ul&gt;&lt;li&gt;A - Transaction is approved&lt;/li&gt;&lt;li&gt;H - Transaction Held&lt;/li&gt;&lt;li&gt;C - Transaction is captured&lt;/li&gt;&lt;li&gt;V - Transaction is voided by Merchant&lt;/li&gt;&lt;li&gt;v - Transaction is voided by System&lt;/li&gt;&lt;li&gt;K - Transaction is cancelled&lt;/li&gt;&lt;li&gt;D - Transaction is declined by issuer&lt;/li&gt;&lt;li&gt;F - Transaction failures other than Issuer Declines&lt;/li&gt;&lt;li&gt;S - Transaction Settled&lt;/li&gt;&lt;li&gt;P - Deposit Sent&lt;/li&gt;&lt;li&gt;N - Transaction Settled, but will not be funded by Qualpay&lt;/li&gt;&lt;li&gt;R - Transaction Rejected&lt;/li&gt;&lt;/ul&gt;
   * @return tranStatus
  **/
  @ApiModelProperty(example = "C", value = "<strong>Format: </strong>Fixed length, 1 AN<br><strong>Description: </strong>Transaction status.<ul><li>A - Transaction is approved</li><li>H - Transaction Held</li><li>C - Transaction is captured</li><li>V - Transaction is voided by Merchant</li><li>v - Transaction is voided by System</li><li>K - Transaction is cancelled</li><li>D - Transaction is declined by issuer</li><li>F - Transaction failures other than Issuer Declines</li><li>S - Transaction Settled</li><li>P - Deposit Sent</li><li>N - Transaction Settled, but will not be funded by Qualpay</li><li>R - Transaction Rejected</li></ul>")
  public String getTranStatus() {
    return tranStatus;
  }

  public void setTranStatus(String tranStatus) {
    this.tranStatus = tranStatus;
  }

  public Transaction authCode(String authCode) {
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

  public Transaction rcode(String rcode) {
    this.rcode = rcode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Gateway response code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for possible values.
   * @return rcode
  **/
  @ApiModelProperty(example = "000", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Gateway response code. Refer to <a href=\"/developer/api/reference#gateway-response-codes\"target=\"_blank\">Payment Gateway Response Codes</a> for possible values.")
  public String getRcode() {
    return rcode;
  }

  public void setRcode(String rcode) {
    this.rcode = rcode;
  }

  public Transaction cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Masked card number. 
   * @return cardNumber
  **/
  @ApiModelProperty(example = "488888xxxxxx8887", value = "<strong>Format: </strong>Fixed length, 16 AN<br><strong>Description: </strong>Masked card number. ")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Transaction cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card type of the billing card used for the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for possible values. 
   * @return cardType
  **/
  @ApiModelProperty(example = "VS", value = "<strong>Format: </strong>Fixed length, 2 AN<br><strong>Description: </strong>Card type of the billing card used for the transaction. Refer to <a href=\"/developer/api/reference#card-types\"target=\"_blank\">Card Types</a> for possible values. ")
  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public Transaction purchaseId(String purchaseId) {
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

  public Transaction pgId(String pgId) {
    this.pgId = pgId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated payment gateway ID for the transaction.
   * @return pgId
  **/
  @ApiModelProperty(example = "c0a3bead4a5911e6807e0a728c0d49c0", value = "<strong>Format: </strong>Fixed length, 32 AN<br><strong>Description: </strong>Qualpay generated payment gateway ID for the transaction.")
  public String getPgId() {
    return pgId;
  }

  public void setPgId(String pgId) {
    this.pgId = pgId;
  }

  public Transaction cardholderFirstName(String cardholderFirstName) {
    this.cardholderFirstName = cardholderFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;First name of card holder.
   * @return cardholderFirstName
  **/
  @ApiModelProperty(example = "John", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>First name of card holder.")
  public String getCardholderFirstName() {
    return cardholderFirstName;
  }

  public void setCardholderFirstName(String cardholderFirstName) {
    this.cardholderFirstName = cardholderFirstName;
  }

  public Transaction cardholderLastName(String cardholderLastName) {
    this.cardholderLastName = cardholderLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Last name of card holder.
   * @return cardholderLastName
  **/
  @ApiModelProperty(example = "Doe", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Last name of card holder.")
  public String getCardholderLastName() {
    return cardholderLastName;
  }

  public void setCardholderLastName(String cardholderLastName) {
    this.cardholderLastName = cardholderLastName;
  }

  public Transaction amtTran(Double amtTran) {
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

  public Transaction tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. 
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric currency code of the transaction. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes. ")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public Transaction disputeFlag(Boolean disputeFlag) {
    this.disputeFlag = disputeFlag;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Will be set to true if the transaction is disputed.
   * @return disputeFlag
  **/
  @ApiModelProperty(example = "false", value = "<br><strong>Description: </strong>Will be set to true if the transaction is disputed.")
  public Boolean isDisputeFlag() {
    return disputeFlag;
  }

  public void setDisputeFlag(Boolean disputeFlag) {
    this.disputeFlag = disputeFlag;
  }

  public Transaction amtRefunded(Double amtRefunded) {
    this.amtRefunded = amtRefunded;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Amount refunded if there are any refunds.
   * @return amtRefunded
  **/
  @ApiModelProperty(example = "0.0", value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>Amount refunded if there are any refunds.")
  public Double getAmtRefunded() {
    return amtRefunded;
  }

  public void setAmtRefunded(Double amtRefunded) {
    this.amtRefunded = amtRefunded;
  }

  public Transaction batchNumber(Long batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Settlement batch number.
   * @return batchNumber
  **/
  @ApiModelProperty(example = "2", value = "<strong>Format: </strong>Variable length, up to 3 N<br><strong>Description: </strong>Settlement batch number.")
  public Long getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(Long batchNumber) {
    this.batchNumber = batchNumber;
  }

  public Transaction dbaName(String dbaName) {
    this.dbaName = dbaName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;DBA name used in the transaction.
   * @return dbaName
  **/
  @ApiModelProperty(example = "Qualpay", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>DBA name used in the transaction.")
  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }

  public Transaction customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer vault ID.
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Customer vault ID.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Transaction subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Subscription identifier.
   * @return subscriptionId
  **/
  @ApiModelProperty(example = "1111", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>Subscription identifier.")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Transaction merchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchant provided reference number for this transaction.
   * @return merchRefNum
  **/
  @ApiModelProperty(example = "Ref#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Merchant provided reference number for this transaction.")
  public String getMerchRefNum() {
    return merchRefNum;
  }

  public void setMerchRefNum(String merchRefNum) {
    this.merchRefNum = merchRefNum;
  }

  public Transaction batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch.
   * @return batchId
  **/
  @ApiModelProperty(example = "1", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to this batch.")
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public Transaction batchDate(String batchDate) {
    this.batchDate = batchDate;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the batch was closed.
   * @return batchDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "<strong>Format: </strong>Fixed length, 10, YYYY-MM-DD format<br><strong>Description: </strong>The date the batch was closed.")
  public String getBatchDate() {
    return batchDate;
  }

  public void setBatchDate(String batchDate) {
    this.batchDate = batchDate;
  }

  public Transaction settleDate(String settleDate) {
    this.settleDate = settleDate;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date Qualpay settled the transaction with the issuer.
   * @return settleDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "<strong>Format: </strong>Fixed length, 10, YYYY-MM-DD format<br><strong>Description: </strong>The date Qualpay settled the transaction with the issuer.")
  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }

  public Transaction amtFunded(Double amtFunded) {
    this.amtFunded = amtFunded;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount funded to the merchant (in funded currency).
   * @return amtFunded
  **/
  @ApiModelProperty(example = "100.0", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>The amount funded to the merchant (in funded currency).")
  public Double getAmtFunded() {
    return amtFunded;
  }

  public void setAmtFunded(Double amtFunded) {
    this.amtFunded = amtFunded;
  }

  public Transaction fundedCurrency(String fundedCurrency) {
    this.fundedCurrency = fundedCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the funded amount. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for possible values. 
   * @return fundedCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric currency code of the funded amount. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for possible values. ")
  public String getFundedCurrency() {
    return fundedCurrency;
  }

  public void setFundedCurrency(String fundedCurrency) {
    this.fundedCurrency = fundedCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.merchantId, transaction.merchantId) &&
        Objects.equals(this.tranTime, transaction.tranTime) &&
        Objects.equals(this.tranDate, transaction.tranDate) &&
        Objects.equals(this.tranStatus, transaction.tranStatus) &&
        Objects.equals(this.authCode, transaction.authCode) &&
        Objects.equals(this.rcode, transaction.rcode) &&
        Objects.equals(this.cardNumber, transaction.cardNumber) &&
        Objects.equals(this.cardType, transaction.cardType) &&
        Objects.equals(this.purchaseId, transaction.purchaseId) &&
        Objects.equals(this.pgId, transaction.pgId) &&
        Objects.equals(this.cardholderFirstName, transaction.cardholderFirstName) &&
        Objects.equals(this.cardholderLastName, transaction.cardholderLastName) &&
        Objects.equals(this.amtTran, transaction.amtTran) &&
        Objects.equals(this.tranCurrency, transaction.tranCurrency) &&
        Objects.equals(this.disputeFlag, transaction.disputeFlag) &&
        Objects.equals(this.amtRefunded, transaction.amtRefunded) &&
        Objects.equals(this.batchNumber, transaction.batchNumber) &&
        Objects.equals(this.dbaName, transaction.dbaName) &&
        Objects.equals(this.customerId, transaction.customerId) &&
        Objects.equals(this.subscriptionId, transaction.subscriptionId) &&
        Objects.equals(this.merchRefNum, transaction.merchRefNum) &&
        Objects.equals(this.batchId, transaction.batchId) &&
        Objects.equals(this.batchDate, transaction.batchDate) &&
        Objects.equals(this.settleDate, transaction.settleDate) &&
        Objects.equals(this.amtFunded, transaction.amtFunded) &&
        Objects.equals(this.fundedCurrency, transaction.fundedCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, tranTime, tranDate, tranStatus, authCode, rcode, cardNumber, cardType, purchaseId, pgId, cardholderFirstName, cardholderLastName, amtTran, tranCurrency, disputeFlag, amtRefunded, batchNumber, dbaName, customerId, subscriptionId, merchRefNum, batchId, batchDate, settleDate, amtFunded, fundedCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    tranTime: ").append(toIndentedString(tranTime)).append("\n");
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    tranStatus: ").append(toIndentedString(tranStatus)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    rcode: ").append(toIndentedString(rcode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    pgId: ").append(toIndentedString(pgId)).append("\n");
    sb.append("    cardholderFirstName: ").append(toIndentedString(cardholderFirstName)).append("\n");
    sb.append("    cardholderLastName: ").append(toIndentedString(cardholderLastName)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    disputeFlag: ").append(toIndentedString(disputeFlag)).append("\n");
    sb.append("    amtRefunded: ").append(toIndentedString(amtRefunded)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    merchRefNum: ").append(toIndentedString(merchRefNum)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    settleDate: ").append(toIndentedString(settleDate)).append("\n");
    sb.append("    amtFunded: ").append(toIndentedString(amtFunded)).append("\n");
    sb.append("    fundedCurrency: ").append(toIndentedString(fundedCurrency)).append("\n");
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

