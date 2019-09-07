
# SettledTransactionReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 18 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this deposit. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a Merchant. |  [optional]
**batchDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the batch was settled to Qualpay. |  [optional]
**dbaName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The doing business as name of the merchant. |  [optional]
**merchCityPh** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 13 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Sent to the card issuer; either the merchant&#39;s city, or phone number. |  [optional]
**merchState** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Sent to the card issuer; the merchant&#39;s state. |  [optional]
**merchZip** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Sent to the card issuer; the merchant&#39;s ZIP code. |  [optional]
**merchCountry** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Sent to the card issuer; the merchant&#39;s country code. |  [optional]
**batchNumber** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A non-unique ID assigned by the merchant&#39;s terminal, POS device, or gateway for this batch, in the range of 1 - 999. |  [optional]
**batchId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch. |  [optional]
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The truncated card number of the transaction. |  [optional]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The card brand of this transaction. |  [optional]
**authDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the transaction was authorized by the merchant. |  [optional]
**tranDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the transaction was captured by the merchant. |  [optional]
**settleDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date Qualpay settled the transaction with the issuer. |  [optional]
**amtAuth** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of the original authorization. |  [optional]
**amtTran** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of the settled transaction. |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The ISO 4217 numeric currency code of the dispute. |  [optional]
**referenceNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 23 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The bank reference number of the deposit. |  [optional]
**purchaseId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A merchant supplied tracking number, generally an invoice or purchase number. This number may be visible to the cardholder, depending on card issuer. |  [optional]
**authCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 6 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The authorization code provided by the card issuer when the card was approved. |  [optional]
**motoEcommInd** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The transaction ECI (e-commerce indicator), an indicatior of how the card was processed. |  [optional]
**posEntryMode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Indicates the way a card number was entered. For all codes, please see &lt;a href&#x3D;\&quot;/developer/api/reference#pos_entry_mode\&quot; target&#x3D;\&quot;_blank\&quot;&gt;POS Entry Modes&lt;/a&gt;. |  [optional]
**amtFunded** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of this transaction funded to the merchant (in the funded currency). |  [optional]
**fundedCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The ISO 4217 numeric currency code of the transaction. |  [optional]
**pgId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;32-byte unique identifier generated by the payment gateway, returned in all valid responses. Applicable only to Qualpay Payment Gateway transactions. It provides a reference to the transaction and is required for some post-auth operations (e.g. capture, refund, or void). |  [optional]
**merchRefNum** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchant provided reference value that will be stored with the transaction data and included with transaction data in reports within Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur. |  [optional]
**acqReferenceNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 11 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Acquirer reference number is an 11-digit number generated by the product initiating the transaction. It is a unique number that both the acquirer and the issuer can use to identify a transaction. For chargeback adjustments, the acquirer reference number is used as the deposit reference number. |  [optional]
**authRrn** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Authorization Retrieval Reference Number (RRN) is a unique identifier assigned by an acquirer to an authorization. |  [optional]
**authTranId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 15 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Authorization transaction identifier is a unique identifier returned by the issuing bank for an electronically authorized transaction. |  [optional]


<a name="CardTypeEnum"></a>
## Enum: CardTypeEnum
Name | Value
---- | -----
VS | &quot;VS&quot;
MC | &quot;MC&quot;
AM | &quot;AM&quot;
DS | &quot;DS&quot;
JC | &quot;JC&quot;
PP | &quot;PP&quot;
AP | &quot;AP&quot;



