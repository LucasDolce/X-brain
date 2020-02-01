package com.example.Xbrain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "Vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 88, nullable = false)
    private String nome;

}
