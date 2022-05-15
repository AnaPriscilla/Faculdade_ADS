/*
 */
package br.com.AnaPriscilla.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.AnaPriscilla.model.Objeto;

/**
 *
 * @author anapriscilla
 */
public class ObjetoDao {
    
    private Connection connection;

    public ObjetoDao() {
        this.connection = Conexao.getConnection();
    }
    
    public void inserirObj(Objeto obj){
        
        try {
            String sql = "INSERT INTO tabela_anapriscilla (id_anapriscilla, descricao_anapriscilla, cpf_anapriscilla, email_anapriscilla, datanascimento_anapriscilla) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.setString(2, obj.getDescricao());
            ps.setString(3, obj.getCpf());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getDatanascimento());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjetoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Objeto> listarTodosObj(){
        List<Objeto> lista = new ArrayList<Objeto>();
        
        try {
            String sql = "SELECT * FROM tabela_anapriscilla ORDER BY id_anapriscilla ASC";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                Objeto obj = new Objeto();
                obj.setId(rs.getInt("id_anapriscilla"));
                obj.setDescricao(rs.getString("descricao_anapriscilla"));
                obj.setCpf(rs.getString("cpf_anapriscilla"));
                obj.setEmail(rs.getString("email_anapriscilla"));
                obj.setDatanascimento(rs.getString("datanascimento_anapriscilla"));
                lista.add(obj);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ObjetoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public void alterarObj(Objeto obj){
        try {
            String sql = "UPDATE tabela_anapriscilla SET descricao_anapriscilla = ? WHERE id_anapriscilla = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, obj.getDescricao());
            ps.setInt(2, obj.getId());
         
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjetoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removerObj(int id){
        try {
            String sql = "DELETE FROM tabela_anapriscilla WHERE id_anapriscilla = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ObjetoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
