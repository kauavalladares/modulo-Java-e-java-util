package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);
       int valor = idadeRef.intValue();

       System.out.println(idadeRef.doubleValue());

       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);

       System.out.println(Integer.SIZE);
       System.out.println(Integer.BYTES);

        List<Integer> numeros = new ArrayList<Integer>(29);
        numeros.add(29);
      }
}
