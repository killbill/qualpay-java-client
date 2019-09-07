
# GatewayResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pgId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Qualpay generated payment gateway ID for the transaction |  [optional]
**rcode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Gateway Response Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for possible values. |  [optional]
**rmsg** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A short description of the response code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#gateway-response-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Gateway Response Codes&lt;/a&gt; for response code descriptions. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of the gateway transaction. |  [optional]
**authCode** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 6 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Authorization code from issuer. |  [optional]
**cardId** | **String** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The card_id generated by the system if customer chooses to save card. Applicable only for Qualpay Checkout transactions with a customer id. |  [optional]
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Masked card number used in transaction.  |  [optional]
**tranTime** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, in YYYY-MM-DD HH:MM:ss format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction time. All times are pacific.  |  [optional]
**amtTran** | **Double** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Transaction amount. |  [optional]
**purchaseId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Purchase ID of the transaction. |  [optional]
**cvv2Result** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If CVV is sent, then the result from the card issuer will be returned in this field. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#cvv2-result-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Result Codes for CVV2&lt;/a&gt; for valid CVV2 result codes. |  [optional]
**avsResult** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 1 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;If the billing_zip (and optionally the billing_street_addr1) is sent, then the result from the card issuer will be returned in this field. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#avs-result-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Payment Result Codes for AVS&lt;/a&gt; for |  [optional]
**duration** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Duration of Gateway request in ms. |  [optional]
**httpStatus** | **Integer** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;HTTP status of the payment gateway request. |  [optional]
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. |  [optional]
**profileId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique profile ID used in the payment gateway requests. |  [optional]
**merchRefNum** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;This field contains a merchant provided reference value that will be stored with the transaction data and will be included with the transaction data reported in the Qualpay Manager. This value will also be attached to any lifecycle transactions (e.g. retrieval requests and chargebacks) that may occur. |  [optional]
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric currency code of the transaction. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. |  [optional]
**dbaName** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;DBA name associated with the profile. |  [optional]
**customerId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID established by merchant to identify a customer. Customer ID is included in the response if it is sent in the request.  |  [optional]
**customer** | [**CheckoutCustomer**](CheckoutCustomer.md) | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The customer data input by the user for this transaction in the checkout page.  Applicable only for Qualpay Checkout transactions. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
APPROVED | &quot;Approved&quot;
DECLINED | &quot;Declined&quot;


