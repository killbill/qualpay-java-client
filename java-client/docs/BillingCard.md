
# BillingCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The masked card number.  |  [optional]
**expDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N, MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Expiration date of card number.  |  [optional]
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID received from a tokenization request. |  [optional]
**billingFirstName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing first name.  |  [optional]
**billingLastName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing last name.  |  [optional]
**billingFirmName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Business name on billing card, if applicable.  |  [optional]
**billingAddr1** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing street address. This address will also be used for AVS verification if AVS verification is enabled.  |  [optional]
**billingAddr2** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing Address line item 2. |  [optional]
**billingCity** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 64 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing city. |  [optional]
**billingState** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing state. |  [optional]
**billingZip** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip. |  [optional]
**billingZip4** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 4 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing zip+4 code if applicable. |  [optional]
**billingCountry** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Billing Country. |  [optional]
**billingCountryCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;ISO numeric country code for the billing address. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of country codes. |  [optional]
**primary** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;True if this is the default card. The default card will be used in recurring billing payments.&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;false |  [optional]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 2 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card Type. The card type is derived from the card number. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#card-types\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Card Types&lt;/a&gt; for a list of card types.  |  [optional]
**verifiedDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Verified Date. The date the card was last verified successfully. |  [optional]


<a name="CardTypeEnum"></a>
## Enum: CardTypeEnum
Name | Value
---- | -----
VS | &quot;VS&quot;
MC | &quot;MC&quot;
AM | &quot;AM&quot;
DS | &quot;DS&quot;
JC | &quot;JC&quot;
PP | &quot;PP&quot;
AP | &quot;AP&quot;



