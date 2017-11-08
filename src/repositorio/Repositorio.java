package repositorio;

import classes.Cliente;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Repositorio extends Cliente{

    Conexao objconexao = new Conexao();
    
      public String inserir(Repositorio objRepositorio) {
        try {
            String sql = "insert into cardapio(prato, descricao, quantidade, preco)values(?,?,?,? )";
            PreparedStatement stmt = objconexao.getConexao().prepareStatement(sql);

            stmt.setString(1, objRepositorio.getPrato());
            stmt.setString(2, objRepositorio.getDescricao());
            stmt.setInt(3, objRepositorio.getQuantidade());
            stmt.setDouble(4, objRepositorio.getPreco());

            stmt.execute();

            stmt.close();

            return "Inserido com sucesso!";
        } catch (SQLException ex) {
            return "Erro ao inserir:" + ex.getMessage();
        }
        
    }
      public ArrayList<Cliente>retornar(Repositorio objRepositorio){
    try{
        ArrayList<Cliente>listaCliente= new ArrayList();
        String sql ="select * from cardapio where code = ?";
        PreparedStatement stmt = objconexao.getConexao().prepareStatement(sql);
        stmt.setString(1,String.valueOf(objRepositorio.getCode()));
        ResultSet retorno = stmt.executeQuery();
        while (retorno.next()){
            Cliente objUsuario = new Cliente();
            objUsuario.setCode(retorno.getInt("code"));
            objUsuario.setPrato(retorno.getString("prato"));
            objUsuario.setDescricao(retorno.getString("descricao"));
            objUsuario.setQuantidade(retorno.getInt("quantidade"));
            objUsuario.setPreco(retorno.getDouble("preco"));
            
            listaCliente.add(objUsuario);
        }
        stmt.close();
        return listaCliente;
    }catch (SQLException ex){
        return null;
    }
    
    }
       public String alterar(Repositorio objRepositorio) {
       try{
           String sql="update cardapio set Prato=?,Descrição=?, Quantidade=? where Preço=?";
           PreparedStatement stmt= objconexao.getConexao().prepareStatement(sql);
           
            stmt.setString(1, objRepositorio.getPrato());
            stmt.setString(2, objRepositorio.getDescricao());
            stmt.setInt(3, objRepositorio.getQuantidade());
            stmt.setDouble(4, objRepositorio.getPreco());

            stmt.execute();
            stmt.close();
            return "Alterado com sucesso!";
       }catch(SQLException ex){
           return "Erro ao alterar:"+ex.getMessage();
       }
    }

    public String excluir(Repositorio objRepositorio) {
        try{
           String sql="delete from cardapio where Prato=?";
           PreparedStatement stmt= objconexao.getConexao().prepareStatement(sql);
           
            
            stmt.setString(1, objRepositorio.getPrato());
           

            stmt.execute();
            stmt.close();
            return "Excluído com sucesso!";
       }catch(SQLException ex){
           return "Erro ao excluir:"+ex.getMessage();
       }
    }
    

    public ArrayList<Cliente> retornarTodos() {
           try{
        ArrayList<Cliente>listaCliente= new ArrayList<>();
        String sql ="select * from cardapio";
        PreparedStatement stmt = objconexao.getConexao().prepareStatement(sql);
       
        ResultSet retorno = stmt.executeQuery();
        while (retorno.next()){
            Cliente objCliente = new Cliente();
            objCliente.setCode(retorno.getInt("code"));
            objCliente.setPrato(retorno.getString("prato"));
            objCliente.setDescricao(retorno.getString("descricao"));
            objCliente.setQuantidade(retorno.getInt("quantidade"));
            objCliente.setPreco(retorno.getDouble("preco"));
            
            listaCliente.add(objCliente);
        }
        stmt.close();
        
        return listaCliente;
    }catch (SQLException ex){
        return null;
    }
    
    }

    
}
