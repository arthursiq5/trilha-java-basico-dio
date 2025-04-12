/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.arthursiq5.src;

/**
 *
 * @author Arthur
 */
public class ContaTerminal {
    private String nomeConta;
    private int agencia;
    private String conta;
    private double saldo;
    
    public ContaTerminal(String nomeConta, int agencia, String conta, double saldo) {
        this.nomeConta = nomeConta;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
    
    public ContaTerminal (String nomeConta, int agencia, String conta) {
        this.nomeConta = nomeConta;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }
    
    public ContaTerminal (String nomeConta, int agencia, int conta) {
        this.nomeConta = nomeConta;
        this.agencia = agencia;
        this.conta = String.valueOf(conta) + "-1";
        this.saldo = 0;
    }
    
    public boolean aumentarSaldo (double acrescimo) {
        if (acrescimo <= 0) return false;
        this.saldo += acrescimo;
        return true;
    }
    
    public boolean reduzirSaldo (double reducao) {
        if (reducao <= 0) return false;
        this.saldo -= reducao;
        return true;
    }
    
    public String criarContaMensagem() {
        return "Olá " + this.nomeConta + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + this.agencia + ", conta " + this.conta + " "
                + "e seu saldo " + this.saldo + " já está disponível para saque";
    }
    
    public String toJson () {
        String linhaJson = String.format(
                "{"
                        + "\"nomeConta\":\"%s\","
                        + "\"agencia\":%d,"
                        + "\"conta\":\"%s\","
                        + "\"saldo\":%f" +
                "}",
                this.nomeConta,
                this.agencia,
                this.conta,
                this.saldo);
        return linhaJson;
    }
    
    public static void main(String[] args) {
        ContaTerminal ct = new ContaTerminal("Teste Teste", 1, "0001-1");
        System.out.println(ct.criarContaMensagem());
    }
}
