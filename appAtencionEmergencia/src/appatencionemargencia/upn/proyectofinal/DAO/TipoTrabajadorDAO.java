/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appatencionemargencia.upn.proyectofinal.DAO;

import appatencionemergencia.upn.proyectofinal.Entidades.Tipo_Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul
 */
public class TipoTrabajadorDAO {
    
    public boolean RegistrarTipo(Tipo_Trabajador objTipoTrabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("INSERT INTO TIPO_TRABAJADOR(ID,DESCRIPCION) VALUES (SQ_TIPOTRABAJADOR.NEXTVAL,?)");
            pstm.setString(1, objTipoTrabajador.getDescripcion());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            System.out.println("ERROR - TIPOTRABAJADOR - DAO - REGISTRARTIPO" + e.getMessage());
            e.printStackTrace();
        }
        return retornar;
    }
    
    
    
    
    public boolean ActualizarTipo(Tipo_Trabajador obTipo_Trabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("UPDATE TIPO_TRABAJADOR SET DESCRIPCION=? WHERE ID=?");
            pstm.setString(1, obTipo_Trabajador.getDescripcion());
            pstm.setInt(2, obTipo_Trabajador.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            System.out.println("ERROR - TIPOTRABAJADOR - DAO - ACTUALIZARTIPO" + e.getMessage());
            e.printStackTrace();
        }
        return retornar;
    }
    
    public boolean EliminarTipo(Tipo_Trabajador obTipo_Trabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("DELETE FROM TIPO_TRABAJADOR WHERE ID=?");
            pstm.setInt(1, obTipo_Trabajador.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            System.out.println("ERROR - TIPOTRABAJADOR - DAO - ELIMINARTIPO" + e.getMessage());
            e.printStackTrace();
        }
        return retornar;
    }
    
    public List<Tipo_Trabajador> ListaDeTipo()throws SQLException{
        List<Tipo_Trabajador> listartipo = new ArrayList<>();
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT ID,DESCRIPCION FROM TIPO_TRABAJADOR");
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {                
                Tipo_Trabajador tipo = new Tipo_Trabajador();
                tipo.setId(rst.getInt("ID"));
                tipo.setDescripcion(rst.getString("DESCRIPCION"));
                listartipo.add(tipo);
            }
            pstm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR - TIPOTRABAJADOR - DAO - LISTARTIPO" + e.getMessage());
            e.printStackTrace();
        }
        return listartipo;
    }
    
}
