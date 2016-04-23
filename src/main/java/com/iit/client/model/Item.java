package com.iit.client.model;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by sahan on 4/21/16.
 */
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String barcode;

    private Boolean expirable = Boolean.FALSE;
    private String name;

    private BigInteger quantity;

    private Brand brand;

    private Collection<ReceivedItem> receivedItems;

    private Collection<SoldItem> soldItems;

    public Item() {
    }

    public Item(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Boolean isExpirable() {
        return expirable;
    }

    public Collection<SoldItem> getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Collection<SoldItem> soldItems) {
        this.soldItems = soldItems;
    }

    @XmlTransient
    public Collection<ReceivedItem> getReceivedItems() {
        return receivedItems;
    }

    public void setReceivedItems(Collection<ReceivedItem> receivedItems) {
        this.receivedItems = receivedItems;
    }

    @Override
    public String toString() {
        return "lec5.entity.Item[ id=" + id + " ]";
    }

}
