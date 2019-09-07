
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated ID that identifies a subscription. Save this id to manage the subscription.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer id of the subscriber. |  [optional]
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The payment method that will be used for the recurring charge. If empty, the recurring charges will be made using the customer&#39;s primary payment method.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Status of the subscription. Following are possible statuses:               &lt;ul&gt;              &lt;li&gt;A - Active&lt;/li&gt;              &lt;li&gt;D - Complete&lt;/li&gt;              &lt;li&gt;P - Paused&lt;/li&gt;              &lt;li&gt;C - Cancelled&lt;/li&gt;              &lt;li&gt;S - Suspended&lt;/li&gt;              &lt;/ul&gt; |  [optional]
**profileId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The profile ID to be used in payment gateway requests. |  [optional]
**subscriptionOnPlan** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;True for on-plan subscriptions, false for off-plan subscriptions. |  [optional]
**planId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The plan id of the recurring plan associated with this subscription. 0 if this is an off-plan subscription.  |  [optional]
**planName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A name assigned by merchant to the plan. |  [optional]
**planCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A code assigned by merchant to the plan. |  [optional]
**planDesc** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the plan.  |  [optional]
**planFrequency** | [**PlanFrequencyEnum**](#PlanFrequencyEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field identifies the frequency of billing. Use one of the following codes for frequency. &lt;ul&gt;      &lt;li&gt;0 - Weekly&lt;/li&gt;      &lt;li&gt;1 - Bi-Weekly&lt;/li&gt;      &lt;li&gt;3 - Monthly&lt;/li&gt;      &lt;li&gt;4 - Quarterly&lt;/li&gt;      &lt;li&gt;5 - Bi-Annually&lt;/li&gt;      &lt;li&gt;6 - Annually&lt;/li&gt;      &lt;li&gt;7 - Daily&lt;/li&gt;   &lt;/ul&gt; |  [optional]
**planDuration** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Number of billing cycles in the recurring transaction, -1 indicates bill until cancelled. |  [optional]
**interval** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Applicable only for monthly frequency. Number of months in a subscription cycle. |  [optional]
**customerFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;First name of the subscriber. |  [optional]
**customerLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Last name of the subscriber. |  [optional]
**dateStart** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Start date of subscription.  |  [optional]
**dateNext** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Next billing date of subscription. This field will be empty for cancelled and completed subscriptions. |  [optional]
**dateEnd** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date the subscription will end.  |  [optional]
**amtSetup** | [**BigDecimal**](BigDecimal.md) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;One-time fee amount. This fee will be charged when a subscription is added. |  [optional]
**prorateDateStart** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the customer will be billed the prorate amount. (for pro-rated subscriptions).  |  [optional]
**prorateAmt** | [**BigDecimal**](BigDecimal.md) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The prorate amount  (for pro-rated subscriptions). |  [optional]
**trialDateStart** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The start date of the trial period.  Applicable only for subscriptions that include a trail period. |  [optional]
**trialDateEnd** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The end date of the trial period.  Applicable only for subscriptions that include a trail period. |  [optional]
**trialAmt** | [**BigDecimal**](BigDecimal.md) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount billed during the trial period.  Applicable only for subscriptions that include a trail period. |  [optional]
**recurDateStart** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date regular billing cycle will start. |  [optional]
**recurDateEnd** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date regular billing cycle will end.  |  [optional]
**recurAmt** | [**BigDecimal**](BigDecimal.md) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Regular billing amount. |  [optional]
**response** | [**GatewayResponse**](GatewayResponse.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Response from payment gateway for amt_setup fee. Applicable only when adding subscriptions with one time fee.  |  [optional]
**customer** | [**CustomerVault**](CustomerVault.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer vault reord. Applicable only when adding subscriptions.  |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for possible values.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840 |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
A | &quot;A&quot;
D | &quot;D&quot;
P | &quot;P&quot;
C | &quot;C&quot;
S | &quot;S&quot;


<a name="PlanFrequencyEnum"></a>
## Enum: PlanFrequencyEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7



