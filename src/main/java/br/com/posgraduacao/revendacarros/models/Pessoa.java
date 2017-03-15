package br.com.posgraduacao.revendacarros.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pessoa
{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nome;
   private String cpf;

   public Integer getId()
   {
      return this.id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public String getNome()
   {
      return this.nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public String getCpf()
   {
      return this.cpf;
   }

   public void setCpf(String cpf)
   {
      this.cpf = cpf;
   }
}
