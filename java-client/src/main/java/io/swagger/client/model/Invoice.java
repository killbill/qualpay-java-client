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
 * Invoice
 */

public class Invoice {
  @SerializedName("invoice_id")
  private Long invoiceId = null;

  @SerializedName("merchant_id")
  private Long merchantId = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("from_contact")
  private Contact fromContact = null;

  @SerializedName("billing_contact")
  private Contact billingContact = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;SAVED - Invoice is in draft state. An invoice in draft state can be updated. &lt;br&gt;OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.&lt;br&gt;PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. &lt;br&gt;CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SAVED("SAVED"),
    
    OUTSTANDING("OUTSTANDING"),
    
    PAID("PAID"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("amt_tran")
  private Double amtTran = null;

  @SerializedName("amt_tax")
  private Double amtTax = null;

  @SerializedName("amt_sub_total")
  private Double amtSubTotal = null;

  @SerializedName("amt_paid")
  private Double amtPaid = null;

  @SerializedName("amt_balance")
  private Double amtBalance = null;

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

  @SerializedName("invoice_link")
  private String invoiceLink = null;

  @SerializedName("sales_tax")
  private SalesTax salesTax = null;

  @SerializedName("payment_terms")
  private PaymentTerm paymentTerms = null;

  @SerializedName("date_invoice")
  private String dateInvoice = null;

  @SerializedName("line_items")
  private List<LineItem> lineItems = null;

  @SerializedName("date_payment")
  private String datePayment = null;

  @SerializedName("date_due")
  private String dateDue = null;

  @SerializedName("date_last_view")
  private String dateLastView = null;

  @SerializedName("date_sent")
  private String dateSent = null;

  @SerializedName("date_notice")
  private String dateNotice = null;

  @SerializedName("db_timestamp")
  private String dbTimestamp = null;

  public Invoice invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice.
   * @return invoiceId
  **/
  @ApiModelProperty(example = "1234", value = "<strong>Format: </strong>Variable length, up to 10 N<br><strong>Description: </strong>A unique number generated by Qualpay to identify an invoice. Save this id to manage an invoice.")
  public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice merchantId(Long merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Unique ID assigned by Qualpay to a merchant.
   * @return merchantId
  **/
  @ApiModelProperty(example = "212000000001", value = "<strong>Format: </strong>Variable length, up to 16 N<br><strong>Description: </strong>Unique ID assigned by Qualpay to a merchant.")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  public Invoice customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 32 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The qualpay customer id associated with this invoice. 
   * @return customerId
  **/
  @ApiModelProperty(example = "JOHNDOE", value = "<strong>Format: </strong>Variable length, up to 32 AN<br><strong>Description: </strong>The qualpay customer id associated with this invoice. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Invoice fromContact(Contact fromContact) {
    this.fromContact = fromContact;
    return this;
  }

   /**
   * The merchant business contact information.
   * @return fromContact
  **/
  @ApiModelProperty(value = "The merchant business contact information.")
  public Contact getFromContact() {
    return fromContact;
  }

  public void setFromContact(Contact fromContact) {
    this.fromContact = fromContact;
  }

  public Invoice billingContact(Contact billingContact) {
    this.billingContact = billingContact;
    return this;
  }

   /**
   * The customer contact information.
   * @return billingContact
  **/
  @ApiModelProperty(value = "The customer contact information.")
  public Contact getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(Contact billingContact) {
    this.billingContact = billingContact;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 25 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The Invoice Number (also referred to as the purchase identifier) generated by the merchant. 
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "QP-1234", value = "<strong>Format: </strong>Variable length, up to 25 AN<br><strong>Description: </strong>The Invoice Number (also referred to as the purchase identifier) generated by the merchant. ")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 16 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Status of an invoice. Possible values are &lt;br&gt;SAVED - Invoice is in draft state. An invoice in draft state can be updated. &lt;br&gt;OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.&lt;br&gt;PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. &lt;br&gt;CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. 
   * @return status
  **/
  @ApiModelProperty(example = "PAID", value = "<strong>Format: </strong>Variable length, up to 16 AN<br><strong>Description: </strong>Status of an invoice. Possible values are <br>SAVED - Invoice is in draft state. An invoice in draft state can be updated. <br>OUTSTANDING - Invoice has been mailed to the customer. Once an invoice is sent, only the billing_contact and from_contact can be updated.<br>PAID - Invoice has been paid completely. Once paid, the invoice is locked and cannot be modified. <br>CANCELED - Invoice has been canceled. Once canceled, the invoice is locked and cannot be modified. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invoice amtTran(Double amtTran) {
    this.amtTran = amtTran;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The total invoice amount. Typically this will be a sum of the line item total and the tax amount. 
   * @return amtTran
  **/
  @ApiModelProperty(example = "100.45", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>The total invoice amount. Typically this will be a sum of the line item total and the tax amount. ")
  public Double getAmtTran() {
    return amtTran;
  }

  public void setAmtTran(Double amtTran) {
    this.amtTran = amtTran;
  }

  public Invoice amtTax(Double amtTax) {
    this.amtTax = amtTax;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Tax amount. This amount is automatically calculated if the tax_rate is provided.
   * @return amtTax
  **/
  @ApiModelProperty(example = "1.45", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>Tax amount. This amount is automatically calculated if the tax_rate is provided.")
  public Double getAmtTax() {
    return amtTax;
  }

  public void setAmtTax(Double amtTax) {
    this.amtTax = amtTax;
  }

  public Invoice amtSubTotal(Double amtSubTotal) {
    this.amtSubTotal = amtSubTotal;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Sum of all line item total amounts.
   * @return amtSubTotal
  **/
  @ApiModelProperty(example = "1.45", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>Sum of all line item total amounts.")
  public Double getAmtSubTotal() {
    return amtSubTotal;
  }

  public void setAmtSubTotal(Double amtSubTotal) {
    this.amtSubTotal = amtSubTotal;
  }

  public Invoice amtPaid(Double amtPaid) {
    this.amtPaid = amtPaid;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount paid by the customer.
   * @return amtPaid
  **/
  @ApiModelProperty(example = "50.0", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>The amount paid by the customer.")
  public Double getAmtPaid() {
    return amtPaid;
  }

  public void setAmtPaid(Double amtPaid) {
    this.amtPaid = amtPaid;
  }

  public Invoice amtBalance(Double amtBalance) {
    this.amtBalance = amtBalance;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 10,2 N&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The amount due from the customer. This amount is typically the amt_tran minus amt_paid.
   * @return amtBalance
  **/
  @ApiModelProperty(example = "50.45", value = "<strong>Format: </strong>Variable length, up to 10,2 N<br><strong>Description: </strong>The amount due from the customer. This amount is typically the amt_tran minus amt_paid.")
  public Double getAmtBalance() {
    return amtBalance;
  }

  public void setAmtBalance(Double amtBalance) {
    this.amtBalance = amtBalance;
  }

  public Invoice profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 20 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The unique payment gateway profile ID to be used when making an invoice payment. 
   * @return profileId
  **/
  @ApiModelProperty(example = "21200000000100000840", value = "<strong>Format: </strong>Variable length, up to 20 AN<br><strong>Description: </strong>The unique payment gateway profile ID to be used when making an invoice payment. ")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Invoice tranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 3 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;Numeric Currency Code. Refer to &lt;a href&#x3D;\&quot;/developer/api/reference#country-codes\&quot;target&#x3D;\&quot;_blank\&quot;&gt;Country Codes&lt;/a&gt; for a list of currency codes. 
   * @return tranCurrency
  **/
  @ApiModelProperty(example = "840", value = "<strong>Format: </strong>Fixed length, 3 AN<br><strong>Description: </strong>Numeric Currency Code. Refer to <a href=\"/developer/api/reference#country-codes\"target=\"_blank\">Country Codes</a> for a list of currency codes. ")
  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }

  public Invoice footerNote(String footerNote) {
    this.footerNote = footerNote;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 750 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice footer note. This data will be displayed on the footer of the invoice. 
   * @return footerNote
  **/
  @ApiModelProperty(example = "Thanks for your business!", value = "<strong>Format: </strong>Variable length, up to 750 AN<br><strong>Description: </strong>The invoice footer note. This data will be displayed on the footer of the invoice. ")
  public String getFooterNote() {
    return footerNote;
  }

  public void setFooterNote(String footerNote) {
    this.footerNote = footerNote;
  }

  public Invoice paymentTermsNote(String paymentTermsNote) {
    this.paymentTermsNote = paymentTermsNote;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 500 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice payment terms description.
   * @return paymentTermsNote
  **/
  @ApiModelProperty(example = "Late fees calculated.", value = "<strong>Format: </strong>Variable length, up to 500 AN<br><strong>Description: </strong>The invoice payment terms description.")
  public String getPaymentTermsNote() {
    return paymentTermsNote;
  }

  public void setPaymentTermsNote(String paymentTermsNote) {
    this.paymentTermsNote = paymentTermsNote;
  }

  public Invoice checkoutSettings(CheckoutSettings checkoutSettings) {
    this.checkoutSettings = checkoutSettings;
    return this;
  }

   /**
   * Invoice checkout settings specific to the checkout page.
   * @return checkoutSettings
  **/
  @ApiModelProperty(value = "Invoice checkout settings specific to the checkout page.")
  public CheckoutSettings getCheckoutSettings() {
    return checkoutSettings;
  }

  public void setCheckoutSettings(CheckoutSettings checkoutSettings) {
    this.checkoutSettings = checkoutSettings;
  }

  public Invoice invoiceLink(String invoiceLink) {
    this.invoiceLink = invoiceLink;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Variable length, up to 128 AN&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;A unique link generated once the invoice is complete and sent out to a customer. Customers can also use this link to view and pay for the invoice. 
   * @return invoiceLink
  **/
  @ApiModelProperty(example = "https://app.qualpay.com/checkout/invoice/7d8e96ac261711e8b413acde4800bbbb", value = "<strong>Format: </strong>Variable length, up to 128 AN<br><strong>Description: </strong>A unique link generated once the invoice is complete and sent out to a customer. Customers can also use this link to view and pay for the invoice. ")
  public String getInvoiceLink() {
    return invoiceLink;
  }

  public void setInvoiceLink(String invoiceLink) {
    this.invoiceLink = invoiceLink;
  }

  public Invoice salesTax(SalesTax salesTax) {
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

  public Invoice paymentTerms(PaymentTerm paymentTerms) {
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

  public Invoice dateInvoice(String dateInvoice) {
    this.dateInvoice = dateInvoice;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice date. 
   * @return dateInvoice
  **/
  @ApiModelProperty(example = "2018-01-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The invoice date. ")
  public String getDateInvoice() {
    return dateInvoice;
  }

  public void setDateInvoice(String dateInvoice) {
    this.dateInvoice = dateInvoice;
  }

  public Invoice lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(LineItem lineItemsItem) {
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

  public Invoice datePayment(String datePayment) {
    this.datePayment = datePayment;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice payment date. If multiple payments are made for this invoice, this field will have the latest payment date.
   * @return datePayment
  **/
  @ApiModelProperty(example = "2018-20-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The invoice payment date. If multiple payments are made for this invoice, this field will have the latest payment date.")
  public String getDatePayment() {
    return datePayment;
  }

  public void setDatePayment(String datePayment) {
    this.datePayment = datePayment;
  }

  public Invoice dateDue(String dateDue) {
    this.dateDue = dateDue;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice due date. This date will be automatically calculated based on the payment_terms.  &lt;br&gt;&lt;strong&gt;Default: &lt;/strong&gt;Invoice Date
   * @return dateDue
  **/
  @ApiModelProperty(example = "2018-01-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The invoice due date. This date will be automatically calculated based on the payment_terms.  <br><strong>Default: </strong>Invoice Date")
  public String getDateDue() {
    return dateDue;
  }

  public void setDateDue(String dateDue) {
    this.dateDue = dateDue;
  }

  public Invoice dateLastView(String dateLastView) {
    this.dateLastView = dateLastView;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date the invoice was last viewed by the customer. 
   * @return dateLastView
  **/
  @ApiModelProperty(example = "2018-10-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The date the invoice was last viewed by the customer. ")
  public String getDateLastView() {
    return dateLastView;
  }

  public void setDateLastView(String dateLastView) {
    this.dateLastView = dateLastView;
  }

  public Invoice dateSent(String dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date invoice was first sent to the customer. This is the date the invoice status is set to OUTSTANDING. 
   * @return dateSent
  **/
  @ApiModelProperty(example = "2018-01-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The date invoice was first sent to the customer. This is the date the invoice status is set to OUTSTANDING. ")
  public String getDateSent() {
    return dateSent;
  }

  public void setDateSent(String dateSent) {
    this.dateSent = dateSent;
  }

  public Invoice dateNotice(String dateNotice) {
    this.dateNotice = dateNotice;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length, 10 AN, in YYYY-MM-DD format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The date a reminder or overdue notice will be sent. A reminder notice is sent before the due date, overdue notices are sent after the due date. The reminder and overdue intervals can be configured in the Invoice settings page in Qualpay Manager. 
   * @return dateNotice
  **/
  @ApiModelProperty(example = "2018-20-01", value = "<strong>Format: </strong>Fixed length, 10 AN, in YYYY-MM-DD format<br><strong>Description: </strong>The date a reminder or overdue notice will be sent. A reminder notice is sent before the due date, overdue notices are sent after the due date. The reminder and overdue intervals can be configured in the Invoice settings page in Qualpay Manager. ")
  public String getDateNotice() {
    return dateNotice;
  }

  public void setDateNotice(String dateNotice) {
    this.dateNotice = dateNotice;
  }

  public Invoice dbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
    return this;
  }

   /**
   * &lt;strong&gt;Format: &lt;/strong&gt;Fixed length  AN, in yyyy-MM-ddTHH:mm:ss.SSS-ZZZZ format&lt;br&gt;&lt;strong&gt;Description: &lt;/strong&gt;The invoice creation timestamp. 
   * @return dbTimestamp
  **/
  @ApiModelProperty(example = "2018-01-01T12:57:47.000-0700", value = "<strong>Format: </strong>Fixed length  AN, in yyyy-MM-ddTHH:mm:ss.SSS-ZZZZ format<br><strong>Description: </strong>The invoice creation timestamp. ")
  public String getDbTimestamp() {
    return dbTimestamp;
  }

  public void setDbTimestamp(String dbTimestamp) {
    this.dbTimestamp = dbTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.merchantId, invoice.merchantId) &&
        Objects.equals(this.customerId, invoice.customerId) &&
        Objects.equals(this.fromContact, invoice.fromContact) &&
        Objects.equals(this.billingContact, invoice.billingContact) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.amtTran, invoice.amtTran) &&
        Objects.equals(this.amtTax, invoice.amtTax) &&
        Objects.equals(this.amtSubTotal, invoice.amtSubTotal) &&
        Objects.equals(this.amtPaid, invoice.amtPaid) &&
        Objects.equals(this.amtBalance, invoice.amtBalance) &&
        Objects.equals(this.profileId, invoice.profileId) &&
        Objects.equals(this.tranCurrency, invoice.tranCurrency) &&
        Objects.equals(this.footerNote, invoice.footerNote) &&
        Objects.equals(this.paymentTermsNote, invoice.paymentTermsNote) &&
        Objects.equals(this.checkoutSettings, invoice.checkoutSettings) &&
        Objects.equals(this.invoiceLink, invoice.invoiceLink) &&
        Objects.equals(this.salesTax, invoice.salesTax) &&
        Objects.equals(this.paymentTerms, invoice.paymentTerms) &&
        Objects.equals(this.dateInvoice, invoice.dateInvoice) &&
        Objects.equals(this.lineItems, invoice.lineItems) &&
        Objects.equals(this.datePayment, invoice.datePayment) &&
        Objects.equals(this.dateDue, invoice.dateDue) &&
        Objects.equals(this.dateLastView, invoice.dateLastView) &&
        Objects.equals(this.dateSent, invoice.dateSent) &&
        Objects.equals(this.dateNotice, invoice.dateNotice) &&
        Objects.equals(this.dbTimestamp, invoice.dbTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, merchantId, customerId, fromContact, billingContact, invoiceNumber, status, amtTran, amtTax, amtSubTotal, amtPaid, amtBalance, profileId, tranCurrency, footerNote, paymentTermsNote, checkoutSettings, invoiceLink, salesTax, paymentTerms, dateInvoice, lineItems, datePayment, dateDue, dateLastView, dateSent, dateNotice, dbTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    fromContact: ").append(toIndentedString(fromContact)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amtTran: ").append(toIndentedString(amtTran)).append("\n");
    sb.append("    amtTax: ").append(toIndentedString(amtTax)).append("\n");
    sb.append("    amtSubTotal: ").append(toIndentedString(amtSubTotal)).append("\n");
    sb.append("    amtPaid: ").append(toIndentedString(amtPaid)).append("\n");
    sb.append("    amtBalance: ").append(toIndentedString(amtBalance)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    tranCurrency: ").append(toIndentedString(tranCurrency)).append("\n");
    sb.append("    footerNote: ").append(toIndentedString(footerNote)).append("\n");
    sb.append("    paymentTermsNote: ").append(toIndentedString(paymentTermsNote)).append("\n");
    sb.append("    checkoutSettings: ").append(toIndentedString(checkoutSettings)).append("\n");
    sb.append("    invoiceLink: ").append(toIndentedString(invoiceLink)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    dateInvoice: ").append(toIndentedString(dateInvoice)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    datePayment: ").append(toIndentedString(datePayment)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateLastView: ").append(toIndentedString(dateLastView)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    dateNotice: ").append(toIndentedString(dateNotice)).append("\n");
    sb.append("    dbTimestamp: ").append(toIndentedString(dbTimestamp)).append("\n");
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
