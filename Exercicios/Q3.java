package br.uniesp.poo.Exercicios;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioReajustado;
        double aumento = 0.2;

        System.out.println("Digite o seu nome ou então digite 'Fim' para encerrar o programa: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o seu salário: ");
        double salario = leitor.nextDouble();

        while(!"fim" .equals(nome)){

            if(salario < 500){
                salarioReajustado = (salario *  aumento) + salario;
                System.out.println("O valor do seu salário reajustado é de: " + salarioReajustado);
            }else{
                System.out.println("Você não tem direito ao aumento!");
            }
            System.out.println("Informe seu nome: ");
            nome = leitor.next();

            if("fim" .equals(nome)){
                break;
            }

            System.out.println("Informe seu salário: ");
            salario = leitor.nextDouble();
        }

        System.out.println("Programa encerrado!");
        leitor.close();
    }
}

