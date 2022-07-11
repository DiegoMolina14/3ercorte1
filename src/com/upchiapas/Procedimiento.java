package com.upchiapas;

import java.util.ArrayList;

 public class Procedimiento {

        private int sumaTotal=0;
        private int suma=0;
        public void sumaNumero(ArrayList<Integer> Numeros) {
            Impresion impresion=new Impresion();
            for (Integer numeros:Numeros) {
                suma += numeros;
            }
            impresion.ImpresiondeResultado(suma);
            Numeros.clear();
        }
        public void sumaNumerosecundario(ArrayList<Integer>Numerolista,ArrayList<Integer>Numeros){
            int resultadouno=0; int resultadodos=0;

            for (Integer numerolista: Numerolista) {
                resultadouno +=numerolista;
            }
            for (Integer numero:Numeros) {
                resultadodos +=numero;
            }
            sumatotal(resultadouno,resultadodos);
            Numerolista.clear();
            Numeros.clear();
        }
        public void sumatotal(int resultadouno,int resultadodos){
            Impresion impresion=new Impresion();
            sumaTotal=resultadouno+resultadodos;
            impresion.ImpresiondeResultadoDos(sumaTotal);
        }
    }


