/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */
public class ContaCorrente extends ContaBancaria implements Tributavel{
    
    public double limiteespecial;

    public ContaCorrente(double limiteespecial, int numero, int senha, double saldo, Cliente cli) {
        super(numero, senha, saldo, cli);
        this.limiteespecial = limiteespecial;
    }

    @Override
    public String toString() {
        return "Conta Corrente\nSaldo:"+this.saldo;
    }

    public double getValorImposto(){
        
        return (this.saldo/100);
    }
    
    
    
    
    
}
