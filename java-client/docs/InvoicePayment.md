
# InvoicePayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to an invoice payment. Save this id for managing invoice payments.  |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a Merchant. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The mode of payment. &lt;br&gt;&lt;ul&gt;&lt;li&gt;CARD Invoice checkout payment by customer using a card. A card payment cannot be manually added. &lt;/li&gt;&lt;li&gt;CASH Cash payment.&lt;/li&gt;&lt;li&gt;CHECK Check Payment.&lt;/li&gt;&lt;li&gt;OTHER Other modes of payment.&lt;/li&gt;&lt;/ul&gt; |  [optional]
**amtPaid** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Amount paid.  |  [optional]
**description** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the payment. |  [optional]
**pgId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated Payment gateway ID for the transaction. Applicable only to CARD type transaction. |  [optional]
**invoiceId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice. |  [optional]
**datePayment** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Date the payment was made |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;&lt;ul&gt;&lt;li&gt;SAVED Invoice is in draft state. An invoice in draft state can be updated. &lt;/li&gt;&lt;li&gt;OUTSTANDING Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated. &lt;/li&gt;&lt;li&gt;PAID Invoice has been paid completely. A paid invoice cannot be updated. &lt;/li&gt;&lt;li&gt;CANCELED Invoice has been canceled. A canceled invoice cannot be updated. &lt;/li&gt;&lt;/ul&gt; |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes.  |  [optional]
**tranStatus** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction status for CARD payments. The status will be empty for non credit card payments.Possible values are &lt;br&gt;&lt;ul&gt;&lt;li&gt;A - Transaction is approved&lt;/li&gt;&lt;li&gt;H - Transaction Held&lt;/li&gt;&lt;li&gt;C - Transaction is captured&lt;/li&gt;&lt;li&gt;V - Transaction is voided by Merchant&lt;/li&gt;&lt;li&gt;v - Transaction is voided by System&lt;/li&gt;&lt;li&gt;K - Transaction is cancelled&lt;/li&gt;&lt;li&gt;S - Transaction Settled&lt;/li&gt;&lt;li&gt;P - Deposit Sent&lt;/li&gt;&lt;li&gt;N - Transaction Settled, but will not be funded by Qualpay&lt;/li&gt;&lt;li&gt;U - Transaction authorization failed or was declined by issuer&lt;/li&gt;&lt;li&gt;R - Transaction Rejected&lt;/li&gt;&lt;/ul&gt; |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CARD | &quot;CARD&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;
OTHER | &quot;OTHER&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SAVED | &quot;SAVED&quot;
OUTSTANDING | &quot;OUTSTANDING&quot;
PAID | &quot;PAID&quot;
CANCELED | &quot;CANCELED&quot;


