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
 * WebhookEvent
 */

public class WebhookEvent {
  @SerializedName("events")
  private List<String> events = new ArrayList<String>();

  public WebhookEvent events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookEvent addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * An array of events that will trigger the POST request. Refer to Webhooks documentation for a list of available events.
   * @return events
  **/
  @ApiModelProperty(required = true, value = "An array of events that will trigger the POST request. Refer to Webhooks documentation for a list of available events.")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEvent webhookEvent = (WebhookEvent) o;
    return Objects.equals(this.events, webhookEvent.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEvent {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

