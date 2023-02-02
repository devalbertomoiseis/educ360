package com.br.basico;

import java.util.Scanner;

public class AtividadeCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int numero2 = scan.nextInt();

        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Multiplicacao");
        System.out.println("3. Divisao");
        System.out.println("4. Subtracao");
        System.out.println("0. Sair");
        System.out.println("Operação: ");
        int operacao = scan.nextInt();

        if(operacao == 1){
            int soma = numero1 + numero2;
            System.out.println("soma: " + soma);
        }else if(operacao == 2){
            int mult = numero1 * numero2;
            System.out.println("mult: " + mult);
        }else if(operacao == 3){
            int div = numero1 / numero2;
            System.out.println("div: " + div);
        }else if(operacao == 4){
            int sub = numero1 - numero2;
            System.out.println("sub " + sub);
        }else if(operacao == 0) {
            scan.close();
        }else{
            System.out.println("Erro nos valores e operação");
        }


    }
}
