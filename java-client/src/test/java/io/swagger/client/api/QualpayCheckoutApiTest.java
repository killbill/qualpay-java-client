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
import io.swagger.client.model.CheckoutLinkResponse;
import io.swagger.client.model.CheckoutRequest;
import io.swagger.client.model.CheckoutResponse;
import io.swagger.client.model.QPApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QualpayCheckoutApi
 */
@Ignore
public class QualpayCheckoutApiTest {

    private final QualpayCheckoutApi api = new QualpayCheckoutApi();

    
    /**
     * Create a Checkout Payment Link
     *
     * Creates a new checkout object which contains a payment link, through which checkout payments can be made. This operation generates a unique checkout_id, that can be used to query the status of a checkout payment using the Lookup Checkout Payment API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCheckoutTest() throws ApiException {
        CheckoutRequest body = null;
        CheckoutLinkResponse response = api.addCheckout(body);

        // TODO: test validations
    }
    
    /**
     * Lookup Checkout Payment
     *
     * Queries the status of a payment made through Qualpay Hosted Checkout. The operation returns a checkout object which contains information about the transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String checkoutId = null;
        CheckoutResponse response = api.getDetails(checkoutId);

        // TODO: test validations
    }
    
}