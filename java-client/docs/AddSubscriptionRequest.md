
# AddSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateStart** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date the subscription will start. | 
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer id of the Subscriber. Customer id should be a valid existing customer from customer vault. A customer can also be created on the fly before adding a subscription by using the customer field.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or customer is required. |  [optional]
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;By default, when a subscription is added to a customer, the recurring charges will be billed to the customer&#39;s primary payment method. This can be overridden to charge against any of the customer&#39;s payment methods, by sending any card_id belonging to the customer in this field.  |  [optional]
**customer** | [**AddCustomerRequest**](AddCustomerRequest.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If a customer_id is not included in the request, the customer will be added to customer vault and a recurring payment will be added to the primary card.  Applicable only when adding subscriptions. Set use_existing_customer field to true, if system should re-use an existing customer if available. Set customer.auto_generate_customer_id to true if the customer_id should be auto generated when adding a customer. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or customer is required |  [optional]
**planCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Plan code of the recurring plan. Plan should be active and a valid recurring plan.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt; Required for on-plan subscriptions  |  [optional]
**planDesc** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the one off plan. Applicable only to one-off subscriptions.  |  [optional]
**planFrequency** | [**PlanFrequencyEnum**](#PlanFrequencyEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; This field identifies the frequency of billing.  Applicable only to one-off subscriptions. Use one of the following codes for frequency. &lt;ul&gt; &lt;li&gt;0 - Weekly&lt;/li&gt; &lt;li&gt;1 - Bi-Weekly&lt;/li&gt; &lt;li&gt;3 - Monthly&lt;/li&gt; &lt;li&gt;4 - Quarterly&lt;/li&gt; &lt;li&gt;5 - Bi-annually&lt;/li&gt; &lt;li&gt;6 - Annually&lt;/li&gt; &lt;li&gt;7 - Daily&lt;/li&gt;   &lt;/ul&gt;&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscriptions. |  [optional]
**interval** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; Applicable only for monthly or weekly frequency. Number of months in a subscription cycle. |  [optional]
**planDuration** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of billing cycles in the recurring subscription, Use -1 if billing cycles are indefinite. Applicable only to one-off subscriptions. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscriptions.  |  [optional]
**amtSetup** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;One-Time Fee amount. This fee will be charged immediately when a subscription is added. Applicable only to one-off subscriptions.  |  [optional]
**amtSetupIgnore** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; When set to true and if the recurring plan requires a one time fee, the system will not charge the one-time fee amount. By default if a plan has a one-time fee, the customer will be charged the one-time fee when the subscription is created. Set this flag to true if you would like to avoid charging the customer for the plan one-time fee.  &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false |  [optional]
**amtTran** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Plan Transaction Amount. Amount that will be billed each cycle period. Applicable only to one-off subscriptions. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required for one-off subscription.  |  [optional]
**profileId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 20 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Payment Gateway Profile id that will be used when billing transactions. tran_currency will be used if profile_id is not provided. If both tran_currency and profile_id are not provided, default USD profile is used. Applicable only to one-off subscriptions.  |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. If profile_id is provided, the currency is determined from profile. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. Applicable only to one-off subscriptions.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840 |  [optional]
**useExistingCustomer** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt; When set to true, the system will try to use an existing customer_id if one is available. If there is an existing customer with the same customer_first_name and customer_last_name and primary card_number or card_id, then the subscription is added to the matching customer.  If a customer is not found, a new customer is generated. The generated customer_id will be returned in the response. &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;If set to true, the field, customer, is required. |  [optional]
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



