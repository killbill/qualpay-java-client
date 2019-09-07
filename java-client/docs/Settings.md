
# Settings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **Long** | The application ID for this merchant account.  Only returned if an application exists. |  [optional]
**merchantId** | **Long** | The merchant ID this merchant account. |  [optional]
**dbaName** | **String** | The DBA name for the merchant account. |  [optional]
**paymentsAccepted** | [**List&lt;Payment&gt;**](Payment.md) | An array of the card types and currency accepted by the merchant account. |  [optional]
**paymentProfiles** | [**List&lt;PaymentProfile&gt;**](PaymentProfile.md) | An array payment profiles available for the merchant account. |  [optional]
**userLogin** | **String** | The user login created for the merchant account.  Only returned if a new user was requested during account creation. |  [optional]
**resetUrl** | **String** | The URL to establish a new password for the created user.  Only returned if a new user was requested during account creation. |  [optional]



