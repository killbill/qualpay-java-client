
# BatchReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to this batch. | 
**merchantId** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant. | 
**tranCurrency** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The ISO 4217 numeric currency code of the batch. | 
**batchNumber** | **Long** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A non-unique ID assigned by the merchant&#39;s terminal, POS device, or gateway for this batch, in the range of 1 - 999. | 
**batchDate** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the batch was settled to Qualpay. | 
**amtTotal** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The total, or net amount of the batch, in the batches currency. | 
**cntTotal** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of transactions in the batch, including purchases and credits. | 
**amtPurch** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of purchases within the batch, in the batches currency. | 
**cntPurch** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of purchases in the batch. | 
**amtReturn** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 12,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount of returns, or credits back to the customer, in the batch&#39;s currency. | 
**cntReturn** | **String** | &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 9 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The count of returns or credits back to the customer in the batch. | 



