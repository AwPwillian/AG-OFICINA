package main;

import classes.Produto;
import java.util.ArrayList;

 public class main {

    public static void main (String[] args){
        /*Produto p = new Produto();
        p.setDescricao("Produto 01");
        p.setPreco(9.99);
        p.setQuantidade(12);
        p.adicionar();*/
        
        ArrayList<Produto> produtos = Produto.listar();
        for(Produto produto: produtos){
            int id = produto.getId();
            String descricao = produto.getDescricao();
            double preco = produto.getPreco();
            int quantidade = produto.getQuantidade();
            System.out.println(id + descricao + preco + quantidade); 
        }
    }
}