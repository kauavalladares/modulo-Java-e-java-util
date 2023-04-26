package br.com.bytebank.banco.teste.util;


import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class teste {

    public static void main(String[] args) {

        LinkedList<Conta> lista =  new LinkedList<>();

        Conta cc =  new ContaCorrente(11,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);


        System.out.println("tamanho: " + lista.size());
        Conta ref = (Conta)lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("tamanho: " + lista.size());

        Conta cc3 =  new ContaCorrente(33,33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44,44);
        lista.add(cc4);

        for (int i = 0; i <lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("--------------------------------------");

        for (Object oref : lista){
            System.out.println(oref);
        }
     }
}
