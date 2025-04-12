/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.arthursiq5.src;

/**
 *
 * @author Arthur
 */
public class ContaTerminalFactory {
    private String nomeConta;
    private int agencia;
    private String conta;
    private double saldo;
    
    public void setNome (String nome) {
        this.nomeConta = nome;
    }
    
    public void setAgencia (int agencia) {
        this.agencia = agencia;
    }
    
    public void setAgencia (String agencia) {
        this.setAgencia(Integer.parseInt(agencia));
    }
    
    public void setConta (String conta) {
        this.conta = conta;
    }
    
    public void setConta (int conta) {
        this.setConta(conta + "");
    }
    
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    
    public void setSaldo (String saldo) {
        String saldoCorrigido = saldo.replaceAll(",", ".");
        this.setSaldo(Double.parseDouble(saldoCorrigido));
    }
    
    public ContaTerminal generate (){
        return new ContaTerminal(
                this.nomeConta,
                this.agencia,
                this.conta,
                this.saldo
        );
    }
}
