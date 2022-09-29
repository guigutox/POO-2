/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class ContaCorrente extends ContaBancaria{
    
    public double limiteespecial;

    public ContaCorrente(int num, int senha, String nometitular, double limiteespecial) {
        super(num, senha, nometitular);
        this.limiteespecial = limiteespecial;
    }


    
    
    @Override
    public boolean sacar(double valor, int senha){
        
       
        System.out.println("Insira o valor a ser sacado");
        if(valor > saldo){
            if( valor > saldo+limiteespecial){
                System.out.println("Impossivel realizar, pois excede saldo e limite especial");
                return false;
            }else{
                System.out.println("Entrou no limite especial");
                saldo = (saldo-valor);
                System.out.println("Saldo atual: "+saldo);
                return true;
            } 
        }else{
            System.out.println("Realizado com sucesso");
            saldo = saldo-valor;
            System.out.println("Saldo atual: "+saldo);
            return true;
        }
        
    }
    
    
}
