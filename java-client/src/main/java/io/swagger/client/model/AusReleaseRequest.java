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
 * AusReleaseRequest
 */

public class AusReleaseRequest {
  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  public AusReleaseRequest cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID to be released from Account Updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer id and will release only the card_id from hold.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either card_id or customer_id is required.
   * @return cardId
  **/
  @ApiModelProperty(example = "86e1b00d9b0811e68df3069d8f743581", value = "<strong>Format: </strong>Fixed length, 32 AN<br><strong>Description: </strong>Card ID to be released from Account Updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer id and will release only the card_id from hold.<br><strong>Conditional Requirement: </strong>Either card_id or customer_id is required.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public AusReleaseRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. All card ids belonging to this customer will released from Account updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer_id and will release only the card_id from hold.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either card_id or customer_id is required.
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Unique ID established by merchant to identify a customer. All card ids belonging to this customer will released from Account updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer_id and will release only the card_id from hold.<br><strong>Conditional Requirement: </strong>Either card_id or customer_id is required.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public AusReleaseRequest merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "210000000289", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.<br><strong>Conditional Requirement: </strong>Required if this request is on behalf of another merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AusReleaseRequest ausReleaseRequest = (AusReleaseRequest) o;
    return Objects.equals(this.cardId, ausReleaseRequest.cardId) &&
        Objects.equals(this.customerId, ausReleaseRequest.customerId) &&
        Objects.equals(this.merchantId, ausReleaseRequest.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, customerId, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AusReleaseRequest {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

