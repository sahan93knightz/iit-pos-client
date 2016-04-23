package com.iit.client.model;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by sahan on 4/21/16.
 */
public class GoodReceiveInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Long id;
    
    private Date date;
    
    private Collection<ReceivedItem> receivedItems;

    public GoodReceiveInvoice() {
    }

    public GoodReceiveInvoice(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        return "lec5.entity.GoodReceiveInvoice[ id=" + id + " ]";
    }

}
