
# PaymentTerm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Payment Term type. By default, this field is set to DAYS.  |  [optional]
**value** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Payment Term. The invoice_due_date will be automatically updated based on this value. If type is DATE, this field should contain the invoice_due_date in &#39;YYYY-MM-DD&#39; format. If type is DAYS, this field should contain the number of days from invoice date when payment is due.   |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
DATE | &quot;DATE&quot;



