/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael
 */
class Produto {
    
    private String nome;
    private String tipo;
    private float preco;
    
    Produto(String Nome,String tipo, float preco){
        this.nome=nome;
        this.tipo=tipo;
        this.preco=preco;
    }
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nome){
        this.nome=nome;
    }
    
    String getTipo(){
        return tipo;
    }
    
    void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    float getPreco(){
        return preco;
    }
    
    void setPreco(float preco){
        this.preco=preco;
    }
    
    
}
