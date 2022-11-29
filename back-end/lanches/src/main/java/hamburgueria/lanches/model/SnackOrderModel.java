package hamburgueria.lanches.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "snackOrder")
public class SnackOrderModel implements Serializable {
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

    @ManyToOne
    @JoinColumn(name = "product")
    @ForeignKey(name = "product_fk")
    private ProductModel productModel;

    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "client")
    @ForeignKey(name = "client_fk")
    private ClientModel clientModel;

    @OneToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "StatusSnack_id")
    private StatusSnackModel statusSnackModel;

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