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
public class Proveedores {

        private int id_proveedor;
        private String nom_proveedor;
        private String dir_proveedor;
        private String tel_proveedor;
        private String correo_proveedor;
        private String contacto_proveedor;

    public Proveedores(int id_proveedor, String nom_proveedor, String dir_proveedor, String tel_proveedor, String correo_proveedor, String contacto_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.dir_proveedor = dir_proveedor;
        this.tel_proveedor = tel_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.contacto_proveedor = contacto_proveedor;
    }

    public String getContacto_proveedor() {
        return contacto_proveedor;
    }

    public void setContacto_proveedor(String contacto_proveedor) {
        this.contacto_proveedor = contacto_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getDir_proveedor() {
        return dir_proveedor;
    }

    public void setDir_proveedor(String dir_proveedor) {
        this.dir_proveedor = dir_proveedor;
    }

    public String getTel_proveedor() {
        return tel_proveedor;
    }

    public void setTel_proveedor(String tel_proveedor) {
        this.tel_proveedor = tel_proveedor;
    }

    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }
        
        
    
}
