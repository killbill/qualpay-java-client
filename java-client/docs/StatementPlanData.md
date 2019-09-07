
# StatementPlanData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recIdLinked** | **Long** | For INTERNAL USE ONLY. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**billingMonth** | **String** | Billing month of the statement in YYYY-MM-DD |  [optional]
**planCode** | **String** | Defines the payment instrument type of Visa, MasterCard, American Express, or Discover. |  [optional]
**cntPurch** | **Long** | The total funded sales transactions count. |  [optional]
**amtPurch** | **Double** | The total funded sales dollar amount. |  [optional]
**cntReturn** | **Long** | The total funded credit transactions count. |  [optional]
**amtReturn** | **Double** | The total funded credit dollar amount. |  [optional]
**amtNet** | **Double** | The net dollar amount of transactions. |  [optional]
**amtAvgTicket** | **Double** | Average ticket amount. |  [optional]
**perItem** | **Double** | The per item rate for the payment type. |  [optional]
**rate** | **Double** | The discount rate for the payment type is applied to the Sales Amount. |  [optional]
**discountDue** | **Double** | The Amount of discount due |  [optional]



