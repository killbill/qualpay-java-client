
# CustomerVault

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. The customer ID can be used to add subscriptions using the Recurring Billing API or make payments using the Payment Gateway API. Once established, this ID cannot be updated. This field is case sensitive. Only letters and numbers are allowed in a Customer ID. |  [optional]
**recId** | **Long** | For INTERNAL USE ONLY. |  [optional]
**nodeId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Qualpay Merchant ID to which this customer belongs. |  [optional]
**customerFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s first name. |  [optional]
**customerLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s last name. |  [optional]
**customerFirmName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s business name, if applicable.  |  [optional]
**customerPhone** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s phone number. |  [optional]
**customerEmail** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s email address.  |  [optional]
**comments** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Comment |  [optional]
**primaryCardNumber** | **String** | Default Card Number for this customer. |  [optional]
**shippingAddresses** | [**List&lt;ShippingAddress&gt;**](ShippingAddress.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of shipping addresses.  |  [optional]
**billingCards** | [**List&lt;BillingCard&gt;**](BillingCard.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of billing cards.  |  [optional]



