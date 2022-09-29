/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class ContaPoupanca  extends ContaBancaria{
    
    public double taxarendimento;

    public ContaPoupanca(int num, int senha, String nometitular, double taxarendimento) {
        super(num, senha, nometitular);
        this.taxarendimento = taxarendimento;
    }
    


    
    
    
    
}
