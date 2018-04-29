/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.pojos;

/**
 *
 * @author ivan
 */
public class DetalleVentas {
    
    private int id_detalle_venta;
    private int id_ventas;
    private String id_prod;
    private Double cantidad_vendida;

    public DetalleVentas(int id_detalle_venta, int id_ventas, String id_prod, Double cantidad_vendida) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_ventas = id_ventas;
        this.id_prod = id_prod;
        this.cantidad_vendida = cantidad_vendida;
    }

    public Double getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(Double cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }
    
    
    
}
