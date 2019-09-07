
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to which this transaction belongs. |  [optional]
**tranTime** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length,  in YYYY-MM-DD HH:MM:ss format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction time. All times are Pacific time.  |  [optional]
**tranDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the transaction was captured by the merchant. |  [optional]
**tranStatus** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction status.&lt;ul&gt;&lt;li&gt;A - Transaction is approved&lt;/li&gt;&lt;li&gt;H - Transaction Held&lt;/li&gt;&lt;li&gt;C - Transaction is captured&lt;/li&gt;&lt;li&gt;V - Transaction is voided by Merchant&lt;/li&gt;&lt;li&gt;v - Transaction is voided by System&lt;/li&gt;&lt;li&gt;K - Transaction is cancelled&lt;/li&gt;&lt;li&gt;D - Transaction is declined by issuer&lt;/li&gt;&lt;li&gt;F - Transaction failures other than Issuer Declines&lt;/li&gt;&lt;li&gt;S - Transaction Settled&lt;/li&gt;&lt;li&gt;P - Deposit Sent&lt;/li&gt;&lt;li&gt;N - Transaction Settled, but will not be funded by Qualpay&lt;/li&gt;&lt;li&gt;R - Transaction Rejected&lt;/li&gt;&lt;/ul&gt; |  [optional]
**authCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 6 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Authorization code from issuer. |  [optional]
**rcode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Gateway response code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for possible values. |  [optional]
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Masked card number.  |  [optional]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card type of the billing card used for the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for possible values.  |  [optional]
**purchaseId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Purchase ID of the transaction. |  [optional]
**pgId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated payment gateway ID for the transaction. |  [optional]
**cardholderFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;First name of card holder. |  [optional]
**cardholderLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Last name of card holder. |  [optional]
**amtTran** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction amount. |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes.  |  [optional]
**disputeFlag** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Will be set to true if the transaction is disputed. |  [optional]
**amtRefunded** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Amount refunded if there are any refunds. |  [optional]
**batchNumber** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Settlement batch number. |  [optional]
**dbaName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;DBA name used in the transaction. |  [optional]
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer vault ID. |  [optional]
**subscriptionId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Subscription identifier. |  [optional]
**merchRefNum** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchant provided reference number for this transaction. |  [optional]
**batchId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch. |  [optional]
**batchDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the batch was closed. |  [optional]
**settleDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10, YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date Qualpay settled the transaction with the issuer. |  [optional]
**amtFunded** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount funded to the merchant (in funded currency). |  [optional]
**fundedCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the funded amount. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for possible values.  |  [optional]


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



