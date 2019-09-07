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
import io.swagger.client.model.AddCustomerRequest;
import java.io.IOException;

/**
 * AddSubscriptionRequest
 */

public class AddSubscriptionRequest {
  @SerializedName("date_start")
  private String dateStart = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("customer")
  private AddCustomerRequest customer = null;

  @SerializedName("plan_code")
  private String planCode = null;

  @SerializedName("plan_desc")
  private String planDesc = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; This field identifies the frequency of billing.  Applicable only to one-off subscriptions. Use one of the following codes for frequency. &lt;ul&gt; &lt;li&gt;0 - Weekly&lt;/li&gt; &lt;li&gt;1 - Bi-Weekly&lt;/li&gt; &lt;li&gt;3 - Monthly&lt;/li&gt; &lt;li&gt;4 - Quarterly&lt;/li&gt; &lt;li&gt;5 - Bi-annually&lt;/li&gt; &lt;li&gt;6 - Annually&lt;/li&gt; &lt;li&gt;7 - Daily&lt;/li&gt;   &lt;/ul&gt;&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscriptions.
   */
  @JsonAdapter(PlanFrequencyEnum.Adapter.class)
  public enum PlanFrequencyEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7);

    private Integer value;

    PlanFrequencyEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanFrequencyEnum fromValue(String text) {
      for (PlanFrequencyEnum b : PlanFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlanFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return PlanFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("plan_frequency")
  private PlanFrequencyEnum planFrequency = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("plan_duration")
  private Integer planDuration = null;

  @SerializedName("amt_setup")
  private Double amtSetup = null;

  @SerializedName("amt_setup_ignore")
  private Boolean amtSetupIgnore = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("use_existing_customer")
  private Boolean useExistingCustomer = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  public AddSubscriptionRequest dateStart(String dateStart) {
    this.dateStart = dateStart;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date the subscription will start.
   * @return dateStart
  **/
  @ApiModelProperty(example = "2016-07-14", required = true, value = "<strong>Format: </strong>Fixed length, 10, YYYY-MM-DD format<br><strong>Description: </strong>Date the subscription will start.")
  public String getDateStart() {
    return dateStart;
  }

  public void setDateStart(String dateStart) {
    this.dateStart = dateStart;
  }

  public AddSubscriptionRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer id of the Subscriber. Customer id should be a valid existing customer from customer vault. A customer can also be created on the fly before adding a subscription by using the customer field.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or customer is required.
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>Customer id of the Subscriber. Customer id should be a valid existing customer from customer vault. A customer can also be created on the fly before adding a subscription by using the customer field.<br><strong>Conditional Requirement: </strong>Either customer_id or customer is required.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public AddSubscriptionRequest cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;By default, when a subscription is added to a customer, the recurring charges will be billed to the customer&#39;s primary payment method. This can be overridden to charge against any of the customer&#39;s payment methods, by sending any card_id belonging to the customer in this field. 
   * @return cardId
  **/
  @ApiModelProperty(example = "86e1b00d9b0811e68df3069d8f743581", value = "<strong>Format: </strong>Fixed length, 32 AN<br><strong>Description: </strong>By default, when a subscription is added to a customer, the recurring charges will be billed to the customer's primary payment method. This can be overridden to charge against any of the customer's payment methods, by sending any card_id belonging to the customer in this field. ")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public AddSubscriptionRequest customer(AddCustomerRequest customer) {
    this.customer = customer;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If a customer_id is not included in the request, the customer will be added to customer vault and a recurring payment will be added to the primary card.  Applicable only when adding subscriptions. Set use_existing_customer field to true, if system should re-use an existing customer if available. Set customer.auto_generate_customer_id to true if the customer_id should be auto generated when adding a customer. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or customer is required
   * @return customer
  **/
  @ApiModelProperty(value = "<br><strong>Description: </strong>If a customer_id is not included in the request, the customer will be added to customer vault and a recurring payment will be added to the primary card.  Applicable only when adding subscriptions. Set use_existing_customer field to true, if system should re-use an existing customer if available. Set customer.auto_generate_customer_id to true if the customer_id should be auto generated when adding a customer. <br><strong>Conditional Requirement: </strong>Either customer_id or customer is required")
  public AddCustomerRequest getCustomer() {
    return customer;
  }

  public void setCustomer(AddCustomerRequest customer) {
    this.customer = customer;
  }

  public AddSubscriptionRequest planCode(String planCode) {
    this.planCode = planCode;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Plan code of the recurring plan. Plan should be active and a valid recurring plan.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt; Required for on-plan subscriptions 
   * @return planCode
  **/
  @ApiModelProperty(example = "1234", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Plan code of the recurring plan. Plan should be active and a valid recurring plan.<br><strong>Conditional Requirement: </strong> Required for on-plan subscriptions ")
  public String getPlanCode() {
    return planCode;
  }

  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }

  public AddSubscriptionRequest planDesc(String planDesc) {
    this.planDesc = planDesc;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the one off plan. Applicable only to one-off subscriptions. 
   * @return planDesc
  **/
  @ApiModelProperty(example = "ABC Monthly Billing Plan", value = "<strong>Format: </strong>Variable length<br><strong>Description: </strong>A short description of the one off plan. Applicable only to one-off subscriptions. ")
  public String getPlanDesc() {
    return planDesc;
  }

  public void setPlanDesc(String planDesc) {
    this.planDesc = planDesc;
  }

  public AddSubscriptionRequest planFrequency(PlanFrequencyEnum planFrequency) {
    this.planFrequency = planFrequency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; This field identifies the frequency of billing.  Applicable only to one-off subscriptions. Use one of the following codes for frequency. &lt;ul&gt; &lt;li&gt;0 - Weekly&lt;/li&gt; &lt;li&gt;1 - Bi-Weekly&lt;/li&gt; &lt;li&gt;3 - Monthly&lt;/li&gt; &lt;li&gt;4 - Quarterly&lt;/li&gt; &lt;li&gt;5 - Bi-annually&lt;/li&gt; &lt;li&gt;6 - Annually&lt;/li&gt; &lt;li&gt;7 - Daily&lt;/li&gt;   &lt;/ul&gt;&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscriptions.
   * @return planFrequency
  **/
  @ApiModelProperty(example = "0", value = "<strong>Format: </strong>Fixed length 1 N<br><strong>Description: </strong> This field identifies the frequency of billing.  Applicable only to one-off subscriptions. Use one of the following codes for frequency. <ul> <li>0 - Weekly</li> <li>1 - Bi-Weekly</li> <li>3 - Monthly</li> <li>4 - Quarterly</li> <li>5 - Bi-annually</li> <li>6 - Annually</li> <li>7 - Daily</li>   </ul><br><strong>Conditional Requirement: </strong>Required for one-off subscriptions.")
  public PlanFrequencyEnum getPlanFrequency() {
    return planFrequency;
  }

  public void setPlanFrequency(PlanFrequencyEnum planFrequency) {
    this.planFrequency = planFrequency;
  }

  public AddSubscriptionRequest interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Applicable only for monthly or weekly frequency. Number of months in a subscription cycle.
   * @return interval
  **/
  @ApiModelProperty(example = "3", value = "<strong>Format: </strong>Variable length, up to 2 N<br><strong>Description: </strong> Applicable only for monthly or weekly frequency. Number of months in a subscription cycle.")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public AddSubscriptionRequest planDuration(Integer planDuration) {
    this.planDuration = planDuration;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of billing cycles in the recurring subscription, Use -1 if billing cycles are indefinite. Applicable only to one-off subscriptions. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscriptions. 
   * @return planDuration
  **/
  @ApiModelProperty(example = "10", value = "<strong>Format: </strong>Variable length, up to 4 N<br><strong>Description: </strong>Number of billing cycles in the recurring subscription, Use -1 if billing cycles are indefinite. Applicable only to one-off subscriptions. <br><strong>Conditional Requirement: </strong>Required for one-off subscriptions. ")
  public Integer getPlanDuration() {
    return planDuration;
  }

  public void setPlanDuration(Integer planDuration) {
    this.planDuration = planDuration;
  }

  public AddSubscriptionRequest amtSetup(Double amtSetup) {
    this.amtSetup = amtSetup;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;One-Time Fee amount. This fee will be charged immediately when a subscription is added. Applicable only to one-off subscriptions. 
   * @return amtSetup
  **/
  @ApiModelProperty(example = "50.0", value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>One-Time Fee amount. This fee will be charged immediately when a subscription is added. Applicable only to one-off subscriptions. ")
  public Double getAmtSetup() {
    return amtSetup;
  }

  public void setAmtSetup(Double amtSetup) {
    this.amtSetup = amtSetup;
  }

  public AddSubscriptionRequest amtSetupIgnore(Boolean amtSetupIgnore) {
    this.amtSetupIgnore = amtSetupIgnore;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; When set to true and if the recurring plan requires a one time fee, the system will not charge the one-time fee amount. By default if a plan has a one-time fee, the customer will be charged the one-time fee when the subscription is created. Set this flag to true if you would like to avoid charging the customer for the plan one-time fee.  &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false
   * @return amtSetupIgnore
  **/
  @ApiModelProperty(example = "false", value = "<br><strong>Description: </strong> When set to true and if the recurring plan requires a one time fee, the system will not charge the one-time fee amount. By default if a plan has a one-time fee, the customer will be charged the one-time fee when the subscription is created. Set this flag to true if you would like to avoid charging the customer for the plan one-time fee.  <br><strong>Default: </strong>false")
  public Boolean isAmtSetupIgnore() {
    return amtSetupIgnore;
  }

  public void setAmtSetupIgnore(Boolean amtSetupIgnore) {
    this.amtSetupIgnore = amtSetupIgnore;
  }

  public AddSubscriptionRequest amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Plan Transaction Amount. Amount that will be billed each cycle period. Applicable only to one-off subscriptions. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscription. 
   * @return amtTran
  **/
  @ApiModelProperty(example = "19.99", value = "<strong>Format: </strong>Variable length, up to 12,2 N<br><strong>Description: </strong>Plan Transaction Amount. Amount that will be billed each cycle period. Applicable only to one-off subscriptions. <br><strong>Conditional Requirement: </strong>Required for one-off subscription. ")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public AddSubscriptionRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 20 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Payment Gateway Profile id that will be used when billing transactions. tran_currency will be used if profile_id is not provided. If both tran_currency and profile_id are not provided, default USD profile is used. Applicable only to one-off subscriptions. 
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Fixed length, 20 N<br><strong>Description: </strong>Payment Gateway Profile id that will be used when billing transactions. tran_currency will be used if profile_id is not provided. If both tran_currency and profile_id are not provided, default USD profile is used. Applicable only to one-off subscriptions. ")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public AddSubscriptionRequest tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. If profile_id is provided, the currency is determined from profile. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. Applicable only to one-off subscriptions.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric Currency Code. If profile_id is provided, the currency is determined from profile. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes. Applicable only to one-off subscriptions.<br><strong>Default: </strong>840")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public AddSubscriptionRequest useExistingCustomer(Boolean useExistingCustomer) {
    this.useExistingCustomer = useExistingCustomer;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; When set to true, the system will try to use an existing customer_id if one is available. If there is an existing customer with the same customer_first_name and customer_last_name and primary card_number or card_id, then the subscription is added to the matching customer.  If a customer is not found, a new customer is generated. The generated customer_id will be returned in the response. &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;If set to true, the field, customer, is required.
   * @return useExistingCustomer
  **/
  @ApiModelProperty(example = "false", value = "<br><strong>Description: </strong> When set to true, the system will try to use an existing customer_id if one is available. If there is an existing customer with the same customer_first_name and customer_last_name and primary card_number or card_id, then the subscription is added to the matching customer.  If a customer is not found, a new customer is generated. The generated customer_id will be returned in the response. <br><strong>Default: </strong>false<br><strong>Conditional Requirement: </strong>If set to true, the field, customer, is required.")
  public Boolean isUseExistingCustomer() {
    return useExistingCustomer;
  }

  public void setUseExistingCustomer(Boolean useExistingCustomer) {
    this.useExistingCustomer = useExistingCustomer;
  }

  public AddSubscriptionRequest merchantId(Long merchantId) {
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
    AddSubscriptionRequest addSubscriptionRequest = (AddSubscriptionRequest) o;
    return Objects.equals(this.dateStart, addSubscriptionRequest.dateStart) &&
        Objects.equals(this.customerId, addSubscriptionRequest.customerId) &&
        Objects.equals(this.cardId, addSubscriptionRequest.cardId) &&
        Objects.equals(this.customer, addSubscriptionRequest.customer) &&
        Objects.equals(this.planCode, addSubscriptionRequest.planCode) &&
        Objects.equals(this.planDesc, addSubscriptionRequest.planDesc) &&
        Objects.equals(this.planFrequency, addSubscriptionRequest.planFrequency) &&
        Objects.equals(this.interval, addSubscriptionRequest.interval) &&
        Objects.equals(this.planDuration, addSubscriptionRequest.planDuration) &&
        Objects.equals(this.amtSetup, addSubscriptionRequest.amtSetup) &&
        Objects.equals(this.amtSetupIgnore, addSubscriptionRequest.amtSetupIgnore) &&
        Objects.equals(this.amtTran, addSubscriptionRequest.amtTran) &&
        Objects.equals(this.profileId, addSubscriptionRequest.profileId) &&
        Objects.equals(this.tranCurrency, addSubscriptionRequest.tranCurrency) &&
        Objects.equals(this.useExistingCustomer, addSubscriptionRequest.useExistingCustomer) &&
        Objects.equals(this.merchantId, addSubscriptionRequest.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStart, customerId, cardId, customer, planCode, planDesc, planFrequency, interval, planDuration, amtSetup, amtSetupIgnore, amtTran, profileId, tranCurrency, useExistingCustomer, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubscriptionRequest {\n");
    
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    planCode: ").append(toIndentedString(planCode)).append("\n");
    sb.append("    planDesc: ").append(toIndentedString(planDesc)).append("\n");
    sb.append("    planFrequency: ").append(toIndentedString(planFrequency)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    planDuration: ").append(toIndentedString(planDuration)).append("\n");
    sb.append("    amtSetup: ").append(toIndentedString(amtSetup)).append("\n");
    sb.append("    amtSetupIgnore: ").append(toIndentedString(amtSetupIgnore)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    useExistingCustomer: ").append(toIndentedString(useExistingCustomer)).append("\n");
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

