
# RecurringPlanListResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Response code from API. 0 indicates success. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#api-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Platform API Response Codes&lt;/a&gt; for entire list of return codes. | 
**message** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the API response code. | 
**totalPages** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Total Number of pages.  | 
**totalRecords** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Total number of records upto a maximum of 100. | 
**data** | [**List&lt;RecurringPlan&gt;**](RecurringPlan.md) | An array of the resource object. | 



