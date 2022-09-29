/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */
public class ClientePF extends Cliente{
    
    public String sobrenome;

    public ClientePF( String nome,  String sobrenome, String endereco) {
        super(nome, endereco);
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
         return "Pessoa Juridica: " + this.nome + " (" + this.sobrenome + ")";
    }
    
    
    
    
}
