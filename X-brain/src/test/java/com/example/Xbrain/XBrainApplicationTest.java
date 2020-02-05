package com.example.Xbrain;

import com.example.Xbrain.model.Venda;
import com.example.Xbrain.model.Vendedor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
class XBrainApplicationTest {
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    void VendaSave() {
        Venda venda=restTemplate.postForObject(
                "http://localhost:8080/venda",
                new Venda(1L,new java.sql.Date(2020,3,2),2000.0f, new Vendedor(1L,"Dolce")),Venda.class );

        Assert.assertEquals("1"+"Fri Apr 02 00:00:00 BRT 3920"+"2000.0"+"Dolce",
                venda.getId()
                        +venda.getDataVenda().toString()
                        +venda.getValor()
                        +venda.getVendedor().getNome());
    }

    @Test
    void VendedorSave() {
        Vendedor vendedor= restTemplate.postForObject(
                "http://localhost:8080/vendedor",
                new Vendedor(1L,"Dolce"),Vendedor.class );

        Assert.assertEquals("1"+"Dolce",vendedor.getId()+ vendedor.getNome());
    }
}