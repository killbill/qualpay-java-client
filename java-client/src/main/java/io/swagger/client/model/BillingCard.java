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
 * BillingCard
 */

public class BillingCard {
  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("exp_date")
  private String expDate = null;

  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("billing_first_name")
  private String billingFirstName = null;

  @SerializedName("billing_last_name")
  private String billingLastName = null;

  @SerializedName("billing_firm_name")
  private String billingFirmName = null;

  @SerializedName("billing_addr1")
  private String billingAddr1 = null;

  @SerializedName("billing_addr2")
  private String billingAddr2 = null;

  @SerializedName("billing_city")
  private String billingCity = null;

  @SerializedName("billing_state")
  private String billingState = null;

  @SerializedName("billing_zip")
  private String billingZip = null;

  @SerializedName("billing_zip4")
  private String billingZip4 = null;

  @SerializedName("billing_country")
  private String billingCountry = null;

  @SerializedName("billing_country_code")
  private String billingCountryCode = null;

  @SerializedName("primary")
  private Boolean primary = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card Type. The card type is derived from the card number. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for a list of card types. 
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

  @SerializedName("verified_date")
  private String verifiedDate = null;

  public BillingCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The masked card number. 
   * @return cardNumber
  **/
  @ApiModelProperty(example = "411111xxxxxx1111", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>The masked card number. ")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public BillingCard expDate(String expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N, MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Expiration date of card number. 
   * @return expDate
  **/
  @ApiModelProperty(example = "0420", value = "<strong>Format: </strong>Fixed length, 4 N, MMYY format<br><strong>Description: </strong>Expiration date of card number. ")
  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }

  public BillingCard cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID received from a tokenization request.
   * @return cardId
  **/
  @ApiModelProperty(example = "86e1b00d9b0811e68df3069d8f743581", value = "<strong>Format: </strong>Fixed length, 32 AN<br><strong>Description: </strong>Card ID received from a tokenization request.")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public BillingCard billingFirstName(String billingFirstName) {
    this.billingFirstName = billingFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing first name. 
   * @return billingFirstName
  **/
  @ApiModelProperty(example = "John", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Billing first name. ")
  public String getBillingFirstName() {
    return billingFirstName;
  }

  public void setBillingFirstName(String billingFirstName) {
    this.billingFirstName = billingFirstName;
  }

  public BillingCard billingLastName(String billingLastName) {
    this.billingLastName = billingLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing last name. 
   * @return billingLastName
  **/
  @ApiModelProperty(example = "Doe", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Billing last name. ")
  public String getBillingLastName() {
    return billingLastName;
  }

  public void setBillingLastName(String billingLastName) {
    this.billingLastName = billingLastName;
  }

  public BillingCard billingFirmName(String billingFirmName) {
    this.billingFirmName = billingFirmName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Business name on billing card, if applicable. 
   * @return billingFirmName
  **/
  @ApiModelProperty(example = "Qualpay", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Business name on billing card, if applicable. ")
  public String getBillingFirmName() {
    return billingFirmName;
  }

  public void setBillingFirmName(String billingFirmName) {
    this.billingFirmName = billingFirmName;
  }

  public BillingCard billingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing street address. This address will also be used for AVS verification if AVS verification is enabled. 
   * @return billingAddr1
  **/
  @ApiModelProperty(example = "123 Main Avenue", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Billing street address. This address will also be used for AVS verification if AVS verification is enabled. ")
  public String getBillingAddr1() {
    return billingAddr1;
  }

  public void setBillingAddr1(String billingAddr1) {
    this.billingAddr1 = billingAddr1;
  }

  public BillingCard billingAddr2(String billingAddr2) {
    this.billingAddr2 = billingAddr2;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing Address line item 2.
   * @return billingAddr2
  **/
  @ApiModelProperty(example = "#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Billing Address line item 2.")
  public String getBillingAddr2() {
    return billingAddr2;
  }

  public void setBillingAddr2(String billingAddr2) {
    this.billingAddr2 = billingAddr2;
  }

  public BillingCard billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing city.
   * @return billingCity
  **/
  @ApiModelProperty(example = "San Mateo", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Billing city.")
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public BillingCard billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing state.
   * @return billingState
  **/
  @ApiModelProperty(example = "CA", value = "<strong>Format: </strong>Variable length, up to 3 AN<br><strong>Description: </strong>Billing state.")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public BillingCard billingZip(String billingZip) {
    this.billingZip = billingZip;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip.
   * @return billingZip
  **/
  @ApiModelProperty(example = "94402", value = "<strong>Format: </strong>Variable length, up to 10 AN<br><strong>Description: </strong>Billing zip.")
  public String getBillingZip() {
    return billingZip;
  }

  public void setBillingZip(String billingZip) {
    this.billingZip = billingZip;
  }

  public BillingCard billingZip4(String billingZip4) {
    this.billingZip4 = billingZip4;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip+4 code if applicable.
   * @return billingZip4
  **/
  @ApiModelProperty(example = "1234", value = "<strong>Format: </strong>Fixed length, 4 N<br><strong>Description: </strong>Billing zip+4 code if applicable.")
  public String getBillingZip4() {
    return billingZip4;
  }

  public void setBillingZip4(String billingZip4) {
    this.billingZip4 = billingZip4;
  }

  public BillingCard billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing Country.
   * @return billingCountry
  **/
  @ApiModelProperty(example = "United States", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Billing Country.")
  public String getBillingCountry() {
    return billingCountry;
  }

  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }

  public BillingCard billingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ISO numeric country code for the billing address. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of country codes.
   * @return billingCountryCode
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>ISO numeric country code for the billing address. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of country codes.")
  public String getBillingCountryCode() {
    return billingCountryCode;
  }

  public void setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
  }

  public BillingCard primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;True if this is the default card. The default card will be used in recurring billing payments.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false
   * @return primary
  **/
  @ApiModelProperty(example = "true", value = "<br><strong>Description: </strong>True if this is the default card. The default card will be used in recurring billing payments.<br><strong>Default: </strong>false")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public BillingCard cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card Type. The card type is derived from the card number. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for a list of card types. 
   * @return cardType
  **/
  @ApiModelProperty(example = "VS", value = "<strong>Format: </strong>Fixed length, 2 AN<br><strong>Description: </strong>Card Type. The card type is derived from the card number. Refer to <a href=\"/developer/api/reference#card-types\"target=\"_blank\">Card Types</a> for a list of card types. ")
  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Verified Date. The date the card was last verified successfully.
   * @return verifiedDate
  **/
  @ApiModelProperty(example = "20160530000000", value = "<strong>Format: </strong>Variable length<br><strong>Description: </strong>Verified Date. The date the card was last verified successfully.")
  public String getVerifiedDate() {
    return verifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCard billingCard = (BillingCard) o;
    return Objects.equals(this.cardNumber, billingCard.cardNumber) &&
        Objects.equals(this.expDate, billingCard.expDate) &&
        Objects.equals(this.cardId, billingCard.cardId) &&
        Objects.equals(this.billingFirstName, billingCard.billingFirstName) &&
        Objects.equals(this.billingLastName, billingCard.billingLastName) &&
        Objects.equals(this.billingFirmName, billingCard.billingFirmName) &&
        Objects.equals(this.billingAddr1, billingCard.billingAddr1) &&
        Objects.equals(this.billingAddr2, billingCard.billingAddr2) &&
        Objects.equals(this.billingCity, billingCard.billingCity) &&
        Objects.equals(this.billingState, billingCard.billingState) &&
        Objects.equals(this.billingZip, billingCard.billingZip) &&
        Objects.equals(this.billingZip4, billingCard.billingZip4) &&
        Objects.equals(this.billingCountry, billingCard.billingCountry) &&
        Objects.equals(this.billingCountryCode, billingCard.billingCountryCode) &&
        Objects.equals(this.primary, billingCard.primary) &&
        Objects.equals(this.cardType, billingCard.cardType) &&
        Objects.equals(this.verifiedDate, billingCard.verifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expDate, cardId, billingFirstName, billingLastName, billingFirmName, billingAddr1, billingAddr2, billingCity, billingState, billingZip, billingZip4, billingCountry, billingCountryCode, primary, cardType, verifiedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCard {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    billingFirstName: ").append(toIndentedString(billingFirstName)).append("\n");
    sb.append("    billingLastName: ").append(toIndentedString(billingLastName)).append("\n");
    sb.append("    billingFirmName: ").append(toIndentedString(billingFirmName)).append("\n");
    sb.append("    billingAddr1: ").append(toIndentedString(billingAddr1)).append("\n");
    sb.append("    billingAddr2: ").append(toIndentedString(billingAddr2)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingZip: ").append(toIndentedString(billingZip)).append("\n");
    sb.append("    billingZip4: ").append(toIndentedString(billingZip4)).append("\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    billingCountryCode: ").append(toIndentedString(billingCountryCode)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    verifiedDate: ").append(toIndentedString(verifiedDate)).append("\n");
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

