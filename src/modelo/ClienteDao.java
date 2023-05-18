/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author emanu
 */
public class ClienteDao {
     //Se crean variables para la conexion a la base de datos.
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;

    public boolean iniciarSesion(String usuario, String contraseña){
        boolean pasa = false;
        String sql = "SELECT * FROM cliente WHERE nombre =? AND contrasena =? ";
        try{
            
            //Conexion a la db.
            con = cn.getConnection();
            //Se prepara peticion.
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            //Se envia peticion.
            rs = ps.executeQuery();
            //Se llenan los datos para ser enviados al controlador.
            if(rs != null && rs.next()){
                pasa = true;
            }
        }catch(Exception e){
            System.err.println("Se ha producido un error buscando al cliente " + usuario + ": "+ e);
            pasa=false;
        } finally {
            // Cerrar la conexión y liberar recursos
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (ps != null) ps.close(); } catch (SQLException e) {}
            try { if (con != null) con.close(); } catch (SQLException e) {}
        }
        return pasa;
    }
    public boolean agregar (Cliente cliente){
        String sql = "INSERT INTO cliente(nombre,contrasena,cedula,telefono) VALUES(?,?,?,?)";
         boolean pasa = false;
        try{
            //Conexion a la db.
            con = cn.getConnection();
            //Se prepara peticion.
            ps=con.prepareStatement(sql);
            //Se obtienen los datos del empleado que recibe el metodo en los parametros.
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getContraseña());
            ps.setString(3,cliente.getCedula());
            ps.setString(4,cliente.getTelefono());
            //Se envia peticion.
            ps.executeUpdate(); 
            pasa=true;
        }catch(Exception e){
            System.err.println("Se ha producido un error insertando el cliente: " + e);
            pasa=false;
        } finally {
            // Cerrar la conexión y liberar recursos
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (ps != null) ps.close(); } catch (SQLException e) {}
            try { if (con != null) con.close(); } catch (SQLException e) {}
        }
        return pasa;
    }
    
    public List<Cliente> listarClientes() {
        
        List<Cliente> listaClientes = new ArrayList<>();
        
        String sql = "SELECT * FROM cliente";
        
        try {
            //Conexion a la db.
            con = cn.getConnection();
            //Se prepara peticion.
            ps=con.prepareStatement(sql);
            //Se envia peticion.
            rs = ps.executeQuery();
            //Se llenan los datos para ser enviados al controlador.
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setContraseña(rs.getString("contrasena"));
                cliente.setCedula(rs.getString("cedula"));
                cliente.setTelefono(rs.getString("telefono"));
                listaClientes.add(cliente);
            }
            
        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            // Cerrar la conexión y liberar recursos
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (ps != null) ps.close(); } catch (SQLException e) {}
            try { if (con != null) con.close(); } catch (SQLException e) {}
        }
        
        return listaClientes;
    }
}
