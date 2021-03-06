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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CheckoutSettings;
import io.swagger.client.model.Contact;
import io.swagger.client.model.LineItem;
import io.swagger.client.model.PaymentTerm;
import io.swagger.client.model.SalesTax;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateInvoiceRequest
 */

public class CreateInvoiceRequest {
  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("from_contact")
  private Contact fromContact = null;

  @SerializedName("billing_contact")
  private Contact billingContact = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("tran_currency")
  private String tranCurrency = null;

  @SerializedName("footer_note")
  private String footerNote = null;

  @SerializedName("payment_terms_note")
  private String paymentTermsNote = null;

  @SerializedName("checkout_settings")
  private CheckoutSettings checkoutSettings = null;

  @SerializedName("sales_tax")
  private SalesTax salesTax = null;

  @SerializedName("payment_terms")
  private PaymentTerm paymentTerms = null;

  @SerializedName("date_invoice")
  private String dateInvoice = null;

  @SerializedName("line_items")
  private List<LineItem> lineItems = null;

  @SerializedName("save_customer")
  private Boolean saveCustomer = null;

  public CreateInvoiceRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The qualpay customer_id associated with this invoice. If customer does not exist in the system, set the save_customer flag to true to create the customer before creating the invoice. 
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", required = true, value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The qualpay customer_id associated with this invoice. If customer does not exist in the system, set the save_customer flag to true to create the customer before creating the invoice. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CreateInvoiceRequest fromContact(Contact fromContact) {
    this.fromContact = fromContact;
    return this;
  }

   /**
   * The merchant business contact information. By default, the system will use the Business Contact information from the Invoice Settings page. This field is required to send the invoice.
   * @return fromContact
  **/
  @ApiModelProperty(value = "The merchant business contact information. By default, the system will use the Business Contact information from the Invoice Settings page. This field is required to send the invoice.")
  public Contact getFromContact() {
    return fromContact;
  }

  public void setFromContact(Contact fromContact) {
    this.fromContact = fromContact;
  }

  public CreateInvoiceRequest billingContact(Contact billingContact) {
    this.billingContact = billingContact;
    return this;
  }

   /**
   * The customer contact information. If not provided, the system will populate this information from Customer Vault using the customer_id field. This field is required to send the invoice. &lt;br&gt;&lt;strong&gt;Conditional Requirement: &lt;/strong&gt;This field is required if the save_customer flag is set to true.
   * @return billingContact
  **/
  @ApiModelProperty(value = "The customer contact information. If not provided, the system will populate this information from Customer Vault using the customer_id field. This field is required to send the invoice. <br><strong>Conditional Requirement: </strong>This field is required if the save_customer flag is set to true.")
  public Contact getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(Contact billingContact) {
    this.billingContact = billingContact;
  }

  public CreateInvoiceRequest invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Invoice Number (also referred to as the purchase identifier) generated by the merchant. 
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "QP-1234", required = true, value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>The Invoice Number (also referred to as the purchase identifier) generated by the merchant. ")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public CreateInvoiceRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique qualpay payment gateway profile ID to be used when making an invoice payment. This field is optional, only the tran_currency field can be sent and the system will choose the appropriate profile. If both profile_id and tran_currency is sent, the system will use the profile_id. 
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Variable length, up to 20 AN<br><strong>Description: </strong>The unique qualpay payment gateway profile ID to be used when making an invoice payment. This field is optional, only the tran_currency field can be sent and the system will choose the appropriate profile. If both profile_id and tran_currency is sent, the system will use the profile_id. ")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public CreateInvoiceRequest tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. If both profile_id and tran_currency fields are provided, profile_id is used. tran_currency will be updated to match the profile_id&lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;840
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Variable length, up to 3 AN<br><strong>Description: </strong>Numeric Currency Code. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes. If both profile_id and tran_currency fields are provided, profile_id is used. tran_currency will be updated to match the profile_id<br><strong>Default: </strong>840")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public CreateInvoiceRequest footerNote(String footerNote) {
    this.footerNote = footerNote;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 750 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice footer note. This data will be displayed on the footer of the invoice.  By default, the system will use the footer note from the Invoice Settings page.
   * @return footerNote
  **/
  @ApiModelProperty(example = "Thanks for your business!", value = "<strong>Format: </strong>Variable length, up to 750 AN<br><strong>Description: </strong>The invoice footer note. This data will be displayed on the footer of the invoice.  By default, the system will use the footer note from the Invoice Settings page.")
  public String getFooterNote() {
    return footerNote;
  }

  public void setFooterNote(String footerNote) {
    this.footerNote = footerNote;
  }

  public CreateInvoiceRequest paymentTermsNote(String paymentTermsNote) {
    this.paymentTermsNote = paymentTermsNote;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 500 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice payment terms description. By default, the system will use the payment terms note information from the Invoice Settings page.
   * @return paymentTermsNote
  **/
  @ApiModelProperty(example = "Late fees calculated.", value = "<strong>Format: </strong>Variable length, up to 500 AN<br><strong>Description: </strong>The invoice payment terms description. By default, the system will use the payment terms note information from the Invoice Settings page.")
  public String getPaymentTermsNote() {
    return paymentTermsNote;
  }

  public void setPaymentTermsNote(String paymentTermsNote) {
    this.paymentTermsNote = paymentTermsNote;
  }

  public CreateInvoiceRequest checkoutSettings(CheckoutSettings checkoutSettings) {
    this.checkoutSettings = checkoutSettings;
    return this;
  }

   /**
   * Invoice checkout page specific settings. By default, the system will use the Checkout Settings information from the Invoice Settings page.
   * @return checkoutSettings
  **/
  @ApiModelProperty(value = "Invoice checkout page specific settings. By default, the system will use the Checkout Settings information from the Invoice Settings page.")
  public CheckoutSettings getCheckoutSettings() {
    return checkoutSettings;
  }

  public void setCheckoutSettings(CheckoutSettings checkoutSettings) {
    this.checkoutSettings = checkoutSettings;
  }

  public CreateInvoiceRequest salesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Sales tax
   * @return salesTax
  **/
  @ApiModelProperty(value = "Sales tax")
  public SalesTax getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
  }

  public CreateInvoiceRequest paymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Payment Terms
   * @return paymentTerms
  **/
  @ApiModelProperty(value = "Payment Terms")
  public PaymentTerm getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerm paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public CreateInvoiceRequest dateInvoice(String dateInvoice) {
    this.dateInvoice = dateInvoice;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 AN,in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice date.
   * @return dateInvoice
  **/
  @ApiModelProperty(example = "2018-01-01", value = "<strong>Format: </strong>Variable length, up to 10 AN,in YYYY-MM-DD format<br><strong>Description: </strong>The invoice date.")
  public String getDateInvoice() {
    return dateInvoice;
  }

  public void setDateInvoice(String dateInvoice) {
    this.dateInvoice = dateInvoice;
  }

  public CreateInvoiceRequest lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreateInvoiceRequest addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The invoice line item details. 
   * @return lineItems
  **/
  @ApiModelProperty(value = "The invoice line item details. ")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CreateInvoiceRequest saveCustomer(Boolean saveCustomer) {
    this.saveCustomer = saveCustomer;
    return this;
  }

   /**
   * &lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Set this value to true if you want to create a customer. By default, this value is false. &lt;br&gt;customer_id and billing_contact fields are required when this flag is set to true. 
   * @return saveCustomer
  **/
  @ApiModelProperty(value = "<br><strong>Description: </strong>Set this value to true if you want to create a customer. By default, this value is false. <br>customer_id and billing_contact fields are required when this flag is set to true. ")
  public Boolean isSaveCustomer() {
    return saveCustomer;
  }

  public void setSaveCustomer(Boolean saveCustomer) {
    this.saveCustomer = saveCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvoiceRequest createInvoiceRequest = (CreateInvoiceRequest) o;
    return Objects.equals(this.customerId, createInvoiceRequest.customerId) &&
        Objects.equals(this.fromContact, createInvoiceRequest.fromContact) &&
        Objects.equals(this.billingContact, createInvoiceRequest.billingContact) &&
        Objects.equals(this.invoiceNumber, createInvoiceRequest.invoiceNumber) &&
        Objects.equals(this.profileId, createInvoiceRequest.profileId) &&
        Objects.equals(this.tranCurrency, createInvoiceRequest.tranCurrency) &&
        Objects.equals(this.footerNote, createInvoiceRequest.footerNote) &&
        Objects.equals(this.paymentTermsNote, createInvoiceRequest.paymentTermsNote) &&
        Objects.equals(this.checkoutSettings, createInvoiceRequest.checkoutSettings) &&
        Objects.equals(this.salesTax, createInvoiceRequest.salesTax) &&
        Objects.equals(this.paymentTerms, createInvoiceRequest.paymentTerms) &&
        Objects.equals(this.dateInvoice, createInvoiceRequest.dateInvoice) &&
        Objects.equals(this.lineItems, createInvoiceRequest.lineItems) &&
        Objects.equals(this.saveCustomer, createInvoiceRequest.saveCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, fromContact, billingContact, invoiceNumber, profileId, tranCurrency, footerNote, paymentTermsNote, checkoutSettings, salesTax, paymentTerms, dateInvoice, lineItems, saveCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvoiceRequest {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    fromContact: ").append(toIndentedString(fromContact)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    footerNote: ").append(toIndentedString(footerNote)).append("\n");
    sb.append("    paymentTermsNote: ").append(toIndentedString(paymentTermsNote)).append("\n");
    sb.append("    checkoutSettings: ").append(toIndentedString(checkoutSettings)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    dateInvoice: ").append(toIndentedString(dateInvoice)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    saveCustomer: ").append(toIndentedString(saveCustomer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

