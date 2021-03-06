
# StatementDisputeData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recIdLinked** | **Long** | For INTERNAL USE ONLY. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**billingMonth** | **String** | Billing month of the statement in YYYY-MM-DD. |  [optional]
**batchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the ACH debit or credit adjustment was made to the depository account in YYYY-MM-DD format. |  [optional]
**referenceNumber** | **Long** | An 11-digit number generated by the product initiating the transaction. The number is available when the transaction is settled and is a unique number that both the acquirer and the issuer can use to identify a transaction. The reference is used as the deposit reference number. |  [optional]
**planType** | **String** | SDefines the payment instrument type of Visa, MasterCard, American Express, or Discover. |  [optional]
**typeId** | **String** | The type of dispute. |  [optional]
**billable** | **String** | Defines by a Yes or No whether the dispute triggered a billable event. All billable dispute events will appear as a total line item in the Fees section in YYYY-MM-DD format. |  [optional]
**amtPurch** | **Double** | The dollar value of the adjustment that is a debit to the depository account. |  [optional]
**amtReturn** | **Double** | The dollar value of the adjustment that is a credit to the depository account. |  [optional]



