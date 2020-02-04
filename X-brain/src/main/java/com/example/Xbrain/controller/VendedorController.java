package com.example.Xbrain.controller;

import com.example.Xbrain.model.Venda;
import com.example.Xbrain.model.Vendedor;
import com.example.Xbrain.repositories.VendedorRepository;
import com.example.Xbrain.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @Autowired
    private VendedorRepository vendedorRepository;

    @PostMapping

    public Vendedor save(@RequestBody Vendedor vendedor){
        return (vendedorService.save(vendedor));
    }

    @GetMapping
    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }


}
