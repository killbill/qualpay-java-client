
# AccountUpdaterReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a Merchant. |  [optional]
**requestId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to the account updater request. |  [optional]
**requestDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater request date. Date when a harvest request was sent to the account updater service. |  [optional]
**responseDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater response date. Date when the account updater service responded. This field is empty if the response is not yet received. |  [optional]
**cardId** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card ID received from a tokenization request for a card. The card_id may be used in place of a card number in messages requiring cardholder account data. |  [optional]
**cardNumber** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Cardholder card number(masked). |  [optional]
**expDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N, in MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Card expiration date. |  [optional]
**cardNumberNew** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Updated cardholder card number(masked). This field will be empty if there are no updates to the card number. |  [optional]
**expDateNew** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 4 N, in MMYY format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Updated card expiration date. This field will be empty if there are no updates to the expiration date. |  [optional]
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Account updater reason code.  Account updater reason code. Following are descriptions of the codes              &lt;ul&gt;              &lt;li&gt;000 - New Card/No response&lt;/li&gt;              &lt;li&gt;200 - Valid account no update&lt;/li&gt;              &lt;li&gt;201 - Account Expiration Date Updated&lt;/li&gt;              &lt;li&gt;202 - Account Number Updated&lt;/li&gt;              &lt;li&gt;203 - Account is Closed&lt;/li&gt;              &lt;li&gt;204 - Contact Cardholder&lt;/li&gt;              &lt;li&gt;206 - No Match&lt;/li&gt;              &lt;li&gt;315 - Invalid Expiration Date&lt;/li&gt;              &lt;li&gt;320 - Invalid Account Number&lt;/li&gt;              &lt;li&gt;329 - Invalid Card Type&lt;/li&gt;              &lt;/ul&gt; |  [optional]
**billable** | **Boolean** | &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Merchants will be billed only for matches. Reason codes 201, 202, 203 and 204 are billable. |  [optional]


<a name="ReasonCodeEnum"></a>
## Enum: ReasonCodeEnum
Name | Value
---- | -----
_000 | &quot;000&quot;
_200 | &quot;200&quot;
_201 | &quot;201&quot;
_202 | &quot;202&quot;
_203 | &quot;203&quot;
_204 | &quot;204&quot;
_206 | &quot;206&quot;
_315 | &quot;315&quot;
_320 | &quot;320&quot;
_329 | &quot;329&quot;



