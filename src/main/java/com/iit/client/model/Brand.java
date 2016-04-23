/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.client.model;

/**
 *
 * @author sahan
 */

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;


public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String name ;
    private Collection<Item> items;

    public Brand() {
    }

    public Brand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Brand{" + "id=" + id + ", name=" + name + ", items=" + items + '}';
    }


  

}
