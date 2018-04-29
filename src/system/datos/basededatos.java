/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import system.pojos.Categorias;
import system.pojos.DetalleVentas;
import system.pojos.Producto;
import system.pojos.Proveedores;
import system.pojos.Ventas;

/**
 *
 * @author ivan
 */
public class basededatos {
    
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    public basededatos(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insertarProducto(Producto producto){
        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
            FileInputStream fis = new FileInputStream(producto.getFoto_prod());
            
            String sql = "INSERT INTO cat_productos (id_prod, nombre_prod, des_prod, stock_prod, foto_prod, unidad_prod,"
                    + " precio_compra_prod, precio_venta_prod, existencias_prod) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            st.setString(1, producto.getId_Prod());
            st.setString(2, producto.getNombre_Prod());
            st.setString(3, producto.getDes_prod());
            st.setDouble(4, producto.getStock_prod());
            st.setBinaryStream(5, fis, (int)producto.getFoto_prod().length());
            st.setString(6, producto.getUnidad_prod());
            st.setDouble(7, producto.getPrecio_compra_prod());
            st.setDouble(8, producto.getPrecio_venta_prod());
            st.setDouble(9, producto.getExistencias_prod());
            st.setInt(10, producto.getId_categoria_prod());
            st.setInt(11, producto.getId_proveedor());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void insertarCategoria(Categorias categorias){
        try {
            
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
          
            
            String sql = "INSERT INTO cat_categorias (nom_categoria_prod, desc_categoria_prod) "
                    + "VALUES (?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setString(1, categorias.getNom_categoria_prod());
            st.setString(2, categorias.getDesc_categoria_prod());
           
            
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void insertarProveedor(Proveedores proveedores){
        
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
            
            String sql = "INSERT INTO cat_proveedores (nom_proveedor, dir_proveedor, tel_proveedor, correo_proveedor"
                    + "contacto_proveedor) "
                    + "VALUES (?, ?, ?, ?, ?)";
            
            
            st = conn.prepareStatement(sql);
            
            st.setString(2, proveedores.getNom_proveedor());
            st.setString(3, proveedores.getDir_proveedor());
            st.setString(4, proveedores.getTel_proveedor());
            st.setString(5, proveedores.getCorreo_proveedor());
            st.setString(6, proveedores.getContacto_proveedor());
            
            st.executeQuery();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    
    public void insertarVentas(Ventas ventas){
        
        try {
            
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
          
            
            String sql = "INSERT INTO ventas (monto_venta, fecha_venta) "
                    + "VALUES (?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setDouble(1, ventas.getMonto_venta());
            st.setDate(2, ventas.getFecha_venta());
           
            
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    public void insertarDetalleVentas(DetalleVentas detalleventas){
        
        try {
            
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
          
            
            String sql = "INSERT INTO detalle_venta (id_ventas, id_prod, cantidad_vendida) "
                    + "VALUES (?, ?, ?)";
            
            st = conn.prepareStatement(sql);
            
            st.setInt(1, detalleventas.getId_ventas());
            st.setString(2, detalleventas.getId_prod());
            st.setDouble(3, detalleventas.getCantidad_vendida());
           
            
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
//        Categorias categorias = new Categorias(4, "hola", "hola");
//        basededatos base = new basededatos();
//        
//        base.insertarCategoria(categorias);
        
    }
    
    
}
