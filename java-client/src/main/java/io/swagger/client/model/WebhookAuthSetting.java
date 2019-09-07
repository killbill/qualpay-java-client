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
 * WebhookAuthSetting
 */

public class WebhookAuthSetting {
  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("user_password")
  private String userPassword = null;

  public WebhookAuthSetting userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The HTTP Basic authentication user name. Applicable only if auth_type is BASIC. 
   * @return userName
  **/
  @ApiModelProperty(example = "Test", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>The HTTP Basic authentication user name. Applicable only if auth_type is BASIC. ")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public WebhookAuthSetting userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The HTTP Basic authentication password. Applicable only if auth_type is BASIC. 
   * @return userPassword
  **/
  @ApiModelProperty(example = "passowrd", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>The HTTP Basic authentication password. Applicable only if auth_type is BASIC. ")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookAuthSetting webhookAuthSetting = (WebhookAuthSetting) o;
    return Objects.equals(this.userName, webhookAuthSetting.userName) &&
        Objects.equals(this.userPassword, webhookAuthSetting.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, userPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookAuthSetting {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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
