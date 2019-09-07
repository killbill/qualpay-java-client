
# StatementReserveData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recIdLinked** | **Long** | For INTERNAL USE ONLY. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**billingMonth** | **String** | Identifies the date funds are posted to the depository account for either settled transactions, net of reserve or adjustments for release of reserves. in YYYY-MM-DD. |  [optional]
**batchDate** | [**OffsetDateTime**](OffsetDateTime.md) | Identifies the date funds are posted to the depository account for either settled transactions, net of reserve or adjustments for release of reserves. in YYYY-MM-DD. |  [optional]
**amtReserve** | **Double** | Is the total dollar amount deducted from settled transactions prior to funding. The amount is calculated by applying an agreed upon percentage to the sales volume in a batch. |  [optional]
**amtReleasedReserve** | **Double** | Is the total dollar amount released as an adjustment to the depository account. |  [optional]
**amtReserveBalance** | **Double** | Total amount of reserve held by Qualpay as of the ACH Post Date. |  [optional]



