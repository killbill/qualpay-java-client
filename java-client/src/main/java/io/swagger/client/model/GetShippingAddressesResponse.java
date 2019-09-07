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
import io.swagger.client.model.ShippingAddress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetShippingAddressesResponse
 */

public class GetShippingAddressesResponse {
  @SerializedName("shipping_addresses")
  private List<ShippingAddress> shippingAddresses = null;

  public GetShippingAddressesResponse shippingAddresses(List<ShippingAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
    return this;
  }

  public GetShippingAddressesResponse addShippingAddressesItem(ShippingAddress shippingAddressesItem) {
    if (this.shippingAddresses == null) {
      this.shippingAddresses = new ArrayList<ShippingAddress>();
    }
    this.shippingAddresses.add(shippingAddressesItem);
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of shipping addresses. 
   * @return shippingAddresses
  **/
  @ApiModelProperty(value = "<br><strong>Description: </strong>An array of shipping addresses. ")
  public List<ShippingAddress> getShippingAddresses() {
    return shippingAddresses;
  }

  public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShippingAddressesResponse getShippingAddressesResponse = (GetShippingAddressesResponse) o;
    return Objects.equals(this.shippingAddresses, getShippingAddressesResponse.shippingAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShippingAddressesResponse {\n");
    
    sb.append("    shippingAddresses: ").append(toIndentedString(shippingAddresses)).append("\n");
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
