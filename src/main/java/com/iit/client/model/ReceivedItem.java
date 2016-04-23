package com.iit.client.model;

import java.io.Serializable;

/**
 * Created by sahan on 4/21/16.
 */
public class ReceivedItem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Double quantity;
    private Item item;
    private GoodReceiveInvoice goodReceiveInvoice;

    public ReceivedItem() {
    }

    public ReceivedItem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public GoodReceiveInvoice getGoodReceiveInvoice() {
        return goodReceiveInvoice;
    }

    public void setGoodReceiveInvoice(GoodReceiveInvoice goodReceiveInvoice) {
        this.goodReceiveInvoice = goodReceiveInvoice;
    }

    @Override
    public String toString() {
        return "lec5.entity.ReceivedItem[ id=" + id + " ]";
    }

}
