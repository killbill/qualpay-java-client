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
 * AccountUpdaterReport
 */

public class AccountUpdaterReport {
  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("request_id")
  private Long requestId = null;

  @SerializedName("request_date")
  private String requestDate = null;

  @SerializedName("response_date")
  private String responseDate = null;

  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("exp_date")
  private String expDate = null;

  @SerializedName("card_number_new")
  private String cardNumberNew = null;

  @SerializedName("exp_date_new")
  private String expDateNew = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater reason code.  Account updater reason code. Following are descriptions of the codes              &lt;ul&gt;              &lt;li&gt;000 - New Card/No response&lt;/li&gt;              &lt;li&gt;200 - Valid account no update&lt;/li&gt;              &lt;li&gt;201 - Account Expiration Date Updated&lt;/li&gt;              &lt;li&gt;202 - Account Number Updated&lt;/li&gt;              &lt;li&gt;203 - Account is Closed&lt;/li&gt;              &lt;li&gt;204 - Contact Cardholder&lt;/li&gt;              &lt;li&gt;206 - No Match&lt;/li&gt;              &lt;li&gt;315 - Invalid Expiration Date&lt;/li&gt;              &lt;li&gt;320 - Invalid Account Number&lt;/li&gt;              &lt;li&gt;329 - Invalid Card Type&lt;/li&gt;              &lt;/ul&gt;
   */
  @JsonAdapter(ReasonCodeEnum.Adapter.class)
  public enum ReasonCodeEnum {
    _000("000"),
    
    _200("200"),
    
    _201("201"),
    
    _202("202"),
    
    _203("203"),
    
    _204("204"),
    
    _206("206"),
    
    _315("315"),
    
    _320("320"),
    
    _329("329");

    private String value;

    ReasonCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonCodeEnum fromValue(String text) {
      for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason_code")
  private ReasonCodeEnum reasonCode = null;

  @SerializedName("billable")
  private Boolean billable = null;

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a Merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to a Merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to the account updater request.
   * @return requestId
  **/
  @ApiModelProperty(example = "112", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to the account updater request.")
  public Long getRequestId() {
    return requestId;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater request date. Date when a harvest request was sent to the account updater service.
   * @return requestDate
  **/
  @ApiModelProperty(example = "2017-05-06", value = "<strong>Format: </strong>Variable length, up to 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>Account updater request date. Date when a harvest request was sent to the account updater service.")
  public String getRequestDate() {
    return requestDate;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater response date. Date when the account updater service responded. This field is empty if the response is not yet received.
   * @return responseDate
  **/
  @ApiModelProperty(example = "2017-05-09", value = "<strong>Format: </strong>Variable length, up to 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>Account updater response date. Date when the account updater service responded. This field is empty if the response is not yet received.")
  public String getResponseDate() {
    return responseDate;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID received from a tokenization request for a card. The card_id may be used in place of a card number in messages requiring cardholder account data.
   * @return cardId
  **/
  @ApiModelProperty(example = "86e1b00d9b0811e68df3069d8f743581", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Card ID received from a tokenization request for a card. The card_id may be used in place of a card number in messages requiring cardholder account data.")
  public String getCardId() {
    return cardId;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Cardholder card number(masked).
   * @return cardNumber
  **/
  @ApiModelProperty(example = "411111xxxxxx1111", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Cardholder card number(masked).")
  public String getCardNumber() {
    return cardNumber;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N, in MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card expiration date.
   * @return expDate
  **/
  @ApiModelProperty(example = "0415", value = "<strong>Format: </strong>Variable length, up to 4 N, in MMYY format<br><strong>Description: </strong>Card expiration date.")
  public String getExpDate() {
    return expDate;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Updated cardholder card number(masked). This field will be empty if there are no updates to the card number.
   * @return cardNumberNew
  **/
  @ApiModelProperty(example = "424242xxxxxx4242", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Updated cardholder card number(masked). This field will be empty if there are no updates to the card number.")
  public String getCardNumberNew() {
    return cardNumberNew;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N, in MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Updated card expiration date. This field will be empty if there are no updates to the expiration date.
   * @return expDateNew
  **/
  @ApiModelProperty(example = "0419", value = "<strong>Format: </strong>Variable length, up to 4 N, in MMYY format<br><strong>Description: </strong>Updated card expiration date. This field will be empty if there are no updates to the expiration date.")
  public String getExpDateNew() {
    return expDateNew;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater reason code.  Account updater reason code. Following are descriptions of the codes              &lt;ul&gt;              &lt;li&gt;000 - New Card/No response&lt;/li&gt;              &lt;li&gt;200 - Valid account no update&lt;/li&gt;              &lt;li&gt;201 - Account Expiration Date Updated&lt;/li&gt;              &lt;li&gt;202 - Account Number Updated&lt;/li&gt;              &lt;li&gt;203 - Account is Closed&lt;/li&gt;              &lt;li&gt;204 - Contact Cardholder&lt;/li&gt;              &lt;li&gt;206 - No Match&lt;/li&gt;              &lt;li&gt;315 - Invalid Expiration Date&lt;/li&gt;              &lt;li&gt;320 - Invalid Account Number&lt;/li&gt;              &lt;li&gt;329 - Invalid Card Type&lt;/li&gt;              &lt;/ul&gt;
   * @return reasonCode
  **/
  @ApiModelProperty(example = "200", value = "<strong>Format: </strong>Variable length, up to 3 N<br><strong>Description: </strong>Account updater reason code.  Account updater reason code. Following are descriptions of the codes              <ul>              <li>000 - New Card/No response</li>              <li>200 - Valid account no update</li>              <li>201 - Account Expiration Date Updated</li>              <li>202 - Account Number Updated</li>              <li>203 - Account is Closed</li>              <li>204 - Contact Cardholder</li>              <li>206 - No Match</li>              <li>315 - Invalid Expiration Date</li>              <li>320 - Invalid Account Number</li>              <li>329 - Invalid Card Type</li>              </ul>")
  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchants will be billed only for matches. Reason codes 201, 202, 203 and 204 are billable.
   * @return billable
  **/
  @ApiModelProperty(example = "true", value = "<br><strong>Description: </strong>Merchants will be billed only for matches. Reason codes 201, 202, 203 and 204 are billable.")
  public Boolean isBillable() {
    return billable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdaterReport accountUpdaterReport = (AccountUpdaterReport) o;
    return Objects.equals(this.merchantId, accountUpdaterReport.merchantId) &&
        Objects.equals(this.requestId, accountUpdaterReport.requestId) &&
        Objects.equals(this.requestDate, accountUpdaterReport.requestDate) &&
        Objects.equals(this.responseDate, accountUpdaterReport.responseDate) &&
        Objects.equals(this.cardId, accountUpdaterReport.cardId) &&
        Objects.equals(this.cardNumber, accountUpdaterReport.cardNumber) &&
        Objects.equals(this.expDate, accountUpdaterReport.expDate) &&
        Objects.equals(this.cardNumberNew, accountUpdaterReport.cardNumberNew) &&
        Objects.equals(this.expDateNew, accountUpdaterReport.expDateNew) &&
        Objects.equals(this.reasonCode, accountUpdaterReport.reasonCode) &&
        Objects.equals(this.billable, accountUpdaterReport.billable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, requestId, requestDate, responseDate, cardId, cardNumber, expDate, cardNumberNew, expDateNew, reasonCode, billable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdaterReport {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    responseDate: ").append(toIndentedString(responseDate)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    cardNumberNew: ").append(toIndentedString(cardNumberNew)).append("\n");
    sb.append("    expDateNew: ").append(toIndentedString(expDateNew)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
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

