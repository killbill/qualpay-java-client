
# AccountUpdaterSummaryReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to the account updater request. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a Merchant. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of the request. The status can be one of the following               &lt;ul&gt;              &lt;li&gt;QUEUED - Account updater request is queued in the Account updater service&lt;/li&gt;              &lt;li&gt;COMPLETED - Account updater request has completed&lt;/li&gt;              &lt;/ul&gt; |  [optional]
**cntRequest** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of cards in this request. |  [optional]
**cntResponse** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of cards in this request that were reviewed by the account updater service. (This should match the cnt_request.). The cnt_response field will be zero if the status field is not COMPLETED. |  [optional]
**cntUpdate** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Number of cards in this request that were updated by the account updater service. The cnt_update field will be zero if the status field is not COMPLETED or if there are no updates by the account updater service. |  [optional]
**requestDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in  YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater request date. Date when a harvest request was sent to the account updater service. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
COMPLETED | &quot;COMPLETED&quot;



