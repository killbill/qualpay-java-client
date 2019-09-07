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
 * DisputeResponseData
 */

public class DisputeResponseData {
  @SerializedName("message")
  private String message = null;

  @SerializedName("cbr_response_type")
  private String cbrResponseType = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("reference_number")
  private String referenceNumber = null;

  @SerializedName("batch_date")
  private String batchDate = null;

  @SerializedName("cbr_ce_type")
  private String cbrCeType = null;

  @SerializedName("download_description")
  private String downloadDescription = null;

  @SerializedName("download_timestamp")
  private String downloadTimestamp = null;

  @SerializedName("ce_indicators")
  private List<String> ceIndicators = null;

  @SerializedName("tran_date")
  private String tranDate = null;

  @SerializedName("amt_purch")
  private Double amtPurch = null;

  @SerializedName("cbr_id_type")
  private String cbrIdType = null;

  @SerializedName("cancellation_date")
  private String cancellationDate = null;

  @SerializedName("reason_desc")
  private String reasonDesc = null;

  public DisputeResponseData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response Reason Description&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;5000
   * @return message
  **/
  @ApiModelProperty(example = "Please see attached doc", value = "Response Reason Description<br><strong>Maximum Length: </strong>5000")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DisputeResponseData cbrResponseType(String cbrResponseType) {
    this.cbrResponseType = cbrResponseType;
    return this;
  }

   /**
   * The type of Response Reason. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#response-reason\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Response Reason&lt;/a&gt;
   * @return cbrResponseType
  **/
  @ApiModelProperty(example = "CE", value = "The type of Response Reason. For all types, please refer to <a href=\"/developer/api/reference#response-reason\"target=\"_blank\">Response Reason</a>")
  public String getCbrResponseType() {
    return cbrResponseType;
  }

  public void setCbrResponseType(String cbrResponseType) {
    this.cbrResponseType = cbrResponseType;
  }

  public DisputeResponseData amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * The amount of the original settled transaction.
   * @return amtTran
  **/
  @ApiModelProperty(example = "58.94", value = "The amount of the original settled transaction.")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public DisputeResponseData referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The bank reference number of the deposit.&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;23
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "24050835204212000000011", value = "The bank reference number of the deposit.<br><strong>Maximum Length: </strong>23")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public DisputeResponseData batchDate(String batchDate) {
    this.batchDate = batchDate;
    return this;
  }

   /**
   * The date the batch was settled to Qualpay &lt;br&gt;&lt;strong&gt;Date: &lt;/strong&gt;2011-12-03
   * @return batchDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "The date the batch was settled to Qualpay <br><strong>Date: </strong>2011-12-03")
  public String getBatchDate() {
    return batchDate;
  }

  public void setBatchDate(String batchDate) {
    this.batchDate = batchDate;
  }

  public DisputeResponseData cbrCeType(String cbrCeType) {
    this.cbrCeType = cbrCeType;
    return this;
  }

   /**
   * The type of Compelling Evidence. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#compelling-evidence\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Compelling Evidence&lt;/a&gt;&lt;ul&gt;&lt;li&gt;for CE09 Required fileds are tran_date, amt_purch, reference_number&lt;/li&gt;&lt;/ul&gt;
   * @return cbrCeType
  **/
  @ApiModelProperty(example = "CE04", value = "The type of Compelling Evidence. For all types, please refer to <a href=\"/developer/api/reference#compelling-evidence\"target=\"_blank\">Compelling Evidence</a><ul><li>for CE09 Required fileds are tran_date, amt_purch, reference_number</li></ul>")
  public String getCbrCeType() {
    return cbrCeType;
  }

  public void setCbrCeType(String cbrCeType) {
    this.cbrCeType = cbrCeType;
  }

  public DisputeResponseData downloadDescription(String downloadDescription) {
    this.downloadDescription = downloadDescription;
    return this;
  }

   /**
   * Description of downloaded content only required incase of cbr_ce_type&#x3D;CE04 &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;5000
   * @return downloadDescription
  **/
  @ApiModelProperty(example = "Audio Book", value = "Description of downloaded content only required incase of cbr_ce_type=CE04 <br><strong>Maximum Length: </strong>5000")
  public String getDownloadDescription() {
    return downloadDescription;
  }

  public void setDownloadDescription(String downloadDescription) {
    this.downloadDescription = downloadDescription;
  }

  public DisputeResponseData downloadTimestamp(String downloadTimestamp) {
    this.downloadTimestamp = downloadTimestamp;
    return this;
  }

   /**
   * Timestamp of downloaded content only required incase of cbr_ce_type&#x3D;CE04 &lt;br&gt;&lt;strong&gt;Time Stamp: &lt;/strong&gt;2011-12-03T10:15:30+01:00
   * @return downloadTimestamp
  **/
  @ApiModelProperty(example = "2011-12-03T10:15:30", value = "Timestamp of downloaded content only required incase of cbr_ce_type=CE04 <br><strong>Time Stamp: </strong>2011-12-03T10:15:30+01:00")
  public String getDownloadTimestamp() {
    return downloadTimestamp;
  }

  public void setDownloadTimestamp(String downloadTimestamp) {
    this.downloadTimestamp = downloadTimestamp;
  }

  public DisputeResponseData ceIndicators(List<String> ceIndicators) {
    this.ceIndicators = ceIndicators;
    return this;
  }

  public DisputeResponseData addCeIndicatorsItem(String ceIndicatorsItem) {
    if (this.ceIndicators == null) {
      this.ceIndicators = new ArrayList<String>();
    }
    this.ceIndicators.add(ceIndicatorsItem);
    return this;
  }

   /**
   * String Array of possible list of options for CE04  all possible list of options &lt;a href&#x3D;\&quot;/developer/api/reference#digital-goods-download\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Digital Goods Download&lt;/a&gt; for CE09  all possible list of options &lt;a href&#x3D;\&quot;/developer/api/reference#evidence-of-disputed-payments\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Evidence of Disputed Payments&lt;/a&gt; ; only required when cbr_ce_type&#x3D;CE04 or CE09&lt;ul&gt;&lt;li&gt;for CE04 if ce_indicators is prev_not_disputed, Required fields are tran_date, amt_purch, reference_number&lt;/li&gt;&lt;/ul&gt;
   * @return ceIndicators
  **/
  @ApiModelProperty(example = "\"String Array of possible list of options\"", value = "String Array of possible list of options for CE04  all possible list of options <a href=\"/developer/api/reference#digital-goods-download\"target=\"_blank\">Digital Goods Download</a> for CE09  all possible list of options <a href=\"/developer/api/reference#evidence-of-disputed-payments\"target=\"_blank\">Evidence of Disputed Payments</a> ; only required when cbr_ce_type=CE04 or CE09<ul><li>for CE04 if ce_indicators is prev_not_disputed, Required fields are tran_date, amt_purch, reference_number</li></ul>")
  public List<String> getCeIndicators() {
    return ceIndicators;
  }

  public void setCeIndicators(List<String> ceIndicators) {
    this.ceIndicators = ceIndicators;
  }

  public DisputeResponseData tranDate(String tranDate) {
    this.tranDate = tranDate;
    return this;
  }

   /**
   * The date the transaction was captured by the merchant.
   * @return tranDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "The date the transaction was captured by the merchant.")
  public String getTranDate() {
    return tranDate;
  }

  public void setTranDate(String tranDate) {
    this.tranDate = tranDate;
  }

  public DisputeResponseData amtPurch(Double amtPurch) {
    this.amtPurch = amtPurch;
    return this;
  }

   /**
   * Transaction Amount
   * @return amtPurch
  **/
  @ApiModelProperty(example = "10.99", value = "Transaction Amount")
  public Double getAmtPurch() {
    return amtPurch;
  }

  public void setAmtPurch(Double amtPurch) {
    this.amtPurch = amtPurch;
  }

  public DisputeResponseData cbrIdType(String cbrIdType) {
    this.cbrIdType = cbrIdType;
    return this;
  }

   /**
   * The type of Invalid Dispute. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#invalid-dispute\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Invalid Dispute&lt;/a&gt;
   * @return cbrIdType
  **/
  @ApiModelProperty(example = "The type of Invalid Dispute.For all possible list of options", value = "The type of Invalid Dispute. For all types, please refer to <a href=\"/developer/api/reference#invalid-dispute\"target=\"_blank\">Invalid Dispute</a>")
  public String getCbrIdType() {
    return cbrIdType;
  }

  public void setCbrIdType(String cbrIdType) {
    this.cbrIdType = cbrIdType;
  }

  public DisputeResponseData cancellationDate(String cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

   /**
   * Cancellation date for Invalid Dispute. Only required incase of cbr_id_type &#x3D; IDRC3&lt;br&gt;&lt;strong&gt;Date: &lt;/strong&gt;2011-12-03
   * @return cancellationDate
  **/
  @ApiModelProperty(example = "2016-07-01", value = "Cancellation date for Invalid Dispute. Only required incase of cbr_id_type = IDRC3<br><strong>Date: </strong>2011-12-03")
  public String getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(String cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public DisputeResponseData reasonDesc(String reasonDesc) {
    this.reasonDesc = reasonDesc;
    return this;
  }

   /**
   * Brief invalid dispute reason that was not listed. Only required incase of cbr_id_type &#x3D; IDRC25&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;100
   * @return reasonDesc
  **/
  @ApiModelProperty(example = "Test", value = "Brief invalid dispute reason that was not listed. Only required incase of cbr_id_type = IDRC25<br><strong>Maximum Length: </strong>100")
  public String getReasonDesc() {
    return reasonDesc;
  }

  public void setReasonDesc(String reasonDesc) {
    this.reasonDesc = reasonDesc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeResponseData disputeResponseData = (DisputeResponseData) o;
    return Objects.equals(this.message, disputeResponseData.message) &&
        Objects.equals(this.cbrResponseType, disputeResponseData.cbrResponseType) &&
        Objects.equals(this.amtTran, disputeResponseData.amtTran) &&
        Objects.equals(this.referenceNumber, disputeResponseData.referenceNumber) &&
        Objects.equals(this.batchDate, disputeResponseData.batchDate) &&
        Objects.equals(this.cbrCeType, disputeResponseData.cbrCeType) &&
        Objects.equals(this.downloadDescription, disputeResponseData.downloadDescription) &&
        Objects.equals(this.downloadTimestamp, disputeResponseData.downloadTimestamp) &&
        Objects.equals(this.ceIndicators, disputeResponseData.ceIndicators) &&
        Objects.equals(this.tranDate, disputeResponseData.tranDate) &&
        Objects.equals(this.amtPurch, disputeResponseData.amtPurch) &&
        Objects.equals(this.cbrIdType, disputeResponseData.cbrIdType) &&
        Objects.equals(this.cancellationDate, disputeResponseData.cancellationDate) &&
        Objects.equals(this.reasonDesc, disputeResponseData.reasonDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, cbrResponseType, amtTran, referenceNumber, batchDate, cbrCeType, downloadDescription, downloadTimestamp, ceIndicators, tranDate, amtPurch, cbrIdType, cancellationDate, reasonDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeResponseData {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    cbrResponseType: ").append(toIndentedString(cbrResponseType)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    batchDate: ").append(toIndentedString(batchDate)).append("\n");
    sb.append("    cbrCeType: ").append(toIndentedString(cbrCeType)).append("\n");
    sb.append("    downloadDescription: ").append(toIndentedString(downloadDescription)).append("\n");
    sb.append("    downloadTimestamp: ").append(toIndentedString(downloadTimestamp)).append("\n");
    sb.append("    ceIndicators: ").append(toIndentedString(ceIndicators)).append("\n");
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    amtPurch: ").append(toIndentedString(amtPurch)).append("\n");
    sb.append("    cbrIdType: ").append(toIndentedString(cbrIdType)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    reasonDesc: ").append(toIndentedString(reasonDesc)).append("\n");
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
