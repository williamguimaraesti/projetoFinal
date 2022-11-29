package hamburgueria.lanches.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "statusSnack")
public class StatusSnackModel implements Serializable {
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
    @JoinColumn(name = "SnackOrder")
    private SnackOrderModel SnackOrderModel;

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

    public SnackOrderModel getSnackOrderModel() {
        return SnackOrderModel;
    }

    public void setSnackOrderModel(SnackOrderModel snackOrderModel) {
        this.SnackOrderModel = snackOrderModel;
    }
}