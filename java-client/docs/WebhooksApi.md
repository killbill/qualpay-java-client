# WebhooksApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEvent**](WebhooksApi.md#addEvent) | **POST** /webhook/{webhook_id}/event/{event} | Add an event
[**addWebhook**](WebhooksApi.md#addWebhook) | **POST** /webhook | Add webhook
[**browseWebhook**](WebhooksApi.md#browseWebhook) | **GET** /webhook | Browse webhooks
[**disableWebhook**](WebhooksApi.md#disableWebhook) | **PUT** /webhook/{webhook_id}/disable | Disable a Webhook
[**editWebhook**](WebhooksApi.md#editWebhook) | **PUT** /webhook/{webhook_id} | Update webhook
[**enableWebhook**](WebhooksApi.md#enableWebhook) | **PUT** /webhook/{webhook_id}/enable | Enable a Webhook
[**getEvents**](WebhooksApi.md#getEvents) | **GET** /webhook/{webhook_id}/event | Get events
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhook/{webhook_id} | Get webhook
[**removeEvent**](WebhooksApi.md#removeEvent) | **DELETE** /webhook/{webhook_id}/event/{event} | Delete event


<a name="addEvent"></a>
# **addEvent**
> QPApiResponse addEvent(webhookId, event, body)

Add an event

Add an event to a webhook. Refer to the Webhook documentation for a list of available events. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
String event = "event_example"; // String | Event
QPApiData body = new QPApiData(); // QPApiData | Webhook
try {
    QPApiResponse result = apiInstance.addEvent(webhookId, event, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#addEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |
 **event** | **String**| Event |
 **body** | [**QPApiData**](QPApiData.md)| Webhook | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addWebhook"></a>
# **addWebhook**
> WebhookResponse addWebhook(body)

Add webhook

Configure a new webhook. Save the webhook_id in the response for use in future requests. Save the generated secret, the secret can be used to validate the webhook. Refer to webhook documentation for secret usage.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Webhook body = new Webhook(); // Webhook | Webhook
try {
    WebhookResponse result = apiInstance.addWebhook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#addWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Webhook**](Webhook.md)| Webhook | [optional]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseWebhook"></a>
# **browseWebhook**
> WebhooksListResponse browseWebhook(count, orderOn, orderBy, page, filter)

Browse webhooks

Gets an array of webhook objects. Optional query parameters determines, size and sort order of returned array. Filters can be used to filter results. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "webhook_id"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "asc"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    WebhooksListResponse result = apiInstance.browseWebhook(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#browseWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| The number of records in the result. | [optional] [default to 10]
 **orderOn** | **String**| The field on which the results will be sorted on. Refer to the response model for available fields. | [optional] [default to webhook_id]
 **orderBy** | **String**| Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order) | [optional] [default to asc]
 **page** | **Integer**| Zero-based page number, use this to choose a page when there are more results than the count parameter. | [optional] [default to 0]
 **filter** | **String**| Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter. | [optional]

### Return type

[**WebhooksListResponse**](WebhooksListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableWebhook"></a>
# **disableWebhook**
> QPApiResponse disableWebhook(webhookId, body)

Disable a Webhook

Disable a webhook. Events will not be triggered on a disabled webhook. When disabled, all active requests for this webhook will be held. If the webhook is enabled before a request expires, Qualpay will attempt to post the request again.  

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
QPApiData body = new QPApiData(); // QPApiData | Webhook
try {
    QPApiResponse result = apiInstance.disableWebhook(webhookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#disableWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |
 **body** | [**QPApiData**](QPApiData.md)| Webhook | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editWebhook"></a>
# **editWebhook**
> QPApiResponse editWebhook(webhookId, body)

Update webhook

Manage a webhook. Once created, the webhook node cannot be modified. Only the fields to be updated can be sent in the request.  When events array is included in the request, all events will be replaced with the events in the request. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
Webhook body = new Webhook(); // Webhook | Webhook
try {
    QPApiResponse result = apiInstance.editWebhook(webhookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#editWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |
 **body** | [**Webhook**](Webhook.md)| Webhook | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableWebhook"></a>
# **enableWebhook**
> QPApiResponse enableWebhook(webhookId, body)

Enable a Webhook

Enable a webhook. Events are triggered and requests are posted only for active webhooks. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
QPApiData body = new QPApiData(); // QPApiData | Webhook
try {
    QPApiResponse result = apiInstance.enableWebhook(webhookId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#enableWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |
 **body** | [**QPApiData**](QPApiData.md)| Webhook | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> WebhookEventResponse getEvents(webhookId)

Get events

Get all events for a webhook. Refer to the Webhook documentation for a list of available events. 

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
try {
    WebhookEventResponse result = apiInstance.getEvents(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |

### Return type

[**WebhookEventResponse**](WebhookEventResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(webhookId)

Get webhook

Gets a webhook.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
try {
    WebhookResponse result = apiInstance.getWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeEvent"></a>
# **removeEvent**
> QPApiResponse removeEvent(webhookId, event)

Delete event

Delete an event from a webhook. Refer to the Webhook documentation for a list of available events.  

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebhooksApi apiInstance = new WebhooksApi();
Long webhookId = 789L; // Long | Webhook ID
String event = "event_example"; // String | Event
try {
    QPApiResponse result = apiInstance.removeEvent(webhookId, event);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#removeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **Long**| Webhook ID |
 **event** | **String**| Event |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

