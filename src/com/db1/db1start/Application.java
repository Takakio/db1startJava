package com.db1.db1start;

public class Application {

    public Integer soma (Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    public Integer multiplicacao (Integer numero1, Integer numero2){
        return numero1 * numero2;
    }

    public Integer divisao (Integer numero1, Integer numero2){
        return numero1 / numero2;
    }

    public Integer par (Integer numero1){
        return numero1 % 2;
    }

    public Integer quantosImpares(Integer numero1){
        Integer i;
        i = 0;
        Integer contador;
        contador = 0;

        while(i <= numero1){
            if (i % 2 != 0) {
                contador = contador +1;
            }
            i++;
        }
        return contador;
    }
}
