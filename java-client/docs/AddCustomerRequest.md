
# AddCustomerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. The customer ID can be used to add subscriptions using the Recurring Billing API or make payments using the Payment Gateway API. Once established, this ID cannot be updated. This field is case sensitive. Only letters and numbers are allowed in a Customer ID.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or auto_generate_customer_id is required to add a new customer |  [optional]
**autoGenerateCustomerId** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Boolean flag that indicates if customer id should be auto generated.  When set to true, Qualpay will generate a unique  customer id. The generated customer_id will be returned in the response. Save the customer_id in the response to manage the customer through Vault API. &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer_id or auto_generate_customer_id is required to add a new customer |  [optional]
**customerFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s first name.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s last name.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerFirmName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer business name if applicable. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Either customer name or customer firm name is required. |  [optional]
**customerPhone** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s phone number. |  [optional]
**customerEmail** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Customer&#39;s email address.  |  [optional]
**comments** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Comment |  [optional]
**shippingAddresses** | [**List&lt;AddShippingAddressRequest&gt;**](AddShippingAddressRequest.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of shipping addresses. One of the addresses should be designated as the default shipping address, if not, the system will choose one of the address to be the default.  |  [optional]
**billingCards** | [**List&lt;AddBillingCardRequest&gt;**](AddBillingCardRequest.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;An array of billing cards. One of the cards should be designated as the default billing card, if not, the system will choose one of the cards to be the default.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant. |  [optional]



