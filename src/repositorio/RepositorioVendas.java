
package repositorio;

import classes.Cliente;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RepositorioVendas extends Cliente{
    
    
    
    Conexao objconexao2 = new Conexao();
    
      public String inserir(RepositorioVendas objRepositorioVendas) {
        try {
            String sql = "insert into vendas(item, descricao, quantidade, total)values(?,?,?,? )";
            PreparedStatement stmt = objconexao2.getConexao().prepareStatement(sql);

            stmt.setString(1, objRepositorioVendas.getItem());
            stmt.setString(2, objRepositorioVendas.getDescricao());
            stmt.setInt(3, objRepositorioVendas.getQuantidade());
            stmt.setDouble(4, objRepositorioVendas.getTotal());

            stmt.execute();

            stmt.close();

            return "Inserido com sucesso!";
        } catch (SQLException ex) {
            return "Erro ao inserir:" + ex.getMessage();
        }
        
    }
     public ArrayList<Cliente>retornar(RepositorioVendas objRepositorioVendas){
    try{
        ArrayList<Cliente>listaCliente= new ArrayList();
        String sql ="select * from vendas where item like ?";
        PreparedStatement stmt = objconexao2.getConexao().prepareStatement(sql);
        stmt.setString(1,"%"+objRepositorioVendas.getPrato()+"%");
        ResultSet retorno = stmt.executeQuery();
        while (retorno.next()){
            Cliente objUsuarioCliente = new Cliente();
            objUsuarioCliente.setCode(retorno.getInt("code"));
            objUsuarioCliente.setItem(retorno.getString("item"));
            objUsuarioCliente.setDescricao(retorno.getString("descricao"));
            objUsuarioCliente.setQuantidade(retorno.getInt("quantidade"));
            objUsuarioCliente.setTotal(retorno.getDouble("total"));
            
            listaCliente.add(objUsuarioCliente);
        }
        stmt.close();
        return listaCliente;
    }catch (SQLException ex){
        return null;
    }
    
    
}
}
