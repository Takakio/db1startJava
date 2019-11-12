package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

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
    public void quantosImpares(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.quantosImpares(10);
        Assert.assertEquals(expected,response);
    }
}
