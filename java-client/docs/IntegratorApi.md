# IntegratorApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTestAccount**](IntegratorApi.md#createTestAccount) | **POST** /vendor/settings/account/add | Generate Test Account
[**getMerchantSettings**](IntegratorApi.md#getMerchantSettings) | **GET** /vendor/settings/{mid} | Merchant Settings
[**rotateApiKey**](IntegratorApi.md#rotateApiKey) | **POST** /vendor/settings/key/{mid} | Generate Security Key


<a name="createTestAccount"></a>
# **createTestAccount**
> MerchantSettingsResponse createTestAccount(body)

Generate Test Account

Generates a new test merchant account.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.IntegratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegratorApi apiInstance = new IntegratorApi();
NewAccountRequest body = new NewAccountRequest(); // NewAccountRequest | NewAccount
try {
    MerchantSettingsResponse result = apiInstance.createTestAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegratorApi#createTestAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAccountRequest**](NewAccountRequest.md)| NewAccount | [optional]

### Return type

[**MerchantSettingsResponse**](MerchantSettingsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantSettings"></a>
# **getMerchantSettings**
> MerchantSettingsResponse getMerchantSettings(mid)

Merchant Settings

Request the card types and currencies supported by the requested merchant ID.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.IntegratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegratorApi apiInstance = new IntegratorApi();
Long mid = 789L; // Long | Merchant ID
try {
    MerchantSettingsResponse result = apiInstance.getMerchantSettings(mid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegratorApi#getMerchantSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mid** | **Long**| Merchant ID |

### Return type

[**MerchantSettingsResponse**](MerchantSettingsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rotateApiKey"></a>
# **rotateApiKey**
> RotateKeyResponse rotateApiKey(mid, body)

Generate Security Key

Generates an API key for the specified merchant account.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.IntegratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IntegratorApi apiInstance = new IntegratorApi();
Long mid = 789L; // Long | Merchant ID
RotateKeyRequest body = new RotateKeyRequest(); // RotateKeyRequest | Data
try {
    RotateKeyResponse result = apiInstance.rotateApiKey(mid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegratorApi#rotateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mid** | **Long**| Merchant ID |
 **body** | [**RotateKeyRequest**](RotateKeyRequest.md)| Data |

### Return type

[**RotateKeyResponse**](RotateKeyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

