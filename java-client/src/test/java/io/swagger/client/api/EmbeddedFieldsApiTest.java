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

import qpPlatform.ApiException;
import io.swagger.client.model.EmbeddedKeyResponse;
import io.swagger.client.model.QPApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbeddedFieldsApi
 */
@Ignore
public class EmbeddedFieldsApiTest {

    private final EmbeddedFieldsApi api = new EmbeddedFieldsApi();

    
    /**
     * Get Transient Key
     *
     * Gets a transient key for use with Qualpay Embedded Fields. This key will be invalidated in 12 hours or when a card is successfully verified using Embedded Fields. The transient key is a one time key that is used to invoke Embedded Fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmbeddedTransientKeyTest() throws ApiException {
        EmbeddedKeyResponse response = api.getEmbeddedTransientKey();

        // TODO: test validations
    }
    
}
