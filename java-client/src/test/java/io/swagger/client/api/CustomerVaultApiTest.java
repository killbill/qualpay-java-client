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
import io.swagger.client.model.AddBillingCardRequest;
import io.swagger.client.model.AddCustomerRequest;
import io.swagger.client.model.AddShippingAddressRequest;
import io.swagger.client.model.CustomerListResponse;
import io.swagger.client.model.CustomerResponse;
import io.swagger.client.model.DeleteBillingCardRequest;
import io.swagger.client.model.GetBillingResponse;
import io.swagger.client.model.GetShippingResponse;
import io.swagger.client.model.QPApiResponse;
import io.swagger.client.model.SetPrimaryBillingCardRequest;
import io.swagger.client.model.SetPrimaryShippingAddressRequest;
import io.swagger.client.model.UpdateBillingCardRequest;
import io.swagger.client.model.UpdateCustomerRequest;
import io.swagger.client.model.UpdateShippingAddressRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerVaultApi
 */
@Ignore
public class CustomerVaultApiTest {

    private final CustomerVaultApi api = new CustomerVaultApi();

    
    /**
     * Add a Payment Method
     *
     * Tokenizes and adds a payment method to a customer record. The response will include the tokenized card_number in the field, card_id, which can be used to manage the card and can be used in place of the card_number in Payment Gateway API requests. There is no limit on the number of payment methods you can add to a customer. The first payment method added will be designated as the primary payment method, used for subscription payments. You can use the Set Primary Payment Method API to change the default payment method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBillingCardTest() throws ApiException {
        String customerId = null;
        AddBillingCardRequest body = null;
        CustomerResponse response = api.addBillingCard(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Add a Customer
     *
     * Adds a customer to the Qualpay Customer Vault. A customer_id is required to create invoice and subscription payments. Payment methods, billing addresses and shipping addresses may be included in this request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerTest() throws ApiException {
        AddCustomerRequest body = null;
        CustomerResponse response = api.addCustomer(body);

        // TODO: test validations
    }
    
    /**
     * Add a Shipping Address
     *
     * Adds a shipping address to a customer. The response will include a unique shipping_id. The shipping_id can be used to manage the shipping_address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShippingAddressTest() throws ApiException {
        String customerId = null;
        AddShippingAddressRequest body = null;
        CustomerResponse response = api.addShippingAddress(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Get all Customers
     *
     * Gets an array of customer vault objects. You can use filters to limit the results returned. Optional query parameters determine size and sort order of the returned array.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseCustomersTest() throws ApiException {
        Integer count = null;
        String orderOn = null;
        String orderBy = null;
        Integer page = null;
        String filter = null;
        Long merchantId = null;
        CustomerListResponse response = api.browseCustomers(count, orderOn, orderBy, page, filter, merchantId);

        // TODO: test validations
    }
    
    /**
     * Delete a Payment Method
     *
     * Deletes a customer&#39;s specific payment method based on the card_id provided in the request. The card_id is required in the request body to delete the payment method. A payment method with active subscriptions cannot be deleted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBillingCardTest() throws ApiException {
        String customerId = null;
        DeleteBillingCardRequest body = null;
        CustomerResponse response = api.deleteBillingCard(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Delete a Customer
     *
     * Deletes a customer from the customer vault. Deleting a customer will delete all the subscriptions associated with the customer. **This operation cannot be reversed.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        String customerId = null;
        Long merchantId = null;
        QPApiResponse response = api.deleteCustomer(customerId, merchantId);

        // TODO: test validations
    }
    
    /**
     * Delete a Shipping Address
     *
     * Deletes a customer&#39;s specific shipping address based on the shipping_id provided in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShippingAddressTest() throws ApiException {
        String customerId = null;
        Long id = null;
        Long merchantId = null;
        CustomerResponse response = api.deleteShippingAddress(customerId, id, merchantId);

        // TODO: test validations
    }
    
    /**
     * Get Payment Methods
     *
     * Gets a list of payment methods associated with a customer_id. The response will contain an array of billing_cards.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBillingCardsTest() throws ApiException {
        String customerId = null;
        Long merchantId = null;
        GetBillingResponse response = api.getBillingCards(customerId, merchantId);

        // TODO: test validations
    }
    
    /**
     * Get by Customer ID
     *
     * Gets a customer vault record by customer_id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        String customerId = null;
        Long merchantId = null;
        CustomerResponse response = api.getCustomer(customerId, merchantId);

        // TODO: test validations
    }
    
    /**
     * Get Shipping Addresses
     *
     * Gets all shipping addresses for a customer. The response will include an array of shipping addresses. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingAddressesTest() throws ApiException {
        String customerId = null;
        Long merchantId = null;
        GetShippingResponse response = api.getShippingAddresses(customerId, merchantId);

        // TODO: test validations
    }
    
    /**
     * Set Primary Payment Method
     *
     * Sets a customer&#39;s specific payment method as the primary payment method. A primary payment method is used for subscription payments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPrimaryBillingCardTest() throws ApiException {
        String customerId = null;
        SetPrimaryBillingCardRequest body = null;
        CustomerResponse response = api.setPrimaryBillingCard(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Set Primary Shipping Address
     *
     * Sets a customer&#39;s specific shipping address as primary.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPrimaryShippingAddressTest() throws ApiException {
        String customerId = null;
        SetPrimaryShippingAddressRequest body = null;
        CustomerResponse response = api.setPrimaryShippingAddress(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Payment Method
     *
     * Updates a customer&#39;s payment method by card_id. The complete billing record should be included in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBillingCardTest() throws ApiException {
        String customerId = null;
        UpdateBillingCardRequest body = null;
        CustomerResponse response = api.updateBillingCard(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Customer
     *
     * Updates a customer vault record. You can send the entire resource or only the fields that require an update. When updating array fields - billing_cards or shipping_addresses - the entire array should be included in the request body. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        String customerId = null;
        UpdateCustomerRequest body = null;
        CustomerResponse response = api.updateCustomer(customerId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Shipping Address
     *
     * Update a shipping address for a customer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShippingAddressTest() throws ApiException {
        String customerId = null;
        UpdateShippingAddressRequest body = null;
        CustomerResponse response = api.updateShippingAddress(customerId, body);

        // TODO: test validations
    }
    
}
