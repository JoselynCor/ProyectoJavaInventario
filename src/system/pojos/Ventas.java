/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.pojos;

import java.sql.Date;

/**
 *
 * @author ivan
 */
public class Ventas {
    
    private int id_ventas;
    private Double monto_venta;
    private Date fecha_venta;

    public Ventas(int id_ventas, Double monto_venta, Date fecha_venta) {
        this.id_ventas = id_ventas;
        this.monto_venta = monto_venta;
        this.fecha_venta = fecha_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public Double getMonto_venta() {
        return monto_venta;
    }

    public void setMonto_venta(Double monto_venta) {
        this.monto_venta = monto_venta;
    }
    
    
    
}

