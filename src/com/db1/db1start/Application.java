package com.db1.db1start;

public class Application {

    public Integer soma (Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    public Integer subtracao (Integer numero1, Integer numero2){
        return numero1 - numero2;
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

    public Integer maior(Integer numero1, Integer numero2){
        if (numero1 > numero2){
            return numero1;
        }
        return numero2;
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

    //-----------------------------------------------------------------------------------------------------------------------

    public String maiusculo(String texto){
        String textoMaiusculo = texto.toUpperCase();
        return textoMaiusculo;

    }

    public String minusculo(String texto){
        String textoMinusculo = texto.toLowerCase();
        return textoMinusculo;

    }

    public Integer contaLetrasDB1start(String texto){
        Integer quantidadeDeLetrasDB1start = texto.length();
        return quantidadeDeLetrasDB1start;
    }
    private String removeNumerosDaString(String texto){
        String removeNumerosDaString;
        return texto.replaceAll("[0-9]", "");
    }


    public Integer contaLetrasSemEspacos(String texto){
        String textoSemEspacos = texto.trim();
        Integer quantasLetras = textoSemEspacos.length();
        return quantasLetras;
    }

    public String apenasPrimeirasLetras(String texto){
        String primeirasLetras = texto.substring(0,4);
        return primeirasLetras;
    }

    public String aPartirDaTerceiraLetra(String texto){
        String restoDaPalavra = texto.substring(3);
        return restoDaPalavra;
    }

    public String apenasUltimasLetras(String texto){
        String textoSemEspacos = texto.trim();
        Integer contaLetras = textoSemEspacos.length();
        String ultimasLetras = textoSemEspacos.substring(contaLetras-4);
        return ultimasLetras;
    }

    public String trocaNomePorAluno(String texto){
        Integer indiceEspaco = texto.indexOf(" ");
        String nomeTratado = texto.substring(indiceEspaco);
        String aluno = "Aluno";
        return aluno.concat(nomeTratado);
    }

    /*public String trocaNomePorAluno(String texto){
        String trocaNome = texto.replaceAll("Leandro", "Aluno");
        return trocaNome;
    }*/

    public String[] separaPalavras(String texto){
        return texto.split(", ");
    }

    /*public Integer contaVogais(String texto){
        Integer contador = 0;
        texto.toLowerCase();

        for (Integer i = 0; i < texto.length(); i++){
            Integer letra = texto.charAt(i);
            if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
                contador++;
            }
        }

        return contador;
    }*/

    public Integer quantidadeVogais(String texto){
        return texto
                .trim()
                .replace(" ", "")
                .toUpperCase()
                .replaceAll("[^AEIOU]", "")
                .length();
    }
}
