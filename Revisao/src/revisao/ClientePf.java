/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author facom
 */
public class ClientePf extends Cliente{

    public String sobrenometitular;
    
    public ClientePf(String nometitular, String sobrenometitular, String endereco) {
        super(nometitular,endereco);
        this.sobrenometitular = sobrenometitular;
    }
    
    
}
