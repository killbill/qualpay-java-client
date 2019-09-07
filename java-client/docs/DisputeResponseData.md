
# DisputeResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Response Reason Description&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;5000 |  [optional]
**cbrResponseType** | **String** | The type of Response Reason. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#response-reason\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Response Reason&lt;/a&gt; |  [optional]
**amtTran** | **Double** | The amount of the original settled transaction. |  [optional]
**referenceNumber** | **String** | The bank reference number of the deposit.&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;23 |  [optional]
**batchDate** | **String** | The date the batch was settled to Qualpay &lt;br&gt;&lt;strong&gt;Date: &lt;/strong&gt;2011-12-03 |  [optional]
**cbrCeType** | **String** | The type of Compelling Evidence. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#compelling-evidence\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Compelling Evidence&lt;/a&gt;&lt;ul&gt;&lt;li&gt;for CE09 Required fileds are tran_date, amt_purch, reference_number&lt;/li&gt;&lt;/ul&gt; |  [optional]
**downloadDescription** | **String** | Description of downloaded content only required incase of cbr_ce_type&#x3D;CE04 &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;5000 |  [optional]
**downloadTimestamp** | **String** | Timestamp of downloaded content only required incase of cbr_ce_type&#x3D;CE04 &lt;br&gt;&lt;strong&gt;Time Stamp: &lt;/strong&gt;2011-12-03T10:15:30+01:00 |  [optional]
**ceIndicators** | **List&lt;String&gt;** | String Array of possible list of options for CE04  all possible list of options &lt;a href&#x3D;\&quot;/developer/api/reference#digital-goods-download\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Digital Goods Download&lt;/a&gt; for CE09  all possible list of options &lt;a href&#x3D;\&quot;/developer/api/reference#evidence-of-disputed-payments\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Evidence of Disputed Payments&lt;/a&gt; ; only required when cbr_ce_type&#x3D;CE04 or CE09&lt;ul&gt;&lt;li&gt;for CE04 if ce_indicators is prev_not_disputed, Required fields are tran_date, amt_purch, reference_number&lt;/li&gt;&lt;/ul&gt; |  [optional]
**tranDate** | **String** | The date the transaction was captured by the merchant. |  [optional]
**amtPurch** | **Double** | Transaction Amount |  [optional]
**cbrIdType** | **String** | The type of Invalid Dispute. For all types, please refer to &lt;a href&#x3D;\&quot;/developer/api/reference#invalid-dispute\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Invalid Dispute&lt;/a&gt; |  [optional]
**cancellationDate** | **String** | Cancellation date for Invalid Dispute. Only required incase of cbr_id_type &#x3D; IDRC3&lt;br&gt;&lt;strong&gt;Date: &lt;/strong&gt;2011-12-03 |  [optional]
**reasonDesc** | **String** | Brief invalid dispute reason that was not listed. Only required incase of cbr_id_type &#x3D; IDRC25&lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;100 |  [optional]



