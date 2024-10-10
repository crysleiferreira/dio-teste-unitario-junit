package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancoDeDadosTest {


    @Before
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }


    @Test public void validaDadosDeRetorno() {
            assertTrue(true);
            
    }

    @After
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }
}
