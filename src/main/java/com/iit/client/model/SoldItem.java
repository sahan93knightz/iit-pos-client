package com.iit.client.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by sahan on 4/21/16.
 */
public class SoldItem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private BigDecimal quantity;
    
    private BigDecimal unitPrice;
    
    private Item item;
    
    private Invoice invoice;

    public SoldItem() {
    }

    public SoldItem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "lec5.entity.ReceivedItem[ id=" + id + " ]";
    }

}
