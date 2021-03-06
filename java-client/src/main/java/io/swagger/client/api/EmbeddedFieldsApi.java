/*
 * Qualpay Platform API
 * This document describes the Qualpay Platform API.
 *
 * OpenAPI spec version: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import qpPlatform.ApiCallback;
import qpPlatform.ApiClient;
import qpPlatform.ApiException;
import qpPlatform.ApiResponse;
import qpPlatform.Configuration;
import qpPlatform.Pair;
import qpPlatform.ProgressRequestBody;
import qpPlatform.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.EmbeddedKeyResponse;
import io.swagger.client.model.QPApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmbeddedFieldsApi {
    private ApiClient apiClient;

    public EmbeddedFieldsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmbeddedFieldsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEmbeddedTransientKey
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEmbeddedTransientKeyCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/embedded";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEmbeddedTransientKeyValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getEmbeddedTransientKeyCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Transient Key
     * Gets a transient key for use with Qualpay Embedded Fields. This key will be invalidated in 12 hours or when a card is successfully verified using Embedded Fields. The transient key is a one time key that is used to invoke Embedded Fields.
     * @return EmbeddedKeyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmbeddedKeyResponse getEmbeddedTransientKey() throws ApiException {
        ApiResponse<EmbeddedKeyResponse> resp = getEmbeddedTransientKeyWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Transient Key
     * Gets a transient key for use with Qualpay Embedded Fields. This key will be invalidated in 12 hours or when a card is successfully verified using Embedded Fields. The transient key is a one time key that is used to invoke Embedded Fields.
     * @return ApiResponse&lt;EmbeddedKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmbeddedKeyResponse> getEmbeddedTransientKeyWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getEmbeddedTransientKeyValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<EmbeddedKeyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transient Key (asynchronously)
     * Gets a transient key for use with Qualpay Embedded Fields. This key will be invalidated in 12 hours or when a card is successfully verified using Embedded Fields. The transient key is a one time key that is used to invoke Embedded Fields.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEmbeddedTransientKeyAsync(final ApiCallback<EmbeddedKeyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEmbeddedTransientKeyValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmbeddedKeyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
