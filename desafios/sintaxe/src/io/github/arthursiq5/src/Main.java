/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.arthursiq5.src;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Main {
    private static void menuInicial() {
        System.out.println("Bem-vindo ao nosso banco\n");
        System.out.println("Por favor, selecione uma opção:");
        System.out.println("1 - criar conta");
        System.out.println("2 - listar contas existentes");
        System.out.println("3 - apagar conta");
        System.out.println("0 - sair");
        System.out.println("\nSelecione uma opção:");
    }
    
    private static void criarConta(Scanner sc) {
        String nomeConta;
        int agencia;
        String conta;
        double saldo;
        
        System.out.println("Digite seu nome completo:");
        nomeConta = sc.nextLine();
        System.out.println("Digite sua agência:");
        agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite sua conta:");
        conta = sc.nextLine();
        System.out.println("Digite seu saldo:");
        saldo = sc.nextDouble();
        sc.nextLine();
        
        ContaTerminal ct = new ContaTerminal(nomeConta, agencia, conta, saldo);
        System.out.println(ct.criarContaMensagem());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {            
            menuInicial();
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) criarConta(sc);
        } while (opcao != 0);
    }
}
