/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanu
 */
public class CitaDao {
     //Se crean variables para la conexion a la base de datos.
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
     public boolean agregar (Cita cita, String cedulaCliente){
        String sql = "SELECT * FROM cliente WHERE cedula =?";
        int idCliente = -1;
        boolean pasa = false;
        try{
            //Conexion a la db.
            con = cn.getConnection();
            //Se prepara peticion.
            ps=con.prepareStatement(sql);
            ps.setString(1, cedulaCliente);
            //Se envia peticion.
            rs = ps.executeQuery();
            //Se llenan los datos para ser enviados al controlador.
             while (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
        }catch(Exception e){
            System.err.println("Se ha producido un error buscando la cedula " + cedulaCliente + ": "+ e);
            pasa=false;
        }
        if(idCliente > -1){
            sql = "INSERT INTO cita(fecha, odontologo, idCliente) VALUES(?,?,?)";
            try{
                //Conexion a la db.
                con = cn.getConnection();
                //Se prepara peticion.
                ps=con.prepareStatement(sql);
                //Se obtienen los datos de la cita que se recibe como parámetro en los argumentos.
                ps.setString(1, cita.getFecha());
                ps.setString(2, cita.getOdontologo());
                ps.setInt(3, idCliente);
                //Se envia peticion.
                ps.executeUpdate(); 
                pasa=true;
            }catch(Exception e){
                System.err.println("Se ha producido un error insertando la cita: " + e);
                pasa=false;
            } finally {
                // Cerrar la conexión y liberar recursos
                try { if (rs != null) rs.close(); } catch (SQLException e) {}
                try { if (ps != null) ps.close(); } catch (SQLException e) {}
                try { if (con != null) con.close(); } catch (SQLException e) {}
            }
        }
        return pasa;
    }
    
    public List<CitaCliente> listarCitas() {
        List<CitaCliente> listaCitas = new ArrayList<>();

        String sql = "SELECT nombre,telefono,odontologo,fecha FROM cita INNER JOIN cliente ON cliente.idCliente = cita.idCliente";

        try {
            //Conexion a la db.
            con = cn.getConnection();
            //Se prepara peticion.
            ps=con.prepareStatement(sql);
            //Se envia peticion.
            rs = ps.executeQuery();
            //Se llenan los datos para ser enviados al controlador.
            while (rs.next()) {
                CitaCliente citaCliente = new CitaCliente(
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("odontologo"),
                    rs.getString("fecha")
                );
                listaCitas.add(citaCliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar citas: " + e.getMessage());
        } finally {
            // Cerrar la conexión y liberar recursos
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (ps != null) ps.close(); } catch (SQLException e) {}
            try { if (con != null) con.close(); } catch (SQLException e) {}
        }

        return listaCitas;
    }
}
