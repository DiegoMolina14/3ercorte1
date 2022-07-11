package com.upchiapas;
import java.util.ArrayList;
import java.util.Scanner;
public class Lecturadedatos {
    private int opcion=0;
    private int tam=0;
    private ArrayList<Integer> Numeros=new ArrayList<>();
    public void datonumero(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dijite un numero");
        Numeros.add(entrada.nextInt());
    }
    public void menu(){
        ArrayList<Integer> Numerolista=new ArrayList<>();
        Procedimiento procedimiento=new Procedimiento();
        Scanner entrada=new Scanner(System.in);
        do {
            datonumero();
            System.out.println("(1)Agregar (2)Sumar (3)Salir");
            System.out.println("Opcion:");
            opcion= entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Agregue de nuevo");
                    System.out.println("Dijite un numero");
                    Numerolista.add(entrada.nextInt());
                    procedimiento.sumaNumerosecundario(Numerolista,Numeros);
                    break;
                case 2:
                    System.out.println("suma de numero");
                    procedimiento.sumaNumero(Numeros);
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        }while (opcion!=3);
    }
}
