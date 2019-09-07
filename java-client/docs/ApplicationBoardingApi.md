# ApplicationBoardingApi

All URIs are relative to *https://api-test.qualpay.com/platform*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApp**](ApplicationBoardingApi.md#addApp) | **POST** /application/add | Create Application
[**browseApps**](ApplicationBoardingApi.md#browseApps) | **GET** /application/browse | Browse applications
[**browseSalesReps**](ApplicationBoardingApi.md#browseSalesReps) | **GET** /application/sales/browse | Browse Sales Reps
[**emailApp**](ApplicationBoardingApi.md#emailApp) | **POST** /application/{appId}/email | Email Application
[**getApp**](ApplicationBoardingApi.md#getApp) | **GET** /application/{appId}/get | Get Application
[**saveData**](ApplicationBoardingApi.md#saveData) | **POST** /application/{appId}/data | Save Data
[**uploadFile**](ApplicationBoardingApi.md#uploadFile) | **POST** /application/{appId}/upload | Upload Document
[**validateApp**](ApplicationBoardingApi.md#validateApp) | **GET** /application/{appId}/validate | Validate Application


<a name="addApp"></a>
# **addApp**
> GetAppResult addApp(body)

Create Application

Creates a new merchant application, returning the new application&#39;s ID as well as the pricing options available.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
AddAppRequest body = new AddAppRequest(); // AddAppRequest | Application Request
try {
    GetAppResult result = apiInstance.addApp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#addApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddAppRequest**](AddAppRequest.md)| Application Request | [optional]

### Return type

[**GetAppResult**](GetAppResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseApps"></a>
# **browseApps**
> BrowseAppsResult browseApps(count, orderOn, orderBy, page, filter)

Browse applications

Retrieves an array of Applications. Optional query parameters determine the page size and sorting of the data.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    BrowseAppsResult result = apiInstance.browseApps(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#browseApps");
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

[**BrowseAppsResult**](BrowseAppsResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseSalesReps"></a>
# **browseSalesReps**
> BrowseSalesRepsResult browseSalesReps(count, orderOn, orderBy, page, filter)

Browse Sales Reps

Retrieves an array of Users who can be used during the creation of an application to identify the sales representitive. Optional query parameters determine the page size and sorting of the data.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Integer count = 10; // Integer | The number of records in the result.
String orderOn = "orderOn_example"; // String | The field on which the results will be sorted on. Refer to the response model for available fields.
String orderBy = "orderBy_example"; // String | Ascending or Descending Sort order of the result. Possible values are: asc (Ascending sort order), desc (Descending sort order)
Integer page = 0; // Integer | Zero-based page number, use this to choose a page when there are more results than the count parameter.
String filter = "filter_example"; // String | Results can be filtered by custom filter criteria. Refer to [Filter](/developer/api/reference#filters) to use the filter parameter.
try {
    BrowseSalesRepsResult result = apiInstance.browseSalesReps(count, orderOn, orderBy, page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#browseSalesReps");
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

[**BrowseSalesRepsResult**](BrowseSalesRepsResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailApp"></a>
# **emailApp**
> QPApiResponse emailApp(appId)

Email Application

Emails an application to the business contact for click-through agreement. The business_contact_email must be pre-populated before calling this service.  If present, the business_contact_name will be used to adress the recipient in the email.  An application otherwise does not have to pass validation in order to be emailed.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Long appId = 789L; // Long | Application ID
try {
    QPApiResponse result = apiInstance.emailApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#emailApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| Application ID |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApp"></a>
# **getApp**
> GetAppResult getApp(appId)

Get Application

Retrieve an application&#39;s details and available pricing.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Long appId = 789L; // Long | Application ID
try {
    GetAppResult result = apiInstance.getApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#getApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| Application ID |

### Return type

[**GetAppResult**](GetAppResult.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveData"></a>
# **saveData**
> QPApiResponse saveData(appId, body)

Save Data

Saves one or more data fields to a new merchant application.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Long appId = 789L; // Long | Application ID
SaveDataRequest body = new SaveDataRequest(); // SaveDataRequest | Application Request
try {
    QPApiResponse result = apiInstance.saveData(appId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#saveData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| Application ID |
 **body** | [**SaveDataRequest**](SaveDataRequest.md)| Application Request | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> QPApiResponse uploadFile(appId, file, bucket, label)

Upload Document

Uploads a document relevant to this application to the provided bucket.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Long appId = 789L; // Long | Application ID
File file = new File("/path/to/file.txt"); // File | The file to upload.
String bucket = "bucket_example"; // String | The bucket to upload the file into.
String label = "label_example"; // String | An optional label to apply to the file.
try {
    QPApiResponse result = apiInstance.uploadFile(appId, file, bucket, label);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| Application ID |
 **file** | **File**| The file to upload. |
 **bucket** | **String**| The bucket to upload the file into. |
 **label** | **String**| An optional label to apply to the file. | [optional]

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="validateApp"></a>
# **validateApp**
> QPApiResponse validateApp(appId)

Validate Application

All data fields in an application are validated, including dependencies they may have between eachother. An application can not be submitted until it passes validation.

### Example
```java
// Import classes:
//import qpPlatform.ApiClient;
//import qpPlatform.ApiException;
//import qpPlatform.Configuration;
//import qpPlatform.auth.*;
//import io.swagger.client.api.ApplicationBoardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ApplicationBoardingApi apiInstance = new ApplicationBoardingApi();
Long appId = 789L; // Long | Application ID
try {
    QPApiResponse result = apiInstance.validateApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationBoardingApi#validateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| Application ID |

### Return type

[**QPApiResponse**](QPApiResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

