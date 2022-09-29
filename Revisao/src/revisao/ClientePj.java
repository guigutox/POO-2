/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class ClientePj extends Cliente{
    
    public String razaosocial;s

    public ClientePj(String razaosocial, String nometitular, String endereco) {
        super(nometitular, endereco);
        this.razaosocial = razaosocial;
    }
    
}
