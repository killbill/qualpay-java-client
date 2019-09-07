# DisputeManagementApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptDispute**](DisputeManagementApi.md#acceptDispute) | **GET** /dispute/{recId}/accept | Accept Dispute
[**browseDisputes**](DisputeManagementApi.md#browseDisputes) | **GET** /dispute/browse | Get Disputes
[**createDispute**](DisputeManagementApi.md#createDispute) | **GET** /dispute/{merchantId}/create | Create Dispute Data
[**getCreditedTran**](DisputeManagementApi.md#getCreditedTran) | **GET** /dispute/{recId}/creditedtrans | Get Credited Transaction Detail
[**getDisputeResponse**](DisputeManagementApi.md#getDisputeResponse) | **GET** /dispute/{recId}/response | Get Submitted Dispute Response
[**getNonDisputedTran**](DisputeManagementApi.md#getNonDisputedTran) | **GET** /dispute/{recId}/nondisputedtrans | Get Non Disputed Transaction 
[**resetDispute**](DisputeManagementApi.md#resetDispute) | **GET** /dispute/{recId}/reset | Reset Dispute Data
[**submitDisputesResponse**](DisputeManagementApi.md#submitDisputesResponse) | **POST** /dispute/{recId}/respond | Submit Dispute Response


<a name="acceptDispute"></a>
# **acceptDispute**
> QPApiResponse acceptDispute(recId)

Accept Dispute

Accept first time Chargeback and Pre-Arbitration Withdraw from Arbitration.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
try {
    QPApiResponse result = apiInstance.acceptDispute(recId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#acceptDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseDisputes"></a>
# **browseDisputes**
> DisputeDetail browseDisputes(count, orderOn, orderBy, page, filter)

Get Disputes

Request all disputes and their detail associated with a vendor or a node.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "date_payment"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    DisputeDetail result = apiInstance.browseDisputes(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#browseDisputes");
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

[**DisputeDetail**](DisputeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDispute"></a>
# **createDispute**
> QPApiListResponse createDispute(merchantId, reasonCode)

Create Dispute Data

For testing purposes, create a dispute for a specific reason code or for all the reason codes.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long merchantId = 789L; // Long | Merchant ID
String reasonCode = "null"; // String | Reason Code
try {
    QPApiListResponse result = apiInstance.createDispute(merchantId, reasonCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#createDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **Long**| Merchant ID |
 **reasonCode** | **String**| Reason Code | [optional] [default to null]

### Return type

[**QPApiListResponse**](QPApiListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditedTran"></a>
# **getCreditedTran**
> CorrespondingTransactionResponse getCreditedTran(recId)

Get Credited Transaction Detail

Request the credited transactions associated with dispute.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
try {
    CorrespondingTransactionResponse result = apiInstance.getCreditedTran(recId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#getCreditedTran");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |

### Return type

[**CorrespondingTransactionResponse**](CorrespondingTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDisputeResponse"></a>
# **getDisputeResponse**
> DisputeResponse getDisputeResponse(recId)

Get Submitted Dispute Response

Get previously submitted dispute response.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
try {
    DisputeResponse result = apiInstance.getDisputeResponse(recId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#getDisputeResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |

### Return type

[**DisputeResponse**](DisputeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNonDisputedTran"></a>
# **getNonDisputedTran**
> CorrespondingTransactionResponse getNonDisputedTran(recId)

Get Non Disputed Transaction 

Request the non-disputed transactions associated with with dispute.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
try {
    CorrespondingTransactionResponse result = apiInstance.getNonDisputedTran(recId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#getNonDisputedTran");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |

### Return type

[**CorrespondingTransactionResponse**](CorrespondingTransactionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetDispute"></a>
# **resetDispute**
> QPApiResponse resetDispute(recId)

Reset Dispute Data

For non production enviornment, request to reset a dispute case to new status.For Production, request to reset dispute to new status till a dispute is in Qualpay Review (Status&#x3D;Q).Reset If need to submit different response or want to cancel a rebuttal submitted in error

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
try {
    QPApiResponse result = apiInstance.resetDispute(recId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#resetDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitDisputesResponse"></a>
# **submitDisputesResponse**
> QPApiResponse submitDisputesResponse(recId, file, disputeResponse)

Submit Dispute Response

Submit dispute responses with supporting documentation. Response options are dynamic and are based on the reason code.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.DisputeManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DisputeManagementApi apiInstance = new DisputeManagementApi();
Long recId = 789L; // Long | Control Number
File file = new File("/path/to/file.txt"); // File | The file to upload.
String disputeResponse = "disputeResponse_example"; // String | Dispute response
try {
    QPApiResponse result = apiInstance.submitDisputesResponse(recId, file, disputeResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisputeManagementApi#submitDisputesResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recId** | **Long**| Control Number |
 **file** | **File**| The file to upload. |
 **disputeResponse** | **String**| Dispute response |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

