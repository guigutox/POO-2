/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
        ContaCorrente cc = new ContaCorrente(1, 2, "Gui", 100);
        
         cc.depositar(100, 2);
         cc.sacar(200, 2);
         cc.depositar(1000, 2);
         cc.imprimirSaldo();
         
        ContaPoupanca cp = new ContaPoupanca(2, 3, "Gogos", 10);
        
        cp.depositar(100, 3);
        cp.sacar(50, 3);
        cp.imprimirSaldo();
         
        
        
        
    }
    
}
