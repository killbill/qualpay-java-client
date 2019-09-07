# RecurringBillingApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlan**](RecurringBillingApi.md#addPlan) | **POST** /plan | Add a Recurring Plan
[**addSubscription**](RecurringBillingApi.md#addSubscription) | **POST** /subscription | Add a Subscription
[**archivePlan**](RecurringBillingApi.md#archivePlan) | **POST** /plan/{plan_code}/archive | Archive a Recurring Plan
[**browsePlans**](RecurringBillingApi.md#browsePlans) | **GET** /plan | Get all Recurring Plans
[**browseSubscriptions**](RecurringBillingApi.md#browseSubscriptions) | **GET** /subscription | Get all Subscriptions
[**cancelSubscription**](RecurringBillingApi.md#cancelSubscription) | **POST** /subscription/{subscription_id}/cancel | Cancel a Subscription
[**deletePlan**](RecurringBillingApi.md#deletePlan) | **DELETE** /plan/{plan_id}/delete | Delete a Recurring Plan
[**getAllSubscriptionTransactions**](RecurringBillingApi.md#getAllSubscriptionTransactions) | **GET** /subscription/transactions | Get all subscription transactions
[**getPlan**](RecurringBillingApi.md#getPlan) | **GET** /plan/{plan_code} | Find Recurring Plan by Plan Code
[**getSubscription**](RecurringBillingApi.md#getSubscription) | **GET** /subscription/{subscription_id} | Get Subscription by Subscription ID
[**getSubscriptionTransactions**](RecurringBillingApi.md#getSubscriptionTransactions) | **GET** /subscription/transactions/{subscription_id} | Get transactions by Subscription ID
[**pauseSubscription**](RecurringBillingApi.md#pauseSubscription) | **POST** /subscription/{subscription_id}/pause | Pause a Subscription
[**resumeSubscription**](RecurringBillingApi.md#resumeSubscription) | **POST** /subscription/{subscription_id}/resume | Resume a Subscription
[**updatePlan**](RecurringBillingApi.md#updatePlan) | **PUT** /plan/{plan_code} | Update a Recurring Plan
[**updateSubscription**](RecurringBillingApi.md#updateSubscription) | **PUT** /subscription/{subscription_id} | Update a Subscription


<a name="addPlan"></a>
# **addPlan**
> RecurringPlanResponse addPlan(body)

Add a Recurring Plan

Adds a new Recurring Plan. Save the generated unique plan_id, which is required to delete a plan. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
AddRecurringPlanRequest body = new AddRecurringPlanRequest(); // AddRecurringPlanRequest | Recurring Plan Object that needs to be added
try {
    RecurringPlanResponse result = apiInstance.addPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#addPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddRecurringPlanRequest**](AddRecurringPlanRequest.md)| Recurring Plan Object that needs to be added |

### Return type

[**RecurringPlanResponse**](RecurringPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSubscription"></a>
# **addSubscription**
> SubscriptionResponse addSubscription(body)

Add a Subscription

Creates a new subscription on the specified start date. Returns the subscription_id; save this id to interact with this subscription using the API. When a subscription is added, with a one-time fee, a payment gateway sale request is  made immediately to bill the customer the one-time fee. Check the response in the return model to check the status of the payment gateway request. Note that the subscription remains active even if the payment gateway request for the one-time fee fails. An “off plan” subscription, a subscription without a plan, can be created by excluding the plan_code from your request and sending applicable fields

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
AddSubscriptionRequest body = new AddSubscriptionRequest(); // AddSubscriptionRequest | Subscription Request
try {
    SubscriptionResponse result = apiInstance.addSubscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#addSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddSubscriptionRequest**](AddSubscriptionRequest.md)| Subscription Request | [optional]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="archivePlan"></a>
# **archivePlan**
> RecurringPlanResponse archivePlan(planCode, body)

Archive a Recurring Plan

Archives a Plan. Only active plans can be archived. Note that if there are subscribers to this plan, then all subscriptions belonging to this plan will continue to be active. No updates can be made to an archived plan. New subscribers cannot be added to a archived plan. You can always pull up information on an archived plan from the system. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
String planCode = "planCode_example"; // String | Plan Code that will be archived
ArchiveRecurringPlanRequest body = new ArchiveRecurringPlanRequest(); // ArchiveRecurringPlanRequest | Plan Name
try {
    RecurringPlanResponse result = apiInstance.archivePlan(planCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#archivePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planCode** | **String**| Plan Code that will be archived |
 **body** | [**ArchiveRecurringPlanRequest**](ArchiveRecurringPlanRequest.md)| Plan Name | [optional]

### Return type

[**RecurringPlanResponse**](RecurringPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browsePlans"></a>
# **browsePlans**
> RecurringPlanListResponse browsePlans(count, orderOn, orderBy, page, filter, merchantId)

Get all Recurring Plans

Gets a paginated list of recurring plans. Optional query parameters determines, size and sort order of returned array

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "plan_code"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "asc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    RecurringPlanListResponse result = apiInstance.browsePlans(count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#browsePlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to plan_code]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to asc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**RecurringPlanListResponse**](RecurringPlanListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseSubscriptions"></a>
# **browseSubscriptions**
> SubscriptionListResponse browseSubscriptions(count, orderOn, orderBy, page, filter, merchantId)

Get all Subscriptions

Gets an array of subscription objects. Optional query parameters determines, size and sort order of returned array

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "date_next"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    SubscriptionListResponse result = apiInstance.browseSubscriptions(count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#browseSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to date_next]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**SubscriptionListResponse**](SubscriptionListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelSubscription"></a>
# **cancelSubscription**
> SubscriptionResponse cancelSubscription(subscriptionId, body)

Cancel a Subscription

Cancels a subscription. Only active, suspended or paused subscriptions can be cancelled. A cancelled subscription cannot be resumed. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | Subscription ID
CancelSubscriptionRequest body = new CancelSubscriptionRequest(); // CancelSubscriptionRequest | Customer ID
try {
    SubscriptionResponse result = apiInstance.cancelSubscription(subscriptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#cancelSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**| Subscription ID |
 **body** | [**CancelSubscriptionRequest**](CancelSubscriptionRequest.md)| Customer ID |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePlan"></a>
# **deletePlan**
> RecurringPlanResponse deletePlan(planId, merchantId)

Delete a Recurring Plan

Deletes a Plan. Any plan, active or not can be deleted. If there are subscribers to the plan, then all subscriptions related to this plan will be cancelled. A deleted plan cannot be updated, neither can new subscrbers be added to a deleted plan. Even if a plan is deleted, you can query the system to get information about the deleted plan. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long planId = 789L; // Long | Plan ID that will flagged as deleted
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    RecurringPlanResponse result = apiInstance.deletePlan(planId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#deletePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **Long**| Plan ID that will flagged as deleted |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**RecurringPlanResponse**](RecurringPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllSubscriptionTransactions"></a>
# **getAllSubscriptionTransactions**
> TransactionListResponse getAllSubscriptionTransactions(count, orderOn, orderBy, page, filter, merchantId)

Get all subscription transactions

Gets all subscription transactions. Optional Parameters will help filter and restrict the result. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    TransactionListResponse result = apiInstance.getAllSubscriptionTransactions(count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#getAllSubscriptionTransactions");
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
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**TransactionListResponse**](TransactionListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlan"></a>
# **getPlan**
> RecurringPlanListResponse getPlan(planCode, count, orderOn, orderBy, page, filter, merchantId)

Find Recurring Plan by Plan Code

Returns a list of recurring plans for the plan_code. Search result includes active, archived and deleted plans. Optional query parameters determines, size and sort order of returned array

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
String planCode = "planCode_example"; // String | Plan Code
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "plan_code"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "asc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    RecurringPlanListResponse result = apiInstance.getPlan(planCode, count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#getPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planCode** | **String**| Plan Code |
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to plan_code]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to asc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**RecurringPlanListResponse**](RecurringPlanListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscription"></a>
# **getSubscription**
> SubscriptionResponse getSubscription(subscriptionId, merchantId)

Get Subscription by Subscription ID

Gets details of a subscription.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | Subscription ID
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    SubscriptionResponse result = apiInstance.getSubscription(subscriptionId, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**| Subscription ID |
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscriptionTransactions"></a>
# **getSubscriptionTransactions**
> TransactionListResponse getSubscriptionTransactions(subscriptionId, count, orderOn, orderBy, page, filter, merchantId)

Get transactions by Subscription ID

Gets all transactions for a subscription. Optional parameters will help filter and restrict the result. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | Subscription ID
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "tran_time"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "desc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
Long merchantId = 0L; // Long | Unique ID assigned by Qualpay to a merchant.
try {
    TransactionListResponse result = apiInstance.getSubscriptionTransactions(subscriptionId, count, orderOn, orderBy, page, filter, merchantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#getSubscriptionTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**| Subscription ID |
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to tran_time]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to desc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]
 **merchantId** | **Long**| Unique ID assigned by Qualpay to a merchant. | [optional] [default to 0]

### Return type

[**TransactionListResponse**](TransactionListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pauseSubscription"></a>
# **pauseSubscription**
> SubscriptionResponse pauseSubscription(subscriptionId, body)

Pause a Subscription

Pauses an active subscription. Recurring payments will be skipped when a subscription is paused. Only active subscriptions can be paused. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | 
PauseSubscriptionRequest body = new PauseSubscriptionRequest(); // PauseSubscriptionRequest | Customer ID
try {
    SubscriptionResponse result = apiInstance.pauseSubscription(subscriptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#pauseSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**|  |
 **body** | [**PauseSubscriptionRequest**](PauseSubscriptionRequest.md)| Customer ID |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resumeSubscription"></a>
# **resumeSubscription**
> SubscriptionResponse resumeSubscription(subscriptionId, body)

Resume a Subscription

Resumes a suspended or paused subscription. When a suspended subscription is resumed, Qualpay’s subscription engine will initiate all the missed subscription transactions. When a paused subscription is resumed, all missed payments are skipped. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | 
ResumeSubscriptionRequest body = new ResumeSubscriptionRequest(); // ResumeSubscriptionRequest | Customer ID
try {
    SubscriptionResponse result = apiInstance.resumeSubscription(subscriptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#resumeSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**|  |
 **body** | [**ResumeSubscriptionRequest**](ResumeSubscriptionRequest.md)| Customer ID |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePlan"></a>
# **updatePlan**
> RecurringPlanResponse updatePlan(planCode, body)

Update a Recurring Plan

Update an active recurring plan. Only the fields sent in the request body will be updated. Only an active plan can be updated. If there are subscribers to this plan, then this plan will be archived and a copy of the plan with a new plan_id will be generated. All updates will be made on the new plan. Save the new plan_id to manage a plan

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
String planCode = "planCode_example"; // String | Plan Code of the plan that will be updated
UpdateRecurringPlanRequest body = new UpdateRecurringPlanRequest(); // UpdateRecurringPlanRequest | Recurring Plan Object. Send only the fields that require an update. Read only fields will be ignored
try {
    RecurringPlanResponse result = apiInstance.updatePlan(planCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#updatePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planCode** | **String**| Plan Code of the plan that will be updated |
 **body** | [**UpdateRecurringPlanRequest**](UpdateRecurringPlanRequest.md)| Recurring Plan Object. Send only the fields that require an update. Read only fields will be ignored |

### Return type

[**RecurringPlanResponse**](RecurringPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSubscription"></a>
# **updateSubscription**
> SubscriptionResponse updateSubscription(subscriptionId, body)

Update a Subscription

Updates the start date of an existing subscription. Only subscriptions that has not yet started can be updated. Only start date can be updated. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.RecurringBillingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RecurringBillingApi apiInstance = new RecurringBillingApi();
Long subscriptionId = 789L; // Long | 
UpdateSubscriptionRequest body = new UpdateSubscriptionRequest(); // UpdateSubscriptionRequest | Subscription Request
try {
    SubscriptionResponse result = apiInstance.updateSubscription(subscriptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringBillingApi#updateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**|  |
 **body** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md)| Subscription Request |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

