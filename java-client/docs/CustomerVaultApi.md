# CustomerVaultApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillingCard**](CustomerVaultApi.md#addBillingCard) | **POST** /vault/customer/{customer_id}/billing | Add a Payment Method
[**addCustomer**](CustomerVaultApi.md#addCustomer) | **POST** /vault/customer | Add a Customer
[**addShippingAddress**](CustomerVaultApi.md#addShippingAddress) | **POST** /vault/customer/{customer_id}/shipping | Add a Shipping Address
[**browseCustomers**](CustomerVaultApi.md#browseCustomers) | **GET** /vault/customer | Get all Customers
[**deleteBillingCard**](CustomerVaultApi.md#deleteBillingCard) | **PUT** /vault/customer/{customer_id}/billing/delete | Delete a Payment Method
[**deleteCustomer**](CustomerVaultApi.md#deleteCustomer) | **DELETE** /vault/customer/{customer_id} | Delete a Customer
[**deleteShippingAddress**](CustomerVaultApi.md#deleteShippingAddress) | **DELETE** /vault/customer/{customer_id}/shipping/{id} | Delete a Shipping Address
[**getBillingCards**](CustomerVaultApi.md#getBillingCards) | **GET** /vault/customer/{customer_id}/billing | Get Payment Methods
[**getCustomer**](CustomerVaultApi.md#getCustomer) | **GET** /vault/customer/{customer_id} | Get by Customer ID
[**getShippingAddresses**](CustomerVaultApi.md#getShippingAddresses) | **GET** /vault/customer/{customer_id}/shipping | Get Shipping Addresses
[**setPrimaryBillingCard**](CustomerVaultApi.md#setPrimaryBillingCard) | **PUT** /vault/customer/{customer_id}/billing/primary | Set Primary Payment Method
[**setPrimaryShippingAddress**](CustomerVaultApi.md#setPrimaryShippingAddress) | **PUT** /vault/customer/{customer_id}/shipping/primary | Set Primary Shipping Address
[**updateBillingCard**](CustomerVaultApi.md#updateBillingCard) | **PUT** /vault/customer/{customer_id}/billing | Update a Payment Method
[**updateCustomer**](CustomerVaultApi.md#updateCustomer) | **PUT** /vault/customer/{customer_id} | Update a Customer
[**updateShippingAddress**](CustomerVaultApi.md#updateShippingAddress) | **PUT** /vault/customer/{customer_id}/shipping | Update a Shipping Address


<a name="addBillingCard"></a>
# **addBillingCard**
> CustomerResponse addBillingCard(customerId, body)

Add a Payment Method

Tokenizes and adds a payment method to a customer record. The response will include the tokenized card_number in the field, card_id, which can be used to manage the card and can be used in place of the card_number in Payment Gateway API requests. There is no limit on the number of payment methods you can add to a customer. The first payment method added will be designated as the primary payment method, used for subscription payments. You can use the Set Primary Payment Method API to change the default payment method.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
AddBillingCardRequest body = new AddBillingCardRequest(); // AddBillingCardRequest | Customer
try {
    CustomerResponse result = apiInstance.addBillingCard(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#addBillingCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**AddBillingCardRequest**](AddBillingCardRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addCustomer"></a>
# **addCustomer**
> CustomerResponse addCustomer(body)

Add a Customer

Adds a customer to the Qualpay Customer Vault. A customer_id is required to create invoice and subscription payments. Payment methods, billing addresses and shipping addresses may be included in this request.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
AddCustomerRequest body = new AddCustomerRequest(); // AddCustomerRequest | Customer
try {
    CustomerResponse result = apiInstance.addCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#addCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddCustomerRequest**](AddCustomerRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addShippingAddress"></a>
# **addShippingAddress**
> CustomerResponse addShippingAddress(customerId, body)

Add a Shipping Address

Adds a shipping address to a customer. The response will include a unique shipping_id. The shipping_id can be used to manage the shipping_address.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Shipping Address
AddShippingAddressRequest body = new AddShippingAddressRequest(); // AddShippingAddressRequest | Shipping Address
try {
    CustomerResponse result = apiInstance.addShippingAddress(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#addShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Shipping Address |
 **body** | [**AddShippingAddressRequest**](AddShippingAddressRequest.md)| Shipping Address |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseCustomers"></a>
# **browseCustomers**
> CustomerListResponse browseCustomers(count, orderOn, orderBy, page, filter, merchantId)

Get all Customers

Gets an array of customer vault objects. You can use filters to limit the results returned. Optional query parameters determine size and sort order of the returned array.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "customer_id"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    CustomerListResponse result = apiInstance.browseCustomers(count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#browseCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to customer_id]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**CustomerListResponse**](CustomerListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBillingCard"></a>
# **deleteBillingCard**
> CustomerResponse deleteBillingCard(customerId, body)

Delete a Payment Method

Deletes a customer&#39;s specific payment method based on the card_id provided in the request. The card_id is required in the request body to delete the payment method. A payment method with active subscriptions cannot be deleted. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
DeleteBillingCardRequest body = new DeleteBillingCardRequest(); // DeleteBillingCardRequest | Customer
try {
    CustomerResponse result = apiInstance.deleteBillingCard(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#deleteBillingCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**DeleteBillingCardRequest**](DeleteBillingCardRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomer"></a>
# **deleteCustomer**
> QPApiResponse deleteCustomer(customerId, merchantId)

Delete a Customer

Deletes a customer from the customer vault. Deleting a customer will delete all the subscriptions associated with the customer. **This operation cannot be reversed.**

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    QPApiResponse result = apiInstance.deleteCustomer(customerId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteShippingAddress"></a>
# **deleteShippingAddress**
> CustomerResponse deleteShippingAddress(customerId, id, merchantId)

Delete a Shipping Address

Deletes a customer&#39;s specific shipping address based on the shipping_id provided in the request.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
Long id = 789L; // Long | Shipping ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    CustomerResponse result = apiInstance.deleteShippingAddress(customerId, id, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#deleteShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **id** | **Long**| Shipping ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBillingCards"></a>
# **getBillingCards**
> GetBillingResponse getBillingCards(customerId, merchantId)

Get Payment Methods

Gets a list of payment methods associated with a customer_id. The response will contain an array of billing_cards.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    GetBillingResponse result = apiInstance.getBillingCards(customerId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#getBillingCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**GetBillingResponse**](GetBillingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> CustomerResponse getCustomer(customerId, merchantId)

Get by Customer ID

Gets a customer vault record by customer_id.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    CustomerResponse result = apiInstance.getCustomer(customerId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShippingAddresses"></a>
# **getShippingAddresses**
> GetShippingResponse getShippingAddresses(customerId, merchantId)

Get Shipping Addresses

Gets all shipping addresses for a customer. The response will include an array of shipping addresses. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    GetShippingResponse result = apiInstance.getShippingAddresses(customerId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#getShippingAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**GetShippingResponse**](GetShippingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPrimaryBillingCard"></a>
# **setPrimaryBillingCard**
> CustomerResponse setPrimaryBillingCard(customerId, body)

Set Primary Payment Method

Sets a customer&#39;s specific payment method as the primary payment method. A primary payment method is used for subscription payments.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
SetPrimaryBillingCardRequest body = new SetPrimaryBillingCardRequest(); // SetPrimaryBillingCardRequest | Customer
try {
    CustomerResponse result = apiInstance.setPrimaryBillingCard(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#setPrimaryBillingCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**SetPrimaryBillingCardRequest**](SetPrimaryBillingCardRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPrimaryShippingAddress"></a>
# **setPrimaryShippingAddress**
> CustomerResponse setPrimaryShippingAddress(customerId, body)

Set Primary Shipping Address

Sets a customer&#39;s specific shipping address as primary.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
SetPrimaryShippingAddressRequest body = new SetPrimaryShippingAddressRequest(); // SetPrimaryShippingAddressRequest | Shipping Address
try {
    CustomerResponse result = apiInstance.setPrimaryShippingAddress(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#setPrimaryShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**SetPrimaryShippingAddressRequest**](SetPrimaryShippingAddressRequest.md)| Shipping Address |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBillingCard"></a>
# **updateBillingCard**
> CustomerResponse updateBillingCard(customerId, body)

Update a Payment Method

Updates a customer&#39;s payment method by card_id. The complete billing record should be included in the request.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
UpdateBillingCardRequest body = new UpdateBillingCardRequest(); // UpdateBillingCardRequest | Customer
try {
    CustomerResponse result = apiInstance.updateBillingCard(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#updateBillingCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**UpdateBillingCardRequest**](UpdateBillingCardRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> CustomerResponse updateCustomer(customerId, body)

Update a Customer

Updates a customer vault record. You can send the entire resource or only the fields that require an update. When updating array fields - billing_cards or shipping_addresses - the entire array should be included in the request body. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Customer ID
UpdateCustomerRequest body = new UpdateCustomerRequest(); // UpdateCustomerRequest | Customer
try {
    CustomerResponse result = apiInstance.updateCustomer(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Customer ID |
 **body** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)| Customer |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateShippingAddress"></a>
# **updateShippingAddress**
> CustomerResponse updateShippingAddress(customerId, body)

Update a Shipping Address

Update a shipping address for a customer.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.CustomerVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CustomerVaultApi apiInstance = new CustomerVaultApi();
String customerId = "customerId_example"; // String | Shipping Address
UpdateShippingAddressRequest body = new UpdateShippingAddressRequest(); // UpdateShippingAddressRequest | Shipping Address
try {
    CustomerResponse result = apiInstance.updateShippingAddress(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerVaultApi#updateShippingAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Shipping Address |
 **body** | [**UpdateShippingAddressRequest**](UpdateShippingAddressRequest.md)| Shipping Address |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

