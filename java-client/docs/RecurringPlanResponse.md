
# RecurringPlanResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Response code from API. 0 indicates success. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#api-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Platform API Response Codes&lt;/a&gt; for entire list of return codes. |  [optional]
**message** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the API response code. |  [optional]
**data** | [**RecurringPlan**](RecurringPlan.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If request is successful, this field will contain the response resource. If there are input validation errors i.e, the code is 2, this field may contain a list of fields that failed the validation. |  [optional]



