package wazaa;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Connect {
    
    public Connect(){
        System.out.println("construye");
    }
    
    static Connection conn = null;
    
    public Connection connect() {
        
        try {
            String url = "jdbc:sqlite:database/historial.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    } 
    
    public void insert(String operacion) {
        
        String sql = "INSERT INTO registro(operacion) VALUES('";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql+operacion+"')");
            pstmt.executeUpdate();
            System.out.println("Datos guardados");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void insertdos(String operacion) {
        String sql = "INSERT INTO registro(operacion) VALUES(?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, operacion);
            pstmt.executeUpdate();
            System.out.println("Datos guardados");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    HistorialBtn hisbtn = new HistorialBtn();
    
    public void selectAll(){
        
        String sql = "SELECT operacion FROM registro";
        String his="";

        try {
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            while (rs.next()) {
                his = his + (rs.getString("operacion") + "\n");
            }
            hisbtn.update(his);
            hisbtn.setLookAndFeel(Jframe.getTemaID());
            hisbtn.setVisible(true);
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    static Statement stmt;
    
    public static void limpiar(){
        
       String sql = "DELETE FROM registro WHERE ID = ?";
       String sqln = "SELECT operacion FROM registro";
        
        try{
            stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sqln);
            int id = 0;
            
            while (rs.next()){
                
                id = id +1;
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
                pstmt.setInt(1, id);

                pstmt.executeUpdate();
                System.out.println(id);
            }
            System.out.println("Limpiado correctamente");
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
