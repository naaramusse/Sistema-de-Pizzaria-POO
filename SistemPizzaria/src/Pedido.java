
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael
 */
public class Pedido {
    
    private int numero;
    private Cliente cliente;
    private List<Produto> listProdutos;
    
    Pedido(int n, Cliente cliente,List<Produto> listProdutos){
        this.numero=n;
        this.cliente=cliente;
        this.listProdutos=listProdutos;
    }

    int getNumero(){
      return numero;
    }

    void setNumero(int numero){
      this.numero=numero;
    }

    Cliente getCliente(){
      return cliente;
    }

    void setCliente(int cliente){
      this.cliente=cliente;
    }

    List<Produto> getProduto(){
      return listProdutos;
    }

    void setProduto(int listProdutos){
      this.listProdutos=listProdutos;
    }
}
