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
 * AusRequestData
 */

public class AusRequestData {
  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("exp_date")
  private String expDate = null;

  public AusRequestData cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Alphanumeric card id and can be up to 32 character.
   * @return cardId
  **/
  @ApiModelProperty(example = "86e1b00d9b0811e68df3069d8f743581", required = true, value = "Alphanumeric card id and can be up to 32 character.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public AusRequestData cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Full card number.
   * @return cardNumber
  **/
  @ApiModelProperty(example = "4111111111111111", required = true, value = "Full card number.")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public AusRequestData expDate(String expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * Card expiration date in MMYY format.
   * @return expDate
  **/
  @ApiModelProperty(example = "0415", required = true, value = "Card expiration date in MMYY format.")
  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AusRequestData ausRequestData = (AusRequestData) o;
    return Objects.equals(this.cardId, ausRequestData.cardId) &&
        Objects.equals(this.cardNumber, ausRequestData.cardNumber) &&
        Objects.equals(this.expDate, ausRequestData.expDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, cardNumber, expDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AusRequestData {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
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
