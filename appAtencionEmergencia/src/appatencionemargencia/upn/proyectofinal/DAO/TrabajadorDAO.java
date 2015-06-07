/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appatencionemargencia.upn.proyectofinal.DAO;

import appatencionemergencia.upn.proyectofinal.Entidades.Tipo_Trabajador;
import appatencionemergencia.upn.proyectofinal.Entidades.Trabajador;
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
public class TrabajadorDAO {
    
    public boolean RegistrarTrabajador(Trabajador objTrabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("INSERT INTO TRABAJADOR(ID,NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,NROCOLEGIATURA,TELEFONO,USUARIO,CLAVE,IDTIPOTRABAJADOR)\n" +
                        " VALUES(SQ_TRABAJADOR.NEXTVAL,?,?,?,?,?,?,?,?)");
            pstm.setString(1, objTrabajador.getNombre());
            pstm.setString(2, objTrabajador.getApellidoPaterno());
            pstm.setString(3, objTrabajador.getApellidoMaterno());
            pstm.setString(4, objTrabajador.getNroColegiatura());
            pstm.setString(5, objTrabajador.getTelefono());
            pstm.setString(6, objTrabajador.getUsuario());
            pstm.setString(7, objTrabajador.getClave());
            pstm.setInt(8, objTrabajador.getObjTipoTrabajador().getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
               e.printStackTrace();
        }
        return retornar;
    }
    
    public boolean ActualizarTrabajador(Trabajador objTrabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("UPDATE TRABAJADOR SET NOMBRE=?,APELLIDOPATERNO=?,APELLIDOMATERNO=?,"
                    + "NROCOLEGIATURA=?,TELEFONO=?,USUARIO=?,CLAVE=?,IDTIPOTRABAJADOR=? "
                    + "WHERE ID=?");
            pstm.setString(1, objTrabajador.getNombre());
            pstm.setString(2, objTrabajador.getApellidoPaterno());
            pstm.setString(3, objTrabajador.getApellidoMaterno());
            pstm.setString(4, objTrabajador.getNroColegiatura());
            pstm.setString(5, objTrabajador.getTelefono());
            pstm.setString(6, objTrabajador.getUsuario());
            pstm.setString(7, objTrabajador.getClave());
            pstm.setInt(8, objTrabajador.getObjTipoTrabajador().getId());
            pstm.setInt(9,objTrabajador.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retornar;
    }
    
    public boolean EliminarTrabajador(Trabajador objTrabajador)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("DELETE FROM TRABAJADOR WHERE ID = ?");
            pstm.setInt(1, objTrabajador.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retornar;
    }
    
    public List<Trabajador> ListarTrabajador()throws SQLException{
        List<Trabajador> listadotrabajador = new ArrayList<>();
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT T.ID,T.NOMBRE,T.APELLIDOPATERNO,T.APELLIDOMATERNO,T.NROCOLEGIATURA,"
                    + "T.TELEFONO,T.USUARIO,T.CLAVE,TI.DESCRIPCION FROM TRABAJADOR T\n" +
                    " INNER JOIN TIPO_TRABAJADOR TI ON(T.IDTIPOTRABAJADOR=TI.ID)");
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {                
                Trabajador trabajador = new Trabajador();
                trabajador.setId(rst.getInt("ID"));
                trabajador.setNombre(rst.getString("NOMBRE"));
                trabajador.setApellidoPaterno(rst.getString("APELLIDOPATERNO"));
                trabajador.setApellidoMaterno(rst.getString("APELLIDOMATERNO"));
                trabajador.setNroColegiatura(rst.getString("NROCOLEGIATURA"));
                trabajador.setTelefono(rst.getString("TELEFONO"));
                trabajador.setUsuario(rst.getString("USUARIO"));
                trabajador.setClave(rst.getString("CLAVE"));
                Tipo_Trabajador tipo = new Tipo_Trabajador();
                tipo.setDescripcion(rst.getString("DESCRIPCION"));
                trabajador.setObjTipoTrabajador(tipo);
                listadotrabajador.add(trabajador);
            }
            pstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listadotrabajador;
    }
    
    public Trabajador validaLogin(String user,String clave)throws SQLException{
        Trabajador objTrabajador = new Trabajador();
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("select t.ID,ti.descripcion from TIPO_TRABAJADOR ti inner join \n" +
                        "TRABAJADOR t on (ti.ID = t.IDTIPOTRABAJADOR)\n" +
                        "where t.USUARIO='"+user+"' and t.CLAVE='"+clave+"'");
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {                
                objTrabajador.setId(rst.getInt("ID"));
                Tipo_Trabajador tipo = new Tipo_Trabajador();
                tipo.setDescripcion(rst.getString("descripcion"));
                objTrabajador.setObjTipoTrabajador(tipo);
            }
            pstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objTrabajador;
    }
}
