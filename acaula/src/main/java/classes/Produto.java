package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto {
    protected int id;
    protected String descricao;
    protected double preco;
    protected int quantidade;

    public void adicionar( ){
        String sql = "INSERT INTO produto (descricao, preco, quantidade) VALUES (?, ?, ?)";

        Connection con = DB.conexao();

        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, this.getDescricao()); 
            stmt.setDouble(2, this.getPreco()); 
            stmt.setInt(3, this.getQuantidade());
            stmt.execute();

        }catch(SQLException e){ 
            System.out.println("Erro no adicionar Produto: " + e.toString()); 
        }

    }
    
    public static ArrayList<Produto> listar( ){
        String sql = "SELECT * FROM produto";
        ArrayList<Produto> produtos = new ArrayList<>();
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet registros = stmt.executeQuery();
            
            while(registros.next()){
                Produto temp = new Produto();
                temp.setId(registros.getInt("id"));
                temp.setDescricao(registros.getString("descricao"));
                temp.setPreco(registros.getDouble("preco"));
                temp.setQuantidade(registros.getInt("quantidade"));
                produtos.add(temp);
            }
        }catch(SQLException e){
            System.out.println("Erro no Listar Produto: " + e.toString());
        }
        return produtos;
    }
    public void atualizar( ){ }
    public void excluir( ){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
