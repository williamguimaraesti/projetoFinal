package com.hamburgueria.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "snackorder")
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

}