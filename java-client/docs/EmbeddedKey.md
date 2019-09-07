
# EmbeddedKey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transientKey** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A single use token used for loading embedded fields. The key will be invalidated   when a card is successfully verified. If unused, the token will expire in 30 minutes.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. | 
**dbTimestamp** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field contains the transient key creation timestamp.  |  [optional]
**expiryTime** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field contains the timestamp when the transient key will expire. |  [optional]



