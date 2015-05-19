/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa e Ana
 */
public class Usuario {
    private String nome;
    private String matricula;
    private String senha;
    private String tipo;


    private String cpf;

    
    public Usuario(String nome,String matricula,String senha,String tipo,String cpf){
        this.nome=nome;
        this.matricula=matricula;
        this.senha=senha;
        this.tipo=tipo;
        this.cpf=cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String matricula){
        this.senha=senha;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
}
