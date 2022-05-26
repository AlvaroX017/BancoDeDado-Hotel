package bd_hotel;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection connect; //vai fazer a Conexão com o BD
    public Statement stat; //para passar comando ao BD
    public ResultSet resultado; //guardar resultado de consultas
    
    public void conectar(){        
        try {
            //Passa o nome do Driver para conexão
            Class.forName("com.mysql.jdbc.Driver");  
            
            connect =  (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost/hotel","root","");
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Verifique a biblioteca!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Verifique BD, usuário e senha ou se o MySQL está ON!");
        }       
    }
    
    public void manipularDados(String comandoSql){ //para fazer insert, update, delete   
        try {
            stat = (Statement) connect.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            stat.executeUpdate(comandoSql);    //chama esse método passando comando SQL
        } catch(SQLException sqlex) {            
            JOptionPane.showMessageDialog(null,
              "não foi possivel executar o comando \n"+sqlex+
                      ", o sql passado foi");           
        }    
    }

    public void executarConsulta (String comandoSelect){        
        try {
            stat = (Statement) connect.createStatement(
              ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            resultado = stat.executeQuery(comandoSelect);          
        } catch(SQLException sqlex) {
            JOptionPane.showMessageDialog(
                    null,"Erro no comando SQL de consulta\n"+sqlex+
                             ", o sql passado foi");
            }    
    }
    
    public void desconectar(){
       try{
            connect.close();           
        } catch (SQLException erroSQL) {            
            JOptionPane.showMessageDialog(null,"não foi possivel fechar a conexão\n"+erroSQL.getMessage());
        }    
    }
}

