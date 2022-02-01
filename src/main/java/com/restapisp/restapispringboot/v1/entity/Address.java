package com.restapisp.restapispringboot.v1.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Address {

   private String address;
   private String logradouro;
   private String bairro;
   private String complemento;
   private String uf;
   private String cidade;
}
