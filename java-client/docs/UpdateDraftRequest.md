
# UpdateDraftRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The qualpay customer_id associated with this invoice. Customer should be a valid customer in the system.   | 
**fromContact** | [**Contact**](Contact.md) | The merchant business contact information. This field is required to send the invoice. |  [optional]
**billingContact** | [**Contact**](Contact.md) | The customer contact information. This field is required to send the invoice.  |  [optional]
**invoiceNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Invoice Number (also referred to as the purchase identifier) generated by the merchant.  | 
**profileId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique qualpay payment gateway profile ID to be used when making an invoice payment. This field is optional, only the tran_currency field can be sent and the system will choose the appropriate profile. If both profile_id and tran_currency is sent, the system will use the profile_id.  |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. If both profile_id and tran_currency fields are provided, profile_id is used. tran_currency will be updated to match the profile_id&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840 |  [optional]
**footerNote** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 750 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice footer note. This data will be displayed on the footer of the invoice.  |  [optional]
**paymentTermsNote** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 500 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice payment terms description.  |  [optional]
**checkoutSettings** | [**CheckoutSettings**](CheckoutSettings.md) | Invoice checkout page specific settings from the invoice settings page. |  [optional]
**salesTax** | [**SalesTax**](SalesTax.md) | Sales tax |  [optional]
**paymentTerms** | [**PaymentTerm**](PaymentTerm.md) | Payment Terms |  [optional]
**dateInvoice** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice date. |  [optional]
**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) | The invoice line item details.  |  [optional]



