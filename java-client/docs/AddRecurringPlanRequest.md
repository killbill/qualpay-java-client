
# AddRecurringPlanRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique alphanumeric code provided by the merchant to identify the plan. | 
**planName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique name assigned to the plan.  | 
**planDesc** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the plan. | 
**planFrequency** | [**PlanFrequencyEnum**](#PlanFrequencyEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; The billing frequency. Use one of the following codes for frequency. &lt;ul&gt;      &lt;li&gt;0 - Weekly&lt;/li&gt;      &lt;li&gt;1 - Bi-weekly&lt;/li&gt;      &lt;li&gt;3 - Monthly&lt;/li&gt;      &lt;li&gt;4 - Quarterly&lt;/li&gt;      &lt;li&gt;5 - Bi-annually&lt;/li&gt;      &lt;li&gt;6 - Annually&lt;/li&gt;      &lt;li&gt;7 - Daily&lt;/li&gt;   &lt;/ul&gt; | 
**interval** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of months or weeks in a subscription cycle. For example if plan_frequency is 3 (Monthly) and interval is 2, a customer using this plan will be billed every 2 months till the subscription is complete or cancelled. Applicable only for monthly or weekly plan_frequency. &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;1 |  [optional]
**planDuration** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Number of billing cycles in the recurring transaction, -1 indicates bill until cancelled. For example if plan_frequency is 3 (Monthly) and plan_duration is 6, the customer will be billed every month for 6 months. | 
**trialDuration** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of billing cycles in a trial period. |  [optional]
**amtTrial** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Amount to be billed during the trial period. |  [optional]
**amtSetup** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;One-time fee amount. When adding a subscription with this plan, a payment gateway sale transaction will be initiated to charge the customer the one time fee. |  [optional]
**amtTran** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Plan transaction amount. Amount that will be billed each cycle.  | 
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. If profile_id is provided, the currency is determined from profile. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840 |  [optional]
**profileId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 20 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Payment gateway profile id that will be used for subscriptions that use this plan. tran_currency will be used if profile_id is not provided. If both tran_currency and profile_id are not provided, default USD profile is used.  |  [optional]
**billSpecificDay** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If set to true, the customer will be billed on a specific start date.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false |  [optional]
**dayOfWeek** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field represents the day of the week on which the system will be billed for weekly or biweekly plans.&lt;ul&gt;&lt;li&gt;1 - Sunday&lt;/li&gt;&lt;li&gt;2 - Monday&lt;/li&gt;&lt;li&gt;3 - Tuesday&lt;/li&gt;&lt;li&gt;4 - Wednesday&lt;/li&gt;&lt;li&gt;5 - Thursday&lt;/li&gt;&lt;li&gt;6 - Friday&lt;/li&gt;&lt;li&gt;7 - Saturday&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Applicable only when billing is on specific day, i.e., bill_specific_day flag is set to true. |  [optional]
**dayOfMonth** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Day of the month on which the system will be billed for month or year based plans. Use 1-31 to represent the day of month when the customer will be billed or 32 if billing should be on the last day of month. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Applicable only when billing is on specific day, i.e., bill_specific_day flag is set to true. |  [optional]
**month** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Month on which the system will be billed for month or year based plans. &lt;ul&gt;&lt;li&gt;1 - January&lt;/li&gt;&lt;li&gt;2 - February&lt;/li&gt;&lt;li&gt;3 - March&lt;/li&gt;&lt;li&gt;4 - April&lt;/li&gt;&lt;li&gt;5 - May&lt;/li&gt;&lt;li&gt;6 - June&lt;/li&gt;&lt;li&gt;7 - July&lt;/li&gt;&lt;li&gt;8 - August&lt;/li&gt;&lt;li&gt;9 - September&lt;/li&gt;&lt;li&gt;10 - October&lt;/li&gt;&lt;li&gt;11 - November&lt;/li&gt;&lt;li&gt;12 - December&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Applicable only when billing is on specific day , i.e., bill_specific_day flag is set to true. |  [optional]
**prorateFirstPmt** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Set this flag to true if the first payment should be prorated. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Applicable only when billing is on specific day , i.e., bill_specific_day flag is set to true. |  [optional]
**amtProrate** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Fixed prorate amount for first payment. If set to zero or undefined, the system will calculate the prorate amount based on the number of days remaining in the first cycle. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;This field is applicable only if prorate_first_pmt is set to true.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant. |  [optional]


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



