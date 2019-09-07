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
 * BatchReport
 */

public class BatchReport {
  @SerializedName("batch_id")
  private Long batchId = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("batch_number")
  private Long batchNumber = null;

  @SerializedName("batch_date")
  private String batchDate = null;

  @SerializedName("amt_total")
  private String amtTotal = null;

  @SerializedName("cnt_total")
  private String cntTotal = null;

  @SerializedName("amt_purch")
  private String amtPurch = null;

  @SerializedName("cnt_purch")
  private String cntPurch = null;

  @SerializedName("amt_return")
  private String amtReturn = null;

  @SerializedName("cnt_return")
  private String cntReturn = null;

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch.
   * @return batchId
  **/
  @ApiModelProperty(example = "1", required = true, value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to this batch.")
  public Long getBatchId() {
    return batchId;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", required = true, value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to a merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The ISO 4217 numeric currency code of the batch.
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", required = true, value = "<strong>Format: </strong>Variable length, up to 3 AN<br><strong>Description: </strong>The ISO 4217 numeric currency code of the batch.")
  public String getTranCurrency() {
    return tranCurrency;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A non-unique ID assigned by the merchant&#39;s terminal, POS device, or gateway for this batch, in the range of 1 - 999.
   * @return batchNumber
  **/
  @ApiModelProperty(example = "1", required = true, value = "<strong>Format: </strong>Variable length, up to 3 N<br><strong>Description: </strong>A non-unique ID assigned by the merchant's terminal, POS device, or gateway for this batch, in the range of 1 - 999.")
  public Long getBatchNumber() {
    return batchNumber;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the batch was settled to Qualpay.
   * @return batchDate
  **/
  @ApiModelProperty(example = "2016-07-01", required = true, value = "<strong>Format: </strong>Variable length, up to 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The date the batch was settled to Qualpay.")
  public String getBatchDate() {
    return batchDate;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The total, or net amount of the batch, in the batches currency.
   * @return amtTotal
  **/
  @ApiModelProperty(example = "1.00", required = true, value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>The total, or net amount of the batch, in the batches currency.")
  public String getAmtTotal() {
    return amtTotal;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of transactions in the batch, including purchases and credits.
   * @return cntTotal
  **/
  @ApiModelProperty(example = "10", required = true, value = "<strong>Format: </strong>Variable length, up to 9 N<br><strong>Description: </strong>The count of transactions in the batch, including purchases and credits.")
  public String getCntTotal() {
    return cntTotal;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of purchases within the batch, in the batches currency.
   * @return amtPurch
  **/
  @ApiModelProperty(example = "1.00", required = true, value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>The amount of purchases within the batch, in the batches currency.")
  public String getAmtPurch() {
    return amtPurch;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of purchases in the batch.
   * @return cntPurch
  **/
  @ApiModelProperty(example = "10", required = true, value = "<strong>Format: </strong>Variable length, up to 9 N<br><strong>Description: </strong>The count of purchases in the batch.")
  public String getCntPurch() {
    return cntPurch;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of returns, or credits back to the customer, in the batch&#39;s currency.
   * @return amtReturn
  **/
  @ApiModelProperty(example = "1.00", required = true, value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>The amount of returns, or credits back to the customer, in the batch's currency.")
  public String getAmtReturn() {
    return amtReturn;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of returns or credits back to the customer in the batch.
   * @return cntReturn
  **/
  @ApiModelProperty(example = "10", required = true, value = "<strong>Format: </strong>Variable length, up to 9 N<br><strong>Description: </strong>The count of returns or credits back to the customer in the batch.")
  public String getCntReturn() {
    return cntReturn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchReport batchReport = (BatchReport) o;
    return Objects.equals(this.batchId, batchReport.batchId) &&
        Objects.equals(this.merchantId, batchReport.merchantId) &&
        Objects.equals(this.tranCurrency, batchReport.tranCurrency) &&
        Objects.equals(this.batchNumber, batchReport.batchNumber) &&
        Objects.equals(this.batchDate, batchReport.batchDate) &&
        Objects.equals(this.amtTotal, batchReport.amtTotal) &&
        Objects.equals(this.cntTotal, batchReport.cntTotal) &&
        Objects.equals(this.amtPurch, batchReport.amtPurch) &&
        Objects.equals(this.cntPurch, batchReport.cntPurch) &&
        Objects.equals(this.amtReturn, batchReport.amtReturn) &&
        Objects.equals(this.cntReturn, batchReport.cntReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, merchantId, tranCurrency, batchNumber, batchDate, amtTotal, cntTotal, amtPurch, cntPurch, amtReturn, cntReturn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReport {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    amtTotal: ").append(toIndentedString(amtTotal)).append("\n");
    sb.append("    cntTotal: ").append(toIndentedString(cntTotal)).append("\n");
    sb.append("    amtPurch: ").append(toIndentedString(amtPurch)).append("\n");
    sb.append("    cntPurch: ").append(toIndentedString(cntPurch)).append("\n");
    sb.append("    amtReturn: ").append(toIndentedString(amtReturn)).append("\n");
    sb.append("    cntReturn: ").append(toIndentedString(cntReturn)).append("\n");
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
