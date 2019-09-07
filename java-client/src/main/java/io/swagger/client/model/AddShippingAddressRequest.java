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
 * AddShippingAddressRequest
 */

public class AddShippingAddressRequest {
  @SerializedName("shipping_first_name")
  private String shippingFirstName = null;

  @SerializedName("shipping_last_name")
  private String shippingLastName = null;

  @SerializedName("shipping_firm_name")
  private String shippingFirmName = null;

  @SerializedName("shipping_addr1")
  private String shippingAddr1 = null;

  @SerializedName("shipping_addr2")
  private String shippingAddr2 = null;

  @SerializedName("shipping_city")
  private String shippingCity = null;

  @SerializedName("shipping_state")
  private String shippingState = null;

  @SerializedName("shipping_country")
  private String shippingCountry = null;

  @SerializedName("shipping_country_code")
  private String shippingCountryCode = null;

  @SerializedName("shipping_zip")
  private String shippingZip = null;

  @SerializedName("shipping_zip4")
  private String shippingZip4 = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  public AddShippingAddressRequest shippingFirstName(String shippingFirstName) {
    this.shippingFirstName = shippingFirstName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping first name.
   * @return shippingFirstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Shipping first name.")
  public String getShippingFirstName() {
    return shippingFirstName;
  }

  public void setShippingFirstName(String shippingFirstName) {
    this.shippingFirstName = shippingFirstName;
  }

  public AddShippingAddressRequest shippingLastName(String shippingLastName) {
    this.shippingLastName = shippingLastName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping last name.
   * @return shippingLastName
  **/
  @ApiModelProperty(example = "John", required = true, value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Shipping last name.")
  public String getShippingLastName() {
    return shippingLastName;
  }

  public void setShippingLastName(String shippingLastName) {
    this.shippingLastName = shippingLastName;
  }

  public AddShippingAddressRequest shippingFirmName(String shippingFirmName) {
    this.shippingFirmName = shippingFirmName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Business name of the shipping address, if applicable. 
   * @return shippingFirmName
  **/
  @ApiModelProperty(example = "Qualpay", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Business name of the shipping address, if applicable. ")
  public String getShippingFirmName() {
    return shippingFirmName;
  }

  public void setShippingFirmName(String shippingFirmName) {
    this.shippingFirmName = shippingFirmName;
  }

  public AddShippingAddressRequest shippingAddr1(String shippingAddr1) {
    this.shippingAddr1 = shippingAddr1;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping address line item 1.
   * @return shippingAddr1
  **/
  @ApiModelProperty(example = "123 Main Street", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Shipping address line item 1.")
  public String getShippingAddr1() {
    return shippingAddr1;
  }

  public void setShippingAddr1(String shippingAddr1) {
    this.shippingAddr1 = shippingAddr1;
  }

  public AddShippingAddressRequest shippingAddr2(String shippingAddr2) {
    this.shippingAddr2 = shippingAddr2;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping address line item 2.
   * @return shippingAddr2
  **/
  @ApiModelProperty(example = "#1234", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Shipping address line item 2.")
  public String getShippingAddr2() {
    return shippingAddr2;
  }

  public void setShippingAddr2(String shippingAddr2) {
    this.shippingAddr2 = shippingAddr2;
  }

  public AddShippingAddressRequest shippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping city.
   * @return shippingCity
  **/
  @ApiModelProperty(example = "San Mateo", value = "<strong>Format: </strong>Variable length, up to 64 AN<br><strong>Description: </strong>Shipping city.")
  public String getShippingCity() {
    return shippingCity;
  }

  public void setShippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
  }

  public AddShippingAddressRequest shippingState(String shippingState) {
    this.shippingState = shippingState;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping state.
   * @return shippingState
  **/
  @ApiModelProperty(example = "CA", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Shipping state.")
  public String getShippingState() {
    return shippingState;
  }

  public void setShippingState(String shippingState) {
    this.shippingState = shippingState;
  }

  public AddShippingAddressRequest shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping country.
   * @return shippingCountry
  **/
  @ApiModelProperty(example = "United States", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>Shipping country.")
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }

  public AddShippingAddressRequest shippingCountryCode(String shippingCountryCode) {
    this.shippingCountryCode = shippingCountryCode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ISO numeric country code for the shipping address. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of country codes.
   * @return shippingCountryCode
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>ISO numeric country code for the shipping address. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of country codes.")
  public String getShippingCountryCode() {
    return shippingCountryCode;
  }

  public void setShippingCountryCode(String shippingCountryCode) {
    this.shippingCountryCode = shippingCountryCode;
  }

  public AddShippingAddressRequest shippingZip(String shippingZip) {
    this.shippingZip = shippingZip;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping zip.
   * @return shippingZip
  **/
  @ApiModelProperty(example = "94402", value = "<strong>Format: </strong>Fixed length, 10 AN<br><strong>Description: </strong>Shipping zip.")
  public String getShippingZip() {
    return shippingZip;
  }

  public void setShippingZip(String shippingZip) {
    this.shippingZip = shippingZip;
  }

  public AddShippingAddressRequest shippingZip4(String shippingZip4) {
    this.shippingZip4 = shippingZip4;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Shipping zip+4 code if applicable.
   * @return shippingZip4
  **/
  @ApiModelProperty(example = "1234", value = "<strong>Format: </strong>Fixed length, 4 N<br><strong>Description: </strong>Shipping zip+4 code if applicable.")
  public String getShippingZip4() {
    return shippingZip4;
  }

  public void setShippingZip4(String shippingZip4) {
    this.shippingZip4 = shippingZip4;
  }

  public AddShippingAddressRequest primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Set this field to true if this should be the default address. &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false
   * @return primary
  **/
  @ApiModelProperty(example = "true", value = "<br><strong>Description: </strong>Set this field to true if this should be the default address. <br><strong>Default: </strong>false")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public AddShippingAddressRequest merchantId(Long merchantId) {
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
    AddShippingAddressRequest addShippingAddressRequest = (AddShippingAddressRequest) o;
    return Objects.equals(this.shippingFirstName, addShippingAddressRequest.shippingFirstName) &&
        Objects.equals(this.shippingLastName, addShippingAddressRequest.shippingLastName) &&
        Objects.equals(this.shippingFirmName, addShippingAddressRequest.shippingFirmName) &&
        Objects.equals(this.shippingAddr1, addShippingAddressRequest.shippingAddr1) &&
        Objects.equals(this.shippingAddr2, addShippingAddressRequest.shippingAddr2) &&
        Objects.equals(this.shippingCity, addShippingAddressRequest.shippingCity) &&
        Objects.equals(this.shippingState, addShippingAddressRequest.shippingState) &&
        Objects.equals(this.shippingCountry, addShippingAddressRequest.shippingCountry) &&
        Objects.equals(this.shippingCountryCode, addShippingAddressRequest.shippingCountryCode) &&
        Objects.equals(this.shippingZip, addShippingAddressRequest.shippingZip) &&
        Objects.equals(this.shippingZip4, addShippingAddressRequest.shippingZip4) &&
        Objects.equals(this.primary, addShippingAddressRequest.primary) &&
        Objects.equals(this.merchantId, addShippingAddressRequest.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingFirstName, shippingLastName, shippingFirmName, shippingAddr1, shippingAddr2, shippingCity, shippingState, shippingCountry, shippingCountryCode, shippingZip, shippingZip4, primary, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddShippingAddressRequest {\n");
    
    sb.append("    shippingFirstName: ").append(toIndentedString(shippingFirstName)).append("\n");
    sb.append("    shippingLastName: ").append(toIndentedString(shippingLastName)).append("\n");
    sb.append("    shippingFirmName: ").append(toIndentedString(shippingFirmName)).append("\n");
    sb.append("    shippingAddr1: ").append(toIndentedString(shippingAddr1)).append("\n");
    sb.append("    shippingAddr2: ").append(toIndentedString(shippingAddr2)).append("\n");
    sb.append("    shippingCity: ").append(toIndentedString(shippingCity)).append("\n");
    sb.append("    shippingState: ").append(toIndentedString(shippingState)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
    sb.append("    shippingCountryCode: ").append(toIndentedString(shippingCountryCode)).append("\n");
    sb.append("    shippingZip: ").append(toIndentedString(shippingZip)).append("\n");
    sb.append("    shippingZip4: ").append(toIndentedString(shippingZip4)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

