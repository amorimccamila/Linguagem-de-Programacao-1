package br.uniesp.poo.Exercicios;

import java.util.Scanner;

public class StarTropper {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float creditos;
        int percentualAumento;
        float creditoReajustado;


        System.out.println("Informe os créditos: ");
        creditos = leitor.nextFloat();
        System.out.println("Informe o percentual de aumento salarial: ");
        percentualAumento = leitor.nextInt();

        creditoReajustado = ((creditos * percentualAumento)/100) + creditos;

        System.out.println(" O valor dos créditos galácticos com o percentual de aumento foi: " + creditoReajustado);


    }



}


