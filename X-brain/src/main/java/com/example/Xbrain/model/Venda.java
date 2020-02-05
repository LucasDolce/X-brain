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

    public Venda(Long id,Date dataVenda, float valor,Vendedor vendedor){
        super();
        this.id = id;
        this.dataVenda = dataVenda;
        this.valor= valor;
        this.vendedor= vendedor;

    }

    public Venda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
