
# AusReleaseRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID to be released from Account Updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer id and will release only the card_id from hold.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either card_id or customer_id is required. |  [optional]
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. All card ids belonging to this customer will released from Account updater harvest hold. If both card_id and customer_id are included in the request, the system will ignore the customer_id and will release only the card_id from hold.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either card_id or customer_id is required. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant. |  [optional]



