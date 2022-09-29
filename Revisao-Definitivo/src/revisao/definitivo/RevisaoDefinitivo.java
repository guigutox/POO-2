/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */
public class RevisaoDefinitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClientePF cli1 = new ClientePF("Guilherme","Fernandes", "Algum");
        ContaCorrente cc = new ContaCorrente(100, 1, 2, 300, cli1);
        cc.sacar(100, 2);
        cc.depositar(1050);
        System.out.println(""+cc.titular.toString());
        System.out.println(""+cc.toString());
        
        System.out.println("\n////////////////\n");
        
        ClientePJ cli2 = new ClientePJ("Batataria", "Gabriel", "SLA");
        ContaPoupanca cp = new ContaPoupanca(10, 2, 3, 1000, cli2);
        cc.sacar(300, 3);
        cc.depositar(500);
        System.out.println(""+cp.titular.toString());
        System.out.println(""+cp.toString());
        
        
    }
    
}
