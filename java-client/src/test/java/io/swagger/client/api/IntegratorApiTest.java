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
import io.swagger.client.model.MerchantSettingsResponse;
import io.swagger.client.model.NewAccountRequest;
import io.swagger.client.model.QPApiResponse;
import io.swagger.client.model.RotateKeyRequest;
import io.swagger.client.model.RotateKeyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegratorApi
 */
@Ignore
public class IntegratorApiTest {

    private final IntegratorApi api = new IntegratorApi();

    
    /**
     * Generate Test Account
     *
     * Generates a new test merchant account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTestAccountTest() throws ApiException {
        NewAccountRequest body = null;
        MerchantSettingsResponse response = api.createTestAccount(body);

        // TODO: test validations
    }
    
    /**
     * Merchant Settings
     *
     * Request the card types and currencies supported by the requested merchant ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantSettingsTest() throws ApiException {
        Long mid = null;
        MerchantSettingsResponse response = api.getMerchantSettings(mid);

        // TODO: test validations
    }
    
    /**
     * Generate Security Key
     *
     * Generates an API key for the specified merchant account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rotateApiKeyTest() throws ApiException {
        Long mid = null;
        RotateKeyRequest body = null;
        RotateKeyResponse response = api.rotateApiKey(mid, body);

        // TODO: test validations
    }
    
}
