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
import io.swagger.client.model.Cookies;
import io.swagger.client.model.HttpEntity;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Result
 */

public class Result {
  @SerializedName("body")
  private HttpEntity body = null;

  @SerializedName("flash")
  private Map<String, String> flash = new HashMap<String, String>();

  @SerializedName("session")
  private Map<String, String> session = new HashMap<String, String>();

  @SerializedName("cookies")
  private Cookies cookies = null;

  public Result body(HttpEntity body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public HttpEntity getBody() {
    return body;
  }

  public void setBody(HttpEntity body) {
    this.body = body;
  }

  public Result flash(Map<String, String> flash) {
    this.flash = flash;
    return this;
  }

  public Result putFlashItem(String key, String flashItem) {
    this.flash.put(key, flashItem);
    return this;
  }

   /**
   * Get flash
   * @return flash
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getFlash() {
    return flash;
  }

  public void setFlash(Map<String, String> flash) {
    this.flash = flash;
  }

  public Result session(Map<String, String> session) {
    this.session = session;
    return this;
  }

  public Result putSessionItem(String key, String sessionItem) {
    this.session.put(key, sessionItem);
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getSession() {
    return session;
  }

  public void setSession(Map<String, String> session) {
    this.session = session;
  }

  public Result cookies(Cookies cookies) {
    this.cookies = cookies;
    return this;
  }

   /**
   * Get cookies
   * @return cookies
  **/
  @ApiModelProperty(required = true, value = "")
  public Cookies getCookies() {
    return cookies;
  }

  public void setCookies(Cookies cookies) {
    this.cookies = cookies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.body, result.body) &&
        Objects.equals(this.flash, result.flash) &&
        Objects.equals(this.session, result.session) &&
        Objects.equals(this.cookies, result.cookies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, flash, session, cookies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    flash: ").append(toIndentedString(flash)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
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

