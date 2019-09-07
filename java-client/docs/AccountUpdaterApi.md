# AccountUpdaterApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAusFileRequest**](AccountUpdaterApi.md#addAusFileRequest) | **POST** /aus/add/file | Submit AUS CSV File Request
[**addAusJsonRequest**](AccountUpdaterApi.md#addAusJsonRequest) | **POST** /aus/add | Submit AUS Request
[**getAusResponse**](AccountUpdaterApi.md#getAusResponse) | **GET** /aus/{requestId} | Get AUS Response
[**putOnAusHold**](AccountUpdaterApi.md#putOnAusHold) | **POST** /aus/hold | Put on Account Updater Harvest Hold
[**releaseFromAusHold**](AccountUpdaterApi.md#releaseFromAusHold) | **POST** /aus/release | Release from Account Updater Harvest Hold


<a name="addAusFileRequest"></a>
# **addAusFileRequest**
> AusRequestResponse addAusFileRequest(file)

Submit AUS CSV File Request

Submit an Account Updater request using full card number and expiration date using csv file

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.AccountUpdaterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountUpdaterApi apiInstance = new AccountUpdaterApi();
File file = new File("/path/to/file.txt"); // File | The file to upload.
try {
    AusRequestResponse result = apiInstance.addAusFileRequest(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountUpdaterApi#addAusFileRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The file to upload. |

### Return type

[**AusRequestResponse**](AusRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="addAusJsonRequest"></a>
# **addAusJsonRequest**
> AusRequestResponse addAusJsonRequest(body)

Submit AUS Request

Submit an Account Updater request using full card number and expiration date.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.AccountUpdaterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountUpdaterApi apiInstance = new AccountUpdaterApi();
AusRequest body = new AusRequest(); // AusRequest | aus request
try {
    AusRequestResponse result = apiInstance.addAusJsonRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountUpdaterApi#addAusJsonRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AusRequest**](AusRequest.md)| aus request |

### Return type

[**AusRequestResponse**](AusRequestResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAusResponse"></a>
# **getAusResponse**
> AusUpdatedResponse getAusResponse(requestId)

Get AUS Response

Get updated AUS response using requestId

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.AccountUpdaterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountUpdaterApi apiInstance = new AccountUpdaterApi();
Long requestId = 789L; // Long | Request ID
try {
    AusUpdatedResponse result = apiInstance.getAusResponse(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountUpdaterApi#getAusResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **Long**| Request ID |

### Return type

[**AusUpdatedResponse**](AusUpdatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOnAusHold"></a>
# **putOnAusHold**
> QPApiResponse putOnAusHold(body)

Put on Account Updater Harvest Hold

Put a card id or all payment cards belonging to a customer on Account updater harvest hold. Account updater service cannot process ACH payments or non U.S. issued cards. Account updater service cannot process ACH payments or foreign issued cards, hence this request is applicable to only U.S. issued credit cards. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.AccountUpdaterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountUpdaterApi apiInstance = new AccountUpdaterApi();
AusHoldRequest body = new AusHoldRequest(); // AusHoldRequest | AusOnHold
try {
    QPApiResponse result = apiInstance.putOnAusHold(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountUpdaterApi#putOnAusHold");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AusHoldRequest**](AusHoldRequest.md)| AusOnHold |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="releaseFromAusHold"></a>
# **releaseFromAusHold**
> QPApiResponse releaseFromAusHold(body)

Release from Account Updater Harvest Hold

Release a card id or all payment methods belonging to a customer from Account updater harvest hold. Account updater service cannot process ACH payments or non U.S. issued cards, hence this request is applicable to only U.S. issued credit cards.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.AccountUpdaterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountUpdaterApi apiInstance = new AccountUpdaterApi();
AusReleaseRequest body = new AusReleaseRequest(); // AusReleaseRequest | AusRelease
try {
    QPApiResponse result = apiInstance.releaseFromAusHold(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountUpdaterApi#releaseFromAusHold");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AusReleaseRequest**](AusReleaseRequest.md)| AusRelease |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

