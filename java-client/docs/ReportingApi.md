# ReportingApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**browseAusRequests**](ReportingApi.md#browseAusRequests) | **GET** /reporting/aus/detail | Account Updater Detail Report
[**browseAusSummary**](ReportingApi.md#browseAusSummary) | **GET** /reporting/aus/summary | Account Updater Summary Report
[**browseBatches**](ReportingApi.md#browseBatches) | **GET** /reporting/batches | Batch Report
[**browseDeposits**](ReportingApi.md#browseDeposits) | **GET** /reporting/deposits | Deposit Report
[**browseDisputes**](ReportingApi.md#browseDisputes) | **GET** /reporting/disputes | Disputes Report
[**browseStatementDisputeAdjustmentData**](ReportingApi.md#browseStatementDisputeAdjustmentData) | **GET** /reporting/statement-report/disputeAdjustment | Statement Dispute Adjustments Data
[**browseStatementFeeData**](ReportingApi.md#browseStatementFeeData) | **GET** /reporting/statement-report/fees | Statement Fee Data
[**browseStatementPlanData**](ReportingApi.md#browseStatementPlanData) | **GET** /reporting/statement-report/planType | Statement Plan Type Data
[**browseStatementReserveData**](ReportingApi.md#browseStatementReserveData) | **GET** /reporting/statement-report/reserve | Statement Reserve Data
[**browseStatementSettlemetData**](ReportingApi.md#browseStatementSettlemetData) | **GET** /reporting/statement-report/settlement | Statement Settlemet Data
[**browseTrans**](ReportingApi.md#browseTrans) | **GET** /reporting/transactions | Settled Transaction Report
[**getTransactionByPgId**](ReportingApi.md#getTransactionByPgId) | **GET** /reporting/transactions/bypgid/{pg_id} | Get transaction by PG ID
[**getTransactionRequests**](ReportingApi.md#getTransactionRequests) | **GET** /reporting/transaction-requests | Transaction Report


<a name="browseAusRequests"></a>
# **browseAusRequests**
> AccountUpdaterResponse browseAusRequests(count, orderOn, orderBy, page, filter)

Account Updater Detail Report

Browses a paginated list of Account updater requests

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    AccountUpdaterResponse result = apiInstance.browseAusRequests(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseAusRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**AccountUpdaterResponse**](AccountUpdaterResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseAusSummary"></a>
# **browseAusSummary**
> AccountUpdaterSummaryResponse browseAusSummary(count, orderOn, orderBy, page, filter)

Account Updater Summary Report

Browses a paginated list of account updater summary report

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    AccountUpdaterSummaryResponse result = apiInstance.browseAusSummary(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseAusSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**AccountUpdaterSummaryResponse**](AccountUpdaterSummaryResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseBatches"></a>
# **browseBatches**
> BatchResponse browseBatches(count, orderOn, orderBy, page, filter)

Batch Report

Browses a paginated list of merchant batches. These are whole batches which have been settled from the merchant&#39;s POS device, software, or gateway.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    BatchResponse result = apiInstance.browseBatches(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseDeposits"></a>
# **browseDeposits**
> DepositResponse browseDeposits(count, orderOn, orderBy, page, filter)

Deposit Report

Browses a paginated list of bank deposits and withdrawls.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    DepositResponse result = apiInstance.browseDeposits(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseDeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**DepositResponse**](DepositResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseDisputes"></a>
# **browseDisputes**
> DisputeResponse browseDisputes(count, orderOn, orderBy, page, filter)

Disputes Report

Browses a paginated list of disputes.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    DisputeResponse result = apiInstance.browseDisputes(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseDisputes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**DisputeResponse**](DisputeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseStatementDisputeAdjustmentData"></a>
# **browseStatementDisputeAdjustmentData**
> StatementDisputeResponse browseStatementDisputeAdjustmentData(count, orderOn, orderBy, page, filter)

Statement Dispute Adjustments Data

Browses a paginated list of Statement Disputes Adjustment Data

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    StatementDisputeResponse result = apiInstance.browseStatementDisputeAdjustmentData(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseStatementDisputeAdjustmentData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**StatementDisputeResponse**](StatementDisputeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseStatementFeeData"></a>
# **browseStatementFeeData**
> StatementFeeResponse browseStatementFeeData(count, orderOn, orderBy, page, filter)

Statement Fee Data

Browses a paginated list of Statement Fee Data

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    StatementFeeResponse result = apiInstance.browseStatementFeeData(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseStatementFeeData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**StatementFeeResponse**](StatementFeeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseStatementPlanData"></a>
# **browseStatementPlanData**
> StatementPlanResponse browseStatementPlanData(count, orderOn, orderBy, page, filter)

Statement Plan Type Data

Browses a paginated list of Statement Plan Type Summary

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    StatementPlanResponse result = apiInstance.browseStatementPlanData(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseStatementPlanData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**StatementPlanResponse**](StatementPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseStatementReserveData"></a>
# **browseStatementReserveData**
> StatementReserveResponse browseStatementReserveData(count, orderOn, orderBy, page, filter)

Statement Reserve Data

Browses a paginated list of Statement Reserve Data

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    StatementReserveResponse result = apiInstance.browseStatementReserveData(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseStatementReserveData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**StatementReserveResponse**](StatementReserveResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseStatementSettlemetData"></a>
# **browseStatementSettlemetData**
> StatementSettlementResponse browseStatementSettlemetData(count, orderOn, orderBy, page, filter)

Statement Settlemet Data

Browses a paginated list of Statement Settlemet Data

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    StatementSettlementResponse result = apiInstance.browseStatementSettlemetData(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseStatementSettlemetData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**StatementSettlementResponse**](StatementSettlementResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseTrans"></a>
# **browseTrans**
> SettledTransactionResponse browseTrans(count, orderOn, orderBy, page, filter)

Settled Transaction Report

Browses a paginated list of settled transactions. Some additional text about deposits and stuff.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    SettledTransactionResponse result = apiInstance.browseTrans(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#browseTrans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**SettledTransactionResponse**](SettledTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionByPgId"></a>
# **getTransactionByPgId**
> PGTransactionResponse getTransactionByPgId(pgId)

Get transaction by PG ID

Gets a payment gateway transaction by Payment Gateway ID.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
String pgId = "pgId_example"; // String | PG ID
try {
    PGTransactionResponse result = apiInstance.getTransactionByPgId(pgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#getTransactionByPgId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pgId** | **String**| PG ID |

### Return type

[**PGTransactionResponse**](PGTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionRequests"></a>
# **getTransactionRequests**
> TransactionRequestResponse getTransactionRequests(count, orderOn, orderBy, page, filter)

Transaction Report

Browses a paginated list of transaction requests

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ReportingApi apiInstance = new ReportingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    TransactionRequestResponse result = apiInstance.getTransactionRequests(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#getTransactionRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**TransactionRequestResponse**](TransactionRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

