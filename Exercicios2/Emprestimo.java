package br.uniesp.poo.Exercicios2;

public class Emprestimo {
    String nomeUsuario;
    int idade;
    float valorEmprestimo;
    float percJurosMes;
    int mesesPagar;

    public void imprimir(){
        System.out.println("O nome do usuário é: " + nomeUsuario);
        System.out.println("Sua Idade é: " + idade);
        System.out.println("O Valor do empréstimo é: " + valorEmprestimo);
        System.out.println("O Preço de juros mensal é: " + percJurosMes);
        System.out.println("Quantidade de parcelas: " + mesesPagar);
    }

    public void calcularEmprestimo(){
        if (idade >= 18  idade < 23){
            valorEmprestimo += (valorEmprestimo / mesesPagar) * percJurosMes;
        }else{
            if(idade > 23  idade <= 33){
                valorEmprestimo = (valorEmprestimo * 10)/100;
            }
        }
    }

}