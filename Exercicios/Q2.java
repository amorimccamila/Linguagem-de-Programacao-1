package br.uniesp.poo.Exercicios;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro e saiba se é ímpar ou par: ");
        numero = leitor.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número informado é par!");
        }else{
            System.out.println("O número informado é ímpar!");
        }


    }
}
