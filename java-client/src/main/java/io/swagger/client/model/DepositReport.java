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
 * DepositReport
 */

public class DepositReport {
  @SerializedName("rec_id")
  private Long recId = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("dba_name")
  private String dbaName = null;

  @SerializedName("reference_number")
  private String referenceNumber = null;

  @SerializedName("amt_ach")
  private String amtAch = null;

  @SerializedName("ach_description")
  private String achDescription = null;

  @SerializedName("post_date_actual")
  private String postDateActual = null;

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 18 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this deposit.
   * @return recId
  **/
  @ApiModelProperty(example = "1", required = true, value = "<strong>Format: </strong>Variable length, up to 18 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to this deposit.")
  public Long getRecId() {
    return recId;
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
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The doing business as name of the merchant.
   * @return dbaName
  **/
  @ApiModelProperty(example = "Qualpay", required = true, value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>The doing business as name of the merchant.")
  public String getDbaName() {
    return dbaName;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The bank reference number of the deposit.
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "123456", required = true, value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>The bank reference number of the deposit.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 17,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ACH amount.
   * @return amtAch
  **/
  @ApiModelProperty(example = "100.00", required = true, value = "<strong>Format: </strong>Variable length, up to 17,2 N<br><strong>Description: </strong>ACH amount.")
  public String getAmtAch() {
    return amtAch;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 18 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ACH description.
   * @return achDescription
  **/
  @ApiModelProperty(example = "MERCH DEP", required = true, value = "<strong>Format: </strong>Variable length, up to 18 AN<br><strong>Description: </strong>ACH description.")
  public String getAchDescription() {
    return achDescription;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the ACH posted to the federal reserve. 
   * @return postDateActual
  **/
  @ApiModelProperty(example = "2016-07-01", required = true, value = "<strong>Format: </strong>Variable length, up to 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The date the ACH posted to the federal reserve. ")
  public String getPostDateActual() {
    return postDateActual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositReport depositReport = (DepositReport) o;
    return Objects.equals(this.recId, depositReport.recId) &&
        Objects.equals(this.merchantId, depositReport.merchantId) &&
        Objects.equals(this.dbaName, depositReport.dbaName) &&
        Objects.equals(this.referenceNumber, depositReport.referenceNumber) &&
        Objects.equals(this.amtAch, depositReport.amtAch) &&
        Objects.equals(this.achDescription, depositReport.achDescription) &&
        Objects.equals(this.postDateActual, depositReport.postDateActual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recId, merchantId, dbaName, referenceNumber, amtAch, achDescription, postDateActual);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositReport {\n");
    
    sb.append("    recId: ").append(toIndentedString(recId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    amtAch: ").append(toIndentedString(amtAch)).append("\n");
    sb.append("    achDescription: ").append(toIndentedString(achDescription)).append("\n");
    sb.append("    postDateActual: ").append(toIndentedString(postDateActual)).append("\n");
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
