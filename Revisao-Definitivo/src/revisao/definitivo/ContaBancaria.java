/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */




public class ContaBancaria {
    
    public int numero;
    private int senha;
    protected double saldo;
    public String nometitular;
    public Cliente titular;

    public ContaBancaria(int numero, int senha, double saldo, Cliente cli) {
        this.titular = cli;
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;

     
    }
    
    public boolean sacar(double valor, int senha){
        if(senha == this.senha){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
     public void depositar(double valor){
         if(valor > 0){
             this.saldo = this.saldo + valor;
         }
    }


   static void imprimirSaldo(double saldo){
        System.out.println("O saldo e: "+saldo);
}
     
    
}
