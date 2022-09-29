/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class ContaBancaria {
    
    public int num;
    private int senha;
    protected double saldo;
    public Cliente titular;
    
    ContaBancaria(int num, int senha, String nometitular){
        this.titular.nometitular = nometitular;
        this.num = num;
        this.senha = senha;
        this.saldo = 0;
    }
    
   public boolean sacar(double valor, int senha){
       if(this.senha != senha){
           return false;
       }else{
           if(valor < saldo){
              saldo = saldo - valor;
              return true;
           }else{
               return false;
           }
       }
   }
   
      public boolean depositar(double valor, int senha){
       if(this.senha != senha){
           return false;
       }else{
           if(valor > 0){
              saldo = saldo + valor;
              return true;
           }else{
               return false;
           }
       }
   }
    
      public void imprimirSaldo(){
          System.out.println("O saldo da conta e: "+this.saldo);
      }
      
 
      
      
    
    
    
}
