package com.example.Xbrain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date dataVenda;
    @Column(nullable = false)
    private float valor;
    @ManyToOne
    private Vendedor vendedor;
}
