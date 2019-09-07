
# BouncedInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**invoiceNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Invoice Number (also referred to as the purchase identifier) generated by the merchant.  |  [optional]
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Qualpay customer id associated with this invoice.  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;SAVED - Invoice is in draft state. An invoice in draft state can be updated. &lt;br&gt;OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.&lt;br&gt;PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. &lt;br&gt;CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;16 |  [optional]
**sendCode** | [**SendCodeEnum**](#SendCodeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The email client response code. Possible values are &lt;br&gt;O - Email not send. The email address may be invalid.  &lt;br&gt;A - Email not sent. The email address has been disabled. &lt;br&gt;B - Email bounced. &lt;br&gt;&lt;strong&gt;Maximum Length: &lt;/strong&gt;1 |  [optional]
**dbTimestamp** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The time when the invoice was sent. |  [optional]
**recipient** | **List&lt;String&gt;** | An array of the invoice recipient&#39;s email addresses. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SAVED | &quot;SAVED&quot;
OUTSTANDING | &quot;OUTSTANDING&quot;
PAID | &quot;PAID&quot;
CANCELED | &quot;CANCELED&quot;


<a name="SendCodeEnum"></a>
## Enum: SendCodeEnum
Name | Value
---- | -----
O | &quot;O&quot;
A | &quot;A&quot;
B | &quot;B&quot;


