package com.br.basico;

import java.util.Scanner;

public class AtividadeSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }
}
