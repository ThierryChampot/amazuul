package com.imie.stock.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT a FROM Product a")
})

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Long id;
    @Column(name = "label")
    private String label;
    @Basic(optional = true)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "price")
    private Number price;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    
    public Product() {
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Number return the price
     */
    public Number getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Number price) {
        this.price = price;
    }

    /**
     * @return int return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}