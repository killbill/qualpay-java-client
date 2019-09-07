
# StatementFeeData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recIdLinked** | **Long** | For INTERNAL USE ONLY. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**billingMonth** | **String** | Billing month of the statement in YYYY-MM-DD. |  [optional]
**feeCategory** | **String** | The category defines the type of fees. |  [optional]
**count** | **Long** | The count of items applicable to the category. |  [optional]
**amtFees** | **Double** | The dollar amount of items applicable to the category. |  [optional]
**perItem** | **Double** | The percentage rate applied to the category item. |  [optional]
**rate** | **Double** | The per item rate applied to the category item. |  [optional]
**discountDue** | **Double** |  | 
**description** | **String** | The description of a category item. |  [optional]
**feesPaid** | **Double** | Any fees paid during the month. |  [optional]
**feesTotal** | **Double** | The total amount of fees due for the category item. |  [optional]



