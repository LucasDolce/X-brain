package com.example.Xbrain.repositories;

import com.example.Xbrain.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

public interface VendaRepository extends JpaRepository <Venda, Long> {

   @Query(value = "SELECT VENDEDOR_NOME, COUNT(VENDA_VENDEDOR),COUNT(VENDA_VENDEDOR)/DATEDIFF(day,:dataInicial,:dataFinal) FROM VENDA, VENDEDOR WHERE VENDA_DATA BETWEEN :dataInicial AND :dataFinal AND VENDEDOR_ID = VENDA_VENDEDOR GROUP BY VENDEDOR_ID", nativeQuery = true)
   List<Object[]> findEntreDatas(@PathVariable(value = "dataInicial") Date dataInicial, @PathVariable(value = "dataFinal") Date dataFinal);
}