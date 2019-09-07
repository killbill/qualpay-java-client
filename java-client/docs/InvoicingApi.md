# InvoicingApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInvoicePayment**](InvoicingApi.md#addInvoicePayment) | **POST** /invoice/{invoice_id}/payments | Add Payment to an Invoice
[**browseBouncedInvoices**](InvoicingApi.md#browseBouncedInvoices) | **GET** /invoice/bounced | Get Undelivered Invoices
[**browseInvoicePayments**](InvoicingApi.md#browseInvoicePayments) | **GET** /invoice/payments | Get Invoice Payments
[**browseInvoicePaymentsById**](InvoicingApi.md#browseInvoicePaymentsById) | **GET** /invoice/{invoice_id}/payments | Get invoice payments by id
[**browseInvoices**](InvoicingApi.md#browseInvoices) | **GET** /invoice | Get all Invoices
[**cancelInvoice**](InvoicingApi.md#cancelInvoice) | **DELETE** /invoice/{invoice_id}/cancel | Cancel an Invoice
[**copyInvoice**](InvoicingApi.md#copyInvoice) | **POST** /invoice/{invoice_id}/copy | Copy an Invoice
[**createInvoice**](InvoicingApi.md#createInvoice) | **POST** /invoice | Create an invoice
[**getInvoice**](InvoicingApi.md#getInvoice) | **GET** /invoice/{invoice_id}/detail | Get by Invoice ID
[**removeInvoicePayment**](InvoicingApi.md#removeInvoicePayment) | **DELETE** /invoice/{invoice_id}/payments/{payment_id} | Remove an Invoice Payment
[**resendInvoice**](InvoicingApi.md#resendInvoice) | **POST** /invoice/{invoice_id}/resend | Resend an Invoice
[**sendInvoice**](InvoicingApi.md#sendInvoice) | **POST** /invoice/{invoice_id}/send | Send an Invoice
[**updateDraftInvoice**](InvoicingApi.md#updateDraftInvoice) | **PUT** /invoice/{invoice_id}/draft | Update a Draft Invoice
[**updateInvoicePayment**](InvoicingApi.md#updateInvoicePayment) | **PUT** /invoice/{invoice_id}/payments/{payment_id} | Update an Invoice Payment
[**updateOutstandingInvoice**](InvoicingApi.md#updateOutstandingInvoice) | **PUT** /invoice/{invoice_id}/outstanding | Update an Outstanding Invoice


<a name="addInvoicePayment"></a>
# **addInvoicePayment**
> InvoicePaymentResponse addInvoicePayment(invoiceId, body)

Add Payment to an Invoice

Adds a payment to an invoice. A check or cash payment can be added to a saved or outstanding invoice. Credit card payments cannot be added manually to an invoice. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
InvoicePaymentRequest body = new InvoicePaymentRequest(); // InvoicePaymentRequest | Invoice Payment
try {
    InvoicePaymentResponse result = apiInstance.addInvoicePayment(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#addInvoicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**InvoicePaymentRequest**](InvoicePaymentRequest.md)| Invoice Payment |

### Return type

[**InvoicePaymentResponse**](InvoicePaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseBouncedInvoices"></a>
# **browseBouncedInvoices**
> InvoiceBouncedResponse browseBouncedInvoices(count, orderOn, orderBy, page, filter)

Get Undelivered Invoices

Browse all undelivered invoices. Optional query parameters determines, size and sort order of returned array.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "db_timestamp"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    InvoiceBouncedResponse result = apiInstance.browseBouncedInvoices(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#browseBouncedInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to db_timestamp]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**InvoiceBouncedResponse**](InvoiceBouncedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseInvoicePayments"></a>
# **browseInvoicePayments**
> InvoicePaymentListResponse browseInvoicePayments(count, orderOn, orderBy, page, filter)

Get Invoice Payments

Browse all invoice payments. Optional query parameters determines, size and sort order of returned array.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "date_payment"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    InvoicePaymentListResponse result = apiInstance.browseInvoicePayments(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#browseInvoicePayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to date_payment]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**InvoicePaymentListResponse**](InvoicePaymentListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseInvoicePaymentsById"></a>
# **browseInvoicePaymentsById**
> InvoicePaymentListResponse browseInvoicePaymentsById(invoiceId, count, orderOn, orderBy, page, filter)

Get invoice payments by id

Browse all invoice payments made to an invoice. Optional query parameters determines, size and sort order of returned array.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "date_payment"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    InvoicePaymentListResponse result = apiInstance.browseInvoicePaymentsById(invoiceId, count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#browseInvoicePaymentsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to date_payment]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**InvoicePaymentListResponse**](InvoicePaymentListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseInvoices"></a>
# **browseInvoices**
> InvoiceListResponse browseInvoices(count, orderOn, orderBy, page, filter)

Get all Invoices

Gets an array of invoice objects. Optional query parameters determines, size and sort order of returned array.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "invoice_number"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    InvoiceListResponse result = apiInstance.browseInvoices(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#browseInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to invoice_number]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**InvoiceListResponse**](InvoiceListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelInvoice"></a>
# **cancelInvoice**
> InvoiceResponse cancelInvoice(invoiceId)

Cancel an Invoice

Cancels an invoice. A canceled invoice cannot be edited. If your customer clicks on the pay now button in the invoice e-mail an error message will be displayed.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
try {
    InvoiceResponse result = apiInstance.cancelInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#cancelInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyInvoice"></a>
# **copyInvoice**
> InvoiceResponse copyInvoice(invoiceId, body)

Copy an Invoice

Makes a copy of an invoice. The invoice date will be set to today&#39;s date and due date will be adjusted based on the invoice date and the payment terms. Optionally, include an invoice_number in the POST body to make a copy of the invoice with a different invoice number. Invoice payments from the original invoice will not be copied. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
CopyInvoiceRequest body = new CopyInvoiceRequest(); // CopyInvoiceRequest | Invoice
try {
    InvoiceResponse result = apiInstance.copyInvoice(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#copyInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**CopyInvoiceRequest**](CopyInvoiceRequest.md)| Invoice | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInvoice"></a>
# **createInvoice**
> InvoiceResponse createInvoice(body)

Create an invoice

Creates a draft invoice that you can send later using the Send Invoice API.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
CreateInvoiceRequest body = new CreateInvoiceRequest(); // CreateInvoiceRequest | Invoice
try {
    InvoiceResponse result = apiInstance.createInvoice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#createInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateInvoiceRequest**](CreateInvoiceRequest.md)| Invoice |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoice"></a>
# **getInvoice**
> InvoiceResponse getInvoice(invoiceId)

Get by Invoice ID

Gets an invoice by invoice_id.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | Invoice ID
try {
    InvoiceResponse result = apiInstance.getInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#getInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**| Invoice ID |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeInvoicePayment"></a>
# **removeInvoicePayment**
> QPApiResponse removeInvoicePayment(invoiceId, paymentId)

Remove an Invoice Payment

Removes an invoice payment. A payment can be removed on a saved or an outstanding invoice. CARD type payments cannot be removed. Payments made via a credit card cannot be removed. Payments can be deleted only from SAVED or OUTSTANDING invoices.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
Long paymentId = 789L; // Long | 
try {
    QPApiResponse result = apiInstance.removeInvoicePayment(invoiceId, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#removeInvoicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **paymentId** | **Long**|  |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendInvoice"></a>
# **resendInvoice**
> QPApiResponse resendInvoice(invoiceId, body)

Resend an Invoice

Resends an invoice to the customer. An outstanding or paid invoice can be resent.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
ResendInvoiceRequest body = new ResendInvoiceRequest(); // ResendInvoiceRequest | Email Addresses
try {
    QPApiResponse result = apiInstance.resendInvoice(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#resendInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**ResendInvoiceRequest**](ResendInvoiceRequest.md)| Email Addresses | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendInvoice"></a>
# **sendInvoice**
> InvoiceResponse sendInvoice(invoiceId, body)

Send an Invoice

Sends an invoice to the customer. Sending an invoice changes the status of the invoice to outstanding. Once sent, only the from_contact and business_contact of the invoice can be updated.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
SendInvoiceRequest body = new SendInvoiceRequest(); // SendInvoiceRequest | Email Addresses
try {
    InvoiceResponse result = apiInstance.sendInvoice(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#sendInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**SendInvoiceRequest**](SendInvoiceRequest.md)| Email Addresses | [optional]

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDraftInvoice"></a>
# **updateDraftInvoice**
> InvoiceResponse updateDraftInvoice(invoiceId, body)

Update a Draft Invoice

Updates a draft invoice. Only the fields that need updating can be sent in the request body. If updating JSON object fields, the complete JSON should be sent in the request body. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
UpdateDraftRequest body = new UpdateDraftRequest(); // UpdateDraftRequest | Invoice
try {
    InvoiceResponse result = apiInstance.updateDraftInvoice(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#updateDraftInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**UpdateDraftRequest**](UpdateDraftRequest.md)| Invoice |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInvoicePayment"></a>
# **updateInvoicePayment**
> InvoicePaymentResponse updateInvoicePayment(invoiceId, paymentId, body)

Update an Invoice Payment

Updates an invoice payment. A payment can be updated on a saved or an outstanding invoice. Payments made via credit card using the “Pay Now” button cannot be updated.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
Long paymentId = 789L; // Long | 
InvoicePaymentRequest body = new InvoicePaymentRequest(); // InvoicePaymentRequest | Invoice Payment
try {
    InvoicePaymentResponse result = apiInstance.updateInvoicePayment(invoiceId, paymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#updateInvoicePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **paymentId** | **Long**|  |
 **body** | [**InvoicePaymentRequest**](InvoicePaymentRequest.md)| Invoice Payment |

### Return type

[**InvoicePaymentResponse**](InvoicePaymentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOutstandingInvoice"></a>
# **updateOutstandingInvoice**
> InvoiceResponse updateOutstandingInvoice(invoiceId, body)

Update an Outstanding Invoice

Updates an outstanding invoice. Only the from_contact and business_contact fields can be updated on an outstanding invoice. Only the fields that need updating can be sent in the request body. If updating JSON object fields, the complete JSON should be sent in the request body. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.InvoicingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

InvoicingApi apiInstance = new InvoicingApi();
Long invoiceId = 789L; // Long | 
UpdateOutstandingRequest body = new UpdateOutstandingRequest(); // UpdateOutstandingRequest | Invoice
try {
    InvoiceResponse result = apiInstance.updateOutstandingInvoice(invoiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicingApi#updateOutstandingInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **Long**|  |
 **body** | [**UpdateOutstandingRequest**](UpdateOutstandingRequest.md)| Invoice |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

