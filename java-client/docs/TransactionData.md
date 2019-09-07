
# TransactionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tranDate** | **String** | The date the transaction was captured by the merchant. |  [optional]
**referenceNumber** | **String** | The bank reference number of the deposit. |  [optional]
**tranStatus** | **String** | Transaction Status&lt;ul&gt;&lt;li&gt;A - Transaction is approved&lt;/li&gt;&lt;li&gt;H - Transaction Held&lt;/li&gt;&lt;li&gt;C - Transaction is captured&lt;/li&gt;&lt;li&gt;V - Transaction is voided by Merchant&lt;/li&gt;&lt;li&gt;v - Transaction is voided by System&lt;/li&gt;&lt;li&gt;K - Transaction is cancelled&lt;/li&gt;&lt;li&gt;D - Transaction is declined by issuer&lt;/li&gt;&lt;li&gt;F - Transaction failures other than Issuer Declines&lt;/li&gt;&lt;li&gt;S - Transaction Settled&lt;/li&gt;&lt;li&gt;P - Deposit Sent&lt;/li&gt;&lt;li&gt;N - Transaction Settled, but will not be funded by Qualpay&lt;/li&gt;&lt;li&gt;R - Transaction Rejected&lt;/li&gt;&lt;/ul&gt; |  [optional]
**purchaseId** | **String** | Purchase ID of the transaction |  [optional]
**amtTran** | **Double** | Transaction Amount |  [optional]
**tranCurrency** | **String** | Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. |  [optional]
**batchDate** | **String** | The date the batch was settled to Qualpay. |  [optional]
**cardNumber** | **String** | The truncated card number of the dispute. |  [optional]



