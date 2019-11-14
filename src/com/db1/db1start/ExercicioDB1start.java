package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioDB1start {

    public static void main(String[] args) {

    }

    public List<String> coresFavoritas(){
        List<String> listaDeCores = new ArrayList<>();
        listaDeCores.addAll(Arrays.asList("Branco", "Preto", "Vermelho"));
        return listaDeCores;
    }

    private static void imprimir(String titulo, List<String> listaDeCores) {
        System.out.println(titulo);
        System.out.println(listaDeCores);
    }

}