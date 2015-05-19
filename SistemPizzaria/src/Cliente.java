/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael
 */
public class Cliente {
    private String nome;
    private String telefone1,telefone2;
    private String endereco;
    private String cep;
    
    Cliente(String nome, String telefone1, String telefone2,String endereco,String cep){
        this.nome=nome;
        this.telefone1=telefone1;
        this.telefone2=telefone2;
        this.endereco=endereco;
        this.cep=cep;
    }
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nome){
        this.nome=nome;
    }
    
    String getTelefone1(){
        return telefone1;
    }
    
    void setTelefone1(String telefone1){
        this.telefone1=telefone1;
    }
    
    String getTelefone2(){
        return telefone2;
    }
    
    void setTelefone2(String telefone2){
        this.telefone2=telefone2;
    }
    
    String getEndereco(){
        return endereco;
    }
    
    void setEndereco(String endereco){
        this.endereco=endereco;
    }
    String getCep(){
        return cep;
    }
    
    void setCep(String cep){
        this.cep=cep;
    }
    
    
    
    
}
