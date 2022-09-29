/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao.definitivo;

/**
 *
 * @author guilh
 */
public class ClientePJ  extends Cliente{
    
    public String razao;

    public ClientePJ(String razao, String nome, String endereco) {
        super(nome, endereco);
        this.razao = razao;
    }



    @Override
    public String toString() {
       return "Pessoa Juridica: " + this.nome + " (" + this.razao + ")";
  }
    
    
    
}
