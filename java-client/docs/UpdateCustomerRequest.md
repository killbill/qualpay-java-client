
# UpdateCustomerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s first name.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s last name.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerFirmName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s business name, if applicable. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerPhone** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s phone number. |  [optional]
**customerEmail** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s email address.  |  [optional]
**comments** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Comment. |  [optional]
**shippingAddresses** | [**List&lt;AddShippingAddressRequest&gt;**](AddShippingAddressRequest.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of shipping addresses.  |  [optional]
**billingCards** | [**List&lt;AddBillingCardRequest&gt;**](AddBillingCardRequest.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of billing cards.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant. |  [optional]



