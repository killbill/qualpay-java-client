
# UpdateBillingCardRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N, MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Expiration date of cardholder card number.  Use this field if you would like to update the expiration date of the card. |  [optional]
**cvv2** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;CVV2 or CID value from the signature panel on the back of the cardholder&#39;s card. If present during a request where the verify flag is set to true, the value will be sent to the issuer for validation. This field will not be stored in vault.  |  [optional]
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID that should be updated. | 
**billingFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing first name. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Billing first name is required when updating an ACH account number. |  [optional]
**billingLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing last name. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Billing last name is required when updating an ACH account number. |  [optional]
**billingFirmName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Business name on billing card, if applicable.  |  [optional]
**billingAddr1** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing street address. This address will also be used for AVS verification if AVS verification is enabled.  |  [optional]
**billingAddr2** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing Address line item 2. |  [optional]
**billingCity** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing city. |  [optional]
**billingState** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing state. |  [optional]
**billingZip** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip. The zipcode will also be used for AVS verification if AVS verification is enabled. |  [optional]
**billingZip4** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip+4 code if applicable. |  [optional]
**billingCountry** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing country. |  [optional]
**billingCountryCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ISO numeric country code for the billing address. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of country codes. |  [optional]
**verify** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Set this field to true if a card_number or card_id should be verified by the issuer before adding to Customer Vault. When this field is set to true, the billing card will be updated either if the card verification is successful or if card verification is not supported by the issuer.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false |  [optional]
**primary** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Set this field to true if this should be the default card.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Identifies the merchant to whom this request applies. Optional field, applicable only if the request is sent on behalf of another merchant.&lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;Required if this request is on behalf of another merchant. |  [optional]



