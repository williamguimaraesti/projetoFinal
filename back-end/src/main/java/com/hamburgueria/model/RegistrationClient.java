package com.hamburgueria.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name = "registrationclient")
public class RegistrationClient implements Serializable {
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID idRegistrationClient;

   @Column(nullable = false, unique = true, length = 20)
   private String nameClient;

   @Column(nullable = false, unique = true, length = 11)
   private int Contact;

   @Column(nullable = false, unique = true, length = 6)
   private String password;

   /**
    * Methods cardinality
    */

   @OneToMany
   private Address Address;

   @OneToMany
   private SnackOrder snackOrder;

   /**
    * Methods
    */

   public UUID getIdRegistrationClient() {
      return idRegistrationClient;
   }

   public void setIdRegistrationClient(UUID idRegistrationClient) {
      this.idRegistrationClient = idRegistrationClient;
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

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}