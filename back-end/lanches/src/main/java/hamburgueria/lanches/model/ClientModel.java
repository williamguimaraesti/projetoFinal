package hamburgueria.lanches.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "client")
public class ClientModel implements Serializable {
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID idClient;

   @Column(nullable = false, unique = true, length = 20)
   private String nameClient;

   @Column(nullable = false, unique = true, length = 11)
   private int Contact;

   /**
    * relationship mapping
    */

   @OneToMany(mappedBy = "clientModel", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
   private List<AddressModel> addressModel = new ArrayList<AddressModel>();

   @OneToMany(mappedBy = "clientModel", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
   private List<SnackOrderModel> snackOrder = new ArrayList<SnackOrderModel>();


   /**
    * Methods
    */

   public UUID getIdClient() {
      return idClient;
   }

   public void setIdClient(UUID idClient) {
      this.idClient = idClient;
   }

   public String getNameClient() {
      return nameClient;
   }

   public void setNameClient(String nameClient) {
      this.nameClient = nameClient;
   }

   public int getContact() {
      return Contact;
   }

   public void setContact(int contact) {
      Contact = contact;
   }   
}