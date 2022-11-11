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

   @Column(nullable = false, unique = false)
   private String address;

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

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   /*
    * public class Address(){
    * private String rua;
    * private String numero;
    * private String cep;
    * private String cidade;
    * private String estado;
    * private String pais;
    * public String getRua() {
    * return rua;
    * }
    * public void setRua(String rua) {
    * this.rua = rua;
    * }
    * public String getNumero() {
    * return numero;
    * }
    * public void setNumero(String numero) {
    * this.numero = numero;
    * }
    * public String getCep() {
    * return cep;
    * }
    * public void setCep(String cep) {
    * this.cep = cep;
    * }
    * public String getCidade() {
    * return cidade;
    * }
    * public void setCidade(String cidade) {
    * this.cidade = cidade;
    * }
    * public String getEstado() {
    * return estado;
    * }
    * public void setEstado(String estado) {
    * this.estado = estado;
    * }
    * public String getPais() {
    * return pais;
    * }
    * public void setPais(String pais) {
    * this.pais = pais;
    * }
    * 
    * }
    */
}