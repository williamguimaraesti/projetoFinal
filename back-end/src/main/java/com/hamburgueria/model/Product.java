package com.hamburgueria.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;

    @Column(nullable = false)
    private String product;

    @Column(nullable = false)
    private String noteProduct;

    @Column(nullable = false)
    private float price;

    /**
     * Methods cardinality
     */

    @OneToMany
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany
    @JoinColumn(name = "snackorder_id")
    private SnackOrder snackOrder;

    /**
     * Methods
     */

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getNoteProduct() {
        return noteProduct;
    }

    public void setNoteProduct(String noteProduct) {
        this.noteProduct = noteProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SnackOrder getSnackOrder() {
        return snackOrder;
    }

    public void setSnackOrder(SnackOrder snackOrder) {
        this.snackOrder = snackOrder;
    }

    
}