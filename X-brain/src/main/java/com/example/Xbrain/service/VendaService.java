package com.example.Xbrain.service;

import com.example.Xbrain.model.Venda;
import com.example.Xbrain.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda save(Venda venda){
        return (vendaRepository.save(venda));
    }

    public List<Object[]> findEntreDatas(Date dataInicial, Date dataFinal){

        return (vendaRepository.findEntreDatas(dataInicial,dataFinal));

    }

}
