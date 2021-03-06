package com.ecommerce.teamseven.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mustafa Yaşar 25/07/2021.
 */
@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = -1752783608281755739L;

    @Id
    @GeneratedValue
    private int customerId;

    @NotEmpty(message = "សូមធ្វើការបំពេញនូវឈ្មោះអតិថិជន!")
    private String customerName;
    @NotEmpty(message = "សូមធ្វើការបំពេញនូវអាស័យដ្ឋានអ៊ីមែល!")
    private String customerEmail;
    private String customerPhone;
    @NotEmpty(message = "សូមធ្វើការបំពេញនូវឈ្មោះអ្នកប្រើប្រាស់!")
    private String username;
    @NotEmpty(message = "សូមធ្វើការបំពេញនូវលេខសម្ងាត់អ្នកប្រើប្រាស់!")
    private String password;
    private boolean enabled;

    @OneToOne
    @JoinColumn(name = "billingAddressId")
    private BillingAddress billingAddress;

    @OneToOne
    @JoinColumn(name = "shippingAddressId")
    private ShippingAddress shippingAddress;

    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}