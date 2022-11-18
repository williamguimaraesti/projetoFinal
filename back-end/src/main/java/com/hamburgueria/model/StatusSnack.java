package com.hamburgueria.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "statusSnack")
public class StatusSnack implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idStatusSnack;

    @Column(nullable = false)
    private String progress;

    /**
     * relationship mapping
     */

    @OneToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "snackorder_id")
    private SnackOrder snackOrder;

    /**
     * Methods
     */

    public UUID getIdStatusSnack() {
        return idStatusSnack;
    }

    public void setIdStatusSnack(UUID idStatusSnack) {
        this.idStatusSnack = idStatusSnack;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public SnackOrder getSnackOrder() {
        return snackOrder;
    }

    public void setSnackOrder(SnackOrder snackOrder) {
        this.snackOrder = snackOrder;
    }
}