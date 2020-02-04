package com.example.Xbrain.controller;

import com.example.Xbrain.model.Venda;
import com.example.Xbrain.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda save(@RequestBody Venda venda){
        return vendaService.save(venda);
    }

    @GetMapping
    public List<Object[]> findEntreDatas(@RequestParam String dataInicial, @RequestParam  String dataFinal) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Date dataInicialFormatada = formatter.parse(dataInicial);
        Date dataFinalFormatada = formatter.parse(dataFinal);

        return (vendaService.findEntreDatas(dataInicialFormatada,dataFinalFormatada));

    }
}
