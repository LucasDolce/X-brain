package com.example.Xbrain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name= "Vendedor")
public class Vendedor {
    @Id
    @Column(name = "vendedorId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vendedorNome",length = 88, nullable = false)
    private String nome;

    public Vendedor(Long id,String nome){
        super();
        this.id = id;
        this.nome= nome;
    }

    public Vendedor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
