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
 * BouncedInvoice
 */

public class BouncedInvoice {
  @SerializedName("invoice_id")
  private Long invoiceId = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("customer_id")
  private String customerId = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;SAVED - Invoice is in draft state. An invoice in draft state can be updated. &lt;br&gt;OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.&lt;br&gt;PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. &lt;br&gt;CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;16
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SAVED("SAVED"),
    
    OUTSTANDING("OUTSTANDING"),
    
    PAID("PAID"),
    
    CANCELED("CANCELED");

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

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The email client response code. Possible values are &lt;br&gt;O - Email not send. The email address may be invalid.  &lt;br&gt;A - Email not sent. The email address has been disabled. &lt;br&gt;B - Email bounced. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;1
   */
  @JsonAdapter(SendCodeEnum.Adapter.class)
  public enum SendCodeEnum {
    O("O"),
    
    A("A"),
    
    B("B");

    private String value;

    SendCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendCodeEnum fromValue(String text) {
      for (SendCodeEnum b : SendCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SendCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SendCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("send_code")
  private SendCodeEnum sendCode = null;

  @SerializedName("db_timestamp")
  private String dbTimestamp = null;

  @SerializedName("recipient")
  private List<String> recipient = null;

  public BouncedInvoice invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice.
   * @return invoiceId
  **/
  @ApiModelProperty(example = "1234", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice.")
  public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public BouncedInvoice merchantId(Long merchantId) {
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

  public BouncedInvoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Invoice Number (also referred to as the purchase identifier) generated by the merchant. 
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "QP-1234", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>The Invoice Number (also referred to as the purchase identifier) generated by the merchant. ")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public BouncedInvoice customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Qualpay customer id associated with this invoice. 
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The Qualpay customer id associated with this invoice. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BouncedInvoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;SAVED - Invoice is in draft state. An invoice in draft state can be updated. &lt;br&gt;OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.&lt;br&gt;PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. &lt;br&gt;CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;16
   * @return status
  **/
  @ApiModelProperty(example = "PAID", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Status of an invoice. Possible values are <br>SAVED - Invoice is in draft state. An invoice in draft state can be updated. <br>OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.<br>PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. <br>CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. <br><strong>Maximum Length: </strong>16")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BouncedInvoice sendCode(SendCodeEnum sendCode) {
    this.sendCode = sendCode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The email client response code. Possible values are &lt;br&gt;O - Email not send. The email address may be invalid.  &lt;br&gt;A - Email not sent. The email address has been disabled. &lt;br&gt;B - Email bounced. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;1
   * @return sendCode
  **/
  @ApiModelProperty(example = "O", value = "<strong>Format: </strong>Fixed length, 1 AN<br><strong>Description: </strong>The email client response code. Possible values are <br>O - Email not send. The email address may be invalid.  <br>A - Email not sent. The email address has been disabled. <br>B - Email bounced. <br><strong>Maximum Length: </strong>1")
  public SendCodeEnum getSendCode() {
    return sendCode;
  }

  public void setSendCode(SendCodeEnum sendCode) {
    this.sendCode = sendCode;
  }

  public BouncedInvoice dbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The time when the invoice was sent.
   * @return dbTimestamp
  **/
  @ApiModelProperty(example = "2018-01-01T12:57:47.000-0700", value = "<strong>Format: </strong>Variable length AN<br><strong>Description: </strong>The time when the invoice was sent.")
  public String getDbTimestamp() {
    return dbTimestamp;
  }

  public void setDbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
  }

  public BouncedInvoice recipient(List<String> recipient) {
    this.recipient = recipient;
    return this;
  }

  public BouncedInvoice addRecipientItem(String recipientItem) {
    if (this.recipient == null) {
      this.recipient = new ArrayList<String>();
    }
    this.recipient.add(recipientItem);
    return this;
  }

   /**
   * An array of the invoice recipient&#39;s email addresses.
   * @return recipient
  **/
  @ApiModelProperty(example = "\"[johndoe@qualpay.com, jdoe@qualpay.com]\"", value = "An array of the invoice recipient's email addresses.")
  public List<String> getRecipient() {
    return recipient;
  }

  public void setRecipient(List<String> recipient) {
    this.recipient = recipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BouncedInvoice bouncedInvoice = (BouncedInvoice) o;
    return Objects.equals(this.invoiceId, bouncedInvoice.invoiceId) &&
        Objects.equals(this.merchantId, bouncedInvoice.merchantId) &&
        Objects.equals(this.invoiceNumber, bouncedInvoice.invoiceNumber) &&
        Objects.equals(this.customerId, bouncedInvoice.customerId) &&
        Objects.equals(this.status, bouncedInvoice.status) &&
        Objects.equals(this.sendCode, bouncedInvoice.sendCode) &&
        Objects.equals(this.dbTimestamp, bouncedInvoice.dbTimestamp) &&
        Objects.equals(this.recipient, bouncedInvoice.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, merchantId, invoiceNumber, customerId, status, sendCode, dbTimestamp, recipient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BouncedInvoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sendCode: ").append(toIndentedString(sendCode)).append("\n");
    sb.append("    dbTimestamp: ").append(toIndentedString(dbTimestamp)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

