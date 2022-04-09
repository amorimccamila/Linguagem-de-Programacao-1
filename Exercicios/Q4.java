package br.uniesp.poo.Exercicios;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int refrigerante = 3;
        double gasolina = 2.50;

        System.out.println("Quantos litros foram necessários para abastecer o seu veículo? ");
        int litros = leitor.nextInt();

        double conta = (refrigerante) + (gasolina);

        System.out.println("Valor total da compra: R$ " + conta);


    }
}
