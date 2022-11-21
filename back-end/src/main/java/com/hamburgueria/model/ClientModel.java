package com.hamburgueria.model;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;


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

   @OneToOne(cascade = {CascadeType.ALL})
   @JoinColumn(name = "address_id")
   private AddressModel addressModel;

   @OneToMany(mappedBy = " client", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
   private Set<SnackOrderModel> snackOrder;


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

   public AddressModel getAddressModel() {
      return addressModel;
   }

   public void setAddress(AddressModel addressModel) {
     this.addressModel = addressModel;
   }

   
}