package com.hamburgueria.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "snackOrder")
public class SnackOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idSnackOrder;

    @Column(nullable = false, unique = true, length = 20)
    private LocalTime requestDate;

    @Column(nullable = false, unique = true, length = 20)
    private float totalPrice;

    @Column(nullable = false, unique = true, length = 20)
    private int quantity;

    @Column(nullable = false, unique = true, length = 20)
    private String note;

    /**
     * relationship mapping
     */

    @OneToMany
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "StatusSnack_id")
    private StatusSnack statusSnack;

    /**
     * Methods
     */

    public UUID getIdSnackOrder() {
        return idSnackOrder;
    }

    public void setIdSnackOrder(UUID idSnackOrder) {
        this.idSnackOrder = idSnackOrder;
    }

    public LocalTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalTime requestDate) {
        this.requestDate = requestDate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public StatusSnack getStatusSnack() {
        return statusSnack;
    }

    public void setStatusSnack(StatusSnack statusSnack) {
        this.statusSnack = statusSnack;
    }
}