# EmbeddedFieldsApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmbeddedTransientKey**](EmbeddedFieldsApi.md#getEmbeddedTransientKey) | **GET** /embedded | Get Transient Key


<a name="getEmbeddedTransientKey"></a>
# **getEmbeddedTransientKey**
> EmbeddedKeyResponse getEmbeddedTransientKey()

Get Transient Key

Gets a transient key for use with Qualpay Embedded Fields. This key will be invalidated in 12 hours or when a card is successfully verified using Embedded Fields. The transient key is a one time key that is used to invoke Embedded Fields.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.EmbeddedFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EmbeddedFieldsApi apiInstance = new EmbeddedFieldsApi();
try {
    EmbeddedKeyResponse result = apiInstance.getEmbeddedTransientKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedFieldsApi#getEmbeddedTransientKey");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmbeddedKeyResponse**](EmbeddedKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

