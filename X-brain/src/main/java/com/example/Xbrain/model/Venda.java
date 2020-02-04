package com.example.Xbrain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Venda")
public class Venda {

    @Id
    @Column(name = "vendaId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vendaData",nullable = false)
    private Date dataVenda;
    @Column(name = "vendaValor",nullable = false)
    private float valor;
    @ManyToOne
    @JoinColumn(name = "vendaVendedor", nullable = false)
    private Vendedor vendedor;
}
