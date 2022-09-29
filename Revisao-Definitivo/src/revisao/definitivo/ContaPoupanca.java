/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */
public class ContaPoupanca extends ContaBancaria{
    
    public double taxarendimento;

    public ContaPoupanca(double taxarendimento, int numero, int senha, double saldo, Cliente cli) {
        super(numero, senha, saldo, cli);
        this.taxarendimento = taxarendimento;
    }
    
    public void imprimirSaldo(){
        System.out.println("O saldo e: "+this.saldo);
    }

    @Override
    public String toString() {
        return "Conta Poupanca\nSaldo:"+this.saldo;
    }
    
    
    
}
