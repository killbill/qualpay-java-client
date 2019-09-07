# QualpayCheckoutApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCheckout**](QualpayCheckoutApi.md#addCheckout) | **POST** /checkout | Create a Checkout Payment Link
[**getDetails**](QualpayCheckoutApi.md#getDetails) | **GET** /checkout/{checkoutId} | Lookup Checkout Payment


<a name="addCheckout"></a>
# **addCheckout**
> CheckoutLinkResponse addCheckout(body)

Create a Checkout Payment Link

Creates a new checkout object which contains a payment link, through which checkout payments can be made. This operation generates a unique checkout_id, that can be used to query the status of a checkout payment using the Lookup Checkout Payment API.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.QualpayCheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QualpayCheckoutApi apiInstance = new QualpayCheckoutApi();
CheckoutRequest body = new CheckoutRequest(); // CheckoutRequest | Checkout Resource
try {
    CheckoutLinkResponse result = apiInstance.addCheckout(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualpayCheckoutApi#addCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckoutRequest**](CheckoutRequest.md)| Checkout Resource |

### Return type

[**CheckoutLinkResponse**](CheckoutLinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDetails"></a>
# **getDetails**
> CheckoutResponse getDetails(checkoutId)

Lookup Checkout Payment

Queries the status of a payment made through Qualpay Hosted Checkout. The operation returns a checkout object which contains information about the transaction.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.QualpayCheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QualpayCheckoutApi apiInstance = new QualpayCheckoutApi();
String checkoutId = "checkoutId_example"; // String | Checkout ID
try {
    CheckoutResponse result = apiInstance.getDetails(checkoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualpayCheckoutApi#getDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutId** | **String**| Checkout ID |

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

