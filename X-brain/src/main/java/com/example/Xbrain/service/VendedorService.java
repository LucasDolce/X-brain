package com.example.Xbrain.service;

import com.example.Xbrain.model.Venda;
import com.example.Xbrain.model.Vendedor;
import com.example.Xbrain.repositories.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor save(Vendedor vendedor){
        return (vendedorRepository.save(vendedor));
    }

}
