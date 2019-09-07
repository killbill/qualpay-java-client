
# DisputeReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 18 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this dispute. | 
**dataType** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The type of dispute. For all types, please see &lt;a href&#x3D;\&quot;/developer/api/reference#data_type\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Dispute Types&lt;/a&gt;. | 
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. | 
**incomingDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date Qualpay received the dispute from the card issuer. | 
**dbaName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The doing business as name of the merchant. | 
**batchId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch. | 
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The truncated card number of the dispute. | 
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The card brand of this dispute. | 
**tranDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the initial transaction occured. | 
**amtTran** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of the original settled transaction. | 
**amtDispute** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of the dispute: equal to, or less than the amt_tran (when in USD). | 
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The ISO 4217 numeric currency code of the dispute. | 
**purchaseId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A merchant supplied tracking number, generally an invoice or purchase number. This number may be visible to the cardholder, depending on card issuer. | 
**merchRefNum** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A merchant supplied tracking number which is stored by Qualpay, and does not pass to the card issuer. | 
**pgId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If the transaction originated through the Qualpay Virtual Terminal, or Qualpay Payment Gateway, this is the tracking ID returned in the gateway response. | 
**authCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 6 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The authorization code provided by the card issuer when the card was approved. | 
**reasonCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 8 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The card association reason why the dispute was issued. | 
**recIdLinked** | **String** | TODO | 
**authAvsResult** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The AVS (address validation service) match code of the original transaction. | 
**authCvv2Result** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The CVV2 match code of the original transaction. | 
**cardNumberOriginal** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The truncated card number of the original captured transactions. In some rare cases a dispute may be issued on a different card than the original. This can occur when, for example, the card was was re-issued between the transaction date, and the dispute date. | 
**dateStatusChange** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Records dispute status date. The dispute status of a dispute record will change over time and as a result of merchant actions. |  [optional]


<a name="CardTypeEnum"></a>
## Enum: CardTypeEnum
Name | Value
---- | -----
VS | &quot;VS&quot;
MC | &quot;MC&quot;
DS | &quot;DS&quot;
AM | &quot;AM&quot;



