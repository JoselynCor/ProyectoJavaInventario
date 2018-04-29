/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.pojos;

import java.io.File;

/**
 *
 * @author ivan
 */
public class Producto {
    
    private String id_Prod;
    private String nombre_Prod;
    private String des_prod;
    private Double stock_prod;
    private File foto_prod;
    private String unidad_prod;
    private Double precio_compra_prod;
    private Double precio_venta_prod;
    private Double existencias_prod;
    private int id_categoria_prod;
    private int id_proveedor;

    public Producto(String id_Prod, String nombre_Prod, String des_prod, Double stock_prod, File foto_prod, 
            String unidad_prod, Double precio_compra_prod, Double precio_venta_prod, 
            Double existencias_prod, int id_categoria_prod, int id_proveedor) {
        this.id_Prod = id_Prod;
        this.nombre_Prod = nombre_Prod;
        this.des_prod = des_prod;
        this.stock_prod = stock_prod;
        this.foto_prod = foto_prod;
        this.unidad_prod = unidad_prod;
        this.precio_compra_prod = precio_compra_prod;
        this.precio_venta_prod = precio_venta_prod;
        this.existencias_prod = existencias_prod;
        this.id_categoria_prod = id_categoria_prod;
        this.id_proveedor = id_proveedor;
    }

    public Double getExistencias_prod() {
        return existencias_prod;
    }

    public void setExistencias_prod(Double existencias_prod) {
        this.existencias_prod = existencias_prod;
    }

    public String getId_Prod() {
        return id_Prod;
    }

    public void setId_Prod(String id_Prod) {
        this.id_Prod = id_Prod;
    }

    public String getNombre_Prod() {
        return nombre_Prod;
    }

    public void setNombre_Prod(String nombre_Prod) {
        this.nombre_Prod = nombre_Prod;
    }

    public String getDes_prod() {
        return des_prod;
    }

    public void setDes_prod(String des_prod) {
        this.des_prod = des_prod;
    }

    public Double getStock_prod() {
        return stock_prod;
    }

    public void setStock_prod(Double stock_prod) {
        this.stock_prod = stock_prod;
    }

    public File getFoto_prod() {
        return foto_prod;
    }

    public void setFoto_prod(File foto_prod) {
        this.foto_prod = foto_prod;
    }

    public String getUnidad_prod() {
        return unidad_prod;
    }

    public void setUnidad_prod(String unidad_prod) {
        this.unidad_prod = unidad_prod;
    }

    public Double getPrecio_compra_prod() {
        return precio_compra_prod;
    }

    public void setPrecio_compra_prod(Double precio_compra_prod) {
        this.precio_compra_prod = precio_compra_prod;
    }

    public Double getPrecio_venta_prod() {
        return precio_venta_prod;
    }

    public void setPrecio_venta_prod(Double precio_venta_prod) {
        this.precio_venta_prod = precio_venta_prod;
    }

    public int getId_categoria_prod() {
        return id_categoria_prod;
    }

    public void setId_categoria_prod(int id_categoria_prod) {
        this.id_categoria_prod = id_categoria_prod;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
       
}
