package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class AppTest {

    @Test

    public void deveSomarERetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(-5,10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSomarERetornar3(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.soma(0,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSomarERetornar7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.soma(4,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSubtrairEretornar9(){
        Application application = new Application();
        Integer expected = 9;
        Integer response = application.subtracao(18,9);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMultiplicarERetornar15(){
        Application application = new Application();
        Integer expected = 15;
        Integer response = application.multiplicacao(3,5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveDividirERetornar20(){
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.divisao(60,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void verificaNumeroPar(){
        Application application = new Application();
        Integer expected = 0;
        Integer response = application.par(12);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void maior(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.maior(10,8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void quantosImpares(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.quantosImpares(10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void maiusculo(){
        Application application = new Application();
        String expected = "LEANDRO";
        String response = application.maiusculo("leandro");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void minusculo(){
        Application application = new Application();
        String expected = "leandro";
        String response = application.minusculo("LEANDRO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void contaLetrasDB1start(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contaLetrasDB1start("DB1Start");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void contaLetrasSemEspacos(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contaLetrasSemEspacos(" DB1Start ");
        Assert.assertEquals(expected, response);
    }

    @Test

    public void apenasPrimeirasLetras(){
        Application application = new Application();
        String expected = "Lean";
        String response = application.apenasPrimeirasLetras("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test

    public void aPartirDaTerceiraLetra(){
        Application application = new Application();
        String expected = ("ndro Mikio Takahashi");
        String response = application.aPartirDaTerceiraLetra("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void apenasUltimasLetras(){
        Application application = new Application();
        String expected = ("ashi");
        String response = application.apenasUltimasLetras("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    /*@Test  //Este teste não ficou dinâmico
    public void trocaNomePorAluno(){
        Application application = new Application();
        String expected = ("Aluno Mikio Takahashi");
        String response = application.trocaNomePorAluno("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }*/

    @Test
    public void trocaNomePorAluno(){
        Application application = new Application();
        String expected = ("Aluno Mikio Takahashi");
        String response = application.trocaNomePorAluno("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void separaPalavras(){
        Application application = new Application();
        String[] expected = new String[]{"banana", "maçã", "melancia"};
        String[] response = application.separaPalavras("banana, maçã, melancia");
        Assert.assertEquals(expected, response);
    }

    /*@Test
    public void contarVogais(){
        Application application = new Application();
        Integer expected = 10;
        String response = application.contaVogais("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }*/

    @Test
    public void deveContarQuantidadeDeVogais(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.quantidadeVogais("LEANDRO");
        Assert.assertEquals(expected, response);
    }
}
